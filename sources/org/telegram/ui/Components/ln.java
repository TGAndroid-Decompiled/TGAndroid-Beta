package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class ln extends org.telegram.ui.Cells.a6 {
    public final int G;
    public final org.telegram.ui.l4 H;

    public ln(org.telegram.ui.l4 l4Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        super(context, i7, null, i6Var);
        this.H = l4Var;
        this.G = i10;
    }

    @Override
    public final void h(bi.u uVar, ActionMode actionMode) {
        qn qnVar = (qn) this.H.f49583e;
        if (!qnVar.f38933n && this.G == 11 && uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) qnVar.f37135b.f39956a2).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void j(boolean z10) {
        qn.R((qn) this.H.f49583e, this, z10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.a6 a6Var) {
        qn.S((qn) this.H.f49583e, a6Var);
    }

    @Override
    public final void l(bi.u uVar) {
        ((qn) this.H.f49583e).f37135b.i1(uVar, true);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        qn qnVar = (qn) this.H.f49583e;
        if (arrayList.isEmpty()) {
            return false;
        }
        bi.u uVar = this.d;
        uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < qnVar.K) {
            for (int length = qnVar.L.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = qnVar.L;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            qnVar.L[i7] = (CharSequence) arrayList.remove(0);
            qnVar.N++;
            i7++;
        }
        qnVar.n0();
        qnVar.f38931l0 = (qnVar.f38947u0 + i7) - 1;
        qnVar.f38944s.setItemAnimator(qnVar.f38949w);
        qnVar.f38941r.f();
        return true;
    }
}
