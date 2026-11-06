package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class wm extends org.telegram.ui.Cells.a6 {
    public final int F;
    public final org.telegram.ui.l4 G;

    public wm(org.telegram.ui.l4 l4Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, i7, null, f6Var);
        this.G = l4Var;
        this.F = i10;
    }

    @Override
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
        bn bnVar = (bn) this.G.f47405e;
        if (!bnVar.f32229n && this.F == 11 && z5Var.isFocused() && z5Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.an.A8(menu, ((org.telegram.ui.an) bnVar.f38969b.W1).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z9) {
        bn.Q((bn) this.G.f47405e, this, z9);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        bn.R((bn) this.G.f47405e, a6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        ((bn) this.G.f47405e).f38969b.h1(z5Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        bn bnVar = (bn) this.G.f47405e;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.z5 z5Var = this.d;
        z5Var.getText().replace(z5Var.getSelectionStart(), z5Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < bnVar.J) {
            for (int length = bnVar.K.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = bnVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            bnVar.K[i7] = (CharSequence) arrayList.remove(0);
            bnVar.M++;
            i7++;
        }
        bnVar.n0();
        bnVar.f32225k0 = (bnVar.f32241t0 + i7) - 1;
        bnVar.f32239s.setItemAnimator(bnVar.f32244w);
        bnVar.f32237r.f();
        return true;
    }
}
