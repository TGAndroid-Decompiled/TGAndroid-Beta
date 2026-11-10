package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class vm extends org.telegram.ui.Cells.a6 {
    public final int F;
    public final org.telegram.ui.l4 G;

    public vm(org.telegram.ui.l4 l4Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        super(context, i7, null, h6Var);
        this.G = l4Var;
        this.F = i10;
    }

    @Override
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
        an anVar = (an) this.G.f47512e;
        if (!anVar.f31912n && this.F == 11 && z5Var.isFocused() && z5Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.cn.B8(menu, ((org.telegram.ui.cn) anVar.f38656b.Z1).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z9) {
        an.Q((an) this.G.f47512e, this, z9);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        an.R((an) this.G.f47512e, a6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        ((an) this.G.f47512e).f38656b.h1(z5Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        an anVar = (an) this.G.f47512e;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.z5 z5Var = this.d;
        z5Var.getText().replace(z5Var.getSelectionStart(), z5Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < anVar.J) {
            for (int length = anVar.K.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = anVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            anVar.K[i7] = (CharSequence) arrayList.remove(0);
            anVar.M++;
            i7++;
        }
        anVar.n0();
        anVar.f31908k0 = (anVar.f31924t0 + i7) - 1;
        anVar.f31922s.setItemAnimator(anVar.f31927w);
        anVar.f31920r.f();
        return true;
    }
}
