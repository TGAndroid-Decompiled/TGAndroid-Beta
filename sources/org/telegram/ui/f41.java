package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class f41 extends org.telegram.ui.Cells.i3 {
    public final g41 f32682x;

    public f41(g41 g41Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, "", true, false, 1024, f6Var);
        this.f32682x = g41Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        g41 g41Var = this.f32682x;
        bi.d dVar = g41Var.f32994s;
        if (dVar != null) {
            if (!g41Var.d.optional && TextUtils.isEmpty(g41Var.f32992n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
