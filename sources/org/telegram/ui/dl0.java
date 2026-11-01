package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class dl0 implements TextWatcher {
    public final int f36630a;
    public final fl0 f36631b;

    public dl0(fl0 fl0Var, int i10) {
        this.f36631b = fl0Var;
        this.f36630a = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        fl0 fl0Var = this.f36631b;
        if (!fl0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.f36630a;
            if (length > 1) {
                String obj = editable.toString();
                fl0Var.H = true;
                for (int i11 = 0; i11 < Math.min(fl0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        fl0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                fl0Var.H = false;
            }
            if (i10 != fl0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = fl0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                fl0Var.d[i12].requestFocus();
            }
            int i13 = fl0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = fl0Var.getCode();
                if (code.length() == fl0Var.O) {
                    fl0Var.h(null);
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
