package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class rz0 extends pj0 {
    public Context f37843c;
    public ArrayList d;

    @Override
    public final boolean D(v4.d1 d1Var) {
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
    public final void t(v4.d1 d1Var, int i7) {
        int c10;
        if (d1Var.f57060f == 0) {
            boolean z9 = true;
            org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) ((ArrayList) this.d.get(i7 - 1)).get(0);
            if (u6Var.f28603e == org.telegram.ui.ActionBar.l6.Be) {
                c10 = 0;
            } else {
                c10 = u6Var.c();
            }
            org.telegram.ui.Cells.u8 u8Var = (org.telegram.ui.Cells.u8) d1Var.f57056a;
            u8Var.f30587a.setText(org.telegram.ui.ActionBar.u4.c(u6Var.f28603e));
            u8Var.f30588b = c10;
            if (c10 != 0) {
                z9 = false;
            }
            u8Var.setWillNotDraw(z9);
            u8Var.invalidate();
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View u8Var;
        Context context = this.f37843c;
        if (i7 != 0) {
            u8Var = new View(context);
            u8Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(56.0f)));
        } else {
            u8Var = new org.telegram.ui.Cells.u8(context);
            u8Var.setLayoutParams(new v4.o0(-1, -2));
        }
        return new v4.d1(u8Var);
    }
}
