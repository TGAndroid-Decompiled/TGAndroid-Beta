package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class ov0 extends org.telegram.ui.Cells.d6 {
    public final rv0 F;

    public ov0(rv0 rv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = rv0Var;
    }

    @Override
    public final void i(boolean z10) {
        tv0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        tv0.e0(this.F.d, d6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        tv0 tv0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < tv0Var.f37783n) {
            for (int length = tv0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = tv0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            tv0Var.v[i10] = (CharSequence) arrayList.remove(0);
            tv0Var.f37799y++;
            i10++;
        }
        tv0Var.r0();
        tv0Var.f37777g0 = (tv0Var.f37784n0 + i10) - 1;
        tv0Var.f37769b.l();
        return true;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
    }
}
