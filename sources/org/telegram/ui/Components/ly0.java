package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class ly0 implements TextWatcher {
    public final NumberTextView f26254a;
    public final ky0 f26255b;

    public ly0(NumberTextView numberTextView, ky0 ky0Var) {
        this.f26254a = numberTextView;
        this.f26255b = ky0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f26254a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f26255b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
