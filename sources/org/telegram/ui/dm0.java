package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class dm0 implements TextWatcher {
    public final EditTextBoldCursor f36226a;
    public final String f36227b;
    public final fn0 f36228c;

    public dm0(fn0 fn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.f36228c = fn0Var;
        this.f36226a = editTextBoldCursor;
        this.f36227b = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        EditTextBoldCursor editTextBoldCursor = this.f36226a;
        int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
        int i10 = 0;
        while (true) {
            if (i10 < editable.length()) {
                char charAt = editable.charAt(i10);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != ' ' && charAt != '\'' && charAt != ',' && charAt != '.' && charAt != '&' && charAt != '-' && charAt != '/'))) {
                    z4 = true;
                    break;
                }
                i10++;
            } else {
                z4 = false;
                break;
            }
        }
        fn0 fn0Var = this.f36228c;
        if (z4 && !fn0Var.f36859r0) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
            return;
        }
        fn0Var.f36856q0[intValue] = z4;
        fn0.J0(fn0Var, editTextBoldCursor, this.f36227b, editable, false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
