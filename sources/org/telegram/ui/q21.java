package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class q21 extends org.telegram.ui.Cells.h3 {
    public final r21 E;

    public q21(r21 r21Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, "", true, false, 1024, g6Var);
        this.E = r21Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        r21 r21Var = this.E;
        ei.d dVar = r21Var.f40985s;
        if (dVar != null) {
            if (!r21Var.d.optional && TextUtils.isEmpty(r21Var.f40983n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
