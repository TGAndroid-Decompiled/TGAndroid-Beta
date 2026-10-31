package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class ik implements TextWatcher {
    public final kk f26993a;

    public ik(kk kkVar) {
        this.f26993a = kkVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f26993a.g0();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
