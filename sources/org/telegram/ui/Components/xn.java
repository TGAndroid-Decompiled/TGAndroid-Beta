package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class xn extends org.telegram.ui.Cells.c6 {
    public final int F;
    public final co G;

    public xn(co coVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(context, i10, null, d6Var);
        this.G = coVar;
        this.F = i11;
    }

    @Override
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
        fo foVar = this.G.d;
        if (!foVar.f26306n && this.F == 11 && b6Var.isFocused() && b6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.qn.n8(menu, ((org.telegram.ui.qn) foVar.f28173b.f30545f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        fo.P(this.G.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        fo.Q(this.G.d, c6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        this.G.d.f28173b.w1(b6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        fo foVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.b6 b6Var = this.d;
        b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
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
        foVar.k0();
        foVar.f26303k0 = (foVar.f26315t0 + i10) - 1;
        foVar.f26313s.setItemAnimator(foVar.v);
        foVar.f26311r.l();
        return true;
    }
}
