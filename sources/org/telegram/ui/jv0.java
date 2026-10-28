package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class jv0 extends org.telegram.ui.Cells.h6 {
    public final mv0 F;

    public jv0(mv0 mv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = mv0Var;
    }

    @Override
    public final void i(boolean z10) {
        ov0.e0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.h6 h6Var) {
        ov0.f0(this.F.d, h6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        ov0 ov0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.g6 g6Var = this.d;
        g6Var.getText().replace(g6Var.getSelectionStart(), g6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < ov0Var.f42223n) {
            for (int length = ov0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = ov0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            ov0Var.v[i10] = (CharSequence) arrayList.remove(0);
            ov0Var.f42239y++;
            i10++;
        }
        ov0Var.s0();
        ov0Var.f42217g0 = (ov0Var.f42224n0 + i10) - 1;
        ov0Var.f42209b.l();
        return true;
    }

    @Override
    public final void g(org.telegram.ui.Cells.g6 g6Var, ActionMode actionMode) {
    }
}
