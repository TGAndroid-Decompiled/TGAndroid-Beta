package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class j0 implements TextWatcher {
    public final v0 f21211a;

    public j0(v0 v0Var) {
        this.f21211a = v0Var;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        v0 v0Var = this.f21211a;
        g5 g5Var = v0Var.H;
        if (g5Var != null) {
            g5Var.q(v0Var.f21584e);
        }
        v0Var.j();
        if (!v0Var.f21588g0.isEmpty() && !TextUtils.isEmpty(v0Var.f21584e.getText()) && v0Var.f21589h0 >= 0) {
            v0Var.f21589h0 = -1;
            v0Var.y();
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
