package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class my0 implements TextWatcher {
    public final NumberTextView f26520a;
    public final ly0 f26521b;

    public my0(NumberTextView numberTextView, ly0 ly0Var) {
        this.f26520a = numberTextView;
        this.f26521b = ly0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f26520a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f26521b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
