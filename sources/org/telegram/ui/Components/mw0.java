package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class mw0 implements TextWatcher {
    public final NumberTextView f37633a;
    public final lw0 f37634b;

    public mw0(NumberTextView numberTextView, lw0 lw0Var) {
        this.f37633a = numberTextView;
        this.f37634b = lw0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f37633a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f37634b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
