package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class hv0 extends org.telegram.ui.Cells.b6 {
    public final kv0 C;

    public hv0(kv0 kv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.C = kv0Var;
    }

    @Override
    public final void i(boolean z4) {
        mv0.d0(this.C.d, this, z4);
    }

    @Override
    public final void j(org.telegram.ui.Cells.b6 b6Var) {
        mv0.e0(this.C.d, b6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        mv0 mv0Var = this.C.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        dh.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < mv0Var.f36245n) {
            for (int length = mv0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = mv0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            mv0Var.v[i10] = (CharSequence) arrayList.remove(0);
            mv0Var.f36261y++;
            i10++;
        }
        mv0Var.r0();
        mv0Var.f36235d0 = (mv0Var.f36243k0 + i10) - 1;
        mv0Var.f36231b.l();
        return true;
    }

    @Override
    public final void g(dh.b bVar, ActionMode actionMode) {
    }
}
