package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class av0 extends org.telegram.ui.Cells.c6 {
    public final dv0 F;

    public av0(dv0 dv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = dv0Var;
    }

    @Override
    public final void i(boolean z10) {
        fv0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        fv0.e0(this.F.d, c6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        fv0 fv0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.b6 b6Var = this.d;
        b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < fv0Var.f37107n) {
            for (int length = fv0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = fv0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            fv0Var.v[i10] = (CharSequence) arrayList.remove(0);
            fv0Var.f37123y++;
            i10++;
        }
        fv0Var.r0();
        fv0Var.f37101g0 = (fv0Var.f37108n0 + i10) - 1;
        fv0Var.f37093b.l();
        return true;
    }

    @Override
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
    }
}
