package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class cy0 implements TextWatcher {
    public final NumberTextView f24077a;
    public final by0 f24078b;

    public cy0(NumberTextView numberTextView, by0 by0Var) {
        this.f24077a = numberTextView;
        this.f24078b = by0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f24077a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f24078b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
