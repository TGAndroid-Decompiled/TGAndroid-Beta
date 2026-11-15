package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class jy0 extends org.telegram.ui.Cells.k3 {
    public final ly0 F;

    public jy0(ly0 ly0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, "", true, false, 1024, e6Var);
        this.F = ly0Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        ly0 ly0Var = this.F;
        hi.d dVar = ly0Var.f49068s;
        if (dVar != null) {
            if (!ly0Var.d.optional && TextUtils.isEmpty(ly0Var.f49066n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
