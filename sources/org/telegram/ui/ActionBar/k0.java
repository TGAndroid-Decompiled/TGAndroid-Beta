package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class k0 implements TextWatcher {
    public final w0 f19518a;

    public k0(w0 w0Var) {
        this.f19518a = w0Var;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        w0 w0Var = this.f19518a;
        g5 g5Var = w0Var.H;
        if (g5Var != null) {
            g5Var.q(w0Var.e);
        }
        w0Var.j();
        if (!w0Var.f19846g0.isEmpty() && !TextUtils.isEmpty(w0Var.e.getText()) && w0Var.f19847h0 >= 0) {
            w0Var.f19847h0 = -1;
            w0Var.y();
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
