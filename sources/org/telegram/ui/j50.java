package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class j50 implements TextWatcher {
    public final k50 f48911a;

    public j50(k50 k50Var) {
        this.f48911a = k50Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        k50 k50Var = this.f48911a;
        n50 n50Var = k50Var.h;
        if (k50Var.f49158c != 0) {
            n50Var.getConnectionsManager().cancelRequest(k50Var.f49158c, true);
            k50Var.f49158c = 0;
        }
        vs vsVar = k50Var.d;
        if (vsVar != null) {
            org.telegram.messenger.g0.r(vsVar);
        }
        k50Var.f49159e = null;
        if (trim.isEmpty()) {
            n50.f0(n50Var, null);
            return;
        }
        vs vsVar2 = new vs(24, this, trim);
        k50Var.d = vsVar2;
        org.telegram.messenger.g0.h3(vsVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
