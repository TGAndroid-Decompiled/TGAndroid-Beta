package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class k70 implements TextWatcher {
    public final l70 f34959a;

    public k70(l70 l70Var) {
        this.f34959a = l70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        l70 l70Var = this.f34959a;
        o70 o70Var = l70Var.h;
        if (l70Var.f35235c != 0) {
            o70Var.getConnectionsManager().cancelRequest(l70Var.f35235c, true);
            l70Var.f35235c = 0;
        }
        tt ttVar = l70Var.d;
        if (ttVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ttVar);
        }
        l70Var.e = null;
        if (trim.isEmpty()) {
            o70.a0(o70Var, null);
            return;
        }
        tt ttVar2 = new tt(25, this, trim);
        l70Var.d = ttVar2;
        AndroidUtilities.runOnUIThread(ttVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
