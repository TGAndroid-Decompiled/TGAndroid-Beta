package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bm0 implements TextWatcher {
    public final EditTextBoldCursor f32985a;
    public final String f32986b;
    public final dn0 f32987c;

    public bm0(dn0 dn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.f32987c = dn0Var;
        this.f32985a = editTextBoldCursor;
        this.f32986b = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        EditTextBoldCursor editTextBoldCursor = this.f32985a;
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
        dn0 dn0Var = this.f32987c;
        if (z4 && !dn0Var.f33720r0) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
            return;
        }
        dn0Var.f33717q0[intValue] = z4;
        dn0.J0(dn0Var, editTextBoldCursor, this.f32986b, editable, false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
