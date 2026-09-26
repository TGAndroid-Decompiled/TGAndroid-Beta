package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class pn extends org.telegram.ui.Cells.d6 {
    public final int F;
    public final un G;

    public pn(un unVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(context, i10, null, d6Var);
        this.G = unVar;
        this.F = i11;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        wn wnVar = this.G.d;
        if (!wnVar.f30130n && this.F == 11 && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.wn.k8(menu, ((org.telegram.ui.wn) wnVar.f27043b.f30020f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        wn.M(this.G.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        wn.N(this.G.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.G.d.f27043b.t1(c6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        wn wnVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < wnVar.J) {
            for (int length = wnVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = wnVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            wnVar.K[i10] = (CharSequence) arrayList.remove(0);
            wnVar.M++;
            i10++;
        }
        wnVar.h0();
        wnVar.f30127k0 = (wnVar.f30139t0 + i10) - 1;
        wnVar.f30137s.setItemAnimator(wnVar.v);
        wnVar.f30135r.l();
        return true;
    }
}
