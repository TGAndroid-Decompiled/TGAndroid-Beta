package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class py0 extends org.telegram.ui.Cells.k3 {
    public final ry0 E;

    public py0(ry0 ry0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, "", true, false, 1024, h6Var);
        this.E = ry0Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z9;
        ry0 ry0Var = this.E;
        fi.d dVar = ry0Var.f49602s;
        if (dVar != null) {
            if (!ry0Var.d.optional && TextUtils.isEmpty(ry0Var.f49600n.getText())) {
                z9 = false;
            } else {
                z9 = true;
            }
            dVar.setEnabled(z9);
        }
    }
}
