package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class j70 implements TextWatcher {
    public final k70 f37855a;

    public j70(k70 k70Var) {
        this.f37855a = k70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        k70 k70Var = this.f37855a;
        n70 n70Var = k70Var.h;
        if (k70Var.f38200c != 0) {
            n70Var.getConnectionsManager().cancelRequest(k70Var.f38200c, true);
            k70Var.f38200c = 0;
        }
        z10 z10Var = k70Var.d;
        if (z10Var != null) {
            AndroidUtilities.cancelRunOnUIThread(z10Var);
        }
        k70Var.f38201e = null;
        if (trim.isEmpty()) {
            n70.a0(n70Var, null);
            return;
        }
        z10 z10Var2 = new z10(6, this, trim);
        k70Var.d = z10Var2;
        AndroidUtilities.runOnUIThread(z10Var2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
