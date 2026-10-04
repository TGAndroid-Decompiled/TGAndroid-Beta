package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class vy0 implements TextWatcher {
    public final NumberTextView f32380a;
    public final uy0 f32381b;

    public vy0(NumberTextView numberTextView, uy0 uy0Var) {
        this.f32380a = numberTextView;
        this.f32381b = uy0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f32380a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f32381b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
