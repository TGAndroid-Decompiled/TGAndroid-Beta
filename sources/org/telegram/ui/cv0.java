package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class cv0 extends org.telegram.ui.Cells.c6 {
    public final fv0 C;

    public cv0(fv0 fv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.C = fv0Var;
    }

    @Override
    public final void i(boolean z4) {
        hv0.d0(this.C.d, this, z4);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        hv0.e0(this.C.d, c6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        hv0 hv0Var = this.C.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        eh.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < hv0Var.f37657n) {
            for (int length = hv0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = hv0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            hv0Var.v[i10] = (CharSequence) arrayList.remove(0);
            hv0Var.f37673y++;
            i10++;
        }
        hv0Var.r0();
        hv0Var.f37646d0 = (hv0Var.f37655k0 + i10) - 1;
        hv0Var.f37642b.l();
        return true;
    }

    @Override
    public final void g(eh.b bVar, ActionMode actionMode) {
    }
}
