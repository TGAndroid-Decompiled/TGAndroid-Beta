package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class o implements TextWatcher {
    public final m0 f37965a;

    public o(m0 m0Var) {
        this.f37965a = m0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        l0 l0Var;
        m0 m0Var = this.f37965a;
        l0 l0Var2 = m0Var.f37300u2;
        if (l0Var2 != null) {
            i7 = l0Var2.getSelectedTab();
        } else {
            i7 = 0;
        }
        if (i7 == 1 && (l0Var = m0Var.f37301v2) != null && (l0Var.getSelectedTone() instanceof i0)) {
            m0Var.j1();
            m0Var.C1();
            m0Var.B1(true);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
