package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class k0 implements TextWatcher {
    public final w0 f18337a;

    public k0(w0 w0Var) {
        this.f18337a = w0Var;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        w0 w0Var = this.f18337a;
        i5 i5Var = w0Var.H;
        if (i5Var != null) {
            i5Var.q(w0Var.e);
        }
        w0Var.j();
        if (!w0Var.f18694g0.isEmpty() && !TextUtils.isEmpty(w0Var.e.getText()) && w0Var.f18695h0 >= 0) {
            w0Var.f18695h0 = -1;
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
