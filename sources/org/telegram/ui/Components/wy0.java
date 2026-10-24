package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class wy0 implements TextWatcher {
    public final NumberTextView f32441a;
    public final vy0 f32442b;

    public wy0(NumberTextView numberTextView, vy0 vy0Var) {
        this.f32441a = numberTextView;
        this.f32442b = vy0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f32441a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f32442b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
