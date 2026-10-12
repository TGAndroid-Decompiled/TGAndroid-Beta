package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class i0 implements TextWatcher {
    public final u0 f20977a;

    public i0(u0 u0Var) {
        this.f20977a = u0Var;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        u0 u0Var = this.f20977a;
        e5 e5Var = u0Var.H;
        if (e5Var != null) {
            e5Var.q(u0Var.f21315e);
        }
        u0Var.j();
        if (!u0Var.f21319g0.isEmpty() && !TextUtils.isEmpty(u0Var.f21315e.getText()) && u0Var.f21320h0 >= 0) {
            u0Var.f21320h0 = -1;
            u0Var.y();
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
