package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class hx0 implements TextWatcher {
    public final NumberTextView f26955a;
    public final gx0 f26956b;

    public hx0(NumberTextView numberTextView, gx0 gx0Var) {
        this.f26955a = numberTextView;
        this.f26956b = gx0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f26955a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f26956b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
