package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fj0 implements TextWatcher {
    public boolean f47677a;
    public final EditTextBoldCursor f47678b;
    public final String f47679c;
    public final hk0 d;

    public fj0(hk0 hk0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = hk0Var;
        this.f47678b = editTextBoldCursor;
        this.f47679c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f47677a) {
            return;
        }
        boolean z10 = true;
        this.f47677a = true;
        int i7 = 0;
        while (true) {
            if (i7 < editable.length()) {
                char charAt = editable.charAt(i7);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && !((charAt >= '0' && charAt <= '9') || charAt == '-' || charAt == ' '))) {
                    break;
                }
                i7++;
            } else {
                z10 = false;
                break;
            }
        }
        this.f47677a = false;
        EditTextBoldCursor editTextBoldCursor = this.f47678b;
        if (z10) {
            editTextBoldCursor.setErrorText(org.telegram.messenger.gd.M0(2131747256, null));
        } else {
            hk0.N0(this.d, editTextBoldCursor, this.f47679c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
