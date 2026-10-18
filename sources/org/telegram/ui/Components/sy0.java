package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class sy0 implements TextWatcher {
    public final NumberTextView f30413a;
    public final ry0 f30414b;

    public sy0(NumberTextView numberTextView, ry0 ry0Var) {
        this.f30413a = numberTextView;
        this.f30414b = ry0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f30413a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f30414b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
