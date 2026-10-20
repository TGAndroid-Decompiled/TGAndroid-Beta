package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class uy0 implements TextWatcher {
    public final NumberTextView f31085a;
    public final ty0 f31086b;

    public uy0(NumberTextView numberTextView, ty0 ty0Var) {
        this.f31085a = numberTextView;
        this.f31086b = ty0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f31085a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f31086b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
