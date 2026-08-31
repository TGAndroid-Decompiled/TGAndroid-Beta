package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class dy0 implements TextWatcher {
    public final NumberTextView f26343a;
    public final cy0 f26344b;

    public dy0(NumberTextView numberTextView, cy0 cy0Var) {
        this.f26343a = numberTextView;
        this.f26344b = cy0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f26343a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f26344b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
