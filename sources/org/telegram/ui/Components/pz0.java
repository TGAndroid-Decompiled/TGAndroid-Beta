package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class pz0 extends sj0 {
    public Context f37297c;
    public ArrayList d;

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int c2;
        if (d1Var.f55544f == 0) {
            boolean z10 = true;
            org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) ((ArrayList) this.d.get(i3 - 1)).get(0);
            if (t6Var.f28659e == org.telegram.ui.ActionBar.k6.Be) {
                c2 = 0;
            } else {
                c2 = t6Var.c();
            }
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) d1Var.f55540a;
            t8Var.f30605a.setText(org.telegram.ui.ActionBar.u4.c(t6Var.f28659e));
            t8Var.f30606b = c2;
            if (c2 != 0) {
                z10 = false;
            }
            t8Var.setWillNotDraw(z10);
            t8Var.invalidate();
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View t8Var;
        Context context = this.f37297c;
        if (i3 != 0) {
            t8Var = new View(context);
            t8Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
        } else {
            t8Var = new org.telegram.ui.Cells.t8(context);
            t8Var.setLayoutParams(new u4.p0(-1, -2));
        }
        return new u4.d1(t8Var);
    }
}
