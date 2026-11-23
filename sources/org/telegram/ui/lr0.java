package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class lr0 extends org.telegram.ui.Cells.b6 {
    public final or0 G;

    public lr0(or0 or0Var, Context context, int i7) {
        super(context, i7, null, null);
        this.G = or0Var;
    }

    @Override
    public final void j(boolean z10) {
        qr0.i0(this.G.d, this, z10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        qr0.j0(this.G.d, b6Var);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        qr0 qr0Var = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        bi.u uVar = this.d;
        uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < qr0Var.f51298n) {
            for (int length = qr0Var.f51310w.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = qr0Var.f51310w;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            qr0Var.f51310w[i7] = (CharSequence) arrayList.remove(0);
            qr0Var.E++;
            i7++;
        }
        qr0Var.w0();
        qr0Var.f51293h0 = (qr0Var.f51300o0 + i7) - 1;
        qr0Var.f51283b.f();
        return true;
    }

    @Override
    public final void h(bi.u uVar, ActionMode actionMode) {
    }
}
