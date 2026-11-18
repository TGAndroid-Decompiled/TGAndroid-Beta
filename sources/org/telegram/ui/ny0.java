package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class ny0 extends org.telegram.ui.Cells.l3 {
    public final py0 F;

    public ny0(py0 py0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, "", true, false, 1024, i6Var);
        this.F = py0Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        py0 py0Var = this.F;
        hi.d dVar = py0Var.f50964s;
        if (dVar != null) {
            if (!py0Var.d.optional && TextUtils.isEmpty(py0Var.f50962n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
