package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class l implements TextWatcher {
    public final e0 f35518a;

    public l(e0 e0Var) {
        this.f35518a = e0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i3;
        d0 d0Var;
        e0 e0Var = this.f35518a;
        d0 d0Var2 = e0Var.f33248p2;
        if (d0Var2 != null) {
            i3 = d0Var2.getSelectedTab();
        } else {
            i3 = 0;
        }
        if (i3 == 1 && (d0Var = e0Var.f33249q2) != null && (d0Var.getSelectedTone() instanceof a0)) {
            e0Var.h1();
            e0Var.v1();
            e0Var.u1(true);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
