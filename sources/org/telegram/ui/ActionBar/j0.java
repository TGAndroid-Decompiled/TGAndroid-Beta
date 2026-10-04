package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class j0 implements TextWatcher {
    public final v0 f21240a;

    public j0(v0 v0Var) {
        this.f21240a = v0Var;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        v0 v0Var = this.f21240a;
        f5 f5Var = v0Var.H;
        if (f5Var != null) {
            f5Var.q(v0Var.f21580e);
        }
        v0Var.j();
        if (!v0Var.f21584g0.isEmpty() && !TextUtils.isEmpty(v0Var.f21580e.getText()) && v0Var.f21585h0 >= 0) {
            v0Var.f21585h0 = -1;
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
