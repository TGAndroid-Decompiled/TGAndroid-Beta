package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class pv0 extends org.telegram.ui.Cells.d6 {
    public final sv0 F;

    public pv0(sv0 sv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = sv0Var;
    }

    @Override
    public final void i(boolean z10) {
        uv0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        uv0.e0(this.F.d, d6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        uv0 uv0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < uv0Var.f41383n) {
            for (int length = uv0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = uv0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            uv0Var.v[i10] = (CharSequence) arrayList.remove(0);
            uv0Var.f41399y++;
            i10++;
        }
        uv0Var.r0();
        uv0Var.f41377g0 = (uv0Var.f41384n0 + i10) - 1;
        uv0Var.f41368b.l();
        return true;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
    }
}
