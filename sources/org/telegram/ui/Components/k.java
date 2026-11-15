package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class k implements TextWatcher {
    public final d0 f36217a;

    public k(d0 d0Var) {
        this.f36217a = d0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        c0 c0Var;
        d0 d0Var = this.f36217a;
        c0 c0Var2 = d0Var.f33764s2;
        if (c0Var2 != null) {
            i7 = c0Var2.getSelectedTab();
        } else {
            i7 = 0;
        }
        if (i7 == 1 && (c0Var = d0Var.f33765t2) != null && (c0Var.getSelectedTone() instanceof z)) {
            d0Var.h1();
            d0Var.v1();
            d0Var.u1(true);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
