package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class bw0 extends org.telegram.ui.Cells.d6 {
    public final ew0 F;

    public bw0(ew0 ew0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = ew0Var;
    }

    @Override
    public final void i(boolean z10) {
        gw0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        gw0.e0(this.F.d, d6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        gw0 gw0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < gw0Var.f36519n) {
            for (int length = gw0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = gw0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            gw0Var.v[i10] = (CharSequence) arrayList.remove(0);
            gw0Var.f36535y++;
            i10++;
        }
        gw0Var.r0();
        gw0Var.f36513g0 = (gw0Var.f36520n0 + i10) - 1;
        gw0Var.f36505b.l();
        return true;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
    }
}
