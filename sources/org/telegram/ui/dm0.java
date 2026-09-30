package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class dm0 implements TextWatcher {
    public final EditTextBoldCursor f33237a;
    public final String f33238b;
    public final fn0 f33239c;

    public dm0(fn0 fn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.f33239c = fn0Var;
        this.f33237a = editTextBoldCursor;
        this.f33238b = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        EditTextBoldCursor editTextBoldCursor = this.f33237a;
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
        fn0 fn0Var = this.f33239c;
        if (z10 && !fn0Var.f33832u0) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
            return;
        }
        fn0Var.f33830t0[intValue] = z10;
        fn0.J0(fn0Var, editTextBoldCursor, this.f33238b, editable, false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
