package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class p70 implements TextWatcher {
    public final q70 f36364a;

    public p70(q70 q70Var) {
        this.f36364a = q70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        q70 q70Var = this.f36364a;
        t70 t70Var = q70Var.h;
        if (q70Var.f36708c != 0) {
            t70Var.getConnectionsManager().cancelRequest(q70Var.f36708c, true);
            q70Var.f36708c = 0;
        }
        cu cuVar = q70Var.d;
        if (cuVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cuVar);
        }
        q70Var.e = null;
        if (trim.isEmpty()) {
            t70.a0(t70Var, null);
            return;
        }
        cu cuVar2 = new cu(24, this, trim);
        q70Var.d = cuVar2;
        AndroidUtilities.runOnUIThread(cuVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
