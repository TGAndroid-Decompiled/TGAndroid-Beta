package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class j50 implements TextWatcher {
    public final k50 f48991a;

    public j50(k50 k50Var) {
        this.f48991a = k50Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        k50 k50Var = this.f48991a;
        n50 n50Var = k50Var.h;
        if (k50Var.f49321c != 0) {
            n50Var.getConnectionsManager().cancelRequest(k50Var.f49321c, true);
            k50Var.f49321c = 0;
        }
        i50 i50Var = k50Var.d;
        if (i50Var != null) {
            org.telegram.messenger.g0.r(i50Var);
        }
        k50Var.f49322e = null;
        if (trim.isEmpty()) {
            n50.f0(n50Var, null);
            return;
        }
        i50 i50Var2 = new i50(0, this, trim);
        k50Var.d = i50Var2;
        org.telegram.messenger.g0.h3(i50Var2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
