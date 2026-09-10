package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jm0 implements TextWatcher {
    public boolean f34136a;
    public final EditTextBoldCursor f34137b;
    public final String f34138c;
    public final on0 d;

    public jm0(on0 on0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = on0Var;
        this.f34137b = editTextBoldCursor;
        this.f34138c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f34136a) {
            return;
        }
        boolean z10 = true;
        this.f34136a = true;
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
        this.f34136a = false;
        EditTextBoldCursor editTextBoldCursor = this.f34137b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            on0.J0(this.d, editTextBoldCursor, this.f34138c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
