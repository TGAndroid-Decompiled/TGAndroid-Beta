package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class o70 implements TextWatcher {
    public final p70 f40422a;

    public o70(p70 p70Var) {
        this.f40422a = p70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        p70 p70Var = this.f40422a;
        s70 s70Var = p70Var.h;
        if (p70Var.f40689c != 0) {
            s70Var.getConnectionsManager().cancelRequest(p70Var.f40689c, true);
            p70Var.f40689c = 0;
        }
        m70 m70Var = p70Var.d;
        if (m70Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m70Var);
        }
        p70Var.f40690e = null;
        if (trim.isEmpty()) {
            s70.a0(s70Var, null);
            return;
        }
        m70 m70Var2 = new m70(1, this, trim);
        p70Var.d = m70Var2;
        AndroidUtilities.runOnUIThread(m70Var2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
