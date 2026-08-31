package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class j70 implements TextWatcher {
    public final k70 f38030a;

    public j70(k70 k70Var) {
        this.f38030a = k70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        k70 k70Var = this.f38030a;
        n70 n70Var = k70Var.h;
        if (k70Var.f38292c != 0) {
            n70Var.getConnectionsManager().cancelRequest(k70Var.f38292c, true);
            k70Var.f38292c = 0;
        }
        v10 v10Var = k70Var.d;
        if (v10Var != null) {
            AndroidUtilities.cancelRunOnUIThread(v10Var);
        }
        k70Var.f38293e = null;
        if (trim.isEmpty()) {
            n70.a0(n70Var, null);
            return;
        }
        v10 v10Var2 = new v10(7, this, trim);
        k70Var.d = v10Var2;
        AndroidUtilities.runOnUIThread(v10Var2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
