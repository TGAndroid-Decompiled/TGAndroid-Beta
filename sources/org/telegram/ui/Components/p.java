package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class p implements TextWatcher {
    public final n0 f38427a;

    public p(n0 n0Var) {
        this.f38427a = n0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        m0 m0Var;
        n0 n0Var = this.f38427a;
        m0 m0Var2 = n0Var.f37701u2;
        if (m0Var2 != null) {
            i7 = m0Var2.getSelectedTab();
        } else {
            i7 = 0;
        }
        if (i7 == 1 && (m0Var = n0Var.f37702v2) != null && (m0Var.getSelectedTone() instanceof j0)) {
            n0Var.j1();
            n0Var.C1();
            n0Var.B1(true);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
