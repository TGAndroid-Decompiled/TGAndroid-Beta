package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class oy0 extends org.telegram.ui.Cells.k3 {
    public final qy0 E;

    public oy0(qy0 qy0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, "", true, false, 1024, g6Var);
        this.E = qy0Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z9;
        qy0 qy0Var = this.E;
        fi.d dVar = qy0Var.f49223s;
        if (dVar != null) {
            if (!qy0Var.d.optional && TextUtils.isEmpty(qy0Var.f49221n.getText())) {
                z9 = false;
            } else {
                z9 = true;
            }
            dVar.setEnabled(z9);
        }
    }
}
