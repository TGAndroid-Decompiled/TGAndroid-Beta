package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class an0 implements TextWatcher {
    public final int f32200a;
    public final cn0 f32201b;

    public an0(cn0 cn0Var, int i10) {
        this.f32201b = cn0Var;
        this.f32200a = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        cn0 cn0Var = this.f32201b;
        if (!cn0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.f32200a;
            if (length > 1) {
                String obj = editable.toString();
                cn0Var.H = true;
                for (int i11 = 0; i11 < Math.min(cn0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        cn0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                cn0Var.H = false;
            }
            if (i10 != cn0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = cn0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                cn0Var.d[i12].requestFocus();
            }
            int i13 = cn0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = cn0Var.getCode();
                if (code.length() == cn0Var.O) {
                    cn0Var.h(null);
                }
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
