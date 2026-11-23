package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class on extends org.telegram.ui.Cells.b6 {
    public final int G;
    public final org.telegram.ui.l4 H;

    public on(org.telegram.ui.l4 l4Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        super(context, i7, null, h6Var);
        this.H = l4Var;
        this.G = i10;
    }

    @Override
    public final void h(bi.u uVar, ActionMode actionMode) {
        tn tnVar = (tn) this.H.f49474e;
        if (!tnVar.f39972n && this.G == 11 && uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) tnVar.f37519b.f40367a2).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void j(boolean z10) {
        tn.R((tn) this.H.f49474e, this, z10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        tn.S((tn) this.H.f49474e, b6Var);
    }

    @Override
    public final void l(bi.u uVar) {
        ((tn) this.H.f49474e).f37519b.i1(uVar, true);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        tn tnVar = (tn) this.H.f49474e;
        if (arrayList.isEmpty()) {
            return false;
        }
        bi.u uVar = this.d;
        uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < tnVar.K) {
            for (int length = tnVar.L.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = tnVar.L;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            tnVar.L[i7] = (CharSequence) arrayList.remove(0);
            tnVar.N++;
            i7++;
        }
        tnVar.n0();
        tnVar.f39970l0 = (tnVar.f39986u0 + i7) - 1;
        tnVar.f39983s.setItemAnimator(tnVar.f39988w);
        tnVar.f39980r.f();
        return true;
    }
}
