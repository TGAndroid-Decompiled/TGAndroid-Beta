package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class a70 implements TextWatcher {
    public final b70 f35664a;

    public a70(b70 b70Var) {
        this.f35664a = b70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        b70 b70Var = this.f35664a;
        e70 e70Var = b70Var.h;
        if (b70Var.f35942c != 0) {
            e70Var.getConnectionsManager().cancelRequest(b70Var.f35942c, true);
            b70Var.f35942c = 0;
        }
        ot otVar = b70Var.d;
        if (otVar != null) {
            AndroidUtilities.cancelRunOnUIThread(otVar);
        }
        b70Var.e = null;
        if (trim.isEmpty()) {
            e70.a0(e70Var, null);
            return;
        }
        ot otVar2 = new ot(25, this, trim);
        b70Var.d = otVar2;
        AndroidUtilities.runOnUIThread(otVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
