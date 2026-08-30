package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class i70 implements TextWatcher {
    public final j70 f35036a;

    public i70(j70 j70Var) {
        this.f35036a = j70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        j70 j70Var = this.f35036a;
        m70 m70Var = j70Var.h;
        if (j70Var.f35251c != 0) {
            m70Var.getConnectionsManager().cancelRequest(j70Var.f35251c, true);
            j70Var.f35251c = 0;
        }
        g00 g00Var = j70Var.d;
        if (g00Var != null) {
            AndroidUtilities.cancelRunOnUIThread(g00Var);
        }
        j70Var.e = null;
        if (trim.isEmpty()) {
            m70.a0(m70Var, null);
            return;
        }
        g00 g00Var2 = new g00(8, this, trim);
        j70Var.d = g00Var2;
        AndroidUtilities.runOnUIThread(g00Var2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
