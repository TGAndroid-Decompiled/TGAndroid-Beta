package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class i0 implements TextWatcher {
    public final u0 f21411a;

    public i0(u0 u0Var) {
        this.f21411a = u0Var;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        u0 u0Var = this.f21411a;
        g5 g5Var = u0Var.H;
        if (g5Var != null) {
            g5Var.q(u0Var.e);
        }
        u0Var.j();
        if (!u0Var.f21744g0.isEmpty() && !TextUtils.isEmpty(u0Var.e.getText()) && u0Var.f21745h0 >= 0) {
            u0Var.f21745h0 = -1;
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
