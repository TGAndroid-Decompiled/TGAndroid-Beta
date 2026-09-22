package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class nn extends org.telegram.ui.Cells.e6 {
    public final int F;
    public final sn G;

    public nn(sn snVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, i10, null, f6Var);
        this.G = snVar;
        this.F = i11;
    }

    @Override
    public final void g(org.telegram.ui.Cells.d6 d6Var, ActionMode actionMode) {
        un unVar = this.G.d;
        if (!unVar.f28828n && this.F == 11 && d6Var.isFocused() && d6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.zn.k8(menu, ((org.telegram.ui.zn) unVar.f26786b.f29096f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        un.M(this.G.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        un.N(this.G.d, e6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.d6 d6Var) {
        this.G.d.f26786b.t1(d6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        un unVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.d6 d6Var = this.d;
        d6Var.getText().replace(d6Var.getSelectionStart(), d6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
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
        unVar.f28825k0 = (unVar.f28837t0 + i10) - 1;
        unVar.f28835s.setItemAnimator(unVar.v);
        unVar.f28833r.l();
        return true;
    }
}
