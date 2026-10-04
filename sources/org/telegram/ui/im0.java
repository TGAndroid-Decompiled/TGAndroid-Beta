package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class im0 implements TextWatcher {
    public final EditTextBoldCursor f37466a;
    public final String f37467b;
    public final kn0 f37468c;

    public im0(kn0 kn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.f37468c = kn0Var;
        this.f37466a = editTextBoldCursor;
        this.f37467b = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        EditTextBoldCursor editTextBoldCursor = this.f37466a;
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
        kn0 kn0Var = this.f37468c;
        if (z10 && !kn0Var.f38055u0) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
            return;
        }
        kn0Var.f38053t0[intValue] = z10;
        kn0.J0(kn0Var, editTextBoldCursor, this.f37467b, editable, false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
