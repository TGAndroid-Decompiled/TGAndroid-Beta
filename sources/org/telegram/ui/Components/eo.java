package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class eo extends org.telegram.ui.Cells.d6 {
    public final int F;
    public final jo G;

    public eo(jo joVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(context, i10, null, d6Var);
        this.G = joVar;
        this.F = i11;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        lo loVar = this.G.d;
        if (!loVar.f28533n && this.F == 11 && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.zn.n8(menu, ((org.telegram.ui.zn) loVar.f30245b.f33289f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        lo.P(this.G.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        lo.Q(this.G.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.G.d.f30245b.w1(c6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        lo loVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < loVar.J) {
            for (int length = loVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = loVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            loVar.K[i10] = (CharSequence) arrayList.remove(0);
            loVar.M++;
            i10++;
        }
        loVar.k0();
        loVar.f28530k0 = (loVar.f28542t0 + i10) - 1;
        loVar.f28540s.setItemAnimator(loVar.v);
        loVar.f28538r.l();
        return true;
    }
}
