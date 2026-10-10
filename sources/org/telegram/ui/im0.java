package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class im0 implements TextWatcher {
    public boolean f38745a;
    public final EditTextBoldCursor f38746b;
    public final String f38747c;
    public final nn0 d;

    public im0(nn0 nn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = nn0Var;
        this.f38746b = editTextBoldCursor;
        this.f38747c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f38745a) {
            return;
        }
        boolean z10 = true;
        this.f38745a = true;
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
        this.f38745a = false;
        EditTextBoldCursor editTextBoldCursor = this.f38746b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            nn0.I0(this.d, editTextBoldCursor, this.f38747c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
