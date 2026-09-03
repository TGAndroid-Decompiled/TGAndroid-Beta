package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class o31 extends org.telegram.ui.Cells.i3 {
    public final p31 f39522x;

    public o31(p31 p31Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, "", true, false, 1024, g6Var);
        this.f39522x = p31Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z4;
        p31 p31Var = this.f39522x;
        qh.d dVar = p31Var.f39879s;
        if (dVar != null) {
            if (!p31Var.d.optional && TextUtils.isEmpty(p31Var.f39877n.getText())) {
                z4 = false;
            } else {
                z4 = true;
            }
            dVar.setEnabled(z4);
        }
    }
}
