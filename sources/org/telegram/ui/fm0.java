package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fm0 implements TextWatcher {
    public boolean f39399a;
    public final EditTextBoldCursor f39400b;
    public final String f39401c;
    public final kn0 d;

    public fm0(kn0 kn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = kn0Var;
        this.f39400b = editTextBoldCursor;
        this.f39401c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f39399a) {
            return;
        }
        boolean z10 = true;
        this.f39399a = true;
        int i10 = 0;
        while (true) {
            if (i10 < editable.length()) {
                char charAt = editable.charAt(i10);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && !((charAt >= '0' && charAt <= '9') || charAt == '-' || charAt == ' '))) {
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        this.f39399a = false;
        EditTextBoldCursor editTextBoldCursor = this.f39400b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            kn0.J0(this.d, editTextBoldCursor, this.f39401c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
