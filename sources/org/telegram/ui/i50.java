package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class i50 implements TextWatcher {
    public final j50 f46566a;

    public i50(j50 j50Var) {
        this.f46566a = j50Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        j50 j50Var = this.f46566a;
        m50 m50Var = j50Var.h;
        if (j50Var.f46821c != 0) {
            m50Var.getConnectionsManager().cancelRequest(j50Var.f46821c, true);
            j50Var.f46821c = 0;
        }
        q10 q10Var = j50Var.d;
        if (q10Var != null) {
            org.telegram.messenger.g0.r(q10Var);
        }
        j50Var.f46822e = null;
        if (trim.isEmpty()) {
            m50.f0(m50Var, null);
            return;
        }
        q10 q10Var2 = new q10(3, this, trim);
        j50Var.d = q10Var2;
        org.telegram.messenger.g0.i3(q10Var2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
