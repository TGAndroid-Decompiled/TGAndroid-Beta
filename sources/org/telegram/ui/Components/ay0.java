package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class ay0 implements TextWatcher {
    public final NumberTextView f22512a;
    public final zx0 f22513b;

    public ay0(NumberTextView numberTextView, zx0 zx0Var) {
        this.f22512a = numberTextView;
        this.f22513b = zx0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f22512a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f22513b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
