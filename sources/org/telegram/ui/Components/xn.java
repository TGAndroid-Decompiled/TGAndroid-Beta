package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class xn extends org.telegram.ui.Cells.d6 {
    public final int F;
    public final co G;

    public xn(co coVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(context, i10, null, g6Var);
        this.G = coVar;
        this.F = i11;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        fo foVar = this.G.d;
        if (!foVar.f26409n && this.F == 11 && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.sn.n8(menu, ((org.telegram.ui.sn) foVar.f28366b.f30730f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        fo.P(this.G.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        fo.Q(this.G.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.G.d.f28366b.z1(c6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        fo foVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < foVar.J) {
            for (int length = foVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = foVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            foVar.K[i10] = (CharSequence) arrayList.remove(0);
            foVar.M++;
            i10++;
        }
        foVar.l0();
        foVar.f26405k0 = (foVar.f26422t0 + i10) - 1;
        foVar.f26420s.setItemAnimator(foVar.v);
        foVar.f26418r.l();
        return true;
    }
}
