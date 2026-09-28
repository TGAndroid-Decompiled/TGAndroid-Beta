package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d21 implements TextWatcher {
    public final int f32896a;
    public final f21 f32897b;

    public d21(f21 f21Var, int i10) {
        this.f32896a = i10;
        this.f32897b = f21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f32896a) {
            case 0:
                this.f32897b.U(true);
                return;
            case 1:
                f21 f21Var = this.f32897b;
                if (!f21Var.K) {
                    EditTextBoldCursor editTextBoldCursor = f21Var.f33523a[1];
                    int selectionStart = editTextBoldCursor.getSelectionStart();
                    String obj = editTextBoldCursor.getText().toString();
                    StringBuilder sb2 = new StringBuilder(obj.length());
                    int i10 = 0;
                    while (i10 < obj.length()) {
                        int i11 = i10 + 1;
                        String substring = obj.substring(i10, i11);
                        if ("0123456789".contains(substring)) {
                            sb2.append(substring);
                        }
                        i10 = i11;
                    }
                    f21Var.K = true;
                    int intValue = Utilities.parseInt((CharSequence) sb2.toString()).intValue();
                    if (intValue >= 0 && intValue <= 65535 && obj.equals(sb2.toString())) {
                        if (selectionStart >= 0) {
                            editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
                        }
                    } else if (intValue < 0) {
                        editTextBoldCursor.setText("0");
                    } else if (intValue > 65535) {
                        editTextBoldCursor.setText("65535");
                    } else {
                        editTextBoldCursor.setText(sb2.toString());
                    }
                    f21Var.K = false;
                    f21Var.U(true);
                    return;
                }
                return;
            default:
                this.f32897b.U(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f32896a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f32896a;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
