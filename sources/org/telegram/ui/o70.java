package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class o70 implements TextWatcher {
    public final p70 f39121a;

    public o70(p70 p70Var) {
        this.f39121a = p70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        p70 p70Var = this.f39121a;
        s70 s70Var = p70Var.h;
        if (p70Var.f39363c != 0) {
            s70Var.getConnectionsManager().cancelRequest(p70Var.f39363c, true);
            p70Var.f39363c = 0;
        }
        cu cuVar = p70Var.d;
        if (cuVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cuVar);
        }
        p70Var.f39364e = null;
        if (trim.isEmpty()) {
            s70.Z(s70Var, null);
            return;
        }
        cu cuVar2 = new cu(23, this, trim);
        p70Var.d = cuVar2;
        AndroidUtilities.runOnUIThread(cuVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
