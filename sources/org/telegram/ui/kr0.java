package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class kr0 extends org.telegram.ui.Cells.b6 {
    public final nr0 G;

    public kr0(nr0 nr0Var, Context context, int i7) {
        super(context, i7, null, null);
        this.G = nr0Var;
    }

    @Override
    public final void j(boolean z10) {
        pr0.i0(this.G.d, this, z10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        pr0.j0(this.G.d, b6Var);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        pr0 pr0Var = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        bi.u uVar = this.d;
        uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < pr0Var.f50950n) {
            for (int length = pr0Var.f50962w.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = pr0Var.f50962w;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            pr0Var.f50962w[i7] = (CharSequence) arrayList.remove(0);
            pr0Var.E++;
            i7++;
        }
        pr0Var.w0();
        pr0Var.f50945h0 = (pr0Var.f50952o0 + i7) - 1;
        pr0Var.f50935b.f();
        return true;
    }

    @Override
    public final void h(bi.u uVar, ActionMode actionMode) {
    }
}
