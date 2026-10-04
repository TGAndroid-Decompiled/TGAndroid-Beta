package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class en0 implements TextWatcher {
    public final int f36061a;
    public final gn0 f36062b;

    public en0(gn0 gn0Var, int i10) {
        this.f36062b = gn0Var;
        this.f36061a = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        gn0 gn0Var = this.f36062b;
        if (!gn0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.f36061a;
            if (length > 1) {
                String obj = editable.toString();
                gn0Var.H = true;
                for (int i11 = 0; i11 < Math.min(gn0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        gn0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                gn0Var.H = false;
            }
            if (i10 != gn0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = gn0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                gn0Var.d[i12].requestFocus();
            }
            int i13 = gn0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = gn0Var.getCode();
                if (code.length() == gn0Var.O) {
                    gn0Var.h(null);
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
