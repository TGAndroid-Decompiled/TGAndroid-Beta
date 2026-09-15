package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class ay0 implements TextWatcher {
    public final NumberTextView f22516a;
    public final zx0 f22517b;

    public ay0(NumberTextView numberTextView, zx0 zx0Var) {
        this.f22516a = numberTextView;
        this.f22517b = zx0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f22516a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f22517b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
