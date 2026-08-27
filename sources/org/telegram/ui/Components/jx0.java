package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

public final class jx0 implements TextWatcher {

    public final NumberTextView f29827a;

    public final ix0 f29828b;

    public jx0(NumberTextView numberTextView, ix0 ix0Var) {
        this.f29827a = numberTextView;
        this.f29828b = ix0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f29827a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f29828b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
