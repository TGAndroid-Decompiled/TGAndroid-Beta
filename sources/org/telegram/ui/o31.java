package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class o31 extends org.telegram.ui.Cells.h3 {
    public final p31 f36642x;

    public o31(p31 p31Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, "", true, false, 1024, f6Var);
        this.f36642x = p31Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z4;
        p31 p31Var = this.f36642x;
        ph.d dVar = p31Var.f36935s;
        if (dVar != null) {
            if (!p31Var.d.optional && TextUtils.isEmpty(p31Var.f36933n.getText())) {
                z4 = false;
            } else {
                z4 = true;
            }
            dVar.setEnabled(z4);
        }
    }
}
