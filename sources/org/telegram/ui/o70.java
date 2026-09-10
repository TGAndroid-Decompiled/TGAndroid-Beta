package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class o70 implements TextWatcher {
    public final p70 f35409a;

    public o70(p70 p70Var) {
        this.f35409a = p70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        p70 p70Var = this.f35409a;
        s70 s70Var = p70Var.h;
        if (p70Var.f35694c != 0) {
            s70Var.getConnectionsManager().cancelRequest(p70Var.f35694c, true);
            p70Var.f35694c = 0;
        }
        uv uvVar = p70Var.d;
        if (uvVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uvVar);
        }
        p70Var.e = null;
        if (trim.isEmpty()) {
            s70.a0(s70Var, null);
            return;
        }
        uv uvVar2 = new uv(23, this, trim);
        p70Var.d = uvVar2;
        AndroidUtilities.runOnUIThread(uvVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
