package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class av0 extends org.telegram.ui.Cells.c6 {
    public final dv0 C;

    public av0(dv0 dv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.C = dv0Var;
    }

    @Override
    public final void i(boolean z4) {
        fv0.d0(this.C.d, this, z4);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        fv0.e0(this.C.d, c6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        fv0 fv0Var = this.C.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        dh.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < fv0Var.f34388n) {
            for (int length = fv0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = fv0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            fv0Var.v[i10] = (CharSequence) arrayList.remove(0);
            fv0Var.f34404y++;
            i10++;
        }
        fv0Var.r0();
        fv0Var.f34378d0 = (fv0Var.f34386k0 + i10) - 1;
        fv0Var.f34374b.l();
        return true;
    }

    @Override
    public final void g(dh.b bVar, ActionMode actionMode) {
    }
}
