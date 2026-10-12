package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class om0 implements TextWatcher {
    public boolean f39007a;
    public final EditTextBoldCursor f39008b;
    public final String f39009c;
    public final un0 d;

    public om0(un0 un0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = un0Var;
        this.f39008b = editTextBoldCursor;
        this.f39009c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f39007a) {
            return;
        }
        boolean z10 = true;
        this.f39007a = true;
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
        this.f39007a = false;
        EditTextBoldCursor editTextBoldCursor = this.f39008b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            un0.I0(this.d, editTextBoldCursor, this.f39009c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
