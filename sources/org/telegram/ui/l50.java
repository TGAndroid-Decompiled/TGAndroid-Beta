package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class l50 implements TextWatcher {
    public final m50 f47517a;

    public l50(m50 m50Var) {
        this.f47517a = m50Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        m50 m50Var = this.f47517a;
        p50 p50Var = m50Var.h;
        if (m50Var.f47794c != 0) {
            p50Var.getConnectionsManager().cancelRequest(m50Var.f47794c, true);
            m50Var.f47794c = 0;
        }
        f10 f10Var = m50Var.d;
        if (f10Var != null) {
            org.telegram.messenger.g0.r(f10Var);
        }
        m50Var.f47795e = null;
        if (trim.isEmpty()) {
            p50.f0(p50Var, null);
            return;
        }
        f10 f10Var2 = new f10(4, this, trim);
        m50Var.d = f10Var2;
        org.telegram.messenger.g0.i3(f10Var2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
