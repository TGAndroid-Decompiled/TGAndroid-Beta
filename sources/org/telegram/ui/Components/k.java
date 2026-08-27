package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

public final class k implements TextWatcher {

    public final e0 f29866a;

    public k(e0 e0Var) {
        this.f29866a = e0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        d0 d0Var;
        e0 e0Var = this.f29866a;
        d0 d0Var2 = e0Var.f27895s0;
        if ((d0Var2 != null ? d0Var2.getSelectedTab() : 0) == 1 && (d0Var = e0Var.f27896t0) != null && (d0Var.getSelectedTone() instanceof a0)) {
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
