package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class hv0 extends org.telegram.ui.Cells.h6 {
    public final kv0 F;

    public hv0(kv0 kv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = kv0Var;
    }

    @Override
    public final void i(boolean z10) {
        mv0.e0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.h6 h6Var) {
        mv0.f0(this.F.d, h6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        mv0 mv0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.g6 g6Var = this.d;
        g6Var.getText().replace(g6Var.getSelectionStart(), g6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < mv0Var.f41688n) {
            for (int length = mv0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = mv0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            mv0Var.v[i10] = (CharSequence) arrayList.remove(0);
            mv0Var.f41704y++;
            i10++;
        }
        mv0Var.s0();
        mv0Var.f41682g0 = (mv0Var.f41689n0 + i10) - 1;
        mv0Var.f41674b.l();
        return true;
    }

    @Override
    public final void g(org.telegram.ui.Cells.g6 g6Var, ActionMode actionMode) {
    }
}
