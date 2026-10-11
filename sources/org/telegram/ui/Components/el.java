package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class el implements TextWatcher {
    public final gl f26072a;

    public el(gl glVar) {
        this.f26072a = glVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f26072a.g0();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
