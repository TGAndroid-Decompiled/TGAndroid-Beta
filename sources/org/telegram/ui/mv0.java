package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class mv0 extends org.telegram.ui.Cells.d6 {
    public final pv0 F;

    public mv0(pv0 pv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = pv0Var;
    }

    @Override
    public final void i(boolean z10) {
        rv0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        rv0.e0(this.F.d, d6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        rv0 rv0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < rv0Var.f37512n) {
            for (int length = rv0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = rv0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            rv0Var.v[i10] = (CharSequence) arrayList.remove(0);
            rv0Var.f37528y++;
            i10++;
        }
        rv0Var.r0();
        rv0Var.f37506g0 = (rv0Var.f37513n0 + i10) - 1;
        rv0Var.f37498b.l();
        return true;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
    }
}
