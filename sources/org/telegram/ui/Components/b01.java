package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class b01 extends dk0 {
    public Context f33663c;
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
        if (e1Var.f59115f == 0) {
            boolean z10 = true;
            org.telegram.ui.ActionBar.v6 v6Var = (org.telegram.ui.ActionBar.v6) ((ArrayList) this.d.get(i7 - 1)).get(0);
            if (v6Var.f30107e == org.telegram.ui.ActionBar.m6.Ee) {
                c10 = 0;
            } else {
                c10 = v6Var.c();
            }
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) e1Var.f59111a;
            v8Var.f32175a.setText(org.telegram.ui.ActionBar.v4.c(v6Var.f30107e));
            v8Var.f32176b = c10;
            if (c10 != 0) {
                z10 = false;
            }
            v8Var.setWillNotDraw(z10);
            v8Var.invalidate();
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View v8Var;
        Context context = this.f33663c;
        if (i7 != 0) {
            v8Var = new View(context);
            v8Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
        } else {
            v8Var = new org.telegram.ui.Cells.v8(context);
            v8Var.setLayoutParams(new v4.p0(-1, -2));
        }
        return new v4.e1(v8Var);
    }
}
