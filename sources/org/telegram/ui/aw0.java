package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class aw0 extends org.telegram.ui.Cells.d6 {
    public final dw0 F;

    public aw0(dw0 dw0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = dw0Var;
    }

    @Override
    public final void i(boolean z10) {
        fw0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        fw0.e0(this.F.d, d6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        fw0 fw0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < fw0Var.f35995n) {
            for (int length = fw0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = fw0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            fw0Var.v[i10] = (CharSequence) arrayList.remove(0);
            fw0Var.f36011y++;
            i10++;
        }
        fw0Var.r0();
        fw0Var.f35989g0 = (fw0Var.f35996n0 + i10) - 1;
        fw0Var.f35981b.l();
        return true;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
    }
}
