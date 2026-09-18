package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class b41 extends org.telegram.ui.Cells.i3 {
    public final c41 f32050x;

    public b41(c41 c41Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, "", true, false, 1024, f6Var);
        this.f32050x = c41Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        c41 c41Var = this.f32050x;
        ci.d dVar = c41Var.f32670s;
        if (dVar != null) {
            if (!c41Var.d.optional && TextUtils.isEmpty(c41Var.f32668n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
