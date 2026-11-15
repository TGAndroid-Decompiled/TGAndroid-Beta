package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class h50 implements TextWatcher {
    public final i50 f47613a;

    public h50(i50 i50Var) {
        this.f47613a = i50Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        i50 i50Var = this.f47613a;
        l50 l50Var = i50Var.h;
        if (i50Var.f47907c != 0) {
            l50Var.getConnectionsManager().cancelRequest(i50Var.f47907c, true);
            i50Var.f47907c = 0;
        }
        org.telegram.ui.Components.voip.u uVar = i50Var.d;
        if (uVar != null) {
            org.telegram.messenger.g0.r(uVar);
        }
        i50Var.f47908e = null;
        if (trim.isEmpty()) {
            l50.f0(l50Var, null);
            return;
        }
        org.telegram.ui.Components.voip.u uVar2 = new org.telegram.ui.Components.voip.u(29, this, trim);
        i50Var.d = uVar2;
        org.telegram.messenger.g0.i3(uVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
