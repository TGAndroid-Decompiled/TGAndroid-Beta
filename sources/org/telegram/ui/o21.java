package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class o21 extends org.telegram.ui.Cells.i3 {
    public final p21 f39631x;

    public o21(p21 p21Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, "", true, false, 1024, d6Var);
        this.f39631x = p21Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        p21 p21Var = this.f39631x;
        ei.d dVar = p21Var.f39947s;
        if (dVar != null) {
            if (!p21Var.d.optional && TextUtils.isEmpty(p21Var.f39945n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
