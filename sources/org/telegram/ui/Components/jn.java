package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class jn extends org.telegram.ui.Cells.b6 {
    public final int C;
    public final nn D;

    public jn(nn nnVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, i10, null, f6Var);
        this.D = nnVar;
        this.C = i11;
    }

    @Override
    public final void g(dh.b bVar, ActionMode actionMode) {
        pn pnVar = this.D.d;
        if (!pnVar.f27953n && this.C == 11 && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.zn.k8(menu, ((org.telegram.ui.zn) pnVar.f24282b.f26685c0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z4) {
        pn.M(this.D.d, this, z4);
    }

    @Override
    public final void j(org.telegram.ui.Cells.b6 b6Var) {
        pn.N(this.D.d, b6Var);
    }

    @Override
    public final void k(dh.b bVar) {
        this.D.d.f24282b.t1(bVar, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        pn pnVar = this.D.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        dh.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < pnVar.G) {
            for (int length = pnVar.H.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = pnVar.H;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            pnVar.H[i10] = (CharSequence) arrayList.remove(0);
            pnVar.J++;
            i10++;
        }
        pnVar.h0();
        pnVar.f27946h0 = (pnVar.f27957q0 + i10) - 1;
        pnVar.f27960s.setItemAnimator(pnVar.v);
        pnVar.f27958r.l();
        return true;
    }
}
