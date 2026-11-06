package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class ly0 extends org.telegram.ui.Cells.k3 {
    public final ny0 E;

    public ly0(ny0 ny0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, "", true, false, 1024, f6Var);
        this.E = ny0Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z9;
        ny0 ny0Var = this.E;
        fi.d dVar = ny0Var.f48175s;
        if (dVar != null) {
            if (!ny0Var.d.optional && TextUtils.isEmpty(ny0Var.f48173n.getText())) {
                z9 = false;
            } else {
                z9 = true;
            }
            dVar.setEnabled(z9);
        }
    }
}
