package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bm0 implements TextWatcher {
    public boolean f32451a;
    public final EditTextBoldCursor f32452b;
    public final String f32453c;
    public final gn0 d;

    public bm0(gn0 gn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = gn0Var;
        this.f32452b = editTextBoldCursor;
        this.f32453c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f32451a) {
            return;
        }
        boolean z10 = true;
        this.f32451a = true;
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
        this.f32451a = false;
        EditTextBoldCursor editTextBoldCursor = this.f32452b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            gn0.J0(this.d, editTextBoldCursor, this.f32453c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
