package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class k50 implements TextWatcher {
    public final l50 f47197a;

    public k50(l50 l50Var) {
        this.f47197a = l50Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        l50 l50Var = this.f47197a;
        o50 o50Var = l50Var.h;
        if (l50Var.f47467c != 0) {
            o50Var.getConnectionsManager().cancelRequest(l50Var.f47467c, true);
            l50Var.f47467c = 0;
        }
        s10 s10Var = l50Var.d;
        if (s10Var != null) {
            org.telegram.messenger.g0.r(s10Var);
        }
        l50Var.f47468e = null;
        if (trim.isEmpty()) {
            o50.f0(o50Var, null);
            return;
        }
        s10 s10Var2 = new s10(3, this, trim);
        l50Var.d = s10Var2;
        org.telegram.messenger.g0.i3(s10Var2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
