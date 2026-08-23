package org.telegram.ui.Stars;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$AmountLimits;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.HorizontalRoundTabsLayout;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.TableView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TON.TONIntroActivity;

public class GiftOfferSheet extends BottomSheetWithRecyclerListView {
    private static final int[] ALLOWED_DURATIONS = {21600, 43200, 86400, 129600, 172800, 259200};
    private UniversalAdapter adapter;
    private final BalanceCloud balanceCloud;
    private boolean balanceCloudVisible;
    private final ButtonWithCounterView buttonView;
    private final Runnable closeParentSheet;
    private final HorizontalRoundTabsLayout currencyTabsView;
    private final long dialogId;
    private final AnimatedTextView dollarsEqView;
    private final String giftName;
    private final TL_stars.TL_starGiftUnique giftUnique;
    private final ImageView iconStars;
    private final ImageView iconTon;
    private AmountUtils$Amount inputAmount;
    private int inputAmountError;
    private final AmountUtils$AmountLimits inputAmountLimits;
    private boolean isFullyVisible;
    private final UItem mainItem;
    private final EditTextBoldCursor publishingTimeField;
    private final TextView publishingTimeHint;
    private int selectedDuration;
    private final ColoredImageSpan[] spanRefStars;
    private final ColoredImageSpan[] spanRefTon;
    private final EditTextBoldCursor starsCountEditField;
    private final TextView starsCountEditHint;
    private final OutlineTextContainerView starsCountEditOutline;

    @Override
    protected boolean isTouchOutside(float f, float f2) {
        BalanceCloud balanceCloud;
        if (!this.balanceCloudVisible || (balanceCloud = this.balanceCloud) == null || f < balanceCloud.getX() || f > this.balanceCloud.getX() + this.balanceCloud.getWidth() || f2 < this.balanceCloud.getY() || f2 > this.balanceCloud.getY() + this.balanceCloud.getHeight()) {
            return super.isTouchOutside(f, f2);
        }
        return false;
    }

