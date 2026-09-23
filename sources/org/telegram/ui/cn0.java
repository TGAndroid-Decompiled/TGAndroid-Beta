package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cn0 implements TextWatcher {
    public final int f32374a;
    public final en0 f32375b;

    public cn0(en0 en0Var, int i10) {
        this.f32375b = en0Var;
        this.f32374a = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        en0 en0Var = this.f32375b;
        if (!en0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.f32374a;
            if (length > 1) {
                String obj = editable.toString();
                en0Var.H = true;
                for (int i11 = 0; i11 < Math.min(en0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        en0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                en0Var.H = false;
            }
            if (i10 != en0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = en0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                en0Var.d[i12].requestFocus();
            }
            int i13 = en0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = en0Var.getCode();
                if (code.length() == en0Var.O) {
                    en0Var.h(null);
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
