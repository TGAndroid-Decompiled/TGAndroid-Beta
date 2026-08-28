package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class dn extends org.telegram.ui.Cells.c6 {
    public final int B;
    public final hn C;

    public dn(hn hnVar, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10) {
        super(context, i9, null, b6Var);
        this.C = hnVar;
        this.B = i10;
    }

    @Override
    public final void g(fh.s sVar, ActionMode actionMode) {
        jn jnVar = this.C.d;
        if (!jnVar.f29784n && this.B == 11 && sVar.isFocused() && sVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.qn.k8(menu, ((org.telegram.ui.qn) jnVar.f27493b.f30099b0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        jn.L(this.C.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        jn.M(this.C.d, c6Var);
    }

    @Override
    public final void k(fh.s sVar) {
        this.C.d.f27493b.t1(sVar, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        jn jnVar = this.C.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        fh.s sVar = this.d;
        sVar.getText().replace(sVar.getSelectionStart(), sVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i9 = 0;
        while (!arrayList.isEmpty() && i9 < jnVar.F) {
            for (int length = jnVar.G.length - 1; length > i9; length--) {
                CharSequence[] charSequenceArr = jnVar.G;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            jnVar.G[i9] = (CharSequence) arrayList.remove(0);
            jnVar.I++;
            i9++;
        }
        jnVar.g0();
        jnVar.f29776g0 = (jnVar.f29787p0 + i9) - 1;
        jnVar.f29791s.setItemAnimator(jnVar.v);
        jnVar.f29789r.l();
        return true;
    }
}
