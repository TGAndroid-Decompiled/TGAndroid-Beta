package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class zx0 implements TextWatcher {
    public final NumberTextView f33279a;
    public final yx0 f33280b;

    public zx0(NumberTextView numberTextView, yx0 yx0Var) {
        this.f33279a = numberTextView;
        this.f33280b = yx0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f33279a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f33280b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
