package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class tn extends org.telegram.ui.Cells.e6 {
    public final int F;
    public final xn G;

    public tn(xn xnVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, i10, null, f6Var);
        this.G = xnVar;
        this.F = i11;
    }

    @Override
    public final void g(org.telegram.ui.Cells.d6 d6Var, ActionMode actionMode) {
        zn znVar = this.G.d;
        if (!znVar.f29755n && this.F == 11 && d6Var.isFocused() && d6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.eo.k8(menu, ((org.telegram.ui.eo) znVar.f26422b.f29366f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        zn.M(this.G.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        zn.N(this.G.d, e6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.d6 d6Var) {
        this.G.d.f26422b.t1(d6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        zn znVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.d6 d6Var = this.d;
        d6Var.getText().replace(d6Var.getSelectionStart(), d6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < znVar.J) {
            for (int length = znVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = znVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            znVar.K[i10] = (CharSequence) arrayList.remove(0);
            znVar.M++;
            i10++;
        }
        znVar.h0();
        znVar.f29752k0 = (znVar.f29764t0 + i10) - 1;
        znVar.f29762s.setItemAnimator(znVar.v);
        znVar.f29760r.l();
        return true;
    }
}
