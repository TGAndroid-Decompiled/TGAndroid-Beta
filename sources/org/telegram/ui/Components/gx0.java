package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class gx0 implements TextWatcher {
    public final NumberTextView f26534a;
    public final fx0 f26535b;

    public gx0(NumberTextView numberTextView, fx0 fx0Var) {
        this.f26534a = numberTextView;
        this.f26535b = fx0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f26534a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f26535b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
