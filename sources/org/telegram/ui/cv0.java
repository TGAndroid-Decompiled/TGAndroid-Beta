package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class cv0 extends org.telegram.ui.Cells.c6 {
    public final fv0 F;

    public cv0(fv0 fv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = fv0Var;
    }

    @Override
    public final void i(boolean z10) {
        hv0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        hv0.e0(this.F.d, c6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        hv0 hv0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.b6 b6Var = this.d;
        b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < hv0Var.f37678n) {
            for (int length = hv0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = hv0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            hv0Var.v[i10] = (CharSequence) arrayList.remove(0);
            hv0Var.f37694y++;
            i10++;
        }
        hv0Var.r0();
        hv0Var.f37672g0 = (hv0Var.f37679n0 + i10) - 1;
        hv0Var.f37664b.l();
        return true;
    }

    @Override
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
    }
}
