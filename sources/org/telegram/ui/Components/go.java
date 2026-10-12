package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class go extends org.telegram.ui.Cells.d6 {
    public final int F;
    public final lo G;

    public go(lo loVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, i10, null, c6Var);
        this.G = loVar;
        this.F = i11;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        no noVar = this.G.d;
        if (!noVar.f28896n && this.F == 11 && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.eo.n8(menu, ((org.telegram.ui.eo) noVar.f30574b.f24342f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        no.P(this.G.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        no.Q(this.G.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.G.d.f30574b.w1(c6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        no noVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < noVar.J) {
            for (int length = noVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = noVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            noVar.K[i10] = (CharSequence) arrayList.remove(0);
            noVar.M++;
            i10++;
        }
        noVar.k0();
        noVar.f28893k0 = (noVar.f28905t0 + i10) - 1;
        noVar.f28903s.setItemAnimator(noVar.v);
        noVar.f28901r.l();
        return true;
    }
}
