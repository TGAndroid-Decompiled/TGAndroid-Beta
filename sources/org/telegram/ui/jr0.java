package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class jr0 extends org.telegram.ui.Cells.a6 {
    public final mr0 F;

    public jr0(mr0 mr0Var, Context context, int i7) {
        super(context, i7, null, null);
        this.F = mr0Var;
    }

    @Override
    public final void i(boolean z9) {
        or0.i0(this.F.d, this, z9);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        or0.j0(this.F.d, a6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        or0 or0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.z5 z5Var = this.d;
        z5Var.getText().replace(z5Var.getSelectionStart(), z5Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < or0Var.f48524n) {
            for (int length = or0Var.f48536w.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = or0Var.f48536w;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            or0Var.f48536w[i7] = (CharSequence) arrayList.remove(0);
            or0Var.D++;
            i7++;
        }
        or0Var.w0();
        or0Var.f48518g0 = (or0Var.f48525n0 + i7) - 1;
        or0Var.f48509b.f();
        return true;
    }

    @Override
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
    }
}
