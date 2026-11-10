package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class nr0 extends org.telegram.ui.Cells.a6 {
    public final qr0 F;

    public nr0(qr0 qr0Var, Context context, int i7) {
        super(context, i7, null, null);
        this.F = qr0Var;
    }

    @Override
    public final void i(boolean z9) {
        sr0.i0(this.F.d, this, z9);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        sr0.j0(this.F.d, a6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        sr0 sr0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.z5 z5Var = this.d;
        z5Var.getText().replace(z5Var.getSelectionStart(), z5Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < sr0Var.f49936n) {
            for (int length = sr0Var.f49948w.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = sr0Var.f49948w;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            sr0Var.f49948w[i7] = (CharSequence) arrayList.remove(0);
            sr0Var.D++;
            i7++;
        }
        sr0Var.w0();
        sr0Var.f49930g0 = (sr0Var.f49937n0 + i7) - 1;
        sr0Var.f49921b.f();
        return true;
    }

    @Override
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
    }
}
