package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class a41 extends org.telegram.ui.Cells.k3 {
    public final b41 f32008x;

    public a41(b41 b41Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, "", true, false, 1024, f6Var);
        this.f32008x = b41Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        b41 b41Var = this.f32008x;
        ci.d dVar = b41Var.f32275s;
        if (dVar != null) {
            if (!b41Var.d.optional && TextUtils.isEmpty(b41Var.f32273n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
