package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class c50 implements TextWatcher {
    public final d50 f44238a;

    public c50(d50 d50Var) {
        this.f44238a = d50Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        d50 d50Var = this.f44238a;
        g50 g50Var = d50Var.h;
        if (d50Var.f44564c != 0) {
            g50Var.getConnectionsManager().cancelRequest(d50Var.f44564c, true);
            d50Var.f44564c = 0;
        }
        ly lyVar = d50Var.d;
        if (lyVar != null) {
            org.telegram.messenger.g0.r(lyVar);
        }
        d50Var.f44565e = null;
        if (trim.isEmpty()) {
            g50.f0(g50Var, null);
            return;
        }
        ly lyVar2 = new ly(8, this, trim);
        d50Var.d = lyVar2;
        org.telegram.messenger.g0.i3(lyVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
