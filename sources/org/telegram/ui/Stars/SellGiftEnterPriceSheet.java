package org.telegram.ui.Stars;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCheckbox2Cell;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class SellGiftEnterPriceSheet extends BottomSheet {
    private final ButtonWithCounterView buttonView;
    private final AnimatedTextView dollarsEqView;
    private final ImageView iconStars;
    private final ImageView iconTon;
    private AmountUtils$Amount inputAmount;
    private int inputAmountError;
    private final AmountUtils$Amount inputAmountMaxStars;
    private final AmountUtils$Amount inputAmountMaxTON;
    private final AmountUtils$Amount inputAmountMinStars;
    private final AmountUtils$Amount inputAmountMinTON;
    private final TextCheckbox2Cell radioButtonCell;
    private final EditTextBoldCursor starsCountEditField;
    private final TextView starsCountEditHint;
    private final OutlineTextContainerView starsCountEditOutline;
    private final AnimatedTextView titleView;

    public SellGiftEnterPriceSheet(Context context, Theme.ResourcesProvider resourcesProvider, int i, AmountUtils$Amount amountUtils$Amount, final Utilities.Callback callback) {
        super(context, true, resourcesProvider);
        this.currentAccount = i;
        this.smoothKeyboardAnimationEnabled = true;
        this.waitingKeyboard = true;
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i).config;
        long max = Math.max(appGlobalConfig.tonStarGiftResaleAmountMin.get(), 10000000L);
        AmountUtils$Currency amountUtils$Currency = AmountUtils$Currency.TON;
        this.inputAmountMinTON = AmountUtils$Amount.fromNano(max, amountUtils$Currency);
        this.inputAmountMaxTON = AmountUtils$Amount.fromNano(appGlobalConfig.tonStarGiftResaleAmountMax.get(), amountUtils$Currency);
        long j = appGlobalConfig.starsStarGiftResaleAmountMin.get();
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.STARS;
        this.inputAmountMinStars = AmountUtils$Amount.fromDecimal(j, amountUtils$Currency2);
        this.inputAmountMaxStars = AmountUtils$Amount.fromDecimal(appGlobalConfig.starsStarGiftResaleAmountMax.get(), amountUtils$Currency2);
        fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, 56, 55, 0, 0, 0, 0));
        AnimatedTextView animatedTextView = new AnimatedTextView(context);
        this.titleView = animatedTextView;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        animatedTextView.setTextColor(Theme.getColor(i2));
        animatedTextView.setTextSize(AndroidUtilities.dp(20.0f));
        animatedTextView.setGravity(8388627);
        animatedTextView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(animatedTextView, LayoutHelper.createLinear(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 1.0f));
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
        editTextBoldCursor.setTextColor(Theme.getColor(i2));
        editTextBoldCursor.requestFocus();
        outlineTextContainerView.setLeftPadding(AndroidUtilities.dp(28.0f));
        outlineTextContainerView.attachEditText(editTextBoldCursor);
        outlineTextContainerView.animateSelection(true, (amountUtils$Amount == null || amountUtils$Amount.isZero()) ? false : true, false);
        outlineTextContainerView.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view, boolean z) {
                SellGiftEnterPriceSheet.this.lambda$new$0(view, z);
            }
        });
        outlineTextContainerView.addView(editTextBoldCursor, LayoutHelper.createFrame(-1, -2, 48));
        linearLayout3.addView(outlineTextContainerView, LayoutHelper.createLinear(-1, 58, 18.0f, 0.0f, 18.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.iconStars = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        outlineTextContainerView.addView(imageView, LayoutHelper.createFrame(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.iconTon = imageView2;
        imageView2.setImageResource(R.drawable.ton);
        imageView2.setColorFilter(-13397548);
        outlineTextContainerView.addView(imageView2, LayoutHelper.createFrame(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        AnimatedTextView animatedTextView2 = new AnimatedTextView(context);
        this.dollarsEqView = animatedTextView2;
        int i3 = Theme.key_windowBackgroundWhiteGrayText;
        animatedTextView2.setTextColor(Theme.getColor(i3));
        animatedTextView2.setTextSize(AndroidUtilities.dp(13.0f));
        animatedTextView2.setGravity(5);
        outlineTextContainerView.addView(animatedTextView2, LayoutHelper.createFrame(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.starsCountEditHint = textView;
        textView.setTextColor(Theme.getColor(i3));
        textView.setTextSize(1, 13.0f);
        linearLayout3.addView(textView, LayoutHelper.createLinear(-1, -2, 55, 33, 4, 33, 0));
        TextCheckbox2Cell textCheckbox2Cell = new TextCheckbox2Cell(context);
        this.radioButtonCell = textCheckbox2Cell;
        textCheckbox2Cell.setCheckboxGravityTop();
        textCheckbox2Cell.setTextAndValue(LocaleController.getString(R.string.ResellGiftPriceOnlyTON), LocaleController.getString(R.string.ResellGiftPriceHintOnlyTON), true, false);
        textCheckbox2Cell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                SellGiftEnterPriceSheet.this.lambda$new$1(view);
            }
        });
        linearLayout3.addView(textCheckbox2Cell, LayoutHelper.createLinear(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout.addView(linearLayout4, LayoutHelper.createLinear(-1, -2, 80));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        this.buttonView = buttonWithCounterView;
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                SellGiftEnterPriceSheet.this.lambda$new$2(callback, view);
            }
        });
        buttonWithCounterView.setText(LocaleController.getString(R.string.ResellGiftButton), false);
        linearLayout4.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 18.0f, 0.0f, 18.0f, 8.0f));
        if (amountUtils$Amount != null) {
            setAmount(AmountUtils$Amount.fromNano(amountUtils$Amount.asNano(), amountUtils$Amount.currency), !amountUtils$Amount.isZero(), true, false);
        } else {
            setAmount(AmountUtils$Amount.fromNano(0L, amountUtils$Currency2), false, true, false);
        }
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                String obj;
                int indexOf;
                boolean z = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
                if (!z && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
                    editable.delete(indexOf + 3, obj.length());
                }
                SellGiftEnterPriceSheet.this.setAmount(!z ? AmountUtils$Amount.fromDecimal(editable.toString(), SellGiftEnterPriceSheet.this.inputAmount.currency) : AmountUtils$Amount.fromNano(0L, SellGiftEnterPriceSheet.this.inputAmount.currency), false, false, true);
                SellGiftEnterPriceSheet.this.starsCountEditOutline.animateSelection(SellGiftEnterPriceSheet.this.starsCountEditField.isFocused(), true ^ TextUtils.isEmpty(SellGiftEnterPriceSheet.this.starsCountEditField.getText()));
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }
        });
    }

    private void checkAmountInputText(boolean z) {
        OutlineTextContainerView outlineTextContainerView;
        String formatString;
        int i = this.inputAmountError;
        if ((i & 4) != 0) {
            outlineTextContainerView = this.starsCountEditOutline;
            formatString = LocaleController.formatString(R.string.ResellGiftPriceTooMuch, getInputAmountMax().formatAsDecimalSpaced());
        } else if ((i & 2) == 0) {
            this.starsCountEditOutline.setText(LocaleController.getString(this.inputAmount.currency == AmountUtils$Currency.STARS ? R.string.ResellGiftPriceTitle : R.string.ResellGiftPriceTitleTON));
            return;
        } else {
            outlineTextContainerView = this.starsCountEditOutline;
            formatString = LocaleController.formatString(R.string.ResellGiftPriceTooSmall, getInputAmountMin().formatAsDecimalSpaced());
        }
        outlineTextContainerView.setText(formatString);
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

    private void checkRateText(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.SellGiftEnterPriceSheet.checkRateText(boolean):void");
    }

    private AmountUtils$Amount getInputAmountMax() {
        return this.inputAmount.currency == AmountUtils$Currency.TON ? this.inputAmountMaxTON : this.inputAmountMaxStars;
    }

    private AmountUtils$Amount getInputAmountMin() {
        return this.inputAmount.currency == AmountUtils$Currency.TON ? this.inputAmountMinTON : this.inputAmountMinStars;
    }

    public void lambda$new$0(View view, boolean z) {
        this.starsCountEditOutline.animateSelection(z, !TextUtils.isEmpty(this.starsCountEditField.getText()));
    }

    public void lambda$new$1(View view) {
        AmountUtils$Currency amountUtils$Currency = this.inputAmount.currency;
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.TON;
        if (amountUtils$Currency == amountUtils$Currency2) {
            amountUtils$Currency2 = AmountUtils$Currency.STARS;
        }
        setAmount(AmountUtils$Amount.fromNano(0L, amountUtils$Currency2), true, false, true);
        this.starsCountEditField.setText("");
    }

    public void lambda$new$2(Utilities.Callback callback, View view) {
        if (!this.buttonView.isEnabled() || this.buttonView.isLoading()) {
            return;
        }
        this.buttonView.setLoading(true);
        callback.run(this.inputAmount);
    }

    public void lambda$show$3() {
        AndroidUtilities.showKeyboard(this.starsCountEditField);
    }

    private void onCurrencyChanged(boolean z) {
        AmountUtils$Currency amountUtils$Currency = this.inputAmount.currency;
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.STARS;
        if (amountUtils$Currency == amountUtils$Currency2) {
            this.titleView.setText(LocaleController.getString(R.string.ResellGiftTitle), z);
            this.starsCountEditField.setInputType(2);
            this.starsCountEditField.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(getInputAmountMax().asDecimal()).length())});
        } else if (amountUtils$Currency == AmountUtils$Currency.TON) {
            this.titleView.setText(LocaleController.getString(R.string.ResellGiftTitleTON), z);
            this.starsCountEditField.setInputType(8194);
            this.starsCountEditField.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(getInputAmountMax().asDecimal()).length() + 3)});
        }
        CheckBox2 checkBox2 = this.radioButtonCell.checkbox;
        AmountUtils$Currency amountUtils$Currency3 = this.inputAmount.currency;
        AmountUtils$Currency amountUtils$Currency4 = AmountUtils$Currency.TON;
        checkBox2.setChecked(amountUtils$Currency3 == amountUtils$Currency4, z);
        if (z) {
            this.iconStars.animate().alpha(this.inputAmount.currency == amountUtils$Currency2 ? 1.0f : 0.0f).scaleX(this.inputAmount.currency == amountUtils$Currency2 ? 1.0f : 0.0f).scaleY(this.inputAmount.currency == amountUtils$Currency2 ? 1.0f : 0.0f).setDuration(180L).start();
            this.iconTon.animate().alpha(this.inputAmount.currency == amountUtils$Currency4 ? 1.0f : 0.0f).scaleX(this.inputAmount.currency == amountUtils$Currency4 ? 1.0f : 0.0f).scaleY(this.inputAmount.currency == amountUtils$Currency4 ? 1.0f : 0.0f).setDuration(180L).start();
        } else {
            this.iconStars.setAlpha(this.inputAmount.currency == amountUtils$Currency2 ? 1.0f : 0.0f);
            this.iconTon.setAlpha(this.inputAmount.currency == amountUtils$Currency4 ? 1.0f : 0.0f);
        }
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

    @Override
    public void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SellGiftEnterPriceSheet.this.lambda$show$3();
            }
        }, 50L);
    }
}
