package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gn0 implements TextWatcher {
    public final int f38175a;
    public final in0 f38176b;

    public gn0(in0 in0Var, int i10) {
        this.f38176b = in0Var;
        this.f38175a = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        in0 in0Var = this.f38176b;
        if (!in0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.f38175a;
            if (length > 1) {
                String obj = editable.toString();
                in0Var.H = true;
                for (int i11 = 0; i11 < Math.min(in0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        in0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                in0Var.H = false;
            }
            if (i10 != in0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = in0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                in0Var.d[i12].requestFocus();
            }
            int i13 = in0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = in0Var.getCode();
                if (code.length() == in0Var.O) {
                    in0Var.h(null);
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
