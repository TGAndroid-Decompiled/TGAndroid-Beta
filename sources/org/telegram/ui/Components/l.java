package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class l implements TextWatcher {
    public final g0 f30178a;

    public l(g0 g0Var) {
        this.f30178a = g0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        f0 f0Var;
        g0 g0Var = this.f30178a;
        f0 f0Var2 = g0Var.f28683s0;
        if (f0Var2 != null) {
            i10 = f0Var2.getSelectedTab();
        } else {
            i10 = 0;
        }
        if (i10 == 1 && (f0Var = g0Var.f28684t0) != null && (f0Var.getSelectedTone() instanceof c0)) {
            g0Var.c0();
            g0Var.q0();
            g0Var.p0(true);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
