package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class ln extends org.telegram.ui.Cells.c6 {
    public final int C;
    public final pn D;

    public ln(pn pnVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(context, i10, null, g6Var);
        this.D = pnVar;
        this.C = i11;
    }

    @Override
    public final void g(eh.b bVar, ActionMode actionMode) {
        rn rnVar = this.D.d;
        if (!rnVar.f30835n && this.C == 11 && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) rnVar.f26590b.f29058c0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z4) {
        rn.M(this.D.d, this, z4);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        rn.N(this.D.d, c6Var);
    }

    @Override
    public final void k(eh.b bVar) {
        this.D.d.f26590b.t1(bVar, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        rn rnVar = this.D.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        eh.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < rnVar.G) {
            for (int length = rnVar.H.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = rnVar.H;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            rnVar.H[i10] = (CharSequence) arrayList.remove(0);
            rnVar.J++;
            i10++;
        }
        rnVar.h0();
        rnVar.f30828h0 = (rnVar.f30839q0 + i10) - 1;
        rnVar.f30842s.setItemAnimator(rnVar.v);
        rnVar.f30840r.l();
        return true;
    }
}
