package org.telegram.ui.Stars;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCheckbox2Cell;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda20;
import org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda3;

public final class SellGiftEnterPriceSheet extends BottomSheet {
    public final ButtonWithCounterView buttonView;
    public final AnimatedTextView dollarsEqView;
    public final ImageView iconStars;
    public final ImageView iconTon;
    public AmountUtils$Amount inputAmount;
    public int inputAmountError;
    public final AmountUtils$Amount inputAmountMaxStars;
    public final AmountUtils$Amount inputAmountMaxTON;
    public final AmountUtils$Amount inputAmountMinStars;
    public final AmountUtils$Amount inputAmountMinTON;
    public final TextCheckbox2Cell radioButtonCell;
    public final EditTextBoldCursor starsCountEditField;
    public final TextView starsCountEditHint;
    public final OutlineTextContainerView starsCountEditOutline;
    public final AnimatedTextView titleView;

    public SellGiftEnterPriceSheet(Context context, Theme.ResourcesProvider resourcesProvider, int i, AmountUtils$Amount amountUtils$Amount, GiftSheet$$ExternalSyntheticLambda4 giftSheet$$ExternalSyntheticLambda4) {
        super(context, true, false, resourcesProvider);
        this.currentAccount = i;
        this.smoothKeyboardAnimationEnabled = true;
        this.waitingKeyboard = true;
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i).config;
        long jMax = Math.max(appGlobalConfig.tonStarGiftResaleAmountMin.get(), 10000000L);
        AmountUtils$Currency amountUtils$Currency = AmountUtils$Currency.TON;
        this.inputAmountMinTON = AmountUtils$Amount.fromNano(jMax, amountUtils$Currency);
        this.inputAmountMaxTON = AmountUtils$Amount.fromNano(appGlobalConfig.tonStarGiftResaleAmountMax.get(), amountUtils$Currency);
        long j = appGlobalConfig.starsStarGiftResaleAmountMin.get();
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.STARS;
        this.inputAmountMinStars = AmountUtils$Amount.fromDecimal(j, amountUtils$Currency2);
        this.inputAmountMaxStars = AmountUtils$Amount.fromDecimal(appGlobalConfig.starsStarGiftResaleAmountMax.get(), amountUtils$Currency2);
        fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(0, context);
        linearLayout.addView(linearLayoutM, LayoutHelper.createLinear(-1, 56, 55, 0, 0, 0, 0));
        AnimatedTextView animatedTextView = new AnimatedTextView(context);
        this.titleView = animatedTextView;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        animatedTextView.setTextColor(Theme.getColor(null, i2, false));
        animatedTextView.setTextSize(AndroidUtilities.dp(20.0f));
        animatedTextView.setGravity(8388627);
        animatedTextView.setTypeface(AndroidUtilities.bold());
        linearLayoutM.addView(animatedTextView, LayoutHelper.createLinear(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f));
        OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
        this.starsCountEditOutline = outlineTextContainerView;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.starsCountEditField = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(Theme.getColor(null, i2, false));
        editTextBoldCursor.requestFocus();
        outlineTextContainerView.setLeftPadding(AndroidUtilities.dp(28.0f));
        outlineTextContainerView.attachEditText(editTextBoldCursor);
        outlineTextContainerView.animateSelection(true, (amountUtils$Amount == null || amountUtils$Amount.isZero()) ? false : true, false);
        outlineTextContainerView.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new RichTextCell$$ExternalSyntheticLambda3(this, 7));
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
        AnimatedTextView animatedTextView2 = new AnimatedTextView(context);
        this.dollarsEqView = animatedTextView2;
        int i3 = Theme.key_windowBackgroundWhiteGrayText;
        animatedTextView2.setTextColor(Theme.getColor(null, i3, false));
        animatedTextView2.setTextSize(AndroidUtilities.dp(13.0f));
        animatedTextView2.setGravity(5);
        outlineTextContainerView.addView(animatedTextView2, LayoutHelper.createFrame(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.starsCountEditHint = textView;
        textView.setTextColor(Theme.getColor(null, i3, false));
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, LayoutHelper.createLinear(-1, -2, 55, 33, 4, 33, 0));
        TextCheckbox2Cell textCheckbox2Cell = new TextCheckbox2Cell(context);
        this.radioButtonCell = textCheckbox2Cell;
        textCheckbox2Cell.checkbox.setLayoutParams(LayoutHelper.createFrame(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        textCheckbox2Cell.setTextAndValue(LocaleController.getString(R.string.ResellGiftPriceOnlyTON), LocaleController.getString(R.string.ResellGiftPriceHintOnlyTON), true, false);
        textCheckbox2Cell.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(this, 6));
        linearLayout2.addView(textCheckbox2Cell, LayoutHelper.createLinear(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 80));
        ButtonWithCounterView buttonWithCounterViewM = zzkg.m(context, resourcesProvider, true);
        this.buttonView = buttonWithCounterViewM;
        buttonWithCounterViewM.setOnClickListener(new RichEditor$$ExternalSyntheticLambda20(6, this, giftSheet$$ExternalSyntheticLambda4));
        buttonWithCounterViewM.setText(LocaleController.getString(R.string.ResellGiftButton), false);
        linearLayout3.addView(buttonWithCounterViewM, LayoutHelper.createLinear(-1, 48, 18.0f, 0.0f, 18.0f, 8.0f));
        if (amountUtils$Amount != null) {
            setAmount$2(AmountUtils$Amount.fromNano(amountUtils$Amount.nanos, amountUtils$Amount.currency), !amountUtils$Amount.isZero(), true, false);
        } else {
            setAmount$2(AmountUtils$Amount.fromNano(0L, amountUtils$Currency2), false, true, false);
        }
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                String string;
                int iIndexOf;
                boolean z = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
                if (!z && (iIndexOf = (string = editable.toString()).indexOf(46)) >= 0 && (string.length() - iIndexOf) - 1 > 2) {
                    editable.delete(iIndexOf + 3, string.length());
                }
                SellGiftEnterPriceSheet sellGiftEnterPriceSheet = SellGiftEnterPriceSheet.this;
                sellGiftEnterPriceSheet.setAmount$2(!z ? AmountUtils$Amount.fromDecimal(editable.toString(), sellGiftEnterPriceSheet.inputAmount.currency) : AmountUtils$Amount.fromNano(0L, sellGiftEnterPriceSheet.inputAmount.currency), false, false, true);
                sellGiftEnterPriceSheet.starsCountEditOutline.animateSelection(sellGiftEnterPriceSheet.starsCountEditField.isFocused(), true ^ TextUtils.isEmpty(sellGiftEnterPriceSheet.starsCountEditField.getText()));
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }
        });
    }

    public final void setAmount$2(AmountUtils$Amount amountUtils$Amount, boolean z, boolean z2, boolean z3) {
        AmountUtils$Amount amountUtils$Amount2;
        char c;
        long j;
        boolean z4;
        ImageView imageView;
        ImageView imageView2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        AmountUtils$Amount amountUtils$Amount3 = this.inputAmount;
        int i = this.inputAmountError;
        this.inputAmountError = 0;
        if (amountUtils$Amount != null) {
            this.inputAmount = amountUtils$Amount;
        } else {
            this.inputAmount = AmountUtils$Amount.fromNano(0L, amountUtils$Amount3.currency);
            this.inputAmountError |= 1;
        }
        AmountUtils$Amount amountUtils$Amount4 = this.inputAmount;
        AmountUtils$Currency amountUtils$Currency = amountUtils$Amount4.currency;
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.TON;
        AmountUtils$Amount amountUtils$Amount5 = this.inputAmountMaxStars;
        AmountUtils$Amount amountUtils$Amount6 = this.inputAmountMaxTON;
        if ((amountUtils$Currency == amountUtils$Currency2 ? amountUtils$Amount6 : amountUtils$Amount5).nanos < amountUtils$Amount4.nanos) {
            this.inputAmountError |= 4;
        }
        boolean zIsZero = amountUtils$Amount4.isZero();
        AmountUtils$Amount amountUtils$Amount7 = this.inputAmountMinStars;
        AmountUtils$Amount amountUtils$Amount8 = this.inputAmountMinTON;
        if (zIsZero) {
            amountUtils$Amount2 = amountUtils$Amount7;
            c = 0;
        } else {
            AmountUtils$Amount amountUtils$Amount9 = this.inputAmount;
            amountUtils$Amount2 = amountUtils$Amount7;
            c = 0;
            if ((amountUtils$Amount9.currency == amountUtils$Currency2 ? amountUtils$Amount8 : amountUtils$Amount7).nanos > amountUtils$Amount9.nanos) {
                this.inputAmountError |= 2;
            }
        }
        boolean z5 = z2 || amountUtils$Amount3.currency != this.inputAmount.currency;
        boolean z6 = z2 || amountUtils$Amount3.nanos != this.inputAmount.nanos;
        boolean z7 = z2 || i != this.inputAmountError;
        OutlineTextContainerView outlineTextContainerView = this.starsCountEditOutline;
        if (z7) {
            outlineTextContainerView.animateError((this.inputAmountError & (-9)) == 0 ? 0.0f : 1.0f);
        }
        AmountUtils$Currency amountUtils$Currency3 = AmountUtils$Currency.STARS;
        EditTextBoldCursor editTextBoldCursor = this.starsCountEditField;
        if (z5) {
            AmountUtils$Currency amountUtils$Currency4 = this.inputAmount.currency;
            j = 0;
            AnimatedTextView animatedTextView = this.titleView;
            if (amountUtils$Currency4 == amountUtils$Currency3) {
                animatedTextView.setText(LocaleController.getString(R.string.ResellGiftTitle), z3);
                editTextBoldCursor.setInputType(2);
                InputFilter[] inputFilterArr = new InputFilter[1];
                inputFilterArr[c] = new InputFilter.LengthFilter(Long.toString((this.inputAmount.currency == amountUtils$Currency2 ? amountUtils$Amount6 : amountUtils$Amount5).nanos / 1000000000).length());
                editTextBoldCursor.setFilters(inputFilterArr);
            } else {
                if (amountUtils$Currency4 == amountUtils$Currency2) {
                    animatedTextView.setText(LocaleController.getString(R.string.ResellGiftTitleTON), z3);
                    editTextBoldCursor.setInputType(8194);
                    InputFilter[] inputFilterArr2 = new InputFilter[1];
                    inputFilterArr2[c] = new InputFilter.LengthFilter(Long.toString((this.inputAmount.currency == amountUtils$Currency2 ? amountUtils$Amount6 : amountUtils$Amount5).nanos / 1000000000).length() + 3);
                    editTextBoldCursor.setFilters(inputFilterArr2);
                }
                CheckBox2 checkBox2 = this.radioButtonCell.checkbox;
                if (this.inputAmount.currency == amountUtils$Currency2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                checkBox2.setChecked(z4, z3);
                imageView = this.iconTon;
                imageView2 = this.iconStars;
                if (z3) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = imageView2.animate();
                    if (this.inputAmount.currency == amountUtils$Currency3) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(f3);
                    if (this.inputAmount.currency == amountUtils$Currency3) {
                        f4 = 1.0f;
                    } else {
                        f4 = 0.0f;
                    }
                    ViewPropertyAnimator viewPropertyAnimatorScaleX = viewPropertyAnimatorAlpha.scaleX(f4);
                    if (this.inputAmount.currency == amountUtils$Currency3) {
                        f5 = 1.0f;
                    } else {
                        f5 = 0.0f;
                    }
                    viewPropertyAnimatorScaleX.scaleY(f5).setDuration(180L).start();
                    ViewPropertyAnimator viewPropertyAnimatorAnimate2 = imageView.animate();
                    if (this.inputAmount.currency == amountUtils$Currency2) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate2.alpha(f6);
                    if (this.inputAmount.currency == amountUtils$Currency2) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ViewPropertyAnimator viewPropertyAnimatorScaleX2 = viewPropertyAnimatorAlpha2.scaleX(f7);
                    if (this.inputAmount.currency == amountUtils$Currency2) {
                        f8 = 1.0f;
                    } else {
                        f8 = 0.0f;
                    }
                    viewPropertyAnimatorScaleX2.scaleY(f8).setDuration(180L).start();
                } else {
                    if (this.inputAmount.currency == amountUtils$Currency3) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    imageView2.setAlpha(f);
                    if (this.inputAmount.currency == amountUtils$Currency2) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    imageView.setAlpha(f2);
                }
            }
            CheckBox2 checkBox3 = this.radioButtonCell.checkbox;
            if (this.inputAmount.currency == amountUtils$Currency2) {
                z4 = true;
            } else {
                z4 = false;
            }
            checkBox3.setChecked(z4, z3);
            imageView = this.iconTon;
            imageView2 = this.iconStars;
            if (z3) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate3 = imageView2.animate();
                if (this.inputAmount.currency == amountUtils$Currency3) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                ViewPropertyAnimator viewPropertyAnimatorAlpha3 = viewPropertyAnimatorAnimate3.alpha(f3);
                if (this.inputAmount.currency == amountUtils$Currency3) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
                ViewPropertyAnimator viewPropertyAnimatorScaleX3 = viewPropertyAnimatorAlpha3.scaleX(f4);
                if (this.inputAmount.currency == amountUtils$Currency3) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                viewPropertyAnimatorScaleX3.scaleY(f5).setDuration(180L).start();
                ViewPropertyAnimator viewPropertyAnimatorAnimate4 = imageView.animate();
                if (this.inputAmount.currency == amountUtils$Currency2) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                ViewPropertyAnimator viewPropertyAnimatorAlpha4 = viewPropertyAnimatorAnimate4.alpha(f6);
                if (this.inputAmount.currency == amountUtils$Currency2) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ViewPropertyAnimator viewPropertyAnimatorScaleX4 = viewPropertyAnimatorAlpha4.scaleX(f7);
                if (this.inputAmount.currency == amountUtils$Currency2) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                viewPropertyAnimatorScaleX4.scaleY(f8).setDuration(180L).start();
            } else {
                if (this.inputAmount.currency == amountUtils$Currency3) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                imageView2.setAlpha(f);
                if (this.inputAmount.currency == amountUtils$Currency2) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                imageView.setAlpha(f2);
            }
        } else {
            z6 = z6;
            j = 0;
            z7 = z7;
        }
        if (z5 || z7) {
            int i2 = this.inputAmountError;
            if ((i2 & 4) != 0) {
                int i3 = R.string.ResellGiftPriceTooMuch;
                if (this.inputAmount.currency == amountUtils$Currency2) {
                    amountUtils$Amount5 = amountUtils$Amount6;
                }
                Object[] objArr = new Object[1];
                objArr[c] = amountUtils$Amount5.formatAsDecimalSpaced();
                outlineTextContainerView.setText(LocaleController.formatString(i3, objArr));
            } else if ((i2 & 2) != 0) {
                int i4 = R.string.ResellGiftPriceTooSmall;
                if (this.inputAmount.currency != amountUtils$Currency2) {
                    amountUtils$Amount8 = amountUtils$Amount2;
                }
                String asDecimalSpaced = amountUtils$Amount8.formatAsDecimalSpaced();
                Object[] objArr2 = new Object[1];
                objArr2[c] = asDecimalSpaced;
                outlineTextContainerView.setText(LocaleController.formatString(i4, objArr2));
            } else {
                outlineTextContainerView.setText(LocaleController.getString(this.inputAmount.currency == amountUtils$Currency3 ? R.string.ResellGiftPriceTitle : R.string.ResellGiftPriceTitleTON));
            }
        }
        if (z5 || z6 || z7) {
            boolean z8 = this.inputAmountError == 0 && this.inputAmount.nanos > j;
            ButtonWithCounterView buttonWithCounterView = this.buttonView;
            if (buttonWithCounterView.isEnabled() != z8) {
                buttonWithCounterView.setEnabled(z8);
                buttonWithCounterView.setClickable(z8);
                if (z3) {
                    OKLCH.m(buttonWithCounterView.animate(), z8 ? 1.0f : 0.6f, 180L);
                } else {
                    buttonWithCounterView.setAlpha(z8 ? 1.0f : 0.6f);
                }
            }
        }
        if (z5 || z6) {
            AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.currentAccount).config;
            AmountUtils$Amount amountUtils$Amount10 = this.inputAmount;
            AmountUtils$Currency amountUtils$Currency5 = amountUtils$Amount10.currency;
            TextView textView = this.starsCountEditHint;
            AmountUtils$Currency amountUtils$Currency6 = amountUtils$Amount10.currency;
            long j2 = amountUtils$Amount10.nanos;
            if (amountUtils$Currency5 == amountUtils$Currency3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("ResellGiftInfo", (int) (AmountUtils$Amount.fromNano((j2 * ((long) appGlobalConfig.starsStarGiftResaleCommissionPermille.get())) / 1000, amountUtils$Currency6).nanos / 1000000000), new Object[0])));
            } else if (amountUtils$Currency5 == amountUtils$Currency2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ResellGiftInfoTON, AmountUtils$Amount.fromNano((j2 * ((long) appGlobalConfig.tonStarGiftResaleCommissionPermille.get())) / 1000, amountUtils$Currency6).asDecimalString())));
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            sb.append(BillingController.getInstance().formatCurrency((long) (this.inputAmount.asDouble() * (this.inputAmount.currency == amountUtils$Currency2 ? MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() : ((double) MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000) * 1.0E-5d) * 100.0d), "USD", 2));
            this.dollarsEqView.setText(sb, z3);
        }
        if (z && z6) {
            String strAsDecimalString = this.inputAmount.asDecimalString();
            editTextBoldCursor.setText(strAsDecimalString);
            editTextBoldCursor.setSelection(strAsDecimalString.length());
        }
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new BalanceCloud$$ExternalSyntheticLambda1(this, 5), 50L);
    }
}
