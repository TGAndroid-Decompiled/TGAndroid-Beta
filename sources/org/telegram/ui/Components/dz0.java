package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class dz0 implements TextWatcher {
    public final NumberTextView f25757a;
    public final cz0 f25758b;

    public dz0(NumberTextView numberTextView, cz0 cz0Var) {
        this.f25757a = numberTextView;
        this.f25758b = cz0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f25757a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f25758b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
