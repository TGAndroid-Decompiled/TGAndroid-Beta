package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class km0 implements TextWatcher {
    public boolean f39550a;
    public final EditTextBoldCursor f39551b;
    public final String f39552c;
    public final pn0 d;

    public km0(pn0 pn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = pn0Var;
        this.f39551b = editTextBoldCursor;
        this.f39552c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f39550a) {
            return;
        }
        boolean z10 = true;
        this.f39550a = true;
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
        this.f39550a = false;
        EditTextBoldCursor editTextBoldCursor = this.f39551b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            pn0.I0(this.d, editTextBoldCursor, this.f39552c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
