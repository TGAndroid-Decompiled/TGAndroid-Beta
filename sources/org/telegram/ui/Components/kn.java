package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class kn extends org.telegram.ui.Cells.c6 {
    public final int C;
    public final on D;

    public kn(on onVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, i10, null, f6Var);
        this.D = onVar;
        this.C = i11;
    }

    @Override
    public final void g(dh.b bVar, ActionMode actionMode) {
        qn qnVar = this.D.d;
        if (!qnVar.f28181n && this.C == 11 && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) qnVar.f24278b.f26689c0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z4) {
        qn.M(this.D.d, this, z4);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        qn.N(this.D.d, c6Var);
    }

    @Override
    public final void k(dh.b bVar) {
        this.D.d.f24278b.t1(bVar, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        qn qnVar = this.D.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        dh.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < qnVar.G) {
            for (int length = qnVar.H.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = qnVar.H;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            qnVar.H[i10] = (CharSequence) arrayList.remove(0);
            qnVar.J++;
            i10++;
        }
        qnVar.h0();
        qnVar.f28174h0 = (qnVar.f28185q0 + i10) - 1;
        qnVar.f28188s.setItemAnimator(qnVar.v);
        qnVar.f28186r.l();
        return true;
    }
}
