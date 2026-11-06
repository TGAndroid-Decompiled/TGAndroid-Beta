package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class cw0 implements TextWatcher {
    public final NumberTextView f32689a;
    public final bw0 f32690b;

    public cw0(NumberTextView numberTextView, bw0 bw0Var) {
        this.f32689a = numberTextView;
        this.f32690b = bw0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f32689a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f32690b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
