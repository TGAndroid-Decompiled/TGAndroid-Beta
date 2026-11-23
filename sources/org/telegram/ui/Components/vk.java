package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class vk implements TextWatcher {
    public final xk f40725a;

    public vk(xk xkVar) {
        this.f40725a = xkVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f40725a.i0();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
