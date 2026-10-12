package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class nn0 implements TextWatcher {
    public final int f38746a;
    public final qn0 f38747b;

    public nn0(qn0 qn0Var, int i10) {
        this.f38747b = qn0Var;
        this.f38746a = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        qn0 qn0Var = this.f38747b;
        if (!qn0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.f38746a;
            if (length > 1) {
                String obj = editable.toString();
                qn0Var.H = true;
                for (int i11 = 0; i11 < Math.min(qn0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        qn0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                qn0Var.H = false;
            }
            if (i10 != qn0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = qn0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                qn0Var.d[i12].requestFocus();
            }
            int i13 = qn0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = qn0Var.getCode();
                if (code.length() == qn0Var.O) {
                    qn0Var.h(null);
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
