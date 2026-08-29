package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class in extends org.telegram.ui.Cells.a6 {
    public final int B;
    public final mn C;

    public in(mn mnVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, i10, null, c6Var);
        this.C = mnVar;
        this.B = i11;
    }

    @Override
    public final void g(bh.b bVar, ActionMode actionMode) {
        on onVar = this.C.d;
        if (!onVar.f31420n && this.B == 11 && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.tn.k8(menu, ((org.telegram.ui.tn) onVar.f28403b.f30990b0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        on.L(this.C.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        on.M(this.C.d, a6Var);
    }

    @Override
    public final void k(bh.b bVar) {
        this.C.d.f28403b.t1(bVar, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        on onVar = this.C.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        bh.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < onVar.F) {
            for (int length = onVar.G.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = onVar.G;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            onVar.G[i10] = (CharSequence) arrayList.remove(0);
            onVar.I++;
            i10++;
        }
        onVar.h0();
        onVar.f31412g0 = (onVar.f31423p0 + i10) - 1;
        onVar.f31427s.setItemAnimator(onVar.v);
        onVar.f31425r.l();
        return true;
    }
}
