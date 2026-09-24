package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class ky0 implements TextWatcher {
    public final NumberTextView f25898a;
    public final jy0 f25899b;

    public ky0(NumberTextView numberTextView, jy0 jy0Var) {
        this.f25898a = numberTextView;
        this.f25899b = jy0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f25898a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f25899b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
