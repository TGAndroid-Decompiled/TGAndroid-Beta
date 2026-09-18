package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class nn extends org.telegram.ui.Cells.d6 {
    public final int F;
    public final sn G;

    public nn(sn snVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        super(context, i10, null, e6Var);
        this.G = snVar;
        this.F = i11;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        un unVar = this.G.d;
        if (!unVar.f28758n && this.F == 11 && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.zn.k8(menu, ((org.telegram.ui.zn) unVar.f26688b.f29021f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        un.M(this.G.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        un.N(this.G.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.G.d.f26688b.t1(c6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        un unVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < unVar.J) {
            for (int length = unVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = unVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            unVar.K[i10] = (CharSequence) arrayList.remove(0);
            unVar.M++;
            i10++;
        }
        unVar.h0();
        unVar.f28755k0 = (unVar.f28767t0 + i10) - 1;
        unVar.f28765s.setItemAnimator(unVar.v);
        unVar.f28763r.l();
        return true;
    }
}
