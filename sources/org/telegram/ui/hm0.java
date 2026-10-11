package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hm0 implements TextWatcher {
    public boolean f38513a;
    public final EditTextBoldCursor f38514b;
    public final String f38515c;
    public final mn0 d;

    public hm0(mn0 mn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = mn0Var;
        this.f38514b = editTextBoldCursor;
        this.f38515c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f38513a) {
            return;
        }
        boolean z10 = true;
        this.f38513a = true;
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
        this.f38513a = false;
        EditTextBoldCursor editTextBoldCursor = this.f38514b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            mn0.I0(this.d, editTextBoldCursor, this.f38515c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
