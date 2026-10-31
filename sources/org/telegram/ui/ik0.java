package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ik0 implements TextWatcher {
    public boolean f38270a;
    public final EditTextBoldCursor f38271b;
    public final String f38272c;
    public final ll0 d;

    public ik0(ll0 ll0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = ll0Var;
        this.f38271b = editTextBoldCursor;
        this.f38272c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f38270a) {
            return;
        }
        boolean z10 = true;
        this.f38270a = true;
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
        this.f38270a = false;
        EditTextBoldCursor editTextBoldCursor = this.f38271b;
        if (z10) {
            editTextBoldCursor.setErrorText(org.telegram.messenger.cd.L0(2131747465, null));
        } else {
            ll0.M0(this.d, editTextBoldCursor, this.f38272c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
