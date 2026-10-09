package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hn0 implements TextWatcher {
    public final int f38382a;
    public final jn0 f38383b;

    public hn0(jn0 jn0Var, int i10) {
        this.f38383b = jn0Var;
        this.f38382a = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        jn0 jn0Var = this.f38383b;
        if (!jn0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.f38382a;
            if (length > 1) {
                String obj = editable.toString();
                jn0Var.H = true;
                for (int i11 = 0; i11 < Math.min(jn0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        jn0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                jn0Var.H = false;
            }
            if (i10 != jn0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = jn0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                jn0Var.d[i12].requestFocus();
            }
            int i13 = jn0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = jn0Var.getCode();
                if (code.length() == jn0Var.O) {
                    jn0Var.h(null);
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
