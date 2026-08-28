package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class k0 implements TextWatcher {
    public final w0 f23604a;

    public k0(w0 w0Var) {
        this.f23604a = w0Var;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        w0 w0Var = this.f23604a;
        e5 e5Var = w0Var.D;
        if (e5Var != null) {
            e5Var.q(w0Var.f23906e);
        }
        w0Var.j();
        if (!w0Var.f23904c0.isEmpty() && !TextUtils.isEmpty(w0Var.f23906e.getText()) && w0Var.f23905d0 >= 0) {
            w0Var.f23905d0 = -1;
            w0Var.y();
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
