package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hm0 implements TextWatcher {
    public boolean f38479a;
    public final EditTextBoldCursor f38480b;
    public final String f38481c;
    public final mn0 d;

    public hm0(mn0 mn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = mn0Var;
        this.f38480b = editTextBoldCursor;
        this.f38481c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f38479a) {
            return;
        }
        boolean z10 = true;
        this.f38479a = true;
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
        this.f38479a = false;
        EditTextBoldCursor editTextBoldCursor = this.f38480b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            mn0.I0(this.d, editTextBoldCursor, this.f38481c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
