package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class j31 extends org.telegram.ui.Cells.i3 {
    public final l31 f38007x;

    public j31(l31 l31Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, "", true, false, 1024, g6Var);
        this.f38007x = l31Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z4;
        l31 l31Var = this.f38007x;
        qh.d dVar = l31Var.f38578s;
        if (dVar != null) {
            if (!l31Var.d.optional && TextUtils.isEmpty(l31Var.f38576n.getText())) {
                z4 = false;
            } else {
                z4 = true;
            }
            dVar.setEnabled(z4);
        }
    }
}
