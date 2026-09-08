package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class c41 extends org.telegram.ui.Cells.i3 {
    public final d41 f35020x;

    public c41(d41 d41Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, "", true, false, 1024, f6Var);
        this.f35020x = d41Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        d41 d41Var = this.f35020x;
        di.d dVar = d41Var.f35679s;
        if (dVar != null) {
            if (!d41Var.d.optional && TextUtils.isEmpty(d41Var.f35677n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
