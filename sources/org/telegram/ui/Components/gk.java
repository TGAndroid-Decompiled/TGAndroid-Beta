package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class gk implements TextWatcher {
    public final ik f33940a;

    public gk(ik ikVar) {
        this.f33940a = ikVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f33940a.i0();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
