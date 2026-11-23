package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class dj0 implements TextWatcher {
    public boolean f47151a;
    public final EditTextBoldCursor f47152b;
    public final String f47153c;
    public final fk0 d;

    public dj0(fk0 fk0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = fk0Var;
        this.f47152b = editTextBoldCursor;
        this.f47153c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f47151a) {
            return;
        }
        boolean z10 = true;
        this.f47151a = true;
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
        this.f47151a = false;
        EditTextBoldCursor editTextBoldCursor = this.f47152b;
        if (z10) {
            editTextBoldCursor.setErrorText(org.telegram.messenger.gd.N0(2131747255, null));
        } else {
            fk0.N0(this.d, editTextBoldCursor, this.f47153c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
