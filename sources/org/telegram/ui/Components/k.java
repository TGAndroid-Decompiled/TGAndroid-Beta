package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class k implements TextWatcher {
    public final f0 f35119a;

    public k(f0 f0Var) {
        this.f35119a = f0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        e0 e0Var;
        f0 f0Var = this.f35119a;
        e0 e0Var2 = f0Var.f33421r2;
        if (e0Var2 != null) {
            i7 = e0Var2.getSelectedTab();
        } else {
            i7 = 0;
        }
        if (i7 == 1 && (e0Var = f0Var.f33422s2) != null && (e0Var.getSelectedTone() instanceof a0)) {
            f0Var.h1();
            f0Var.v1();
            f0Var.u1(true);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
