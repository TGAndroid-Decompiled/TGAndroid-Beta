package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class zx0 implements TextWatcher {
    public final NumberTextView f30680a;
    public final yx0 f30681b;

    public zx0(NumberTextView numberTextView, yx0 yx0Var) {
        this.f30680a = numberTextView;
        this.f30681b = yx0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f30680a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f30681b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
