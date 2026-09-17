package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class lm0 implements TextWatcher {
    public boolean f35584a;
    public final EditTextBoldCursor f35585b;
    public final String f35586c;
    public final qn0 d;

    public lm0(qn0 qn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = qn0Var;
        this.f35585b = editTextBoldCursor;
        this.f35586c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f35584a) {
            return;
        }
        boolean z10 = true;
        this.f35584a = true;
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
        this.f35584a = false;
        EditTextBoldCursor editTextBoldCursor = this.f35585b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            qn0.J0(this.d, editTextBoldCursor, this.f35586c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
