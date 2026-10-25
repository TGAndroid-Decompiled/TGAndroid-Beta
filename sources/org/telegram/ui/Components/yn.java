package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class yn extends org.telegram.ui.Cells.h6 {
    public final int F;
    public final eo G;

    public yn(eo eoVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11) {
        super(context, i10, null, u6Var);
        this.G = eoVar;
        this.F = i11;
    }

    @Override
    public final void g(org.telegram.ui.Cells.g6 g6Var, ActionMode actionMode) {
        go goVar = this.G.d;
        if (!goVar.f28636n && this.F == 11 && g6Var.isFocused() && g6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.un.r8(menu, ((org.telegram.ui.un) goVar.f30213b.f33018f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        go.P(this.G.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.h6 h6Var) {
        go.Q(this.G.d, h6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.g6 g6Var) {
        this.G.d.f30213b.y1(g6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        go goVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.g6 g6Var = this.d;
        g6Var.getText().replace(g6Var.getSelectionStart(), g6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < goVar.J) {
            for (int length = goVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = goVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            goVar.K[i10] = (CharSequence) arrayList.remove(0);
            goVar.M++;
            i10++;
        }
        goVar.l0();
        goVar.f28632k0 = (goVar.f28649t0 + i10) - 1;
        goVar.f28647s.setItemAnimator(goVar.v);
        goVar.f28645r.l();
        return true;
    }
}
