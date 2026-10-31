package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class en extends org.telegram.ui.Cells.e6 {
    public final int F;
    public final fg.j G;

    public en(fg.j jVar, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11) {
        super(context, i10, null, p6Var);
        this.G = jVar;
        this.F = i11;
    }

    @Override
    public final void g(ih.b bVar, ActionMode actionMode) {
        jn jnVar = (jn) this.G.e;
        if (!jnVar.f27434n && this.F == 11 && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.un.t8(menu, ((org.telegram.ui.un) jnVar.f30947b.W1).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        jn.P((jn) this.G.e, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        jn.Q((jn) this.G.e, e6Var);
    }

    @Override
    public final void k(ih.b bVar) {
        ((jn) this.G.e).f30947b.g1(bVar, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        jn jnVar = (jn) this.G.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        ih.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < jnVar.J) {
            for (int length = jnVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = jnVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            jnVar.K[i10] = (CharSequence) arrayList.remove(0);
            jnVar.M++;
            i10++;
        }
        jnVar.l0();
        jnVar.f27430k0 = (jnVar.f27447t0 + i10) - 1;
        jnVar.f27445s.setItemAnimator(jnVar.f27450w);
        jnVar.f27443r.f();
        return true;
    }
}
