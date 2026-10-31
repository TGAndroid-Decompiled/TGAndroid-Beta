package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class u01 extends sk0 {
    public Context f30743c;
    public ArrayList d;

    @Override
    public final boolean D(s4.c1 c1Var) {
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
    public final int d(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int c10;
        if (c1Var.f47901f == 0) {
            boolean z10 = true;
            org.telegram.ui.ActionBar.c7 c7Var = (org.telegram.ui.ActionBar.c7) ((ArrayList) this.d.get(i10 - 1)).get(0);
            if (c7Var.e == org.telegram.ui.ActionBar.t6.Be) {
                c10 = 0;
            } else {
                c10 = c7Var.c();
            }
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) c1Var.f47898a;
            w8Var.f23409a.setText(org.telegram.ui.ActionBar.d5.c(c7Var.e));
            w8Var.f23410b = c10;
            if (c10 != 0) {
                z10 = false;
            }
            w8Var.setWillNotDraw(z10);
            w8Var.invalidate();
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View w8Var;
        Context context = this.f30743c;
        if (i10 != 0) {
            w8Var = new View(context);
            w8Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(56.0f)));
        } else {
            w8Var = new org.telegram.ui.Cells.w8(context);
            w8Var.setLayoutParams(new s4.o0(-1, -2));
        }
        return new s4.c1(w8Var);
    }
}
