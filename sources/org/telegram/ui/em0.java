package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class em0 implements TextWatcher {
    public boolean f33288a;
    public final EditTextBoldCursor f33289b;
    public final String f33290c;
    public final jn0 d;

    public em0(jn0 jn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = jn0Var;
        this.f33289b = editTextBoldCursor;
        this.f33290c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f33288a) {
            return;
        }
        boolean z10 = true;
        this.f33288a = true;
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
        this.f33288a = false;
        EditTextBoldCursor editTextBoldCursor = this.f33289b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            jn0.J0(this.d, editTextBoldCursor, this.f33290c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
