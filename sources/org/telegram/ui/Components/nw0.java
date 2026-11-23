package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class nw0 implements TextWatcher {
    public final NumberTextView f37929a;
    public final mw0 f37930b;

    public nw0(NumberTextView numberTextView, mw0 mw0Var) {
        this.f37929a = numberTextView;
        this.f37930b = mw0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f37929a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f37930b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
