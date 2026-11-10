package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class qz0 extends oj0 {
    public Context f37430c;
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
        if (d1Var.f57056f == 0) {
            boolean z9 = true;
            org.telegram.ui.ActionBar.v6 v6Var = (org.telegram.ui.ActionBar.v6) ((ArrayList) this.d.get(i7 - 1)).get(0);
            if (v6Var.f28631e == org.telegram.ui.ActionBar.m6.Be) {
                c10 = 0;
            } else {
                c10 = v6Var.c();
            }
            org.telegram.ui.Cells.u8 u8Var = (org.telegram.ui.Cells.u8) d1Var.f57052a;
            u8Var.f30598a.setText(org.telegram.ui.ActionBar.v4.c(v6Var.f28631e));
            u8Var.f30599b = c10;
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
        Context context = this.f37430c;
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
