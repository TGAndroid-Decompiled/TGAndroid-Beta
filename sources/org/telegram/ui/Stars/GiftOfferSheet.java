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
import org.telegram.ui.Stars.StarsIntroActivity;
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
    public boolean isTouchOutside(float f, float f2) {
        BalanceCloud balanceCloud;
        if (!this.balanceCloudVisible || (balanceCloud = this.balanceCloud) == null || f < balanceCloud.getX() || f > this.balanceCloud.getX() + this.balanceCloud.getWidth() || f2 < this.balanceCloud.getY() || f2 > this.balanceCloud.getY() + this.balanceCloud.getHeight()) {
            return super.isTouchOutside(f, f2);
        }
        return false;
    }

    public GiftOfferSheet(final Context context, final int i, final long j, TL_stars.TL_starGiftUnique tL_starGiftUnique, final Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        super(context, null, true, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, resourcesProvider);
        TLRPC.User user;
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
        boolean canUseTon = StarsController.getTonInstance(i).canUseTon();
        if (j > 0 && MessagesController.getInstance(i).getUserFull(j) == null && (user = MessagesController.getInstance(i).getUser(Long.valueOf(j))) != null) {
            MessagesController.getInstance(i).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i).config;
        long j2 = tL_starGiftUnique.offer_min_stars;
        AmountUtils$Currency amountUtils$Currency = AmountUtils$Currency.STARS;
        AmountUtils$Amount fromDecimal = AmountUtils$Amount.fromDecimal(j2, amountUtils$Currency);
        AmountUtils$Amount fromDecimal2 = AmountUtils$Amount.fromDecimal(Math.max(fromDecimal.asDecimal() * 2, appGlobalConfig.starsSuggestedPostAmountMax.get()), amountUtils$Currency);
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.TON;
        AmountUtils$Amount round = fromDecimal.convertTo(amountUtils$Currency2).round(2);
        AmountUtils$Amount fromNano = AmountUtils$Amount.fromNano(Math.max(round.asNano() * 2, appGlobalConfig.tonSuggestedPostAmountMax.get()), amountUtils$Currency2);
        amountUtils$AmountLimits.set(fromDecimal, fromDecimal2);
        amountUtils$AmountLimits.set(round, fromNano);
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
                GiftOfferSheet.this.lambda$new$0(context, resourcesProvider, view);
            }
        });
        fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.starsCountEditField = editTextBoldCursor;
        if (canUseTon) {
            HorizontalRoundTabsLayout horizontalRoundTabsLayout = new HorizontalRoundTabsLayout(context);
            this.currencyTabsView = horizontalRoundTabsLayout;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            horizontalRoundTabsLayout.setTabs(arrayList, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i2) {
                    GiftOfferSheet.this.lambda$new$1(i2);
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
                GiftOfferSheet.this.lambda$new$2(view, z);
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
        imageView2.setImageResource(R.drawable.ton);
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
                GiftOfferSheet.this.lambda$new$4(context, view);
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
                GiftOfferSheet.this.lambda$new$5(i, context, resourcesProvider, j, view);
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
                String obj;
                int indexOf;
                boolean z = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
                if (!z && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
                    editable.delete(indexOf + 3, obj.length());
                }
                GiftOfferSheet.this.setAmount(!z ? AmountUtils$Amount.fromDecimal(editable.toString(), GiftOfferSheet.this.inputAmount.currency) : AmountUtils$Amount.fromNano(0L, GiftOfferSheet.this.inputAmount.currency), false, false, true);
                GiftOfferSheet.this.starsCountEditOutline.animateSelection(GiftOfferSheet.this.starsCountEditField.isFocused(), true ^ TextUtils.isEmpty(GiftOfferSheet.this.starsCountEditField.getText()));
            }
        });
        FrameLayout.LayoutParams createFrame = LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i4 = createFrame.leftMargin;
        int i5 = this.backgroundPaddingLeft;
        createFrame.leftMargin = i4 + i5;
        createFrame.rightMargin += i5;
        this.containerView.addView(buttonWithCounterView, createFrame);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i6 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i6, 0, i6, AndroidUtilities.dp(64.0f));
        this.recyclerListView.setOverScrollMode(2);
        this.mainItem = UItem.asCustom(linearLayout);
        this.adapter.update(false);
    }

    public void lambda$new$0(Context context, Theme.ResourcesProvider resourcesProvider, View view) {
        if (this.inputAmount.currency == AmountUtils$Currency.STARS) {
            new StarsIntroActivity.StarsOptionsSheet(context, resourcesProvider).show();
        }
    }

    public void lambda$new$1(int i) {
        AmountUtils$Currency amountUtils$Currency;
        if (i == 0) {
            amountUtils$Currency = AmountUtils$Currency.STARS;
        } else {
            amountUtils$Currency = AmountUtils$Currency.TON;
        }
        setAmount(AmountUtils$Amount.fromNano(0L, amountUtils$Currency), true, false, true);
        this.starsCountEditField.setText("");
    }

    public void lambda$new$2(View view, boolean z) {
        this.starsCountEditOutline.animateSelection(z, !TextUtils.isEmpty(this.starsCountEditField.getText()));
    }

    public void lambda$new$4(Context context, View view) {
        String[] strArr = new String[ALLOWED_DURATIONS.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = ALLOWED_DURATIONS;
            if (i < iArr.length) {
                strArr[i] = LocaleController.formatPluralString("GiftOfferHours", iArr[i] / 3600, new Object[0]);
                if (iArr[i] == this.selectedDuration) {
                    i2 = i;
                }
                i++;
            } else {
                AlertsCreator.createCustomPicker(context, LocaleController.getString(R.string.GiftOfferDuration), i2, strArr, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        GiftOfferSheet.this.lambda$new$3((Integer) obj);
                    }
                });
                return;
            }
        }
    }

    public void lambda$new$3(Integer num) {
        setSelectedDuration(ALLOWED_DURATIONS[num.intValue()], true);
    }

    public void lambda$new$5(int i, Context context, Theme.ResourcesProvider resourcesProvider, long j, View view) {
        if (this.buttonView.isEnabled()) {
            if (MessagesController.getInstance(i).isFrozen()) {
                AccountFrozenAlert.show(i);
                return;
            }
            StarsController starsController = StarsController.getInstance(i, this.inputAmount.currency);
            AmountUtils$Amount of = starsController.balanceAvailable() ? AmountUtils$Amount.of(starsController.getBalance()) : null;
            if (of == null || of.asNano() < this.inputAmount.asNano()) {
                AmountUtils$Amount amountUtils$Amount = this.inputAmount;
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
            openConfirmAlert();
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
            String asDecimalString = this.inputAmount.asDecimalString();
            this.starsCountEditField.setText(asDecimalString);
            this.starsCountEditField.setSelection(asDecimalString.length());
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
            ViewPropertyAnimator animate = this.iconTon.animate();
            AmountUtils$Currency amountUtils$Currency3 = this.inputAmount.currency;
            AmountUtils$Currency amountUtils$Currency4 = AmountUtils$Currency.TON;
            animate.alpha(amountUtils$Currency3 == amountUtils$Currency4 ? 1.0f : 0.0f).scaleX(this.inputAmount.currency == amountUtils$Currency4 ? 1.0f : 0.0f).scaleY(this.inputAmount.currency == amountUtils$Currency4 ? 1.0f : 0.0f).setDuration(180L).start();
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
        String formatNumber;
        AmountUtils$Amount amountUtils$Amount = this.inputAmount;
        boolean z2 = amountUtils$Amount.currency == AmountUtils$Currency.TON;
        ButtonWithCounterView buttonWithCounterView = this.buttonView;
        int i = R.string.GiftOfferButtonStars;
        if (z2) {
            formatNumber = amountUtils$Amount.asDecimalString();
        } else {
            formatNumber = LocaleController.formatNumber(amountUtils$Amount.asDecimal(), ',');
        }
        buttonWithCounterView.setText(StarsIntroActivity.replaceStars(z2, LocaleController.formatString(i, formatNumber), z2 ? this.spanRefTon : this.spanRefStars), z);
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
            d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
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
                GiftOfferSheet.this.lambda$show$6();
            }
        }, 50L);
    }

    public void lambda$show$6() {
        AndroidUtilities.showKeyboard(this.starsCountEditField);
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
                GiftOfferSheet.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
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
        String formatString;
        String asFormatString = this.inputAmount.asFormatString();
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
            formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, asFormatString, DialogObject.getShortName(this.dialogId), this.giftName);
        } else {
            formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, asFormatString, DialogObject.getShortName(this.dialogId), this.giftName);
        }
        textView2.setText(AndroidUtilities.replaceTags(formatString));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 4));
        TableView tableView = new TableView(getContext(), this.resourcesProvider);
        final long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(this.dialogId);
        final AmountUtils$Amount fromDecimal = AmountUtils$Amount.fromDecimal(sendPaidMessagesStars, amountUtils$Currency2);
        String string = LocaleController.getString(R.string.GiftOfferRowOffer);
        int i2 = R.string.GiftOfferAmount;
        tableView.addRow(string, StarsIntroActivity.replaceStarsWithPlain(z, LocaleController.formatString(i2, asFormatString), 0.8f));
        if (sendPaidMessagesStars > 0) {
            tableView.addRow(LocaleController.getString(R.string.GiftOfferRowFee), StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatString(i2, fromDecimal.asFormatString()), 0.8f));
        }
        tableView.addRow(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", this.selectedDuration / 3600, new Object[0]));
        linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 48, 23, 16, 23, 4));
        final long nextRandomId = SendMessagesHelper.getInstance(this.currentAccount).getNextRandomId();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (sendPaidMessagesStars == 0) {
            spannableStringBuilder.append((CharSequence) StarsIntroActivity.replaceStars(z, LocaleController.formatString(R.string.GiftOfferPay, asFormatString)));
        } else if (z) {
            int i3 = R.string.GiftOfferPayMultiPart;
            spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, StarsIntroActivity.replaceStars(true, (CharSequence) LocaleController.formatString(i3, asFormatString)), StarsIntroActivity.replaceStars(LocaleController.formatString(i3, fromDecimal.asFormatString()))));
        } else {
            spannableStringBuilder.append((CharSequence) StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.GiftOfferPay, AmountUtils$Amount.fromNano(this.inputAmount.asNano() + fromDecimal.asNano(), amountUtils$Currency2).asFormatString())));
        }
        new AlertDialog.Builder(getContext(), this.resourcesProvider).setView(linearLayout).setPositiveButton(spannableStringBuilder, new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i4) {
                GiftOfferSheet.this.lambda$openConfirmAlert$9(sendPaidMessagesStars, z, fromDecimal, nextRandomId, alertDialog, i4);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create().setShowStarsBalance(true).show();
    }

    public void lambda$openConfirmAlert$9(long j, boolean z, AmountUtils$Amount amountUtils$Amount, long j2, final AlertDialog alertDialog, int i) {
        AmountUtils$Amount fromNano;
        if (j > 0) {
            int i2 = this.currentAccount;
            AmountUtils$Currency amountUtils$Currency = AmountUtils$Currency.STARS;
            StarsController starsController = StarsController.getInstance(i2, amountUtils$Currency);
            AmountUtils$Amount of = starsController.balanceAvailable() ? AmountUtils$Amount.of(starsController.getBalance()) : null;
            if (z) {
                fromNano = AmountUtils$Amount.fromDecimal(j, amountUtils$Currency);
            } else {
                fromNano = AmountUtils$Amount.fromNano(this.inputAmount.asNano() + amountUtils$Amount.asNano(), amountUtils$Currency);
            }
            if (of == null || of.asNano() < fromNano.asNano()) {
                new StarsIntroActivity.StarsNeededSheet(getContext(), this.resourcesProvider, fromNano.asDecimal(), 14, null, null, this.dialogId).show();
                return;
            }
        }
        final Browser.Progress makeButtonLoading = alertDialog.makeButtonLoading(-1);
        makeButtonLoading.init();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = this.inputAmount.toTl();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
        tL_sendStarGiftOffer.duration = this.selectedDuration;
        tL_sendStarGiftOffer.slug = this.giftUnique.slug;
        tL_sendStarGiftOffer.random_id = j2;
        if (j > 0) {
            tL_sendStarGiftOffer.flags |= 1;
            tL_sendStarGiftOffer.allow_paid_stars = j;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                GiftOfferSheet.this.lambda$openConfirmAlert$8(makeButtonLoading, alertDialog, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public void lambda$openConfirmAlert$8(final Browser.Progress progress, final AlertDialog alertDialog, final TLRPC.Updates updates, final TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GiftOfferSheet.this.lambda$openConfirmAlert$7(progress, alertDialog, updates, tL_error);
            }
        });
    }

    public void lambda$openConfirmAlert$7(Browser.Progress progress, AlertDialog alertDialog, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        Runnable runnable = this.closeParentSheet;
        if (runnable != null) {
            runnable.run();
        }
        progress.end();
        alertDialog.dismiss();
        lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            if (updates != null) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.forward, LocaleController.getString(R.string.GiftOfferSentTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferSentText, this.giftName, DialogObject.getShortName(this.dialogId)))).ignoreDetach().show();
            } else {
                BulletinFactory.of(safeLastFragment).showForError(tL_error);
            }
        }
    }

    public static void openOfferAcceptAlert(final org.telegram.ui.ActionBar.BaseFragment r29, android.content.Context r30, org.telegram.ui.ActionBar.Theme.ResourcesProvider r31, final int r32, long r33, final int r35, org.telegram.tgnet.TLRPC.TL_messageActionStarGiftPurchaseOffer r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.GiftOfferSheet.openOfferAcceptAlert(org.telegram.ui.ActionBar.BaseFragment, android.content.Context, org.telegram.ui.ActionBar.Theme$ResourcesProvider, int, long, int, org.telegram.tgnet.TLRPC$TL_messageActionStarGiftPurchaseOffer):void");
    }

    public static void lambda$openOfferAcceptAlert$12(int i, final int i2, final BaseFragment baseFragment, final AlertDialog alertDialog, int i3) {
        final Browser.Progress makeButtonLoading = alertDialog.makeButtonLoading(-1);
        makeButtonLoading.init();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = i;
        ConnectionsManager.getInstance(i2).sendRequestTyped(tL_resolveStarGiftOffer, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                GiftOfferSheet.lambda$openOfferAcceptAlert$11(i2, baseFragment, makeButtonLoading, alertDialog, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void lambda$openOfferAcceptAlert$11(int i, final BaseFragment baseFragment, final Browser.Progress progress, final AlertDialog alertDialog, TLRPC.Updates updates, final TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(i).processUpdates(updates, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GiftOfferSheet.lambda$openOfferAcceptAlert$10(BaseFragment.this, tL_error, progress, alertDialog);
            }
        });
    }

    public static void lambda$openOfferAcceptAlert$10(BaseFragment baseFragment, TLRPC.TL_error tL_error, Browser.Progress progress, AlertDialog alertDialog) {
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
        return AmountUtils$Amount.fromNano((amountUtils$Amount.asNano() * i2) / 1000, amountUtils$Currency);
    }
}
