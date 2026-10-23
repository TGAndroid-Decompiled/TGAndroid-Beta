package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class dv0 extends org.telegram.ui.Cells.d6 {
    public final gv0 F;

    public dv0(gv0 gv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = gv0Var;
    }

    @Override
    public final void i(boolean z10) {
        iv0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        iv0.e0(this.F.d, d6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        iv0 iv0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < iv0Var.f38389n) {
            for (int length = iv0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = iv0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            iv0Var.v[i10] = (CharSequence) arrayList.remove(0);
            iv0Var.f38405y++;
            i10++;
        }
        iv0Var.r0();
        iv0Var.f38383g0 = (iv0Var.f38390n0 + i10) - 1;
        iv0Var.f38375b.l();
        return true;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
    }
}
