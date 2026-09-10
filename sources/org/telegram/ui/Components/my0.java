package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class my0 implements TextWatcher {
    public final NumberTextView f25316a;
    public final ly0 f25317b;

    public my0(NumberTextView numberTextView, ly0 ly0Var) {
        this.f25316a = numberTextView;
        this.f25317b = ly0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f25316a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f25317b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
