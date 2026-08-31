package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class am0 implements TextWatcher {
    public boolean f35211a;
    public final EditTextBoldCursor f35212b;
    public final String f35213c;
    public final fn0 d;

    public am0(fn0 fn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = fn0Var;
        this.f35212b = editTextBoldCursor;
        this.f35213c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f35211a) {
            return;
        }
        boolean z4 = true;
        this.f35211a = true;
        int i10 = 0;
        while (true) {
            if (i10 < editable.length()) {
                char charAt = editable.charAt(i10);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && !((charAt >= '0' && charAt <= '9') || charAt == '-' || charAt == ' '))) {
                    break;
                }
                i10++;
            } else {
                z4 = false;
                break;
            }
        }
        this.f35211a = false;
        EditTextBoldCursor editTextBoldCursor = this.f35212b;
        if (z4) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            fn0.J0(this.d, editTextBoldCursor, this.f35213c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
