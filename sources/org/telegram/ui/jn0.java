package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jn0 implements TextWatcher {
    public final int f37845a;
    public final ln0 f37846b;

    public jn0(ln0 ln0Var, int i10) {
        this.f37846b = ln0Var;
        this.f37845a = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        ln0 ln0Var = this.f37846b;
        if (!ln0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.f37845a;
            if (length > 1) {
                String obj = editable.toString();
                ln0Var.H = true;
                for (int i11 = 0; i11 < Math.min(ln0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        ln0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                ln0Var.H = false;
            }
            if (i10 != ln0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = ln0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                ln0Var.d[i12].requestFocus();
            }
            int i13 = ln0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = ln0Var.getCode();
                if (code.length() == ln0Var.O) {
                    ln0Var.h(null);
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
