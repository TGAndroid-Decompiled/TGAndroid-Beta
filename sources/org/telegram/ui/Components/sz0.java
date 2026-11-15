package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class sz0 extends tj0 {
    public Context f39459c;
    public ArrayList d;

    @Override
    public final boolean D(v4.e1 e1Var) {
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
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int c10;
        if (e1Var.f58539f == 0) {
            boolean z10 = true;
            org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) ((ArrayList) this.d.get(i7 - 1)).get(0);
            if (s6Var.f29600e == org.telegram.ui.ActionBar.j6.Ee) {
                c10 = 0;
            } else {
                c10 = s6Var.c();
            }
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) e1Var.f58535a;
            t8Var.f31681a.setText(org.telegram.ui.ActionBar.s4.c(s6Var.f29600e));
            t8Var.f31682b = c10;
            if (c10 != 0) {
                z10 = false;
            }
            t8Var.setWillNotDraw(z10);
            t8Var.invalidate();
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View t8Var;
        Context context = this.f39459c;
        if (i7 != 0) {
            t8Var = new View(context);
            t8Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
        } else {
            t8Var = new org.telegram.ui.Cells.t8(context);
            t8Var.setLayoutParams(new v4.p0(-1, -2));
        }
        return new v4.e1(t8Var);
    }
}
