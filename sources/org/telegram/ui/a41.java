package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class a41 extends org.telegram.ui.Cells.j3 {
    public final b41 f35831x;

    public a41(b41 b41Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, "", true, false, 1024, e6Var);
        this.f35831x = b41Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        b41 b41Var = this.f35831x;
        ci.d dVar = b41Var.f36138s;
        if (dVar != null) {
            if (!b41Var.d.optional && TextUtils.isEmpty(b41Var.f36136n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
