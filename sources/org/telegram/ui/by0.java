package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class by0 extends org.telegram.ui.Cells.k3 {
    public final dy0 F;

    public by0(dy0 dy0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, "", true, false, 1024, e6Var);
        this.F = dy0Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        dy0 dy0Var = this.F;
        gi.d dVar = dy0Var.f44835s;
        if (dVar != null) {
            if (!dy0Var.d.optional && TextUtils.isEmpty(dy0Var.f44833n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
