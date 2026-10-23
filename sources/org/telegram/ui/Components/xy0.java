package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class xy0 implements TextWatcher {
    public final NumberTextView f32731a;
    public final wy0 f32732b;

    public xy0(NumberTextView numberTextView, wy0 wy0Var) {
        this.f32731a = numberTextView;
        this.f32732b = wy0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f32731a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f32732b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
