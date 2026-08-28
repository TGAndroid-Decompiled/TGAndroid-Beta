package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class hx0 implements TextWatcher {
    public final NumberTextView f29209a;
    public final gx0 f29210b;

    public hx0(NumberTextView numberTextView, gx0 gx0Var) {
        this.f29209a = numberTextView;
        this.f29210b = gx0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f29209a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f29210b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
