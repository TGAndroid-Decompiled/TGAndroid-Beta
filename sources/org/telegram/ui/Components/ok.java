package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class ok implements TextWatcher {
    public final qk f38004a;

    public ok(qk qkVar) {
        this.f38004a = qkVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f38004a.i0();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
