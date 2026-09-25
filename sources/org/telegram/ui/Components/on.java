package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class on extends org.telegram.ui.Cells.d6 {
    public final int F;
    public final tn G;

    public on(tn tnVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(context, i10, null, d6Var);
        this.G = tnVar;
        this.F = i11;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        vn vnVar = this.G.d;
        if (!vnVar.f29208n && this.F == 11 && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.wn.k8(menu, ((org.telegram.ui.wn) vnVar.f27088b.f30006f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        vn.M(this.G.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        vn.N(this.G.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.G.d.f27088b.t1(c6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        vn vnVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < vnVar.J) {
            for (int length = vnVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = vnVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            vnVar.K[i10] = (CharSequence) arrayList.remove(0);
            vnVar.M++;
            i10++;
        }
        vnVar.h0();
        vnVar.f29205k0 = (vnVar.f29217t0 + i10) - 1;
        vnVar.f29215s.setItemAnimator(vnVar.v);
        vnVar.f29213r.l();
        return true;
    }
}
