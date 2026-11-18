package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class mn extends org.telegram.ui.Cells.a6 {
    public final int G;
    public final org.telegram.ui.l4 H;

    public mn(org.telegram.ui.l4 l4Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        super(context, i7, null, i6Var);
        this.H = l4Var;
        this.G = i10;
    }

    @Override
    public final void h(bi.u uVar, ActionMode actionMode) {
        rn rnVar = (rn) this.H.f49426e;
        if (!rnVar.f39231n && this.G == 11 && uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) rnVar.f36766b.f39659a2).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void j(boolean z10) {
        rn.R((rn) this.H.f49426e, this, z10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.a6 a6Var) {
        rn.S((rn) this.H.f49426e, a6Var);
    }

    @Override
    public final void l(bi.u uVar) {
        ((rn) this.H.f49426e).f36766b.i1(uVar, true);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        rn rnVar = (rn) this.H.f49426e;
        if (arrayList.isEmpty()) {
            return false;
        }
        bi.u uVar = this.d;
        uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < rnVar.K) {
            for (int length = rnVar.L.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = rnVar.L;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            rnVar.L[i7] = (CharSequence) arrayList.remove(0);
            rnVar.N++;
            i7++;
        }
        rnVar.n0();
        rnVar.f39229l0 = (rnVar.f39245u0 + i7) - 1;
        rnVar.f39242s.setItemAnimator(rnVar.f39247w);
        rnVar.f39239r.f();
        return true;
    }
}
