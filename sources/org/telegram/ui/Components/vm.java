package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class vm extends org.telegram.ui.Cells.z5 {
    public final int G;
    public final org.telegram.ui.n4 H;

    public vm(org.telegram.ui.n4 n4Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, i3, null, e6Var);
        this.H = n4Var;
        this.G = i10;
    }

    @Override
    public final void g(ai.z zVar, ActionMode actionMode) {
        an anVar = (an) this.H.f47865e;
        if (!anVar.f31927n && this.G == 11 && zVar.isFocused() && zVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.wm.A8(menu, ((org.telegram.ui.wm) anVar.f38416b.X1).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        an.Q((an) this.H.f47865e, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        an.R((an) this.H.f47865e, z5Var);
    }

    @Override
    public final void k(ai.z zVar) {
        ((an) this.H.f47865e).f38416b.h1(zVar, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        an anVar = (an) this.H.f47865e;
        if (arrayList.isEmpty()) {
            return false;
        }
        ai.z zVar = this.d;
        zVar.getText().replace(zVar.getSelectionStart(), zVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i3 = 0;
        while (!arrayList.isEmpty() && i3 < anVar.K) {
            for (int length = anVar.L.length - 1; length > i3; length--) {
                CharSequence[] charSequenceArr = anVar.L;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            anVar.L[i3] = (CharSequence) arrayList.remove(0);
            anVar.N++;
            i3++;
        }
        anVar.n0();
        anVar.f31925l0 = (anVar.f31942u0 + i3) - 1;
        anVar.f31939s.setItemAnimator(anVar.f31944w);
        anVar.f31936r.f();
        return true;
    }
}
