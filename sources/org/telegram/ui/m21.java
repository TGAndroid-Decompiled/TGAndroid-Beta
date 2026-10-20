package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class m21 extends org.telegram.ui.Cells.i3 {
    public final n21 f39103x;

    public m21(n21 n21Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, "", true, false, 1024, d6Var);
        this.f39103x = n21Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        n21 n21Var = this.f39103x;
        ei.d dVar = n21Var.f39400s;
        if (dVar != null) {
            if (!n21Var.d.optional && TextUtils.isEmpty(n21Var.f39398n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
