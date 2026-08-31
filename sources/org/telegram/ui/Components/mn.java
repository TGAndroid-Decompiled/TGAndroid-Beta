package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class mn extends org.telegram.ui.Cells.c6 {
    public final int C;
    public final qn D;

    public mn(qn qnVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(context, i10, null, g6Var);
        this.D = qnVar;
        this.C = i11;
    }

    @Override
    public final void g(eh.b bVar, ActionMode actionMode) {
        sn snVar = this.D.d;
        if (!snVar.f31115n && this.C == 11 && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) snVar.f26546b.f29040c0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z4) {
        sn.M(this.D.d, this, z4);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        sn.N(this.D.d, c6Var);
    }

    @Override
    public final void k(eh.b bVar) {
        this.D.d.f26546b.t1(bVar, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        sn snVar = this.D.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        eh.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < snVar.G) {
            for (int length = snVar.H.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = snVar.H;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            snVar.H[i10] = (CharSequence) arrayList.remove(0);
            snVar.J++;
            i10++;
        }
        snVar.h0();
        snVar.f31108h0 = (snVar.f31119q0 + i10) - 1;
        snVar.f31122s.setItemAnimator(snVar.v);
        snVar.f31120r.l();
        return true;
    }
}
