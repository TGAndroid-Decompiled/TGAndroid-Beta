package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gk0 implements TextWatcher {
    public boolean f37519a;
    public final EditTextBoldCursor f37520b;
    public final String f37521c;
    public final jl0 d;

    public gk0(jl0 jl0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = jl0Var;
        this.f37520b = editTextBoldCursor;
        this.f37521c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f37519a) {
            return;
        }
        boolean z10 = true;
        this.f37519a = true;
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
        this.f37519a = false;
        EditTextBoldCursor editTextBoldCursor = this.f37520b;
        if (z10) {
            editTextBoldCursor.setErrorText(org.telegram.messenger.dd.L0(2131747465, null));
        } else {
            jl0.N0(this.d, editTextBoldCursor, this.f37521c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
