package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class g41 extends org.telegram.ui.Cells.j3 {
    public final h41 f36303x;

    public g41(h41 h41Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, "", true, false, 1024, c6Var);
        this.f36303x = h41Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        h41 h41Var = this.f36303x;
        di.d dVar = h41Var.f36605s;
        if (dVar != null) {
            if (!h41Var.d.optional && TextUtils.isEmpty(h41Var.f36603n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
