package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class f60 implements TextWatcher {
    public final g60 f37006a;

    public f60(g60 g60Var) {
        this.f37006a = g60Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        g60 g60Var = this.f37006a;
        j60 j60Var = g60Var.h;
        if (g60Var.f37361c != 0) {
            j60Var.getConnectionsManager().cancelRequest(g60Var.f37361c, true);
            g60Var.f37361c = 0;
        }
        org.telegram.ui.Components.voip.u uVar = g60Var.d;
        if (uVar != null) {
            org.telegram.messenger.i0.r(uVar);
        }
        g60Var.e = null;
        if (trim.isEmpty()) {
            j60.f0(j60Var, null);
            return;
        }
        org.telegram.ui.Components.voip.u uVar2 = new org.telegram.ui.Components.voip.u(27, this, trim);
        g60Var.d = uVar2;
        org.telegram.messenger.i0.h3(uVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
