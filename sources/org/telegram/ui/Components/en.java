package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class en extends org.telegram.ui.Cells.z5 {
    public final int G;
    public final org.telegram.ui.l4 H;

    public en(org.telegram.ui.l4 l4Var, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, i7, null, e6Var);
        this.H = l4Var;
        this.G = i10;
    }

    @Override
    public final void h(bi.u uVar, ActionMode actionMode) {
        jn jnVar = (jn) this.H.f48823e;
        if (!jnVar.f36086n && this.G == 11 && uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.an.C8(menu, ((org.telegram.ui.an) jnVar.f33609b.f36424a2).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void j(boolean z10) {
        jn.R((jn) this.H.f48823e, this, z10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        jn.S((jn) this.H.f48823e, z5Var);
    }

    @Override
    public final void l(bi.u uVar) {
        ((jn) this.H.f48823e).f33609b.h1(uVar, true);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        jn jnVar = (jn) this.H.f48823e;
        if (arrayList.isEmpty()) {
            return false;
        }
        bi.u uVar = this.d;
        uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < jnVar.K) {
            for (int length = jnVar.L.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = jnVar.L;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            jnVar.L[i7] = (CharSequence) arrayList.remove(0);
            jnVar.N++;
            i7++;
        }
        jnVar.n0();
        jnVar.f36084l0 = (jnVar.f36100u0 + i7) - 1;
        jnVar.f36097s.setItemAnimator(jnVar.f36102w);
        jnVar.f36094r.f();
        return true;
    }
}
