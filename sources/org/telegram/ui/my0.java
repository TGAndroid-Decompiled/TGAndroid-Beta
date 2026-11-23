package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class my0 extends org.telegram.ui.Cells.l3 {
    public final oy0 F;

    public my0(oy0 oy0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, "", true, false, 1024, i6Var);
        this.F = oy0Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        oy0 oy0Var = this.F;
        hi.e eVar = oy0Var.f50792s;
        if (eVar != null) {
            if (!oy0Var.d.optional && TextUtils.isEmpty(oy0Var.f50790n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            eVar.setEnabled(z10);
        }
    }
}
