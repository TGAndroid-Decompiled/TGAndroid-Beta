package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class l implements TextWatcher {
    public final g0 f35445a;

    public l(g0 g0Var) {
        this.f35445a = g0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        f0 f0Var;
        g0 g0Var = this.f35445a;
        f0 f0Var2 = g0Var.f33716o2;
        if (f0Var2 != null) {
            i7 = f0Var2.getSelectedTab();
        } else {
            i7 = 0;
        }
        if (i7 == 1 && (f0Var = g0Var.f33717p2) != null && (f0Var.getSelectedTone() instanceof b0)) {
            g0Var.h1();
            g0Var.v1();
            g0Var.u1(true);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
