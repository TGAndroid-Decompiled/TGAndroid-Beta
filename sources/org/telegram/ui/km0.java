package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class km0 implements TextWatcher {
    public boolean f38118a;
    public final EditTextBoldCursor f38119b;
    public final String f38120c;
    public final pn0 d;

    public km0(pn0 pn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = pn0Var;
        this.f38119b = editTextBoldCursor;
        this.f38120c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f38118a) {
            return;
        }
        boolean z10 = true;
        this.f38118a = true;
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
        this.f38118a = false;
        EditTextBoldCursor editTextBoldCursor = this.f38119b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            pn0.J0(this.d, editTextBoldCursor, this.f38120c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
