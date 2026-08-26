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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkr;
import com.stripe.android.Stripe;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
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
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda16;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda20;
import org.telegram.ui.iv.RichMapCell;
import org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda3;

public final class GiftOfferSheet extends BottomSheetWithRecyclerListView {
    public static final int[] ALLOWED_DURATIONS = {21600, 43200, 86400, 129600, 172800, 259200};
    public UniversalAdapter adapter;
    public final BalanceCloud balanceCloud;
    public boolean balanceCloudVisible;
    public final ButtonWithCounterView buttonView;
    public final StarGiftSheet$$ExternalSyntheticLambda4 closeParentSheet;
    public final HorizontalRoundTabsLayout currencyTabsView;
    public final long dialogId;
    public final AnimatedTextView dollarsEqView;
    public final String giftName;
    public final TL_stars.TL_starGiftUnique giftUnique;
    public final ImageView iconStars;
    public final ImageView iconTon;
    public AmountUtils$Amount inputAmount;
    public int inputAmountError;
    public final RichMapCell.AnonymousClass1 inputAmountLimits;
    public boolean isFullyVisible;
    public final UItem mainItem;
    public final AnonymousClass1 publishingTimeField;
    public final TextView publishingTimeHint;
    public int selectedDuration;
    public final ColoredImageSpan[] spanRefStars;
    public final ColoredImageSpan[] spanRefTon;
    public final EditTextBoldCursor starsCountEditField;
    public final TextView starsCountEditHint;
    public final OutlineTextContainerView starsCountEditOutline;

