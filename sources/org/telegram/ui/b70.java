package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class b70 implements TextWatcher {
    public final c70 f37991a;

    public b70(c70 c70Var) {
        this.f37991a = c70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        c70 c70Var = this.f37991a;
        f70 f70Var = c70Var.h;
        if (c70Var.f38365c != 0) {
            f70Var.getConnectionsManager().cancelRequest(c70Var.f38365c, true);
            c70Var.f38365c = 0;
        }
        sz szVar = c70Var.d;
        if (szVar != null) {
            AndroidUtilities.cancelRunOnUIThread(szVar);
        }
        c70Var.e = null;
        if (trim.isEmpty()) {
            f70.b0(f70Var, null);
            return;
        }
        sz szVar2 = new sz(12, this, trim);
        c70Var.d = szVar2;
        AndroidUtilities.runOnUIThread(szVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
