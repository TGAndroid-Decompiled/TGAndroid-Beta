package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class dn0 implements TextWatcher {
    public final int f33008a;
    public final fn0 f33009b;

    public dn0(fn0 fn0Var, int i10) {
        this.f33009b = fn0Var;
        this.f33008a = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        fn0 fn0Var = this.f33009b;
        if (!fn0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.f33008a;
            if (length > 1) {
                String obj = editable.toString();
                fn0Var.H = true;
                for (int i11 = 0; i11 < Math.min(fn0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        fn0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                fn0Var.H = false;
            }
            if (i10 != fn0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = fn0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                fn0Var.d[i12].requestFocus();
            }
            int i13 = fn0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = fn0Var.getCode();
                if (code.length() == fn0Var.O) {
                    fn0Var.h(null);
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
