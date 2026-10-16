package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class al implements TextWatcher {
    public final cl f23264a;

    public al(cl clVar) {
        this.f23264a = clVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f23264a.g0();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
