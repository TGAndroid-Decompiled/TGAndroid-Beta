package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class cz0 implements TextWatcher {
    public final NumberTextView f25554a;
    public final bz0 f25555b;

    public cz0(NumberTextView numberTextView, bz0 bz0Var) {
        this.f25554a = numberTextView;
        this.f25555b = bz0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f25554a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f25555b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
