package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class xk implements TextWatcher {
    public final zk f42154a;

    public xk(zk zkVar) {
        this.f42154a = zkVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f42154a.i0();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
