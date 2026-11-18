package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class vk implements TextWatcher {
    public final xk f40690a;

    public vk(xk xkVar) {
        this.f40690a = xkVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f40690a.i0();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
