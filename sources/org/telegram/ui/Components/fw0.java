package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class fw0 implements TextWatcher {
    public final NumberTextView f34711a;
    public final ew0 f34712b;

    public fw0(NumberTextView numberTextView, ew0 ew0Var) {
        this.f34711a = numberTextView;
        this.f34712b = ew0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f34711a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f34712b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