    public final class AnonymousClass1 extends EditTextBoldCursor {
        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }
    }

    public GiftOfferSheet(Context context, int i, long j, TL_stars.TL_starGiftUnique tL_starGiftUnique, Theme.ResourcesProvider resourcesProvider, StarGiftSheet$$ExternalSyntheticLambda4 starGiftSheet$$ExternalSyntheticLambda4) {
        TLRPC.User user;
        super(context, null, true, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, resourcesProvider);
        RichMapCell.AnonymousClass1 anonymousClass1 = new RichMapCell.AnonymousClass1();
        this.inputAmountLimits = anonymousClass1;
        this.spanRefStars = new ColoredImageSpan[1];
        this.spanRefTon = new ColoredImageSpan[1];
        this.ignoreTouchActionBar = false;
        this.headerMoveTop = AndroidUtilities.dp(12.0f);
        this.topPadding = 0.2f;
        this.dialogId = j;
        this.giftUnique = tL_starGiftUnique;
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        this.giftName = BillingController$$ExternalSyntheticOutline0.m(tL_starGiftUnique.num, ',', sb);
        this.closeParentSheet = starGiftSheet$$ExternalSyntheticLambda4;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean zCanUseTon = StarsController.getInstance(i, true).canUseTon();
        if (j > 0 && MessagesController.getInstance(i).getUserFull(j) == null && (user = MessagesController.getInstance(i).getUser(Long.valueOf(j))) != null) {
            MessagesController.getInstance(i).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i).config;
        long j2 = tL_starGiftUnique.offer_min_stars;
        AmountUtils$Currency amountUtils$Currency = AmountUtils$Currency.STARS;
        AmountUtils$Amount amountUtils$AmountFromDecimal = AmountUtils$Amount.fromDecimal(j2, amountUtils$Currency);
        AmountUtils$Amount amountUtils$AmountFromDecimal2 = AmountUtils$Amount.fromDecimal(Math.max((amountUtils$AmountFromDecimal.nanos / 1000000000) * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), amountUtils$Currency);
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.TON;
        AmountUtils$Amount amountUtils$AmountFromNano = AmountUtils$Amount.fromNano(Math.max(amountUtils$AmountFromDecimal.convertTo(amountUtils$Currency2).round(2).nanos, appGlobalConfig.tonStarGiftResaleAmountMin.get()), amountUtils$Currency2);
        AmountUtils$Amount amountUtils$AmountFromNano2 = AmountUtils$Amount.fromNano(Math.max(amountUtils$AmountFromNano.nanos * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), amountUtils$Currency2);
        AmountUtils$Currency amountUtils$Currency3 = amountUtils$AmountFromDecimal2.currency;
        Stripe[] stripeArr = (Stripe[]) anonymousClass1.this$0;
        AmountUtils$Currency amountUtils$Currency4 = amountUtils$AmountFromDecimal.currency;
        if (amountUtils$Currency4 == amountUtils$Currency3) {
            stripeArr[amountUtils$Currency4.ordinal()] = new Stripe(15, amountUtils$AmountFromDecimal, amountUtils$AmountFromDecimal2);
        }
        AmountUtils$Currency amountUtils$Currency5 = amountUtils$AmountFromNano2.currency;
        AmountUtils$Currency amountUtils$Currency6 = amountUtils$AmountFromNano.currency;
        if (amountUtils$Currency6 == amountUtils$Currency5) {
            stripeArr[amountUtils$Currency6.ordinal()] = new Stripe(15, amountUtils$AmountFromNano, amountUtils$AmountFromNano2);
        }
        BalanceCloud balanceCloud = new BalanceCloud(context, i, amountUtils$Currency, resourcesProvider);
        this.balanceCloud = balanceCloud;
        balanceCloud.setScaleX(0.6f);
        balanceCloud.setScaleY(0.6f);
        balanceCloud.setAlpha(0.0f);
        balanceCloud.setEnabled(false);
        balanceCloud.setClickable(false);
        this.container.addView(balanceCloud, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        ScaleStateListAnimator.apply(balanceCloud);
        balanceCloud.setOnClickListener(new GiftOfferSheet$$ExternalSyntheticLambda2(this, context, resourcesProvider, 0));
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
            ArrayList<CharSequence> arrayList = new ArrayList<>();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            horizontalRoundTabsLayout.setTabs(arrayList, new GiftOfferSheet$$ExternalSyntheticLambda3(this, 0));
            linearLayout.addView(horizontalRoundTabsLayout, LayoutHelper.createLinear(-1, -2, 18.0f, 0.0f, 18.0f, 18.0f));
        } else {
            this.currencyTabsView = null;
        }
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        linearLayout.addView(linearLayoutM, LayoutHelper.createLinear(-1, -2, 1.0f));
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
        editTextBoldCursor.setTextColor(Theme.getColor(null, i2, false));
        editTextBoldCursor.requestFocus();
        outlineTextContainerView.setLeftPadding(AndroidUtilities.dp(28.0f));
        outlineTextContainerView.attachEditText(editTextBoldCursor);
        outlineTextContainerView.animateSelection(true, false, false);
        outlineTextContainerView.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new RichTextCell$$ExternalSyntheticLambda3(this, 5));
        outlineTextContainerView.addView(editTextBoldCursor, LayoutHelper.createFrame(-1, -2, 48));
        linearLayoutM.addView(outlineTextContainerView, LayoutHelper.createLinear(-1, 58, 18.0f, 0.0f, 18.0f, 0.0f));
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
        animatedTextView.setTextColor(Theme.getColor(null, i3, false));
        animatedTextView.setTextSize(AndroidUtilities.dp(13.0f));
        animatedTextView.setGravity(5);
        outlineTextContainerView.addView(animatedTextView, LayoutHelper.createFrame(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.starsCountEditHint = textView;
        textView.setTextSize(1, 13.0f);
        linearLayoutM.addView(textView, LayoutHelper.createLinear(-1, -2, 55, 33, 4, 33, 0));
        AnonymousClass1 anonymousClass2 = new AnonymousClass1(context);
        this.publishingTimeField = anonymousClass2;
        anonymousClass2.setCursorSize(AndroidUtilities.dp(20.0f));
        anonymousClass2.setCursorWidth(1.5f);
        anonymousClass2.setTextSize(1, 17.0f);
        anonymousClass2.setMaxLines(1);
        anonymousClass2.setBackground(null);
        anonymousClass2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        anonymousClass2.setTextColor(Theme.getColor(null, i2, false));
        anonymousClass2.setFocusable(false);
        anonymousClass2.setClickable(false);
        anonymousClass2.setEnabled(false);
        OutlineTextContainerView outlineTextContainerView2 = new OutlineTextContainerView(context);
        outlineTextContainerView2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        outlineTextContainerView2.attachEditText(anonymousClass2);
        outlineTextContainerView2.addView(anonymousClass2, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        ScaleStateListAnimator.apply(outlineTextContainerView2, 0.02f, 1.2f);
        outlineTextContainerView2.setOnClickListener(new RichEditor$$ExternalSyntheticLambda20(5, this, context));
        linearLayoutM.addView(outlineTextContainerView2, LayoutHelper.createLinear(-1, 58, 18.0f, 18.0f, 18.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogEmptyImage, resourcesProvider), PorterDuff.Mode.SRC_IN));
        outlineTextContainerView2.addView(imageView3, LayoutHelper.createFrame(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.publishingTimeHint = textView2;
        textView2.setTextColor(Theme.getColor(null, i3, false));
        textView2.setTextSize(1, 13.0f);
        linearLayoutM.addView(textView2, LayoutHelper.createLinear(-1, -2, 55, 33, 4, 33, 0));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider);
        this.buttonView = buttonWithCounterView;
        buttonWithCounterView.setOnClickListener(new GiftOfferSheet$$ExternalSyntheticLambda6(this, i, context, resourcesProvider, j));
        setAmount(AmountUtils$Amount.fromNano(0L, amountUtils$Currency), false, true, false);
        if (this.selectedDuration != 86400) {
            this.selectedDuration = 86400;
            anonymousClass2.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        checkButtonEnabled(false);
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                String string;
                int iIndexOf;
                boolean z = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
                if (!z && (iIndexOf = (string = editable.toString()).indexOf(46)) >= 0 && (string.length() - iIndexOf) - 1 > 2) {
                    editable.delete(iIndexOf + 3, string.length());
                }
                GiftOfferSheet giftOfferSheet = GiftOfferSheet.this;
                giftOfferSheet.setAmount(!z ? AmountUtils$Amount.fromDecimal(editable.toString(), giftOfferSheet.inputAmount.currency) : AmountUtils$Amount.fromNano(0L, giftOfferSheet.inputAmount.currency), false, false, true);
                giftOfferSheet.starsCountEditOutline.animateSelection(giftOfferSheet.starsCountEditField.isFocused(), true ^ TextUtils.isEmpty(giftOfferSheet.starsCountEditField.getText()));
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
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

    public final void checkBalanceCloudVisibility$1() {
        boolean z = this.isFullyVisible;
        BalanceCloud balanceCloud = this.balanceCloud;
        boolean z2 = (z && !isDismissed() && balanceCloud != null && this.containerView.getY() > ((float) AndroidUtilities.dp(32.0f))) || this.currencyTabsView == null;
        if (this.balanceCloudVisible != z2) {
            this.balanceCloudVisible = z2;
            if (balanceCloud != null) {
                balanceCloud.setEnabled(z2);
                balanceCloud.setClickable(z2);
                OKLCH.m(balanceCloud.animate().scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f), z2 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void checkButtonEnabled(boolean z) {
        boolean z2 = this.inputAmountError == 0 && this.inputAmount.nanos > 0;
        ButtonWithCounterView buttonWithCounterView = this.buttonView;
        if (buttonWithCounterView.isEnabled() != z2) {
            buttonWithCounterView.setEnabled(z2);
            buttonWithCounterView.setClickable(z2);
            if (z) {
                OKLCH.m(buttonWithCounterView.animate(), z2 ? 1.0f : 0.6f, 180L);
            } else {
                buttonWithCounterView.setAlpha(z2 ? 1.0f : 0.6f);
            }
        }
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new GiftSheet$$ExternalSyntheticLambda8(this, 26), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }

    @Override
    public final boolean isTouchOutside(float f, float f2) {
        BalanceCloud balanceCloud;
        if (!this.balanceCloudVisible || (balanceCloud = this.balanceCloud) == null || f < balanceCloud.getX() || f > balanceCloud.getX() + balanceCloud.getWidth() || f2 < balanceCloud.getY() || f2 > balanceCloud.getY() + balanceCloud.getHeight()) {
            return super.isTouchOutside(f, f2);
        }
        return false;
    }

    public final void lambda$new$5(int i, long j, Context context, Theme.ResourcesProvider resourcesProvider) {
        if (this.buttonView.isEnabled()) {
            if (MessagesController.getInstance(i).isFrozen()) {
                AccountFrozenAlert.show(i);
                return;
            }
            StarsController starsController = StarsController.getInstance(i, this.inputAmount.currency);
            AmountUtils$Amount amountUtils$AmountOf = starsController.balanceLoaded ? AmountUtils$Amount.of(starsController.getBalance()) : null;
            AmountUtils$Currency amountUtils$Currency = AmountUtils$Currency.STARS;
            AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.TON;
            if (amountUtils$AmountOf != null) {
                AmountUtils$Amount amountUtils$Amount = this.inputAmount;
                if (amountUtils$AmountOf.nanos >= amountUtils$Amount.nanos) {
                    String strAsFormatString = amountUtils$Amount.asFormatString();
                    final boolean z = this.inputAmount.currency == amountUtils$Currency2;
                    LinearLayout linearLayout = new LinearLayout(getContext());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(getContext());
                    textView.setText(LocaleController.getString(R.string.GiftOfferConfirmSend));
                    int i2 = Theme.key_dialogTextBlack;
                    zzkr.m(i2, this.resourcesProvider, textView, 20.0f);
                    linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(getContext());
                    OKLCH.m(i2, this.resourcesProvider, textView2, 16.0f);
                    AmountUtils$Currency amountUtils$Currency3 = this.inputAmount.currency;
                    String str = this.giftName;
                    long j2 = this.dialogId;
                    textView2.setText(AndroidUtilities.replaceTags(amountUtils$Currency3 == amountUtils$Currency ? LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, strAsFormatString, DialogObject.getShortName(j2), str) : LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, strAsFormatString, DialogObject.getShortName(j2), str)));
                    linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 4));
                    TableView tableView = new TableView(getContext(), this.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j2);
                    final AmountUtils$Amount amountUtils$AmountFromDecimal = AmountUtils$Amount.fromDecimal(sendPaidMessagesStars, amountUtils$Currency);
                    String string = LocaleController.getString(R.string.GiftOfferRowOffer);
                    int i3 = R.string.GiftOfferAmount;
                    tableView.addRow(string, StarsIntroActivity.replaceStarsWithPlain(z, LocaleController.formatString(i3, strAsFormatString), 0.8f, null));
                    if (sendPaidMessagesStars > 0) {
                        tableView.addRow(LocaleController.getString(R.string.GiftOfferRowFee), StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatString(i3, amountUtils$AmountFromDecimal.asFormatString()), 0.8f, null));
                    }
                    tableView.addRow(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", this.selectedDuration / 3600, new Object[0]));
                    linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(this.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (sendPaidMessagesStars != 0) {
                        if (z) {
                            int i4 = R.string.GiftOfferPayMultiPart;
                            spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, StarsIntroActivity.replaceStars(true, (CharSequence) LocaleController.formatString(i4, strAsFormatString), 1.13f), StarsIntroActivity.replaceStars(LocaleController.formatString(i4, amountUtils$AmountFromDecimal.asFormatString()), 1.13f, (ColoredImageSpan[]) null)));
                        } else {
                            spannableStringBuilder.append((CharSequence) StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.GiftOfferPay, AmountUtils$Amount.fromNano(this.inputAmount.nanos + amountUtils$AmountFromDecimal.nanos, amountUtils$Currency).asFormatString()), 1.13f, (ColoredImageSpan[]) null));
                        }
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider).setView(linearLayout).setPositiveButton(spannableStringBuilder, new AlertDialog.OnButtonClickListener() {
                            @Override
                            public final void onClick(AlertDialog alertDialog, int i5) {
                                this.f$0.lambda$openConfirmAlert$9(sendPaidMessagesStars, z, amountUtils$AmountFromDecimal, nextRandomId, alertDialog);
                            }
                        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
                        alertDialogCreate.needStarsBalance = true;
                        alertDialogCreate.show();
                        return;
                    }
                    spannableStringBuilder.append((CharSequence) StarsIntroActivity.replaceStars(z, LocaleController.formatString(R.string.GiftOfferPay, strAsFormatString), 1.13f));
                    AlertDialog alertDialogCreate2 = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider).setView(linearLayout).setPositiveButton(spannableStringBuilder, new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i5) {
                            this.f$0.lambda$openConfirmAlert$9(sendPaidMessagesStars, z, amountUtils$AmountFromDecimal, nextRandomId, alertDialog);
                        }
                    }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
                    alertDialogCreate2.needStarsBalance = true;
                    alertDialogCreate2.show();
                    return;
                }
            }
            AmountUtils$Amount amountUtils$Amount2 = this.inputAmount;
            AmountUtils$Currency amountUtils$Currency4 = amountUtils$Amount2.currency;
            if (amountUtils$Currency4 == amountUtils$Currency) {
                new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, amountUtils$Amount2.nanos / 1000000000, 14, null, null, j).show();
            } else if (amountUtils$Currency4 == amountUtils$Currency2) {
                new TONIntroActivity.StarsNeededSheet(context, resourcesProvider, amountUtils$Amount2, true, null).show();
            }
        }
    }

    public final void lambda$openConfirmAlert$8(Browser.Progress progress, AlertDialog alertDialog, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
        }
        AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16((Object) this, (Object) progress, (Object) alertDialog, (TLObject) updates, tL_error, 10));
    }

    public final void lambda$openConfirmAlert$9(long j, boolean z, AmountUtils$Amount amountUtils$Amount, long j2, AlertDialog alertDialog) {
        if (j > 0) {
            int i = this.currentAccount;
            AmountUtils$Currency amountUtils$Currency = AmountUtils$Currency.STARS;
            StarsController starsController = StarsController.getInstance(i, amountUtils$Currency);
            AmountUtils$Amount amountUtils$AmountOf = starsController.balanceLoaded ? AmountUtils$Amount.of(starsController.getBalance()) : null;
            AmountUtils$Amount amountUtils$AmountFromDecimal = z ? AmountUtils$Amount.fromDecimal(j, amountUtils$Currency) : AmountUtils$Amount.fromNano(this.inputAmount.nanos + amountUtils$Amount.nanos, amountUtils$Currency);
            if (amountUtils$AmountOf == null || amountUtils$AmountOf.nanos < amountUtils$AmountFromDecimal.nanos) {
                new StarsIntroActivity.StarsNeededSheet(getContext(), this.resourcesProvider, amountUtils$AmountFromDecimal.nanos / 1000000000, 14, null, null, this.dialogId).show();
                return;
            }
        }
        Browser.Progress progressMakeButtonLoading = alertDialog.makeButtonLoading(-1, true, true);
        progressMakeButtonLoading.init();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = this.inputAmount.toTl();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
        tL_sendStarGiftOffer.duration = this.selectedDuration;
        tL_sendStarGiftOffer.slug = this.giftUnique.slug;
        tL_sendStarGiftOffer.random_id = j2;
        if (j > 0) {
            tL_sendStarGiftOffer.flags = 1 | tL_sendStarGiftOffer.flags;
            tL_sendStarGiftOffer.allow_paid_stars = j;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new GiftOfferSheet$$ExternalSyntheticLambda12(this, progressMakeButtonLoading, alertDialog, 0));
    }

    @Override
    public final void onContainerTranslationYChanged(float f) {
        super.onContainerTranslationYChanged(f);
        checkBalanceCloudVisibility$1();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.isFullyVisible = true;
        checkBalanceCloudVisibility$1();
    }

    public final void setAmount(AmountUtils$Amount amountUtils$Amount, boolean z, boolean z2, boolean z3) {
        char c;
        long j;
        AmountUtils$Currency amountUtils$Currency;
        AmountUtils$Amount amountUtils$Amount2 = this.inputAmount;
        int i = this.inputAmountError;
        this.inputAmountError = 0;
        if (amountUtils$Amount != null) {
            this.inputAmount = amountUtils$Amount;
        } else {
            this.inputAmount = AmountUtils$Amount.fromNano(0L, amountUtils$Amount2.currency);
            this.inputAmountError |= 1;
        }
        AmountUtils$Currency amountUtils$Currency2 = this.inputAmount.currency;
        RichMapCell.AnonymousClass1 anonymousClass1 = this.inputAmountLimits;
        AmountUtils$Amount amountUtils$Amount3 = (AmountUtils$Amount) ((Stripe[]) anonymousClass1.this$0)[amountUtils$Currency2.ordinal()].defaultPublishableKey;
        AmountUtils$Amount amountUtils$Amount4 = this.inputAmount;
        if (amountUtils$Amount3.nanos < amountUtils$Amount4.nanos) {
            this.inputAmountError |= 4;
        }
        boolean zIsZero = amountUtils$Amount4.isZero();
        Stripe[] stripeArr = (Stripe[]) anonymousClass1.this$0;
        if (!zIsZero) {
            if (((AmountUtils$Amount) stripeArr[this.inputAmount.currency.ordinal()].tokenCreator).nanos > this.inputAmount.nanos) {
                this.inputAmountError |= 2;
            }
        }
        boolean z4 = z2 || amountUtils$Amount2.currency != this.inputAmount.currency;
        boolean z5 = z2 || amountUtils$Amount2.nanos != this.inputAmount.nanos;
        boolean z6 = z2 || i != this.inputAmountError;
        AmountUtils$Currency amountUtils$Currency3 = AmountUtils$Currency.STARS;
        AmountUtils$Currency amountUtils$Currency4 = AmountUtils$Currency.TON;
        EditTextBoldCursor editTextBoldCursor = this.starsCountEditField;
        if (z4) {
            HorizontalRoundTabsLayout horizontalRoundTabsLayout = this.currencyTabsView;
            if (horizontalRoundTabsLayout != null) {
                horizontalRoundTabsLayout.setSelectedIndex(this.inputAmount.currency == amountUtils$Currency3 ? 0 : 1, z3);
            }
            String shortName = DialogObject.getShortName(this.dialogId);
            AmountUtils$Currency amountUtils$Currency5 = this.inputAmount.currency;
            c = 0;
            TextView textView = this.publishingTimeHint;
            if (amountUtils$Currency5 == amountUtils$Currency3) {
                j = 1000000000;
                ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0.m(R.string.GiftOfferDurationInfoStars, new Object[]{shortName}, textView);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((AmountUtils$Amount) stripeArr[this.inputAmount.currency.ordinal()].defaultPublishableKey).nanos / 1000000000).length())});
            } else {
                j = 1000000000;
                if (amountUtils$Currency5 == amountUtils$Currency4) {
                    ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0.m(R.string.GiftOfferDurationInfoTON, new Object[]{shortName}, textView);
                    editTextBoldCursor.setInputType(8194);
                    editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((AmountUtils$Amount) stripeArr[this.inputAmount.currency.ordinal()].defaultPublishableKey).nanos / 1000000000).length() + 3)});
                }
            }
            ImageView imageView = this.iconTon;
            ImageView imageView2 = this.iconStars;
            if (z3) {
                imageView2.animate().alpha(this.inputAmount.currency == amountUtils$Currency3 ? 1.0f : 0.0f).scaleX(this.inputAmount.currency == amountUtils$Currency3 ? 1.0f : 0.0f).scaleY(this.inputAmount.currency == amountUtils$Currency3 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.inputAmount.currency == amountUtils$Currency4 ? 1.0f : 0.0f).scaleX(this.inputAmount.currency == amountUtils$Currency4 ? 1.0f : 0.0f).scaleY(this.inputAmount.currency == amountUtils$Currency4 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                imageView2.setAlpha(this.inputAmount.currency == amountUtils$Currency3 ? 1.0f : 0.0f);
                imageView.setAlpha(this.inputAmount.currency == amountUtils$Currency4 ? 1.0f : 0.0f);
            }
            BalanceCloud balanceCloud = this.balanceCloud;
            if (balanceCloud != null && balanceCloud.currency != (amountUtils$Currency = this.inputAmount.currency)) {
                balanceCloud.currency = amountUtils$Currency;
                balanceCloud.updateBalance();
            }
        } else {
            c = 0;
            j = 1000000000;
        }
        if (z4 || z6) {
            this.starsCountEditOutline.setText(LocaleController.getString(this.inputAmount.currency == amountUtils$Currency3 ? R.string.GiftOfferStarsToOffer : R.string.GiftOfferTONToOffer));
            AmountUtils$Currency amountUtils$Currency6 = this.inputAmount.currency;
            int i2 = this.inputAmountError;
            int i3 = i2 & 4;
            TextView textView2 = this.starsCountEditHint;
            String str = this.giftName;
            if (i3 != 0) {
                int i4 = amountUtils$Currency6 == amountUtils$Currency3 ? R.string.GiftOfferStarsToOfferInfoIsHigh : R.string.GiftOfferTONToOfferInfoIsHigh;
                String strAsFormatString = ((AmountUtils$Amount) stripeArr[amountUtils$Currency6.ordinal()].defaultPublishableKey).asFormatString();
                Object[] objArr = new Object[2];
                objArr[c] = strAsFormatString;
                objArr[1] = str;
                ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0.m(i4, objArr, textView2);
            } else if ((i2 & 2) != 0) {
                int i5 = amountUtils$Currency6 == amountUtils$Currency3 ? R.string.GiftOfferStarsToOfferInfoIsLow : R.string.GiftOfferTONToOfferInfoIsLow;
                String strAsFormatString2 = ((AmountUtils$Amount) stripeArr[amountUtils$Currency6.ordinal()].tokenCreator).asFormatString();
                Object[] objArr2 = new Object[2];
                objArr2[c] = strAsFormatString2;
                objArr2[1] = str;
                ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0.m(i5, objArr2, textView2);
            } else {
                int i6 = amountUtils$Currency6 == amountUtils$Currency3 ? R.string.GiftOfferStarsToOfferInfo : R.string.GiftOfferTONToOfferInfo;
                Object[] objArr3 = new Object[1];
                objArr3[c] = str;
                ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0.m(i6, objArr3, textView2);
            }
            textView2.setTextColor(getThemedColor((this.inputAmountError & (-9)) == 0 ? Theme.key_windowBackgroundWhiteGrayText : Theme.key_text_RedBold));
        }
        if (z4 || z5 || z6) {
            AmountUtils$Amount amountUtils$Amount5 = this.inputAmount;
            boolean z7 = amountUtils$Amount5.currency == amountUtils$Currency4;
            int i7 = R.string.GiftOfferButtonStars;
            Object[] objArr4 = new Object[1];
            objArr4[c] = z7 ? amountUtils$Amount5.asDecimalString() : LocaleController.formatNumber(amountUtils$Amount5.nanos / j, ',');
            this.buttonView.setText(StarsIntroActivity.replaceStars(z7, LocaleController.formatString(i7, objArr4), z7 ? this.spanRefTon : this.spanRefStars), z3);
            checkButtonEnabled(z3);
        }
        if (z4 || z5) {
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            sb.append(BillingController.getInstance().formatCurrency((long) (this.inputAmount.asDouble() * (this.inputAmount.currency == amountUtils$Currency4 ? MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() : ((double) MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000) * 1.0E-5d) * 100.0d), "USD", 2));
            this.dollarsEqView.setText(sb, z3);
        }
        if (z && z5) {
            String strAsDecimalString = this.inputAmount.asDecimalString();
            editTextBoldCursor.setText(strAsDecimalString);
            editTextBoldCursor.setSelection(strAsDecimalString.length());
        }
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new BalanceCloud$$ExternalSyntheticLambda1(this, 3), 50L);
    }
}
