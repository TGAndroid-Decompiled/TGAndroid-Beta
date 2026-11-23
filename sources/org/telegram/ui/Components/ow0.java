package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class ow0 implements TextWatcher {
    public final NumberTextView f38338a;
    public final nw0 f38339b;

    public ow0(NumberTextView numberTextView, nw0 nw0Var) {
        this.f38338a = numberTextView;
        this.f38339b = nw0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f38338a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f38339b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
