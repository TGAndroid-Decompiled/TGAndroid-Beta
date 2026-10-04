package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class qn extends org.telegram.ui.Cells.d6 {
    public final int F;
    public final vn G;

    public qn(vn vnVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(context, i10, null, d6Var);
        this.G = vnVar;
        this.F = i11;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        xn xnVar = this.G.d;
        if (!xnVar.f32929n && this.F == 11 && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.yn.k8(menu, ((org.telegram.ui.yn) xnVar.f29642b.f32812f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        xn.K(this.G.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        xn.L(this.G.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.G.d.f29642b.q1(c6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        xn xnVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < xnVar.J) {
            for (int length = xnVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = xnVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            xnVar.K[i10] = (CharSequence) arrayList.remove(0);
            xnVar.M++;
            i10++;
        }
        xnVar.h0();
        xnVar.f32926k0 = (xnVar.f32938t0 + i10) - 1;
        xnVar.f32936s.setItemAnimator(xnVar.v);
        xnVar.f32934r.l();
        return true;
    }
}
