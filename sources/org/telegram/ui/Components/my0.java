package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class my0 implements TextWatcher {
    public final NumberTextView f26563a;
    public final ly0 f26564b;

    public my0(NumberTextView numberTextView, ly0 ly0Var) {
        this.f26563a = numberTextView;
        this.f26564b = ly0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f26563a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f26564b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
