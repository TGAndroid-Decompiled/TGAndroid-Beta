package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class hz0 implements TextWatcher {
    public final NumberTextView f26982a;
    public final gz0 f26983b;

    public hz0(NumberTextView numberTextView, gz0 gz0Var) {
        this.f26982a = numberTextView;
        this.f26983b = gz0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f26982a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f26983b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
