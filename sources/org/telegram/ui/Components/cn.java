package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

public final class cn extends org.telegram.ui.Cells.z5 {
    public final int B;
    public final gn C;

    public cn(gn gnVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, i10, null, c6Var);
        this.C = gnVar;
        this.B = i11;
    }

    @Override
    public final void g(gh.r rVar, ActionMode actionMode) {
        in inVar = this.C.d;
        if (!inVar.f29430n && this.B == 11 && rVar.isFocused() && rVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) == null) {
                return;
            }
            org.telegram.ui.rn.k8(menu, ((org.telegram.ui.rn) inVar.f34900b.f28635b0).h, false, true, true, true);
        }
    }

    @Override
    public final void i(boolean z10) {
        in.M(this.C.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        in.N(this.C.d, z5Var);
    }

    @Override
    public final void k(gh.r rVar) {
        this.C.d.f34900b.t1(rVar, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        in inVar = this.C.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        gh.r rVar = this.d;
        rVar.getText().replace(rVar.getSelectionStart(), rVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < inVar.F) {
            for (int length = inVar.G.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = inVar.G;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            inVar.G[i10] = (CharSequence) arrayList.remove(0);
            inVar.I++;
            i10++;
        }
        inVar.h0();
        inVar.f29422g0 = (inVar.f29433p0 + i10) - 1;
        inVar.f29437s.setItemAnimator(inVar.v);
        inVar.f29435r.l();
        return true;
    }
}
