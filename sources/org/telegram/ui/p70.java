package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class p70 implements TextWatcher {
    public final q70 f36455a;

    public p70(q70 q70Var) {
        this.f36455a = q70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        q70 q70Var = this.f36455a;
        t70 t70Var = q70Var.h;
        if (q70Var.f36786c != 0) {
            t70Var.getConnectionsManager().cancelRequest(q70Var.f36786c, true);
            q70Var.f36786c = 0;
        }
        kw kwVar = q70Var.d;
        if (kwVar != null) {
            AndroidUtilities.cancelRunOnUIThread(kwVar);
        }
        q70Var.e = null;
        if (trim.isEmpty()) {
            t70.a0(t70Var, null);
            return;
        }
        kw kwVar2 = new kw(20, this, trim);
        q70Var.d = kwVar2;
        AndroidUtilities.runOnUIThread(kwVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
