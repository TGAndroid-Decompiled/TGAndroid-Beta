package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class ty0 implements TextWatcher {
    public final NumberTextView f30757a;
    public final sy0 f30758b;

    public ty0(NumberTextView numberTextView, sy0 sy0Var) {
        this.f30757a = numberTextView;
        this.f30758b = sy0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f30757a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f30758b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
