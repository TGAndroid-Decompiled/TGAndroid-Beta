package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fm0 implements TextWatcher {
    public boolean f36345a;
    public final EditTextBoldCursor f36346b;
    public final String f36347c;
    public final kn0 d;

    public fm0(kn0 kn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = kn0Var;
        this.f36346b = editTextBoldCursor;
        this.f36347c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f36345a) {
            return;
        }
        boolean z10 = true;
        this.f36345a = true;
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
        this.f36345a = false;
        EditTextBoldCursor editTextBoldCursor = this.f36346b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            kn0.J0(this.d, editTextBoldCursor, this.f36347c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
