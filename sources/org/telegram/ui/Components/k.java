package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class k implements TextWatcher {
    public final e0 f25559a;

    public k(e0 e0Var) {
        this.f25559a = e0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        d0 d0Var;
        e0 e0Var = this.f25559a;
        d0 d0Var2 = e0Var.f23800w0;
        if (d0Var2 != null) {
            i10 = d0Var2.getSelectedTab();
        } else {
            i10 = 0;
        }
        if (i10 == 1 && (d0Var = e0Var.f23801x0) != null && (d0Var.getSelectedTone() instanceof z)) {
            e0Var.c0();
            e0Var.q0();
            e0Var.p0(true);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
