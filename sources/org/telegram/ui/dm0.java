package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class dm0 implements TextWatcher {
    public boolean f38905a;
    public final EditTextBoldCursor f38906b;
    public final String f38907c;
    public final in0 d;

    public dm0(in0 in0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = in0Var;
        this.f38906b = editTextBoldCursor;
        this.f38907c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f38905a) {
            return;
        }
        boolean z10 = true;
        this.f38905a = true;
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
        this.f38905a = false;
        EditTextBoldCursor editTextBoldCursor = this.f38906b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            in0.J0(this.d, editTextBoldCursor, this.f38907c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
