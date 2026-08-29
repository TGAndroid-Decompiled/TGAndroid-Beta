package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pm0 implements TextWatcher {
    public final int f41435a;
    public final rm0 f41436b;

    public pm0(rm0 rm0Var, int i10) {
        this.f41436b = rm0Var;
        this.f41435a = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        rm0 rm0Var = this.f41436b;
        if (!rm0Var.D && (length = editable.length()) >= 1) {
            int i10 = this.f41435a;
            if (length > 1) {
                String obj = editable.toString();
                rm0Var.D = true;
                for (int i11 = 0; i11 < Math.min(rm0Var.K - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        rm0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                rm0Var.D = false;
            }
            if (i10 != rm0Var.K - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = rm0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                rm0Var.d[i12].requestFocus();
            }
            int i13 = rm0Var.K;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = rm0Var.getCode();
                if (code.length() == rm0Var.K) {
                    rm0Var.h(null);
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
