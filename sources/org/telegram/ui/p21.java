package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class p21 extends org.telegram.ui.Cells.h3 {
    public final q21 E;

    public p21(q21 q21Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, "", true, false, 1024, g6Var);
        this.E = q21Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        q21 q21Var = this.E;
        ei.d dVar = q21Var.f40699s;
        if (dVar != null) {
            if (!q21Var.d.optional && TextUtils.isEmpty(q21Var.f40697n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
