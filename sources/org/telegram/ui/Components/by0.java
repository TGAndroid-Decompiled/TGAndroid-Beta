package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class by0 implements TextWatcher {
    public final NumberTextView f22822a;
    public final ay0 f22823b;

    public by0(NumberTextView numberTextView, ay0 ay0Var) {
        this.f22822a = numberTextView;
        this.f22823b = ay0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f22822a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f22823b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
