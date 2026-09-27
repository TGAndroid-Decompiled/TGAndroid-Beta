package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class n70 implements TextWatcher {
    public final o70 f35837a;

    public n70(o70 o70Var) {
        this.f35837a = o70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        o70 o70Var = this.f35837a;
        r70 r70Var = o70Var.h;
        if (o70Var.f36150c != 0) {
            r70Var.getConnectionsManager().cancelRequest(o70Var.f36150c, true);
            o70Var.f36150c = 0;
        }
        tv tvVar = o70Var.d;
        if (tvVar != null) {
            AndroidUtilities.cancelRunOnUIThread(tvVar);
        }
        o70Var.e = null;
        if (trim.isEmpty()) {
            r70.a0(r70Var, null);
            return;
        }
        tv tvVar2 = new tv(21, this, trim);
        o70Var.d = tvVar2;
        AndroidUtilities.runOnUIThread(tvVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
