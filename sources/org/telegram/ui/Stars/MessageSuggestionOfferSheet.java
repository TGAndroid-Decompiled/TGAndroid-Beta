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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.HorizontalRoundTabsLayout;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TON.TONIntroActivity;

public class MessageSuggestionOfferSheet extends BottomSheet {
    private final BalanceCloud balanceCloud;
    private boolean balanceCloudVisible;
    private final ButtonWithCounterView buttonView;
    private final HorizontalRoundTabsLayout currencyTabsView;
    private final AnimatedTextView dollarsEqView;
    private final ImageView iconStars;
    private final ImageView iconTon;
    private AmountUtils$Amount inputAmount;
    private int inputAmountError;
    private final AmountUtils$Amount inputAmountMaxStars;
    private final AmountUtils$Amount inputAmountMaxTON;
    private final AmountUtils$Amount inputAmountMinStars;
    private final AmountUtils$Amount inputAmountMinTON;
    private boolean isFullyVisible;
    private final boolean isMonoForumAdmin;
    private final int mode;
    private final EditTextBoldCursor publishingTimeField;
    private long selectedTime;
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

    public MessageSuggestionOfferSheet(final Context context, final int i, final long j, MessageSuggestionParams messageSuggestionParams, final ChatActivity chatActivity, final Theme.ResourcesProvider resourcesProvider, int i2, final Utilities.Callback callback) {
        int i3;
        boolean z;
        super(context, true, resourcesProvider);
        this.selectedTime = -1L;
        this.spanRefStars = new ColoredImageSpan[1];
        this.spanRefTon = new ColoredImageSpan[1];
        this.mode = i2;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean zCanManageMonoForum = ChatObject.canManageMonoForum(i, j);
        this.isMonoForumAdmin = zCanManageMonoForum;
        boolean z2 = zCanManageMonoForum || StarsController.getTonInstance(i).canUseTon();
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i).config;
        long j2 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        AmountUtils$Currency amountUtils$Currency = AmountUtils$Currency.TON;
        this.inputAmountMinTON = AmountUtils$Amount.fromNano(j2, amountUtils$Currency);
        this.inputAmountMaxTON = AmountUtils$Amount.fromNano(appGlobalConfig.tonSuggestedPostAmountMax.get(), amountUtils$Currency);
        long j3 = appGlobalConfig.starsSuggestedPostAmountMin.get();
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.STARS;
        this.inputAmountMinStars = AmountUtils$Amount.fromDecimal(j3, amountUtils$Currency2);
        this.inputAmountMaxStars = AmountUtils$Amount.fromDecimal(appGlobalConfig.starsSuggestedPostAmountMax.get(), amountUtils$Currency2);
        if (!zCanManageMonoForum) {
            BalanceCloud balanceCloud = new BalanceCloud(context, i, MessagesController.getInstance(i).getChat(Long.valueOf(j)).linked_monoforum_id, resourcesProvider);
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
                    this.f$0.lambda$new$0(context, resourcesProvider, view);
                }
            });
        } else {
            this.balanceCloud = null;
        }
        fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i4));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        if (i2 == 0) {
            i3 = R.string.PostSuggestionsOfferTitle;
        } else {
            i3 = R.string.PostSuggestionsOfferChangeTitle;
        }
        textView.setText(LocaleController.getString(i3));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(textView, LayoutHelper.createLinear(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i5 = Theme.key_dialogEmptyImage;
        int color = Theme.getColor(i5, resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
        ScaleStateListAnimator.apply(imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$1(view);
            }
        });
        linearLayout2.addView(imageView, LayoutHelper.createLinear(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.starsCountEditField = editTextBoldCursor;
        if (z2) {
            HorizontalRoundTabsLayout horizontalRoundTabsLayout = new HorizontalRoundTabsLayout(context, resourcesProvider);
            this.currencyTabsView = horizontalRoundTabsLayout;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            horizontalRoundTabsLayout.setTabs(arrayList, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i6) {
                    this.f$0.lambda$new$2(i6);
                }
            });
            linearLayout.addView(horizontalRoundTabsLayout, LayoutHelper.createLinear(-1, -2, 18.0f, 0.0f, 18.0f, 12.0f));
        } else {
            this.currencyTabsView = null;
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 1.0f));
        OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
        this.starsCountEditOutline = outlineTextContainerView;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(Theme.getColor(i4));
        editTextBoldCursor.requestFocus();
        outlineTextContainerView.setLeftPadding(AndroidUtilities.dp(28.0f));
        outlineTextContainerView.attachEditText(editTextBoldCursor);
        AmountUtils$Amount amountUtils$Amount = messageSuggestionParams.amount;
        outlineTextContainerView.animateSelection(true, (amountUtils$Amount == null || amountUtils$Amount.isZero()) ? false : true, false);
        outlineTextContainerView.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view, boolean z3) {
                this.f$0.lambda$new$3(view, z3);
            }
        });
        outlineTextContainerView.addView(editTextBoldCursor, LayoutHelper.createFrame(-1, -2, 48));
        linearLayout3.addView(outlineTextContainerView, LayoutHelper.createLinear(-1, 58, 18.0f, 0.0f, 18.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.iconStars = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        outlineTextContainerView.addView(imageView2, LayoutHelper.createFrame(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.iconTon = imageView3;
        imageView3.setImageResource(R.drawable.ton);
        imageView3.setColorFilter(-13397548);
        outlineTextContainerView.addView(imageView3, LayoutHelper.createFrame(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(context);
        this.dollarsEqView = animatedTextView;
        int i6 = Theme.key_windowBackgroundWhiteGrayText;
        animatedTextView.setTextColor(Theme.getColor(i6));
        animatedTextView.setTextSize(AndroidUtilities.dp(13.0f));
        animatedTextView.setGravity(5);
        outlineTextContainerView.addView(animatedTextView, LayoutHelper.createFrame(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.starsCountEditHint = textView2;
        textView2.setTextColor(Theme.getColor(i6));
        textView2.setTextSize(1, 13.0f);
        linearLayout3.addView(textView2, LayoutHelper.createLinear(-1, -2, 55, 33, 4, 33, 0));
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
        editTextBoldCursor2.setTextColor(Theme.getColor(i4));
        editTextBoldCursor2.setFocusable(false);
        editTextBoldCursor2.setClickable(false);
        editTextBoldCursor2.setEnabled(false);
        OutlineTextContainerView outlineTextContainerView2 = new OutlineTextContainerView(context);
        outlineTextContainerView2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        outlineTextContainerView2.attachEditText(editTextBoldCursor2);
        outlineTextContainerView2.addView(editTextBoldCursor2, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        ScaleStateListAnimator.apply(outlineTextContainerView2, 0.02f, 1.2f);
        outlineTextContainerView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$5(context, resourcesProvider, view);
            }
        });
        linearLayout3.addView(outlineTextContainerView2, LayoutHelper.createLinear(-1, 58, 18.0f, 24.0f, 18.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        imageView4.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i5, resourcesProvider), mode));
        outlineTextContainerView2.addView(imageView4, LayoutHelper.createFrame(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextColor(Theme.getColor(i6));
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout.addView(linearLayout4, LayoutHelper.createLinear(-1, -2, 80));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        this.buttonView = buttonWithCounterView;
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$6(chatActivity, i, context, resourcesProvider, j, callback, view);
            }
        });
        if (i2 == 1) {
            buttonWithCounterView.setText(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false);
        }
        linearLayout4.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 18.0f, 0.0f, 18.0f, 8.0f));
        AmountUtils$Amount amountUtils$Amount2 = messageSuggestionParams.amount;
        if (amountUtils$Amount2 != null) {
            z = false;
            setAmount(AmountUtils$Amount.fromNano(amountUtils$Amount2.asNano(), messageSuggestionParams.amount.currency), !messageSuggestionParams.amount.isZero(), true, false);
        } else {
            z = false;
            setAmount(AmountUtils$Amount.fromNano(0L, amountUtils$Currency2), false, true, false);
        }
        setSelectedTime(messageSuggestionParams.time, z);
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String string;
                int iIndexOf;
                boolean z3 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
                if (!z3 && (iIndexOf = (string = editable.toString()).indexOf(46)) >= 0 && (string.length() - iIndexOf) - 1 > 2) {
                    editable.delete(iIndexOf + 3, string.length());
                }
                MessageSuggestionOfferSheet.this.setAmount(!z3 ? AmountUtils$Amount.fromDecimal(editable.toString(), MessageSuggestionOfferSheet.this.inputAmount.currency) : AmountUtils$Amount.fromNano(0L, MessageSuggestionOfferSheet.this.inputAmount.currency), false, false, true);
                MessageSuggestionOfferSheet.this.starsCountEditOutline.animateSelection(MessageSuggestionOfferSheet.this.starsCountEditField.isFocused(), true ^ TextUtils.isEmpty(MessageSuggestionOfferSheet.this.starsCountEditField.getText()));
            }
        });
    }

    public void lambda$new$0(Context context, Theme.ResourcesProvider resourcesProvider, View view) {
        if (this.inputAmount.currency == AmountUtils$Currency.STARS) {
            new StarsIntroActivity.StarsOptionsSheet(context, resourcesProvider).show();
        }
    }

    public void lambda$new$1(View view) {
        lambda$new$0();
    }

    public void lambda$new$2(int i) {
        AmountUtils$Currency amountUtils$Currency;
        if (i == 0) {
            amountUtils$Currency = AmountUtils$Currency.STARS;
        } else {
            amountUtils$Currency = AmountUtils$Currency.TON;
        }
        setAmount(AmountUtils$Amount.fromNano(0L, amountUtils$Currency), true, false, true);
        this.starsCountEditField.setText("");
    }

    public void lambda$new$3(View view, boolean z) {
        this.starsCountEditOutline.animateSelection(z, !TextUtils.isEmpty(this.starsCountEditField.getText()));
    }

    public void lambda$new$5(Context context, Theme.ResourcesProvider resourcesProvider, View view) {
        AlertsCreator.createSuggestedMessageDatePickerDialog(context, this.selectedTime, new AlertsCreator.ScheduleDatePickerDelegate() {
            @Override
            public final void didSelectDate(boolean z, int i, int i2) {
                this.f$0.lambda$new$4(z, i, i2);
            }
        }, resourcesProvider, 0).show();
    }

    public void lambda$new$4(boolean z, int i, int i2) {
        if (z) {
            setSelectedTime(i, true);
        }
    }

    public void lambda$new$6(ChatActivity chatActivity, int i, Context context, Theme.ResourcesProvider resourcesProvider, long j, Utilities.Callback callback, View view) {
        if (chatActivity == null || !this.buttonView.isEnabled()) {
            return;
        }
        if (MessagesController.getInstance(i).isFrozen()) {
            AccountFrozenAlert.show(i);
            return;
        }
        StarsController starsController = StarsController.getInstance(i, this.inputAmount.currency);
        AmountUtils$Amount amountUtils$AmountOf = starsController.balanceAvailable() ? AmountUtils$Amount.of(starsController.getBalance()) : null;
        if (!this.isMonoForumAdmin && (amountUtils$AmountOf == null || amountUtils$AmountOf.asNano() < this.inputAmount.asNano())) {
            AmountUtils$Amount amountUtils$Amount = this.inputAmount;
            AmountUtils$Currency amountUtils$Currency = amountUtils$Amount.currency;
            if (amountUtils$Currency == AmountUtils$Currency.STARS) {
                new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, amountUtils$Amount.asDecimal(), 13, ForumUtilities.getMonoForumTitle(i, j, true), null, j).show();
                return;
            } else {
                if (amountUtils$Currency == AmountUtils$Currency.TON) {
                    new TONIntroActivity.StarsNeededSheet(context, resourcesProvider, amountUtils$Amount, true, null).show();
                    return;
                }
                return;
            }
        }
        callback.run(MessageSuggestionParams.of(this.inputAmount, this.selectedTime));
        lambda$new$0();
    }

    private void setSelectedTime(long j, boolean z) {
        if (this.selectedTime != j) {
            this.selectedTime = j;
            this.publishingTimeField.setText(formatDateTime(j));
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
        if (getInputAmountMax().asNano() < this.inputAmount.asNano()) {
            this.inputAmountError |= 4;
        }
        if (!this.inputAmount.isZero() && getInputAmountMin().asNano() > this.inputAmount.asNano()) {
            this.inputAmountError |= 2;
        }
        boolean z4 = z2 || amountUtils$Amount2.currency != this.inputAmount.currency;
        boolean z5 = z2 || amountUtils$Amount2.asNano() != this.inputAmount.asNano();
        boolean z6 = z2 || i != this.inputAmountError;
        if (z6) {
            this.starsCountEditOutline.animateError((this.inputAmountError & (-9)) == 0 ? 0.0f : 1.0f);
        }
        if (z4) {
            onCurrencyChanged(z3);
        }
        if (z4 || z6) {
            checkAmountInputText(z3);
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
        AmountUtils$Currency amountUtils$Currency = this.inputAmount.currency;
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.STARS;
        if (amountUtils$Currency == amountUtils$Currency2) {
            this.starsCountEditHint.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleStars));
            this.starsCountEditField.setInputType(2);
            this.starsCountEditField.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(getInputAmountMax().asDecimal()).length())});
        } else if (amountUtils$Currency == AmountUtils$Currency.TON) {
            this.starsCountEditHint.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleTON));
            this.starsCountEditField.setInputType(8194);
            this.starsCountEditField.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(getInputAmountMax().asDecimal()).length() + 3)});
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
        if (this.mode == 0) {
            if (!this.inputAmount.isZero()) {
                AmountUtils$Amount amountUtils$Amount = this.inputAmount;
                boolean z2 = amountUtils$Amount.currency == AmountUtils$Currency.TON;
                ButtonWithCounterView buttonWithCounterView = this.buttonView;
                int i = R.string.PostSuggestionsOfferStars;
                if (z2) {
                    number = amountUtils$Amount.asDecimalString();
                } else {
                    number = LocaleController.formatNumber(amountUtils$Amount.asDecimal(), ',');
                }
                buttonWithCounterView.setText(StarsIntroActivity.replaceStars(z2, LocaleController.formatString(i, number), z2 ? this.spanRefTon : this.spanRefStars), z);
                return;
            }
            this.buttonView.setText(LocaleController.getString(R.string.PostSuggestionsOfferForFree), z);
            return;
        }
        this.buttonView.setText(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), z);
    }

    private void checkButtonEnabled(boolean z) {
        boolean z2 = this.inputAmountError == 0 && (this.inputAmount.asNano() >= 0 || this.selectedTime > 0);
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
        int i2 = this.inputAmountError;
        if ((i2 & 4) != 0) {
            this.starsCountEditOutline.setText(LocaleController.formatString(R.string.SuggestAPostTooMuch, getInputAmountMax().formatAsDecimalSpaced()));
            return;
        }
        if ((i2 & 2) != 0) {
            this.starsCountEditOutline.setText(LocaleController.formatString(R.string.SuggestAPostTooSmall, getInputAmountMin().formatAsDecimalSpaced()));
            return;
        }
        if (this.inputAmount.currency == AmountUtils$Currency.STARS) {
            i = R.string.PostSuggestionsOfferTitlePriceStars;
        } else {
            i = R.string.PostSuggestionsOfferTitlePriceTON;
        }
        this.starsCountEditOutline.setText(LocaleController.getString(i));
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

    private AmountUtils$Amount getInputAmountMin() {
        return this.inputAmount.currency == AmountUtils$Currency.TON ? this.inputAmountMinTON : this.inputAmountMinStars;
    }

    private AmountUtils$Amount getInputAmountMax() {
        return this.inputAmount.currency == AmountUtils$Currency.TON ? this.inputAmountMaxTON : this.inputAmountMaxStars;
    }

    @Override
    public void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$show$7();
            }
        }, 50L);
    }

    public void lambda$show$7() {
        AndroidUtilities.showKeyboard(this.starsCountEditField);
    }

    public static String formatDateTime(long j) {
        if (j <= 0) {
            return LocaleController.getString(R.string.PostSuggestionsAnytime);
        }
        String dateTime = LocaleController.formatDateTime(j, true);
        if (dateTime.isEmpty()) {
            return dateTime;
        }
        return Character.toUpperCase(dateTime.charAt(0)) + dateTime.substring(1);
    }
}
