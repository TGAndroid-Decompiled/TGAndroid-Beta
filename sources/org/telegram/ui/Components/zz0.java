package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class zz0 extends bk0 {
    public Context f42975c;
    public ArrayList d;

    @Override
    public final boolean D(v4.f1 f1Var) {
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
    public final void t(v4.f1 f1Var, int i7) {
        int c10;
        if (f1Var.f59127f == 0) {
            boolean z10 = true;
            org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) ((ArrayList) this.d.get(i7 - 1)).get(0);
            if (w6Var.f30155e == org.telegram.ui.ActionBar.n6.Ee) {
                c10 = 0;
            } else {
                c10 = w6Var.c();
            }
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) f1Var.f59123a;
            v8Var.f32178a.setText(org.telegram.ui.ActionBar.w4.c(w6Var.f30155e));
            v8Var.f32179b = c10;
            if (c10 != 0) {
                z10 = false;
            }
            v8Var.setWillNotDraw(z10);
            v8Var.invalidate();
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View v8Var;
        Context context = this.f42975c;
        if (i7 != 0) {
            v8Var = new View(context);
            v8Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
        } else {
            v8Var = new org.telegram.ui.Cells.v8(context);
            v8Var.setLayoutParams(new v4.q0(-1, -2));
        }
        return new v4.f1(v8Var);
    }
}