    public GiftOfferSheet(final Context context, final int i, final long j, TL_stars.TL_starGiftUnique tL_starGiftUnique, final Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        TLRPC.User user;
        super(context, null, true, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, resourcesProvider);
        AmountUtils$AmountLimits amountUtils$AmountLimits = new AmountUtils$AmountLimits();
        this.inputAmountLimits = amountUtils$AmountLimits;
        this.spanRefStars = new ColoredImageSpan[1];
        this.spanRefTon = new ColoredImageSpan[1];
        this.ignoreTouchActionBar = false;
        this.headerMoveTop = AndroidUtilities.dp(12.0f);
        this.topPadding = 0.2f;
        this.dialogId = j;
        this.giftUnique = tL_starGiftUnique;
        this.giftName = tL_starGiftUnique.title + " #" + LocaleController.formatNumber(tL_starGiftUnique.num, ',');
        this.closeParentSheet = runnable;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean zCanUseTon = StarsController.getTonInstance(i).canUseTon();
        if (j > 0 && MessagesController.getInstance(i).getUserFull(j) == null && (user = MessagesController.getInstance(i).getUser(Long.valueOf(j))) != null) {
            MessagesController.getInstance(i).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i).config;
        long j2 = tL_starGiftUnique.offer_min_stars;
        AmountUtils$Currency amountUtils$Currency = AmountUtils$Currency.STARS;
        AmountUtils$Amount amountUtils$AmountFromDecimal = AmountUtils$Amount.fromDecimal(j2, amountUtils$Currency);
        AmountUtils$Amount amountUtils$AmountFromDecimal2 = AmountUtils$Amount.fromDecimal(Math.max(amountUtils$AmountFromDecimal.asDecimal() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), amountUtils$Currency);
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.TON;
        AmountUtils$Amount amountUtils$AmountFromNano = AmountUtils$Amount.fromNano(Math.max(amountUtils$AmountFromDecimal.convertTo(amountUtils$Currency2).round(2).asNano(), appGlobalConfig.tonStarGiftResaleAmountMin.get()), amountUtils$Currency2);
        AmountUtils$Amount amountUtils$AmountFromNano2 = AmountUtils$Amount.fromNano(Math.max(amountUtils$AmountFromNano.asNano() * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), amountUtils$Currency2);
        amountUtils$AmountLimits.set(amountUtils$AmountFromDecimal, amountUtils$AmountFromDecimal2);
        amountUtils$AmountLimits.set(amountUtils$AmountFromNano, amountUtils$AmountFromNano2);
        BalanceCloud balanceCloud = new BalanceCloud(context, i, resourcesProvider);
        this.balanceCloud = balanceCloud;
        balanceCloud.setScaleX(0.6f);
        balanceCloud.setScaleY(0.6f);
        balanceCloud.setAlpha(0.0f);
        balanceCloud.setEnabled(false);
        balanceCloud.setClickable(false);
        this.container.addView(balanceCloud, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        ScaleStateListAnimator.apply(balanceCloud);
        balanceCloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GiftOfferSheet.m4098$r8$lambda$_g1lhGoznL16p2rdsrn8e0Yzhw(this.f$0, context, resourcesProvider, view);
            }
        });
        fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.starsCountEditField = editTextBoldCursor;
        if (zCanUseTon) {
            HorizontalRoundTabsLayout horizontalRoundTabsLayout = new HorizontalRoundTabsLayout(context, resourcesProvider);
            this.currencyTabsView = horizontalRoundTabsLayout;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            horizontalRoundTabsLayout.setTabs(arrayList, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i2) {
                    GiftOfferSheet.m4094$r8$lambda$B9apyVlnlU4FZl2GR1kWoJ2Cc(this.f$0, i2);
                }
            });
            linearLayout.addView(horizontalRoundTabsLayout, LayoutHelper.createLinear(-1, -2, 18.0f, 0.0f, 18.0f, 18.0f));
        } else {
            this.currencyTabsView = null;
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f));
        OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
        this.starsCountEditOutline = outlineTextContainerView;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        editTextBoldCursor.setTextColor(Theme.getColor(i2));
        editTextBoldCursor.requestFocus();
        outlineTextContainerView.setLeftPadding(AndroidUtilities.dp(28.0f));
        outlineTextContainerView.attachEditText(editTextBoldCursor);
        outlineTextContainerView.animateSelection(true, false, false);
        outlineTextContainerView.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view, boolean z) {
                GiftOfferSheet giftOfferSheet = this.f$0;
                giftOfferSheet.starsCountEditOutline.animateSelection(z, !TextUtils.isEmpty(giftOfferSheet.starsCountEditField.getText()));
            }
        });
        outlineTextContainerView.addView(editTextBoldCursor, LayoutHelper.createFrame(-1, -2, 48));
        linearLayout2.addView(outlineTextContainerView, LayoutHelper.createLinear(-1, 58, 18.0f, 0.0f, 18.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.iconStars = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        outlineTextContainerView.addView(imageView, LayoutHelper.createFrame(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.iconTon = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        outlineTextContainerView.addView(imageView2, LayoutHelper.createFrame(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(context);
        this.dollarsEqView = animatedTextView;
        int i3 = Theme.key_windowBackgroundWhiteGrayText;
        animatedTextView.setTextColor(Theme.getColor(i3));
        animatedTextView.setTextSize(AndroidUtilities.dp(13.0f));
        animatedTextView.setGravity(5);
        outlineTextContainerView.addView(animatedTextView, LayoutHelper.createFrame(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.starsCountEditHint = textView;
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, LayoutHelper.createLinear(-1, -2, 55, 33, 4, 33, 0));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return false;
            }
        };
        this.publishingTimeField = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor2.setTextColor(Theme.getColor(i2));
        editTextBoldCursor2.setFocusable(false);
        editTextBoldCursor2.setClickable(false);
        editTextBoldCursor2.setEnabled(false);
        OutlineTextContainerView outlineTextContainerView2 = new OutlineTextContainerView(context);
        outlineTextContainerView2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        outlineTextContainerView2.attachEditText(editTextBoldCursor2);
        outlineTextContainerView2.addView(editTextBoldCursor2, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        ScaleStateListAnimator.apply(outlineTextContainerView2, 0.02f, 1.2f);
        outlineTextContainerView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GiftOfferSheet.$r8$lambda$o2roYrR_EAziNYmtgGAdak91tuI(this.f$0, context, view);
            }
        });
        linearLayout2.addView(outlineTextContainerView2, LayoutHelper.createLinear(-1, 58, 18.0f, 18.0f, 18.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogEmptyImage, resourcesProvider), PorterDuff.Mode.SRC_IN));
        outlineTextContainerView2.addView(imageView3, LayoutHelper.createFrame(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.publishingTimeHint = textView2;
        textView2.setTextColor(Theme.getColor(i3));
        textView2.setTextSize(1, 13.0f);
        linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2, 55, 33, 4, 33, 0));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        this.buttonView = buttonWithCounterView;
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GiftOfferSheet.$r8$lambda$YhklKuXlUbrWXEhowpTv2blyo4c(this.f$0, i, context, resourcesProvider, j, view);
            }
        });
        setAmount(AmountUtils$Amount.fromNano(0L, amountUtils$Currency), false, true, false);
        setSelectedDuration(86400, false);
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String string;
                int iIndexOf;
                boolean z = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
                if (!z && (iIndexOf = (string = editable.toString()).indexOf(46)) >= 0 && (string.length() - iIndexOf) - 1 > 2) {
                    editable.delete(iIndexOf + 3, string.length());
                }
                GiftOfferSheet.this.setAmount(!z ? AmountUtils$Amount.fromDecimal(editable.toString(), GiftOfferSheet.this.inputAmount.currency) : AmountUtils$Amount.fromNano(0L, GiftOfferSheet.this.inputAmount.currency), false, false, true);
                GiftOfferSheet.this.starsCountEditOutline.animateSelection(GiftOfferSheet.this.starsCountEditField.isFocused(), true ^ TextUtils.isEmpty(GiftOfferSheet.this.starsCountEditField.getText()));
            }
        });
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i4 = layoutParamsCreateFrame.leftMargin;
        int i5 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame.leftMargin = i4 + i5;
        layoutParamsCreateFrame.rightMargin += i5;
        this.containerView.addView(buttonWithCounterView, layoutParamsCreateFrame);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i6 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i6, 0, i6, AndroidUtilities.dp(64.0f));
        this.recyclerListView.setOverScrollMode(2);
        this.mainItem = UItem.asCustom(linearLayout);
        this.adapter.update(false);
    }

    public static void m4098$r8$lambda$_g1lhGoznL16p2rdsrn8e0Yzhw(GiftOfferSheet giftOfferSheet, Context context, Theme.ResourcesProvider resourcesProvider, View view) {
        if (giftOfferSheet.inputAmount.currency == AmountUtils$Currency.STARS) {
            new StarsIntroActivity.StarsOptionsSheet(context, resourcesProvider).show();
        }
    }

    public static void m4094$r8$lambda$B9apyVlnlU4FZl2GR1kWoJ2Cc(GiftOfferSheet giftOfferSheet, int i) {
        AmountUtils$Currency amountUtils$Currency;
        giftOfferSheet.getClass();
        if (i == 0) {
            amountUtils$Currency = AmountUtils$Currency.STARS;
        } else {
            amountUtils$Currency = AmountUtils$Currency.TON;
        }
        giftOfferSheet.setAmount(AmountUtils$Amount.fromNano(0L, amountUtils$Currency), true, false, true);
        giftOfferSheet.starsCountEditField.setText("");
    }

    public static void $r8$lambda$o2roYrR_EAziNYmtgGAdak91tuI(final GiftOfferSheet giftOfferSheet, Context context, View view) {
        giftOfferSheet.getClass();
        String[] strArr = new String[ALLOWED_DURATIONS.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = ALLOWED_DURATIONS;
            if (i < iArr.length) {
                strArr[i] = LocaleController.formatPluralString("GiftOfferHours", iArr[i] / 3600, new Object[0]);
                if (iArr[i] == giftOfferSheet.selectedDuration) {
                    i2 = i;
                }
                i++;
            } else {
                AlertsCreator.createCustomPicker(context, LocaleController.getString(R.string.GiftOfferDuration), i2, strArr, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        GiftOfferSheet.m4097$r8$lambda$VH8csTRCIidk7ns0ZoC5CUhkbY(this.f$0, (Integer) obj);
                    }
                });
                return;
            }
        }
    }

    public static void m4097$r8$lambda$VH8csTRCIidk7ns0ZoC5CUhkbY(GiftOfferSheet giftOfferSheet, Integer num) {
        giftOfferSheet.getClass();
        giftOfferSheet.setSelectedDuration(ALLOWED_DURATIONS[num.intValue()], true);
    }

    public static void $r8$lambda$YhklKuXlUbrWXEhowpTv2blyo4c(GiftOfferSheet giftOfferSheet, int i, Context context, Theme.ResourcesProvider resourcesProvider, long j, View view) {
        if (giftOfferSheet.buttonView.isEnabled()) {
            if (MessagesController.getInstance(i).isFrozen()) {
                AccountFrozenAlert.show(i);
                return;
            }
            StarsController starsController = StarsController.getInstance(i, giftOfferSheet.inputAmount.currency);
            AmountUtils$Amount amountUtils$AmountOf = starsController.balanceAvailable() ? AmountUtils$Amount.of(starsController.getBalance()) : null;
            if (amountUtils$AmountOf == null || amountUtils$AmountOf.asNano() < giftOfferSheet.inputAmount.asNano()) {
                AmountUtils$Amount amountUtils$Amount = giftOfferSheet.inputAmount;
                AmountUtils$Currency amountUtils$Currency = amountUtils$Amount.currency;
                if (amountUtils$Currency == AmountUtils$Currency.STARS) {
                    new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, amountUtils$Amount.asDecimal(), 14, null, null, j).show();
                    return;
                } else {
                    if (amountUtils$Currency == AmountUtils$Currency.TON) {
                        new TONIntroActivity.StarsNeededSheet(context, resourcesProvider, amountUtils$Amount, true, null).show();
                        return;
                    }
                    return;
                }
            }
            giftOfferSheet.openConfirmAlert();
        }
    }

    private void setSelectedDuration(int i, boolean z) {
        if (this.selectedDuration != i) {
            this.selectedDuration = i;
            this.publishingTimeField.setText(LocaleController.formatPluralString("GiftOfferHours", i / 3600, new Object[0]));
        }
        checkButtonEnabled(z);
    }

    public void setAmount(AmountUtils$Amount amountUtils$Amount, boolean z, boolean z2, boolean z3) {
        AmountUtils$Amount amountUtils$Amount2 = this.inputAmount;
        int i = this.inputAmountError;
        this.inputAmountError = 0;
        if (amountUtils$Amount != null) {
            this.inputAmount = amountUtils$Amount;
        } else {
            this.inputAmount = AmountUtils$Amount.fromNano(0L, amountUtils$Amount2.currency);
            this.inputAmountError |= 1;
        }
        if (this.inputAmountLimits.getMax(this.inputAmount.currency).asNano() < this.inputAmount.asNano()) {
            this.inputAmountError |= 4;
        }
        if (!this.inputAmount.isZero() && this.inputAmountLimits.getMin(this.inputAmount.currency).asNano() > this.inputAmount.asNano()) {
            this.inputAmountError |= 2;
        }
        boolean z4 = z2 || amountUtils$Amount2.currency != this.inputAmount.currency;
        boolean z5 = z2 || amountUtils$Amount2.asNano() != this.inputAmount.asNano();
        boolean z6 = z2 || i != this.inputAmountError;
        if (z4) {
            onCurrencyChanged(z3);
        }
        if (z4 || z6) {
            checkAmountInputText(z3);
            checkAmountInputTextHint(z3);
        }
        if (z4 || z5 || z6) {
            checkButtonOfferText(z3);
            checkButtonEnabled(z3);
        }
        if (z4 || z5) {
            checkRateText(z3);
        }
        if (z && z5) {
            String strAsDecimalString = this.inputAmount.asDecimalString();
            this.starsCountEditField.setText(strAsDecimalString);
            this.starsCountEditField.setSelection(strAsDecimalString.length());
        }
    }

    private void onCurrencyChanged(boolean z) {
        HorizontalRoundTabsLayout horizontalRoundTabsLayout = this.currencyTabsView;
        if (horizontalRoundTabsLayout != null) {
            horizontalRoundTabsLayout.setSelectedIndex(this.inputAmount.currency == AmountUtils$Currency.STARS ? 0 : 1, z);
        }
        String shortName = DialogObject.getShortName(this.dialogId);
        AmountUtils$Currency amountUtils$Currency = this.inputAmount.currency;
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.STARS;
        if (amountUtils$Currency == amountUtils$Currency2) {
            this.publishingTimeHint.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
            this.starsCountEditField.setInputType(2);
            this.starsCountEditField.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(this.inputAmountLimits.getMax(this.inputAmount.currency).asDecimal()).length())});
        } else if (amountUtils$Currency == AmountUtils$Currency.TON) {
            this.publishingTimeHint.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
            this.starsCountEditField.setInputType(8194);
            this.starsCountEditField.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(this.inputAmountLimits.getMax(this.inputAmount.currency).asDecimal()).length() + 3)});
        }
        if (z) {
            this.iconStars.animate().alpha(this.inputAmount.currency == amountUtils$Currency2 ? 1.0f : 0.0f).scaleX(this.inputAmount.currency == amountUtils$Currency2 ? 1.0f : 0.0f).scaleY(this.inputAmount.currency == amountUtils$Currency2 ? 1.0f : 0.0f).setDuration(180L).start();
            ViewPropertyAnimator viewPropertyAnimatorAnimate = this.iconTon.animate();
            AmountUtils$Currency amountUtils$Currency3 = this.inputAmount.currency;
            AmountUtils$Currency amountUtils$Currency4 = AmountUtils$Currency.TON;
            viewPropertyAnimatorAnimate.alpha(amountUtils$Currency3 == amountUtils$Currency4 ? 1.0f : 0.0f).scaleX(this.inputAmount.currency == amountUtils$Currency4 ? 1.0f : 0.0f).scaleY(this.inputAmount.currency == amountUtils$Currency4 ? 1.0f : 0.0f).setDuration(180L).start();
        } else {
            this.iconStars.setAlpha(this.inputAmount.currency == amountUtils$Currency2 ? 1.0f : 0.0f);
            this.iconTon.setAlpha(this.inputAmount.currency == AmountUtils$Currency.TON ? 1.0f : 0.0f);
        }
        BalanceCloud balanceCloud = this.balanceCloud;
        if (balanceCloud != null) {
            balanceCloud.setCurrency(this.inputAmount.currency, z);
        }
    }

    @Override
    public void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.isFullyVisible = true;
        checkBalanceCloudVisibility();
    }

    @Override
    public void onContainerTranslationYChanged(float f) {
        super.onContainerTranslationYChanged(f);
        checkBalanceCloudVisibility();
    }

    private void checkBalanceCloudVisibility() {
        boolean z = (this.isFullyVisible && !isDismissed() && this.balanceCloud != null && this.containerView.getY() > ((float) AndroidUtilities.dp(32.0f))) || this.currencyTabsView == null;
        if (this.balanceCloudVisible != z) {
            this.balanceCloudVisible = z;
            BalanceCloud balanceCloud = this.balanceCloud;
            if (balanceCloud != null) {
                balanceCloud.setEnabled(z);
                this.balanceCloud.setClickable(z);
                this.balanceCloud.animate().scaleX(z ? 1.0f : 0.6f).scaleY(z ? 1.0f : 0.6f).alpha(z ? 1.0f : 0.0f).setDuration(180L).start();
            }
        }
    }

    private void checkButtonOfferText(boolean z) {
        String number;
        AmountUtils$Amount amountUtils$Amount = this.inputAmount;
        boolean z2 = amountUtils$Amount.currency == AmountUtils$Currency.TON;
        ButtonWithCounterView buttonWithCounterView = this.buttonView;
        int i = R.string.GiftOfferButtonStars;
        if (z2) {
            number = amountUtils$Amount.asDecimalString();
        } else {
            number = LocaleController.formatNumber(amountUtils$Amount.asDecimal(), ',');
        }
        buttonWithCounterView.setText(StarsIntroActivity.replaceStars(z2, LocaleController.formatString(i, number), z2 ? this.spanRefTon : this.spanRefStars), z);
    }

    private void checkButtonEnabled(boolean z) {
        boolean z2 = this.inputAmountError == 0 && this.inputAmount.asNano() > 0;
        if (this.buttonView.isEnabled() != z2) {
            this.buttonView.setEnabled(z2);
            this.buttonView.setClickable(z2);
            if (z) {
                this.buttonView.animate().alpha(z2 ? 1.0f : 0.6f).setDuration(180L).start();
            } else {
                this.buttonView.setAlpha(z2 ? 1.0f : 0.6f);
            }
        }
    }

    private void checkAmountInputText(boolean z) {
        int i;
        if (this.inputAmount.currency == AmountUtils$Currency.STARS) {
            i = R.string.GiftOfferStarsToOffer;
        } else {
            i = R.string.GiftOfferTONToOffer;
        }
        this.starsCountEditOutline.setText(LocaleController.getString(i));
    }

    private void checkAmountInputTextHint(boolean z) {
        int i;
        int i2;
        int i3;
        AmountUtils$Currency amountUtils$Currency = this.inputAmount.currency;
        int i4 = this.inputAmountError;
        if ((i4 & 4) != 0) {
            if (amountUtils$Currency == AmountUtils$Currency.STARS) {
                i3 = R.string.GiftOfferStarsToOfferInfoIsHigh;
            } else {
                i3 = R.string.GiftOfferTONToOfferInfoIsHigh;
            }
            this.starsCountEditHint.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i3, this.inputAmountLimits.getMax(amountUtils$Currency).asFormatString(), this.giftName)));
        } else if ((i4 & 2) != 0) {
            if (amountUtils$Currency == AmountUtils$Currency.STARS) {
                i2 = R.string.GiftOfferStarsToOfferInfoIsLow;
            } else {
                i2 = R.string.GiftOfferTONToOfferInfoIsLow;
            }
            this.starsCountEditHint.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i2, this.inputAmountLimits.getMin(amountUtils$Currency).asFormatString(), this.giftName)));
        } else {
            if (amountUtils$Currency == AmountUtils$Currency.STARS) {
                i = R.string.GiftOfferStarsToOfferInfo;
            } else {
                i = R.string.GiftOfferTONToOfferInfo;
            }
            this.starsCountEditHint.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i, this.giftName)));
        }
        this.starsCountEditHint.setTextColor(getThemedColor((this.inputAmountError & (-9)) == 0 ? Theme.key_windowBackgroundWhiteGrayText : Theme.key_text_RedBold));
    }

    private void checkRateText(boolean z) {
        double d;
        StringBuilder sb = new StringBuilder(10);
        sb.append('~');
        if (this.inputAmount.currency == AmountUtils$Currency.TON) {
            d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
        } else {
            d = ((double) MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000) * 1.0E-5d;
        }
        sb.append(BillingController.getInstance().formatCurrency((long) (this.inputAmount.asDouble() * d * 100.0d), "USD", 2));
        this.dollarsEqView.setText(sb, z);
    }

    @Override
    public void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AndroidUtilities.showKeyboard(this.f$0.starsCountEditField);
            }
        }, 50L);
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        UItem uItem = this.mainItem;
        if (uItem != null) {
            arrayList.add(uItem);
        }
    }

    private void openConfirmAlert() {
        String string;
        String strAsFormatString = this.inputAmount.asFormatString();
        final boolean z = this.inputAmount.currency == AmountUtils$Currency.TON;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setText(LocaleController.getString(R.string.GiftOfferConfirmSend));
        int i = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 14));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(Theme.getColor(i, this.resourcesProvider));
        textView2.setTextSize(1, 16.0f);
        AmountUtils$Currency amountUtils$Currency = this.inputAmount.currency;
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.STARS;
        if (amountUtils$Currency == amountUtils$Currency2) {
            string = LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, strAsFormatString, DialogObject.getShortName(this.dialogId), this.giftName);
        } else {
            string = LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, strAsFormatString, DialogObject.getShortName(this.dialogId), this.giftName);
        }
        textView2.setText(AndroidUtilities.replaceTags(string));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 4));
        TableView tableView = new TableView(getContext(), this.resourcesProvider);
        final long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(this.dialogId);
        final AmountUtils$Amount amountUtils$AmountFromDecimal = AmountUtils$Amount.fromDecimal(sendPaidMessagesStars, amountUtils$Currency2);
        String string2 = LocaleController.getString(R.string.GiftOfferRowOffer);
        int i2 = R.string.GiftOfferAmount;
        tableView.addRow(string2, StarsIntroActivity.replaceStarsWithPlain(z, LocaleController.formatString(i2, strAsFormatString), 0.8f));
        if (sendPaidMessagesStars > 0) {
            tableView.addRow(LocaleController.getString(R.string.GiftOfferRowFee), StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatString(i2, amountUtils$AmountFromDecimal.asFormatString()), 0.8f));
        }
        tableView.addRow(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", this.selectedDuration / 3600, new Object[0]));
        linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 48, 23, 16, 23, 4));
        final long nextRandomId = SendMessagesHelper.getInstance(this.currentAccount).getNextRandomId();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (sendPaidMessagesStars == 0) {
            spannableStringBuilder.append((CharSequence) StarsIntroActivity.replaceStars(z, LocaleController.formatString(R.string.GiftOfferPay, strAsFormatString)));
        } else if (z) {
            int i3 = R.string.GiftOfferPayMultiPart;
            spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, StarsIntroActivity.replaceStars(true, (CharSequence) LocaleController.formatString(i3, strAsFormatString)), StarsIntroActivity.replaceStars(LocaleController.formatString(i3, amountUtils$AmountFromDecimal.asFormatString()))));
        } else {
            spannableStringBuilder.append((CharSequence) StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.GiftOfferPay, AmountUtils$Amount.fromNano(this.inputAmount.asNano() + amountUtils$AmountFromDecimal.asNano(), amountUtils$Currency2).asFormatString())));
        }
        new AlertDialog.Builder(getContext(), this.resourcesProvider).setView(linearLayout).setPositiveButton(spannableStringBuilder, new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i4) {
                GiftOfferSheet.m4093$r8$lambda$6cSM4IWlYkA69aAfqSlGW1IOEo(this.f$0, sendPaidMessagesStars, z, amountUtils$AmountFromDecimal, nextRandomId, alertDialog, i4);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create().setShowStarsBalance(true).show();
    }

    public static void m4093$r8$lambda$6cSM4IWlYkA69aAfqSlGW1IOEo(final GiftOfferSheet giftOfferSheet, long j, boolean z, AmountUtils$Amount amountUtils$Amount, long j2, final AlertDialog alertDialog, int i) {
        if (j > 0) {
            int i2 = giftOfferSheet.currentAccount;
            AmountUtils$Currency amountUtils$Currency = AmountUtils$Currency.STARS;
            StarsController starsController = StarsController.getInstance(i2, amountUtils$Currency);
            AmountUtils$Amount amountUtils$AmountOf = starsController.balanceAvailable() ? AmountUtils$Amount.of(starsController.getBalance()) : null;
            AmountUtils$Amount amountUtils$AmountFromDecimal = z ? AmountUtils$Amount.fromDecimal(j, amountUtils$Currency) : AmountUtils$Amount.fromNano(giftOfferSheet.inputAmount.asNano() + amountUtils$Amount.asNano(), amountUtils$Currency);
            if (amountUtils$AmountOf == null || amountUtils$AmountOf.asNano() < amountUtils$AmountFromDecimal.asNano()) {
                new StarsIntroActivity.StarsNeededSheet(giftOfferSheet.getContext(), giftOfferSheet.resourcesProvider, amountUtils$AmountFromDecimal.asDecimal(), 14, null, null, giftOfferSheet.dialogId).show();
                return;
            }
        } else {
            giftOfferSheet.getClass();
        }
        final Browser.Progress progressMakeButtonLoading = alertDialog.makeButtonLoading(-1);
        progressMakeButtonLoading.init();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = giftOfferSheet.inputAmount.toTl();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(giftOfferSheet.currentAccount).getInputPeer(giftOfferSheet.dialogId);
        tL_sendStarGiftOffer.duration = giftOfferSheet.selectedDuration;
        tL_sendStarGiftOffer.slug = giftOfferSheet.giftUnique.slug;
        tL_sendStarGiftOffer.random_id = j2;
        if (j > 0) {
            tL_sendStarGiftOffer.flags |= 1;
            tL_sendStarGiftOffer.allow_paid_stars = j;
        }
        ConnectionsManager.getInstance(giftOfferSheet.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                GiftOfferSheet.$r8$lambda$f7mUkJRdgyqjpQ3i_IWaSh5Hy3M(this.f$0, progressMakeButtonLoading, alertDialog, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void $r8$lambda$f7mUkJRdgyqjpQ3i_IWaSh5Hy3M(final GiftOfferSheet giftOfferSheet, final Browser.Progress progress, final AlertDialog alertDialog, final TLRPC.Updates updates, final TLRPC.TL_error tL_error) {
        giftOfferSheet.getClass();
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(giftOfferSheet.currentAccount).processUpdates(updates, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GiftOfferSheet.$r8$lambda$zzjXXW4jEgjFkIUOf2WxUfbN6MQ(this.f$0, progress, alertDialog, updates, tL_error);
            }
        });
    }

    public static void $r8$lambda$zzjXXW4jEgjFkIUOf2WxUfbN6MQ(GiftOfferSheet giftOfferSheet, Browser.Progress progress, AlertDialog alertDialog, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        Runnable runnable = giftOfferSheet.closeParentSheet;
        if (runnable != null) {
            runnable.run();
        }
        progress.end();
        alertDialog.dismiss();
        giftOfferSheet.dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            if (updates != null) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.forward, LocaleController.getString(R.string.GiftOfferSentTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferSentText, giftOfferSheet.giftName, DialogObject.getShortName(giftOfferSheet.dialogId)))).ignoreDetach().show();
            } else {
                BulletinFactory.of(safeLastFragment).showForError(tL_error);
            }
        }
    }

    public static void openOfferAcceptAlert(final BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider, final int i, long j, final int i2, TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer) {
        TLObject chat;
        String string;
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        SpannableStringBuilder spannableStringBuilder;
        boolean z;
        int i3;
        AmountUtils$Amount amountUtils$AmountOfSafe = AmountUtils$Amount.ofSafe(tL_messageActionStarGiftPurchaseOffer.price);
        AmountUtils$Amount amountMinusFee = getAmountMinusFee(i, amountUtils$AmountOfSafe);
        TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
        String str = starGift.title + " #" + LocaleController.formatNumber(starGift.num, ',');
        if (j >= 0) {
            chat = MessagesController.getInstance(i).getUser(Long.valueOf(j));
        } else {
            chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        }
        String strAsFormatString = amountUtils$AmountOfSafe.asFormatString();
        String strAsFormatString2 = amountMinusFee.asFormatString();
        boolean z2 = amountUtils$AmountOfSafe.currency == AmountUtils$Currency.TON;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new StarGiftSheet.GiftTransferTopView(context, starGift, chat), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        textView.setTextSize(1, 16.0f);
        if (amountUtils$AmountOfSafe.currency == AmountUtils$Currency.STARS) {
            string = LocaleController.formatString(R.string.GiftOfferTransferInfoTextSellStars, strAsFormatString, DialogObject.getShortName(j), str, strAsFormatString2);
        } else {
            string = LocaleController.formatString(R.string.GiftOfferTransferInfoTextSellTON, strAsFormatString, DialogObject.getShortName(j), str, strAsFormatString2);
        }
        textView.setText(AndroidUtilities.replaceTags(string));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        TableView tableView = new TableView(context, resourcesProvider);
        frameLayout.addView(tableView, LayoutHelper.createFrame(-1, -1, 119));
        StarGiftSheet.addAttributeRow(tableView, StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeModel.class));
        StarGiftSheet.addAttributeRow(tableView, StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
        StarGiftSheet.addAttributeRow(tableView, StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributePattern.class));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 48, 23, 16, 23, 4));
        AmountUtils$Amount amountUtils$AmountFromUsd = AmountUtils$Amount.fromUsd(starGift.value_usd_amount / Math.pow(10.0d, BillingController.getInstance().getCurrencyExp("USD")), amountUtils$AmountOfSafe.currency);
        if (amountUtils$AmountFromUsd.asDouble() > 0.0d && starGift.value_usd_amount > 0) {
            if (amountUtils$AmountFromUsd.asNano() >= amountMinusFee.asNano()) {
                int iRound = (int) Math.round((1.0d - (amountMinusFee.asDouble() / amountUtils$AmountFromUsd.asDouble())) * 100.0d);
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferAmountLowerHint2, iRound + "%", starGift.title));
                if (iRound > 10) {
                    spannableStringBuilder = spannableStringBuilderReplaceTags;
                    z = true;
                }
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 13.0f);
                textView2.setGravity(17);
                textView2.setText(spannableStringBuilder);
                if (z) {
                    i3 = Theme.key_text_RedRegular;
                } else {
                    i3 = Theme.key_windowBackgroundWhiteGrayText;
                }
                textView2.setTextColor(Theme.getColor(i3, resourcesProvider));
                linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 49, 40, 12, 40, 9));
            } else {
                int iRound2 = (int) Math.round(((amountMinusFee.asDouble() / amountUtils$AmountFromUsd.asDouble()) - 1.0d) * 100.0d);
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferAmountHigherHint2, iRound2 + "%", starGift.title));
            }
            spannableStringBuilder = spannableStringBuilderReplaceTags;
            z = false;
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 13.0f);
            textView3.setGravity(17);
            textView3.setText(spannableStringBuilder);
            if (z) {
                i3 = Theme.key_text_RedRegular;
            } else {
                i3 = Theme.key_windowBackgroundWhiteGrayText;
            }
            textView3.setTextColor(Theme.getColor(i3, resourcesProvider));
            linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2, 49, 40, 12, 40, 9));
        }
        new AlertDialog.Builder(context, resourcesProvider).setView(linearLayout).setPositiveButton(StarsIntroActivity.replaceStars(z2, LocaleController.formatString(R.string.GiftOfferSellFor, strAsFormatString2)), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i4) {
                GiftOfferSheet.$r8$lambda$gwQEkKs_SOAXz1zUreKS8Dm31cc(i2, i, baseFragment, alertDialog, i4);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create().show();
    }

    public static void $r8$lambda$gwQEkKs_SOAXz1zUreKS8Dm31cc(int i, final int i2, final BaseFragment baseFragment, final AlertDialog alertDialog, int i3) {
        final Browser.Progress progressMakeButtonLoading = alertDialog.makeButtonLoading(-1);
        progressMakeButtonLoading.init();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = i;
        ConnectionsManager.getInstance(i2).sendRequestTyped(tL_resolveStarGiftOffer, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                GiftOfferSheet.m4096$r8$lambda$IzHiAyep2_oXhadHlpCz1iaQM(i2, baseFragment, progressMakeButtonLoading, alertDialog, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void m4096$r8$lambda$IzHiAyep2_oXhadHlpCz1iaQM(int i, final BaseFragment baseFragment, final Browser.Progress progress, final AlertDialog alertDialog, TLRPC.Updates updates, final TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(i).processUpdates(updates, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GiftOfferSheet.$r8$lambda$aDhcoXcjT1naWqNx4SfyPR0QPMc(baseFragment, tL_error, progress, alertDialog);
            }
        });
    }

    public static void $r8$lambda$aDhcoXcjT1naWqNx4SfyPR0QPMc(BaseFragment baseFragment, TLRPC.TL_error tL_error, Browser.Progress progress, AlertDialog alertDialog) {
        if (baseFragment != null && tL_error != null) {
            BulletinFactory.of(baseFragment).showForError(tL_error);
        }
        if ((baseFragment instanceof ChatActivity) && tL_error == null) {
            ((ChatActivity) baseFragment).startFireworks();
        }
        progress.end();
        alertDialog.dismiss();
    }

    private static AmountUtils$Amount getAmountMinusFee(int i, AmountUtils$Amount amountUtils$Amount) {
        int i2;
        AmountUtils$Currency amountUtils$Currency = amountUtils$Amount.currency;
        if (amountUtils$Currency == AmountUtils$Currency.STARS) {
            i2 = MessagesController.getInstance(i).config.starsStarGiftResaleCommissionPermille.get();
        } else {
            i2 = MessagesController.getInstance(i).config.tonStarGiftResaleCommissionPermille.get();
        }
        return AmountUtils$Amount.fromNano((amountUtils$Amount.asNano() * ((long) i2)) / 1000, amountUtils$Currency);
    }
}
