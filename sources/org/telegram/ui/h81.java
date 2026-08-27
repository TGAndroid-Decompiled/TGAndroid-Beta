package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class h81 implements TextWatcher {

    public boolean f38725a;

    public final int f38726b;

    public final EditTextBoldCursor f38727c;
    public final org.telegram.ui.Components.jc0 d;

    public final int[] f38728e;

    public final TextView f38729f;

    public h81(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.jc0 jc0Var, int[] iArr, TextView textView) {
        this.f38726b = i10;
        this.f38727c = editTextBoldCursor;
        this.d = jc0Var;
        this.f38728e = iArr;
        this.f38729f = textView;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        double d;
        org.telegram.ui.Components.jc0 jc0Var = this.d;
        int i10 = this.f38726b;
        EditTextBoldCursor editTextBoldCursor = this.f38727c;
        if (this.f38725a) {
            return;
        }
        try {
            d = TextUtils.isEmpty(editable) ? 0.0d : Double.parseDouble(editable.toString());
            try {
                double d10 = MessagesController.getInstance(i10).tonStakeddiceStakeAmountMax / 1.0E9d;
                int[] iArr = this.f38728e;
                if (d > d10) {
                    this.f38725a = true;
                    d = MessagesController.getInstance(i10).tonStakeddiceStakeAmountMax / 1.0E9d;
                    editTextBoldCursor.setText(Double.toString(d));
                    editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                    int i11 = -iArr[0];
                    iArr[0] = i11;
                    AndroidUtilities.shakeViewSpring(jc0Var, i11);
                } else if (d > 0.0d && d < MessagesController.getInstance(i10).tonStakeddiceStakeAmountMin / 1.0E9d) {
                    this.f38725a = true;
                    d = MessagesController.getInstance(i10).tonStakeddiceStakeAmountMin / 1.0E9d;
                    editTextBoldCursor.setText(Double.toString(d));
                    editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                    int i12 = -iArr[0];
                    iArr[0] = i12;
                    AndroidUtilities.shakeViewSpring(jc0Var, i12);
                }
            } catch (Exception unused) {
                this.f38725a = true;
                editTextBoldCursor.setText(d <= 0.0d ? "" : Double.toString(d));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
            }
        } catch (Exception unused2) {
            d = 0.0d;
        }
        this.f38725a = false;
        jc0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
        TextView textView = this.f38729f;
        if (d == 0.0d) {
            textView.animate().alpha(0.0f).start();
            textView.setText("");
        } else {
            textView.animate().alpha(1.0f).start();
            textView.setText("≈" + BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * d * 100.0d), "USD", 2));
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
