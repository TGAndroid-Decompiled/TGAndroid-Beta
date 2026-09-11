package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class q70 implements TextWatcher {
    public final r70 f39748a;

    public q70(r70 r70Var) {
        this.f39748a = r70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        r70 r70Var = this.f39748a;
        u70 u70Var = r70Var.h;
        if (r70Var.f40086c != 0) {
            u70Var.getConnectionsManager().cancelRequest(r70Var.f40086c, true);
            r70Var.f40086c = 0;
        }
        yt ytVar = r70Var.d;
        if (ytVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ytVar);
        }
        r70Var.f40087e = null;
        if (trim.isEmpty()) {
            u70.a0(u70Var, null);
            return;
        }
        yt ytVar2 = new yt(26, this, trim);
        r70Var.d = ytVar2;
        AndroidUtilities.runOnUIThread(ytVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
