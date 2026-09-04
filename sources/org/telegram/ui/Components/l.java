package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class l implements TextWatcher {
    public final f0 f28014a;

    public l(f0 f0Var) {
        this.f28014a = f0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        e0 e0Var;
        f0 f0Var = this.f28014a;
        e0 e0Var2 = f0Var.f25840w0;
        if (e0Var2 != null) {
            i10 = e0Var2.getSelectedTab();
        } else {
            i10 = 0;
        }
        if (i10 == 1 && (e0Var = f0Var.f25841x0) != null && (e0Var.getSelectedTone() instanceof a0)) {
            f0Var.c0();
            f0Var.q0();
            f0Var.p0(true);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
