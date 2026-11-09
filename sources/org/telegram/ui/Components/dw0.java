package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class dw0 implements TextWatcher {
    public final NumberTextView f33176a;
    public final cw0 f33177b;

    public dw0(NumberTextView numberTextView, cw0 cw0Var) {
        this.f33176a = numberTextView;
        this.f33177b = cw0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f33176a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f33177b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
