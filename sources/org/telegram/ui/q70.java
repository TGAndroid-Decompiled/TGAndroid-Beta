package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class q70 implements TextWatcher {
    public final r70 f41203a;

    public q70(r70 r70Var) {
        this.f41203a = r70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        r70 r70Var = this.f41203a;
        v70 v70Var = r70Var.h;
        if (r70Var.f41521c != 0) {
            v70Var.getConnectionsManager().cancelRequest(r70Var.f41521c, true);
            r70Var.f41521c = 0;
        }
        org.telegram.ui.Components.voip.y yVar = r70Var.d;
        if (yVar != null) {
            AndroidUtilities.cancelRunOnUIThread(yVar);
        }
        r70Var.f41522e = null;
        if (trim.isEmpty()) {
            v70.a0(v70Var, null);
            return;
        }
        org.telegram.ui.Components.voip.y yVar2 = new org.telegram.ui.Components.voip.y(28, this, trim);
        r70Var.d = yVar2;
        AndroidUtilities.runOnUIThread(yVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
