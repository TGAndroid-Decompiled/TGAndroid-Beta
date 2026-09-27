package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hm0 implements TextWatcher {
    public final EditTextBoldCursor f34251a;
    public final String f34252b;
    public final jn0 f34253c;

    public hm0(jn0 jn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.f34253c = jn0Var;
        this.f34251a = editTextBoldCursor;
        this.f34252b = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        EditTextBoldCursor editTextBoldCursor = this.f34251a;
        int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
        int i10 = 0;
        while (true) {
            if (i10 < editable.length()) {
                char charAt = editable.charAt(i10);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != ' ' && charAt != '\'' && charAt != ',' && charAt != '.' && charAt != '&' && charAt != '-' && charAt != '/'))) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        jn0 jn0Var = this.f34253c;
        if (z10 && !jn0Var.f34812u0) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
            return;
        }
        jn0Var.f34810t0[intValue] = z10;
        jn0.J0(jn0Var, editTextBoldCursor, this.f34252b, editable, false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
