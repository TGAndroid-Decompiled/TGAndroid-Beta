package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class d70 implements TextWatcher {
    public final e70 f38527a;

    public d70(e70 e70Var) {
        this.f38527a = e70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        e70 e70Var = this.f38527a;
        h70 h70Var = e70Var.h;
        if (e70Var.f38771c != 0) {
            h70Var.getConnectionsManager().cancelRequest(e70Var.f38771c, true);
            e70Var.f38771c = 0;
        }
        kz kzVar = e70Var.d;
        if (kzVar != null) {
            AndroidUtilities.cancelRunOnUIThread(kzVar);
        }
        e70Var.e = null;
        if (trim.isEmpty()) {
            h70.b0(h70Var, null);
            return;
        }
        kz kzVar2 = new kz(13, this, trim);
        e70Var.d = kzVar2;
        AndroidUtilities.runOnUIThread(kzVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
