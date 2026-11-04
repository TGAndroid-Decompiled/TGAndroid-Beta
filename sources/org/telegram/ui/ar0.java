package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class ar0 extends org.telegram.ui.Cells.z5 {
    public final dr0 G;

    public ar0(dr0 dr0Var, Context context, int i3) {
        super(context, i3, null, null);
        this.G = dr0Var;
    }

    @Override
    public final void i(boolean z10) {
        fr0.i0(this.G.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        fr0.j0(this.G.d, z5Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        fr0 fr0Var = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        ai.z zVar = this.d;
        zVar.getText().replace(zVar.getSelectionStart(), zVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i3 = 0;
        while (!arrayList.isEmpty() && i3 < fr0Var.f45344n) {
            for (int length = fr0Var.f45356w.length - 1; length > i3; length--) {
                CharSequence[] charSequenceArr = fr0Var.f45356w;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            fr0Var.f45356w[i3] = (CharSequence) arrayList.remove(0);
            fr0Var.E++;
            i3++;
        }
        fr0Var.w0();
        fr0Var.f45339h0 = (fr0Var.f45346o0 + i3) - 1;
        fr0Var.f45329b.f();
        return true;
    }

    @Override
    public final void g(ai.z zVar, ActionMode actionMode) {
    }
}
