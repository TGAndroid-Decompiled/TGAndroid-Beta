package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class c41 extends org.telegram.ui.Cells.j3 {
    public final d41 f36321x;

    public c41(d41 d41Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, "", true, false, 1024, c6Var);
        this.f36321x = d41Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        d41 d41Var = this.f36321x;
        ci.d dVar = d41Var.f36645s;
        if (dVar != null) {
            if (!d41Var.d.optional && TextUtils.isEmpty(d41Var.f36643n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
