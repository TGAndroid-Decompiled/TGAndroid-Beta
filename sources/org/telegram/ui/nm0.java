package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class nm0 implements TextWatcher {
    public boolean f38425a;
    public final EditTextBoldCursor f38426b;
    public final String f38427c;
    public final sn0 d;

    public nm0(sn0 sn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = sn0Var;
        this.f38426b = editTextBoldCursor;
        this.f38427c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f38425a) {
            return;
        }
        boolean z10 = true;
        this.f38425a = true;
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
        this.f38425a = false;
        EditTextBoldCursor editTextBoldCursor = this.f38426b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            sn0.I0(this.d, editTextBoldCursor, this.f38427c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
