package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class m70 implements TextWatcher {
    public final n70 f35166a;

    public m70(n70 n70Var) {
        this.f35166a = n70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        n70 n70Var = this.f35166a;
        q70 q70Var = n70Var.h;
        if (n70Var.f35446c != 0) {
            q70Var.getConnectionsManager().cancelRequest(n70Var.f35446c, true);
            n70Var.f35446c = 0;
        }
        hw hwVar = n70Var.d;
        if (hwVar != null) {
            AndroidUtilities.cancelRunOnUIThread(hwVar);
        }
        n70Var.e = null;
        if (trim.isEmpty()) {
            q70.a0(q70Var, null);
            return;
        }
        hw hwVar2 = new hw(20, this, trim);
        n70Var.d = hwVar2;
        AndroidUtilities.runOnUIThread(hwVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
