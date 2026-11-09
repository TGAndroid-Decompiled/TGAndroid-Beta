package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class mr0 extends org.telegram.ui.Cells.a6 {
    public final pr0 F;

    public mr0(pr0 pr0Var, Context context, int i7) {
        super(context, i7, null, null);
        this.F = pr0Var;
    }

    @Override
    public final void i(boolean z9) {
        rr0.i0(this.F.d, this, z9);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        rr0.j0(this.F.d, a6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        rr0 rr0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.z5 z5Var = this.d;
        z5Var.getText().replace(z5Var.getSelectionStart(), z5Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < rr0Var.f49582n) {
            for (int length = rr0Var.f49594w.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = rr0Var.f49594w;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            rr0Var.f49594w[i7] = (CharSequence) arrayList.remove(0);
            rr0Var.D++;
            i7++;
        }
        rr0Var.w0();
        rr0Var.f49576g0 = (rr0Var.f49583n0 + i7) - 1;
        rr0Var.f49567b.f();
        return true;
    }

    @Override
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
    }
}
