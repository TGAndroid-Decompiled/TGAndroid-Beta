package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class gz0 implements TextWatcher {
    public final NumberTextView f28749a;
    public final fz0 f28750b;

    public gz0(NumberTextView numberTextView, fz0 fz0Var) {
        this.f28749a = numberTextView;
        this.f28750b = fz0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f28749a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f28750b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
