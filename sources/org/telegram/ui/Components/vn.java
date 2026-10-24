package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class vn extends org.telegram.ui.Cells.d6 {
    public final int F;
    public final ao G;

    public vn(ao aoVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(context, i10, null, g6Var);
        this.G = aoVar;
        this.F = i11;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        co coVar = this.G.d;
        if (!coVar.f25381n && this.F == 11 && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.sn.n8(menu, ((org.telegram.ui.sn) coVar.f27704b.f30146f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        co.P(this.G.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        co.Q(this.G.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.G.d.f27704b.z1(c6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        co coVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < coVar.J) {
            for (int length = coVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = coVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            coVar.K[i10] = (CharSequence) arrayList.remove(0);
            coVar.M++;
            i10++;
        }
        coVar.l0();
        coVar.f25377k0 = (coVar.f25394t0 + i10) - 1;
        coVar.f25392s.setItemAnimator(coVar.v);
        coVar.f25390r.l();
        return true;
    }
}
