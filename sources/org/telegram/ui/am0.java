package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class am0 implements TextWatcher {
    public boolean f35219a;
    public final EditTextBoldCursor f35220b;
    public final String f35221c;
    public final fn0 d;

    public am0(fn0 fn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = fn0Var;
        this.f35220b = editTextBoldCursor;
        this.f35221c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f35219a) {
            return;
        }
        boolean z4 = true;
        this.f35219a = true;
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
        this.f35219a = false;
        EditTextBoldCursor editTextBoldCursor = this.f35220b;
        if (z4) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            fn0.J0(this.d, editTextBoldCursor, this.f35221c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
