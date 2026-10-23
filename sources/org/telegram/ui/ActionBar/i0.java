package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class i0 implements TextWatcher {
    public final u0 f20946a;

    public i0(u0 u0Var) {
        this.f20946a = u0Var;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        u0 u0Var = this.f20946a;
        k5 k5Var = u0Var.H;
        if (k5Var != null) {
            k5Var.q(u0Var.e);
        }
        u0Var.j();
        if (!u0Var.f21882g0.isEmpty() && !TextUtils.isEmpty(u0Var.e.getText()) && u0Var.f21883h0 >= 0) {
            u0Var.f21883h0 = -1;
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
