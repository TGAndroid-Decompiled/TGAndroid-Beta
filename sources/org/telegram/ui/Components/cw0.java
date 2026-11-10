package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class cw0 implements TextWatcher {
    public final NumberTextView f32773a;
    public final bw0 f32774b;

    public cw0(NumberTextView numberTextView, bw0 bw0Var) {
        this.f32773a = numberTextView;
        this.f32774b = bw0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f32773a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f32774b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
