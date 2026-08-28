package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class k implements TextWatcher {
    public final e0 f29895a;

    public k(e0 e0Var) {
        this.f29895a = e0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i9;
        d0 d0Var;
        e0 e0Var = this.f29895a;
        d0 d0Var2 = e0Var.f27869s0;
        if (d0Var2 != null) {
            i9 = d0Var2.getSelectedTab();
        } else {
            i9 = 0;
        }
        if (i9 == 1 && (d0Var = e0Var.f27870t0) != null && (d0Var.getSelectedTone() instanceof a0)) {
            e0Var.b0();
            e0Var.p0();
            e0Var.o0(true);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
