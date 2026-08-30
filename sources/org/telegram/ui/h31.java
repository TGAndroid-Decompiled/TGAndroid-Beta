package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class h31 extends org.telegram.ui.Cells.i3 {
    public final j31 f34748x;

    public h31(j31 j31Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, "", true, false, 1024, f6Var);
        this.f34748x = j31Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z4;
        j31 j31Var = this.f34748x;
        ph.d dVar = j31Var.f35222s;
        if (dVar != null) {
            if (!j31Var.d.optional && TextUtils.isEmpty(j31Var.f35220n.getText())) {
                z4 = false;
            } else {
                z4 = true;
            }
            dVar.setEnabled(z4);
        }
    }
}
