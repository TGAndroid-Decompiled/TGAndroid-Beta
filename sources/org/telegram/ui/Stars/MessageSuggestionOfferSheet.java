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
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.HorizontalRoundTabsLayout;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda156;
import org.telegram.ui.ProfileActivity$9$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.StoriesViewPager$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda13;
import org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda3;

public final class MessageSuggestionOfferSheet extends BottomSheet {
    public final BalanceCloud balanceCloud;
    public boolean balanceCloudVisible;
    public final ButtonWithCounterView buttonView;
    public final HorizontalRoundTabsLayout currencyTabsView;
    public final AnimatedTextView dollarsEqView;
    public final ImageView iconStars;
    public final ImageView iconTon;
    public AmountUtils$Amount inputAmount;
    public int inputAmountError;
    public final AmountUtils$Amount inputAmountMaxStars;
    public final AmountUtils$Amount inputAmountMaxTON;
    public final AmountUtils$Amount inputAmountMinStars;
    public final AmountUtils$Amount inputAmountMinTON;
    public boolean isFullyVisible;
    public final boolean isMonoForumAdmin;
    public final int mode;
    public final AnonymousClass1 publishingTimeField;
    public long selectedTime;
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

    public MessageSuggestionOfferSheet(final Context context, int i, long j, MessageSuggestionParams messageSuggestionParams, ChatActivity chatActivity, final Theme.ResourcesProvider resourcesProvider, int i2, Utilities.Callback callback) {
        boolean z;
        super(context, resourcesProvider, true, false);
        final int i3 = 0;
        this.selectedTime = -1L;
        this.spanRefStars = new ColoredImageSpan[1];
        this.spanRefTon = new ColoredImageSpan[1];
        this.mode = i2;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean zCanManageMonoForum = ChatObject.canManageMonoForum(i, j);
        this.isMonoForumAdmin = zCanManageMonoForum;
        boolean z2 = zCanManageMonoForum || StarsController.getInstance(i, true).canUseTon();
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i).config;
        long j2 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        AmountUtils$Currency amountUtils$Currency = AmountUtils$Currency.TON;
        this.inputAmountMinTON = AmountUtils$Amount.fromNano(j2, amountUtils$Currency);
        this.inputAmountMaxTON = AmountUtils$Amount.fromNano(appGlobalConfig.tonSuggestedPostAmountMax.get(), amountUtils$Currency);
        long j3 = appGlobalConfig.starsSuggestedPostAmountMin.get();
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.STARS;
        this.inputAmountMinStars = AmountUtils$Amount.fromDecimal(j3, amountUtils$Currency2);
        this.inputAmountMaxStars = AmountUtils$Amount.fromDecimal(appGlobalConfig.starsSuggestedPostAmountMax.get(), amountUtils$Currency2);
        if (zCanManageMonoForum) {
            this.balanceCloud = null;
        } else {
            BalanceCloud balanceCloud = new BalanceCloud(context, i, amountUtils$Currency2, resourcesProvider);
            this.balanceCloud = balanceCloud;
            balanceCloud.setScaleX(0.6f);
            balanceCloud.setScaleY(0.6f);
            balanceCloud.setAlpha(0.0f);
            balanceCloud.setEnabled(false);
            balanceCloud.setClickable(false);
            this.container.addView(balanceCloud, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            ScaleStateListAnimator.apply(balanceCloud, 0.1f, 1.5f);
            balanceCloud.setOnClickListener(new View.OnClickListener(this) {
                public final MessageSuggestionOfferSheet f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    MessageSuggestionOfferSheet messageSuggestionOfferSheet = this.f$0;
                    switch (i3) {
                        case 0:
                            if (messageSuggestionOfferSheet.inputAmount.currency == AmountUtils$Currency.STARS) {
                                new StarsIntroActivity.StarsOptionsSheet(context, resourcesProvider).show();
                            }
                            break;
                        default:
                            long j4 = messageSuggestionOfferSheet.selectedTime;
                            StoriesViewPager$$ExternalSyntheticLambda0 storiesViewPager$$ExternalSyntheticLambda0 = new StoriesViewPager$$ExternalSyntheticLambda0(messageSuggestionOfferSheet, 5);
                            Pattern pattern = AlertsCreator.URL_PATTERN;
                            AlertsCreator.createSuggestedMessageDatePickerDialog(context, j4, storiesViewPager$$ExternalSyntheticLambda0, new AlertsCreator.ScheduleDatePickerColors(null), resourcesProvider, 0).bottomSheet.show();
                            break;
                    }
                }
            });
        }
        fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout linearLayoutM = zzkf.m(context, 0);
        linearLayout.addView(linearLayoutM, LayoutHelper.createLinear(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(null, i4, false));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        textView.setText(LocaleController.getString(i2 == 0 ? R.string.PostSuggestionsOfferTitle : R.string.PostSuggestionsOfferChangeTitle));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayoutM.addView(textView, LayoutHelper.createLinear(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i5 = Theme.key_dialogEmptyImage;
        int color = Theme.getColor(i5, resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
        ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(this, 7));
        linearLayoutM.addView(imageView, LayoutHelper.createLinear(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.starsCountEditField = editTextBoldCursor;
        if (z2) {
            HorizontalRoundTabsLayout horizontalRoundTabsLayout = new HorizontalRoundTabsLayout(context, resourcesProvider);
            this.currencyTabsView = horizontalRoundTabsLayout;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            horizontalRoundTabsLayout.setTabs(arrayList, new PhotoViewer$$ExternalSyntheticLambda156(this, 7));
            linearLayout.addView(horizontalRoundTabsLayout, LayoutHelper.createLinear(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.currencyTabsView = null;
        }
        LinearLayout linearLayoutM2 = zzkf.m(context, 1);
        linearLayout.addView(linearLayoutM2, LayoutHelper.createLinear(1.0f, -1, -2));
        OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context, null);
        this.starsCountEditOutline = outlineTextContainerView;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(Theme.getColor(null, i4, false));
        editTextBoldCursor.requestFocus();
        outlineTextContainerView.setLeftPadding(AndroidUtilities.dp(28.0f));
        outlineTextContainerView.attachedEditText = editTextBoldCursor;
        outlineTextContainerView.invalidate();
        AmountUtils$Amount amountUtils$Amount = messageSuggestionParams.amount;
        outlineTextContainerView.animateSelection(1.0f, (amountUtils$Amount == null || amountUtils$Amount.isZero()) ? 0.0f : 1.0f, false);
        outlineTextContainerView.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new RichTextCell$$ExternalSyntheticLambda3(this, 17));
        outlineTextContainerView.addView(editTextBoldCursor, LayoutHelper.createFrame(-1, -2, 48));
        linearLayoutM2.addView(outlineTextContainerView, LayoutHelper.createLinear(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.iconStars = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        outlineTextContainerView.addView(imageView2, LayoutHelper.createFrame(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.iconTon = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        imageView3.setColorFilter(-13397548);
        outlineTextContainerView.addView(imageView3, LayoutHelper.createFrame(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(context, false, false, false);
        this.dollarsEqView = animatedTextView;
        int i6 = Theme.key_windowBackgroundWhiteGrayText;
        animatedTextView.setTextColor(Theme.getColor(null, i6, false));
        animatedTextView.setTextSize(AndroidUtilities.dp(13.0f));
        animatedTextView.setGravity(5);
        outlineTextContainerView.addView(animatedTextView, LayoutHelper.createFrame(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.starsCountEditHint = textView2;
        textView2.setTextColor(Theme.getColor(null, i6, false));
        textView2.setTextSize(1, 13.0f);
        linearLayoutM2.addView(textView2, LayoutHelper.createLinear(-1, -2, 55, 33, 4, 33, 0));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context);
        this.publishingTimeField = anonymousClass1;
        anonymousClass1.setCursorSize(AndroidUtilities.dp(20.0f));
        anonymousClass1.setCursorWidth(1.5f);
        anonymousClass1.setTextSize(1, 17.0f);
        anonymousClass1.setMaxLines(1);
        anonymousClass1.setBackground(null);
        anonymousClass1.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        anonymousClass1.setTextColor(Theme.getColor(null, i4, false));
        anonymousClass1.setFocusable(false);
        anonymousClass1.setClickable(false);
        anonymousClass1.setEnabled(false);
        OutlineTextContainerView outlineTextContainerView2 = new OutlineTextContainerView(context, null);
        outlineTextContainerView2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        outlineTextContainerView2.attachedEditText = anonymousClass1;
        outlineTextContainerView2.invalidate();
        outlineTextContainerView2.addView(anonymousClass1, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        ScaleStateListAnimator.apply(outlineTextContainerView2, 0.02f, 1.2f);
        final int i7 = 1;
        outlineTextContainerView2.setOnClickListener(new View.OnClickListener(this) {
            public final MessageSuggestionOfferSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                MessageSuggestionOfferSheet messageSuggestionOfferSheet = this.f$0;
                switch (i7) {
                    case 0:
                        if (messageSuggestionOfferSheet.inputAmount.currency == AmountUtils$Currency.STARS) {
                            new StarsIntroActivity.StarsOptionsSheet(context, resourcesProvider).show();
                        }
                        break;
                    default:
                        long j4 = messageSuggestionOfferSheet.selectedTime;
                        StoriesViewPager$$ExternalSyntheticLambda0 storiesViewPager$$ExternalSyntheticLambda0 = new StoriesViewPager$$ExternalSyntheticLambda0(messageSuggestionOfferSheet, 5);
                        Pattern pattern = AlertsCreator.URL_PATTERN;
                        AlertsCreator.createSuggestedMessageDatePickerDialog(context, j4, storiesViewPager$$ExternalSyntheticLambda0, new AlertsCreator.ScheduleDatePickerColors(null), resourcesProvider, 0).bottomSheet.show();
                        break;
                }
            }
        });
        linearLayoutM2.addView(outlineTextContainerView2, LayoutHelper.createLinear(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        imageView4.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i5, resourcesProvider), mode));
        outlineTextContainerView2.addView(imageView4, LayoutHelper.createFrame(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextColor(Theme.getColor(null, i6, false));
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        linearLayoutM2.addView(textView3, LayoutHelper.createLinear(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 80));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
        this.buttonView = buttonWithCounterView;
        buttonWithCounterView.setOnClickListener(new MessageSuggestionOfferSheet$$ExternalSyntheticLambda5(this, chatActivity, i, context, resourcesProvider, j, callback));
        if (i2 == 1) {
            buttonWithCounterView.setText(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(buttonWithCounterView, LayoutHelper.createLinear(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        AmountUtils$Amount amountUtils$Amount2 = messageSuggestionParams.amount;
        if (amountUtils$Amount2 != null) {
            z = false;
            setAmount$1(AmountUtils$Amount.fromNano(amountUtils$Amount2.nanos, amountUtils$Amount2.currency), !messageSuggestionParams.amount.isZero(), true, false);
        } else {
            z = false;
            setAmount$1(AmountUtils$Amount.fromNano(0L, amountUtils$Currency2), false, true, false);
        }
        long j4 = messageSuggestionParams.time;
        if (this.selectedTime != j4) {
            this.selectedTime = j4;
            anonymousClass1.setText(formatDateTime(j4));
        }
        checkButtonEnabled$1(z);
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                String string;
                int iIndexOf;
                boolean z3 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
                if (!z3 && (iIndexOf = (string = editable.toString()).indexOf(46)) >= 0 && (string.length() - iIndexOf) - 1 > 2) {
                    editable.delete(iIndexOf + 3, string.length());
                }
                MessageSuggestionOfferSheet messageSuggestionOfferSheet = MessageSuggestionOfferSheet.this;
                messageSuggestionOfferSheet.setAmount$1(!z3 ? AmountUtils$Amount.fromDecimal(editable.toString(), messageSuggestionOfferSheet.inputAmount.currency) : AmountUtils$Amount.fromNano(0L, messageSuggestionOfferSheet.inputAmount.currency), false, false, true);
                messageSuggestionOfferSheet.starsCountEditOutline.animateSelection(messageSuggestionOfferSheet.starsCountEditField.isFocused(), true ^ TextUtils.isEmpty(messageSuggestionOfferSheet.starsCountEditField.getText()));
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }
        });
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

    public final void checkBalanceCloudVisibility$3() {
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

    public final void checkButtonEnabled$1(boolean z) {
        boolean z2 = this.inputAmountError == 0 && (this.inputAmount.nanos >= 0 || this.selectedTime > 0);
        ButtonWithCounterView buttonWithCounterView = this.buttonView;
        if (buttonWithCounterView.enabled != z2) {
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
    public final boolean isTouchOutside(float f, float f2) {
        BalanceCloud balanceCloud;
        if (!this.balanceCloudVisible || (balanceCloud = this.balanceCloud) == null || f < balanceCloud.getX() || f > balanceCloud.getX() + balanceCloud.getWidth() || f2 < balanceCloud.getY() || f2 > balanceCloud.getY() + balanceCloud.getHeight()) {
            return super.isTouchOutside(f, f2);
        }
        return false;
    }

    @Override
    public final void onContainerTranslationYChanged(float f) {
        super.onContainerTranslationYChanged(f);
        checkBalanceCloudVisibility$3();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.isFullyVisible = true;
        checkBalanceCloudVisibility$3();
    }

    public final void setAmount$1(AmountUtils$Amount amountUtils$Amount, boolean z, boolean z2, boolean z3) {
        char c;
        ImageView imageView;
        ImageView imageView2;
        float f;
        float f2;
        BalanceCloud balanceCloud;
        AmountUtils$Currency amountUtils$Currency;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        AmountUtils$Amount amountUtils$Amount2 = this.inputAmount;
        int i = this.inputAmountError;
        this.inputAmountError = 0;
        if (amountUtils$Amount != null) {
            this.inputAmount = amountUtils$Amount;
        } else {
            this.inputAmount = AmountUtils$Amount.fromNano(0L, amountUtils$Amount2.currency);
            this.inputAmountError |= 1;
        }
        AmountUtils$Amount amountUtils$Amount3 = this.inputAmount;
        AmountUtils$Currency amountUtils$Currency2 = amountUtils$Amount3.currency;
        AmountUtils$Currency amountUtils$Currency3 = AmountUtils$Currency.TON;
        AmountUtils$Amount amountUtils$Amount4 = this.inputAmountMaxStars;
        AmountUtils$Amount amountUtils$Amount5 = this.inputAmountMaxTON;
        if ((amountUtils$Currency2 == amountUtils$Currency3 ? amountUtils$Amount5 : amountUtils$Amount4).nanos < amountUtils$Amount3.nanos) {
            this.inputAmountError |= 4;
        }
        boolean zIsZero = amountUtils$Amount3.isZero();
        AmountUtils$Amount amountUtils$Amount6 = this.inputAmountMinStars;
        AmountUtils$Amount amountUtils$Amount7 = this.inputAmountMinTON;
        if (!zIsZero) {
            AmountUtils$Amount amountUtils$Amount8 = this.inputAmount;
            if ((amountUtils$Amount8.currency == amountUtils$Currency3 ? amountUtils$Amount7 : amountUtils$Amount6).nanos > amountUtils$Amount8.nanos) {
                this.inputAmountError |= 2;
            }
        }
        boolean z4 = z2 || amountUtils$Amount2.currency != this.inputAmount.currency;
        boolean z5 = z2 || amountUtils$Amount2.nanos != this.inputAmount.nanos;
        boolean z6 = z2 || i != this.inputAmountError;
        OutlineTextContainerView outlineTextContainerView = this.starsCountEditOutline;
        if (z6) {
            OutlineTextContainerView.animateSpring(outlineTextContainerView.errorSpring, (this.inputAmountError & (-9)) == 0 ? 0.0f : 1.0f);
        }
        AmountUtils$Currency amountUtils$Currency4 = AmountUtils$Currency.STARS;
        EditTextBoldCursor editTextBoldCursor = this.starsCountEditField;
        if (z4) {
            HorizontalRoundTabsLayout horizontalRoundTabsLayout = this.currencyTabsView;
            c = 0;
            if (horizontalRoundTabsLayout != null) {
                horizontalRoundTabsLayout.setSelectedIndex(this.inputAmount.currency == amountUtils$Currency4 ? 0 : 1, z3);
            }
            AmountUtils$Currency amountUtils$Currency5 = this.inputAmount.currency;
            TextView textView = this.starsCountEditHint;
            if (amountUtils$Currency5 == amountUtils$Currency4) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleStars));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString((this.inputAmount.currency == amountUtils$Currency3 ? amountUtils$Amount5 : amountUtils$Amount4).nanos / 1000000000).length())});
            } else {
                if (amountUtils$Currency5 == amountUtils$Currency3) {
                    textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleTON));
                    editTextBoldCursor.setInputType(8194);
                    editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString((this.inputAmount.currency == amountUtils$Currency3 ? amountUtils$Amount5 : amountUtils$Amount4).nanos / 1000000000).length() + 3)});
                }
                imageView = this.iconTon;
                imageView2 = this.iconStars;
                if (z3) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = imageView2.animate();
                    if (this.inputAmount.currency == amountUtils$Currency4) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(f3);
                    if (this.inputAmount.currency == amountUtils$Currency4) {
                        f4 = 1.0f;
                    } else {
                        f4 = 0.0f;
                    }
                    ViewPropertyAnimator viewPropertyAnimatorScaleX = viewPropertyAnimatorAlpha.scaleX(f4);
                    if (this.inputAmount.currency == amountUtils$Currency4) {
                        f5 = 1.0f;
                    } else {
                        f5 = 0.0f;
                    }
                    viewPropertyAnimatorScaleX.scaleY(f5).setDuration(180L).start();
                    ViewPropertyAnimator viewPropertyAnimatorAnimate2 = imageView.animate();
                    if (this.inputAmount.currency == amountUtils$Currency3) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate2.alpha(f6);
                    if (this.inputAmount.currency == amountUtils$Currency3) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ViewPropertyAnimator viewPropertyAnimatorScaleX2 = viewPropertyAnimatorAlpha2.scaleX(f7);
                    if (this.inputAmount.currency == amountUtils$Currency3) {
                        f8 = 1.0f;
                    } else {
                        f8 = 0.0f;
                    }
                    viewPropertyAnimatorScaleX2.scaleY(f8).setDuration(180L).start();
                } else {
                    if (this.inputAmount.currency == amountUtils$Currency4) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    imageView2.setAlpha(f);
                    if (this.inputAmount.currency == amountUtils$Currency3) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    imageView.setAlpha(f2);
                }
                balanceCloud = this.balanceCloud;
                if (balanceCloud != null && balanceCloud.currency != (amountUtils$Currency = this.inputAmount.currency)) {
                    balanceCloud.currency = amountUtils$Currency;
                    balanceCloud.updateBalance();
                }
            }
            imageView = this.iconTon;
            imageView2 = this.iconStars;
            if (z3) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate3 = imageView2.animate();
                if (this.inputAmount.currency == amountUtils$Currency4) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                ViewPropertyAnimator viewPropertyAnimatorAlpha3 = viewPropertyAnimatorAnimate3.alpha(f3);
                if (this.inputAmount.currency == amountUtils$Currency4) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
                ViewPropertyAnimator viewPropertyAnimatorScaleX3 = viewPropertyAnimatorAlpha3.scaleX(f4);
                if (this.inputAmount.currency == amountUtils$Currency4) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                viewPropertyAnimatorScaleX3.scaleY(f5).setDuration(180L).start();
                ViewPropertyAnimator viewPropertyAnimatorAnimate4 = imageView.animate();
                if (this.inputAmount.currency == amountUtils$Currency3) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                ViewPropertyAnimator viewPropertyAnimatorAlpha4 = viewPropertyAnimatorAnimate4.alpha(f6);
                if (this.inputAmount.currency == amountUtils$Currency3) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ViewPropertyAnimator viewPropertyAnimatorScaleX4 = viewPropertyAnimatorAlpha4.scaleX(f7);
                if (this.inputAmount.currency == amountUtils$Currency3) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                viewPropertyAnimatorScaleX4.scaleY(f8).setDuration(180L).start();
            } else {
                if (this.inputAmount.currency == amountUtils$Currency4) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                imageView2.setAlpha(f);
                if (this.inputAmount.currency == amountUtils$Currency3) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                imageView.setAlpha(f2);
            }
            balanceCloud = this.balanceCloud;
            if (balanceCloud != null) {
                balanceCloud.currency = amountUtils$Currency;
                balanceCloud.updateBalance();
            }
        } else {
            z5 = z5;
            z6 = z6;
            c = 0;
        }
        if (z4 || z6) {
            int i2 = this.inputAmountError;
            if ((i2 & 4) != 0) {
                int i3 = R.string.SuggestAPostTooMuch;
                if (this.inputAmount.currency == amountUtils$Currency3) {
                    amountUtils$Amount4 = amountUtils$Amount5;
                }
                Object[] objArr = new Object[1];
                objArr[c] = amountUtils$Amount4.formatAsDecimalSpaced();
                outlineTextContainerView.setText(LocaleController.formatString(i3, objArr));
            } else if ((i2 & 2) != 0) {
                int i4 = R.string.SuggestAPostTooSmall;
                if (this.inputAmount.currency == amountUtils$Currency3) {
                    amountUtils$Amount6 = amountUtils$Amount7;
                }
                Object[] objArr2 = new Object[1];
                objArr2[c] = amountUtils$Amount6.formatAsDecimalSpaced();
                outlineTextContainerView.setText(LocaleController.formatString(i4, objArr2));
            } else {
                outlineTextContainerView.setText(LocaleController.getString(this.inputAmount.currency == amountUtils$Currency4 ? R.string.PostSuggestionsOfferTitlePriceStars : R.string.PostSuggestionsOfferTitlePriceTON));
            }
        }
        if (z4 || z5 || z6) {
            ButtonWithCounterView buttonWithCounterView = this.buttonView;
            if (this.mode != 0) {
                buttonWithCounterView.setText(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), z3, true);
            } else if (this.inputAmount.isZero()) {
                buttonWithCounterView.setText(LocaleController.getString(R.string.PostSuggestionsOfferForFree), z3, true);
            } else {
                AmountUtils$Amount amountUtils$Amount9 = this.inputAmount;
                boolean z7 = amountUtils$Amount9.currency == amountUtils$Currency3;
                int i5 = R.string.PostSuggestionsOfferStars;
                Object[] objArr3 = new Object[1];
                objArr3[c] = z7 ? amountUtils$Amount9.asDecimalString() : LocaleController.formatNumber(amountUtils$Amount9.nanos / 1000000000, ',');
                buttonWithCounterView.setText(StarsIntroActivity.replaceStars(z7, LocaleController.formatString(i5, objArr3), z7 ? this.spanRefTon : this.spanRefStars), z3, true);
            }
            checkButtonEnabled$1(z3);
        }
        if (z4 || z5) {
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            sb.append(BillingController.getInstance().formatCurrency((long) (this.inputAmount.asDouble() * (this.inputAmount.currency == amountUtils$Currency3 ? MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() : ((double) MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000) * 1.0E-5d) * 100.0d), "USD", 2));
            this.dollarsEqView.setText(sb, z3, true);
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
        AndroidUtilities.runOnUIThread(new ProfileActivity$9$$ExternalSyntheticLambda1(this, 21), 50L);
    }
}
