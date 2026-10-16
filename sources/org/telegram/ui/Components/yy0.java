package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class yy0 implements TextWatcher {
    public final NumberTextView f31380a;
    public final xy0 f31381b;

    public yy0(NumberTextView numberTextView, xy0 xy0Var) {
        this.f31380a = numberTextView;
        this.f31381b = xy0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f31380a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f31381b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
