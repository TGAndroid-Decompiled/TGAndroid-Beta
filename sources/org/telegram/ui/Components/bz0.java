package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class bz0 implements TextWatcher {
    public final NumberTextView f25183a;
    public final az0 f25184b;

    public bz0(NumberTextView numberTextView, az0 az0Var) {
        this.f25183a = numberTextView;
        this.f25184b = az0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f25183a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f25184b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
