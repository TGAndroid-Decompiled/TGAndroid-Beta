package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class ao extends org.telegram.ui.Cells.d6 {
    public final int F;
    public final go G;

    public ao(go goVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, i10, null, c6Var);
        this.G = goVar;
        this.F = i11;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        io ioVar = this.G.d;
        if (!ioVar.f26024n && this.F == 11 && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.fo.n8(menu, ((org.telegram.ui.fo) ioVar.f27671b.f30001f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        io.P(this.G.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        io.Q(this.G.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.G.d.f27671b.w1(c6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        io ioVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < ioVar.J) {
            for (int length = ioVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = ioVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            ioVar.K[i10] = (CharSequence) arrayList.remove(0);
            ioVar.M++;
            i10++;
        }
        ioVar.k0();
        ioVar.f26021k0 = (ioVar.f26033t0 + i10) - 1;
        ioVar.f26031s.setItemAnimator(ioVar.v);
        ioVar.f26029r.l();
        return true;
    }
}
