package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class o70 implements TextWatcher {
    public final p70 f40435a;

    public o70(p70 p70Var) {
        this.f40435a = p70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        p70 p70Var = this.f40435a;
        s70 s70Var = p70Var.h;
        if (p70Var.f40774c != 0) {
            s70Var.getConnectionsManager().cancelRequest(p70Var.f40774c, true);
            p70Var.f40774c = 0;
        }
        n70 n70Var = p70Var.d;
        if (n70Var != null) {
            AndroidUtilities.cancelRunOnUIThread(n70Var);
        }
        p70Var.f40775e = null;
        if (trim.isEmpty()) {
            s70.a0(s70Var, null);
            return;
        }
        n70 n70Var2 = new n70(0, this, trim);
        p70Var.d = n70Var2;
        AndroidUtilities.runOnUIThread(n70Var2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
