package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

public final class k0 implements TextWatcher {

    public final v0 f23605a;

    public k0(v0 v0Var) {
        this.f23605a = v0Var;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        v0 v0Var = this.f23605a;
        e5 e5Var = v0Var.D;
        if (e5Var != null) {
            e5Var.q(v0Var.f23859e);
        }
        v0Var.j();
        if (v0Var.f23857c0.isEmpty() || TextUtils.isEmpty(v0Var.f23859e.getText()) || v0Var.f23858d0 < 0) {
            return;
        }
        v0Var.f23858d0 = -1;
        v0Var.y();
    }

    @Override
    public final void afterTextChanged(Editable editable) {
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
