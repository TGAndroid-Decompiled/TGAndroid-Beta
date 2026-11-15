package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cj0 implements TextWatcher {
    public boolean f46176a;
    public final EditTextBoldCursor f46177b;
    public final String f46178c;
    public final ek0 d;

    public cj0(ek0 ek0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = ek0Var;
        this.f46177b = editTextBoldCursor;
        this.f46178c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f46176a) {
            return;
        }
        boolean z10 = true;
        this.f46176a = true;
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
        this.f46176a = false;
        EditTextBoldCursor editTextBoldCursor = this.f46177b;
        if (z10) {
            editTextBoldCursor.setErrorText(org.telegram.messenger.hd.M0(2131747449, null));
        } else {
            ek0.N0(this.d, editTextBoldCursor, this.f46178c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
