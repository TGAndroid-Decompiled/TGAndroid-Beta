package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class ny0 implements TextWatcher {
    public final NumberTextView f26807a;
    public final my0 f26808b;

    public ny0(NumberTextView numberTextView, my0 my0Var) {
        this.f26807a = numberTextView;
        this.f26808b = my0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f26807a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f26808b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
