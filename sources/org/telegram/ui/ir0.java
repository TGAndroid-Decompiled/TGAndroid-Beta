package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class ir0 extends org.telegram.ui.Cells.z5 {
    public final lr0 G;

    public ir0(lr0 lr0Var, Context context, int i7) {
        super(context, i7, null, null);
        this.G = lr0Var;
    }

    @Override
    public final void j(boolean z10) {
        nr0.i0(this.G.d, this, z10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        nr0.j0(this.G.d, z5Var);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        nr0 nr0Var = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        bi.u uVar = this.d;
        uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < nr0Var.f49631n) {
            for (int length = nr0Var.f49643w.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = nr0Var.f49643w;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            nr0Var.f49643w[i7] = (CharSequence) arrayList.remove(0);
            nr0Var.E++;
            i7++;
        }
        nr0Var.w0();
        nr0Var.f49626h0 = (nr0Var.f49633o0 + i7) - 1;
        nr0Var.f49616b.f();
        return true;
    }

    @Override
    public final void h(bi.u uVar, ActionMode actionMode) {
    }
}
