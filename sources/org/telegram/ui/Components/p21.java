package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class p21 extends pm0 {
    public Context f29703c;
    public ArrayList d;

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int c10;
        if (d1Var.f47662f == 0) {
            boolean z10 = true;
            org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) ((ArrayList) this.d.get(i10 - 1)).get(0);
            if (k6Var.f21345f == org.telegram.ui.ActionBar.i6.Nd) {
                c10 = 0;
            } else {
                c10 = k6Var.c();
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) d1Var.f47658a;
            z8Var.f23818a.setText(org.telegram.ui.ActionBar.g5.i(k6Var.f21345f));
            z8Var.f23819b = c10;
            if (c10 != 0) {
                z10 = false;
            }
            z8Var.setWillNotDraw(z10);
            z8Var.invalidate();
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View z8Var;
        Context context = this.f29703c;
        if (i10 != 0) {
            z8Var = new View(context);
            z8Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setLayoutParams(new s4.q0(-1, -2));
        }
        return new s4.d1(z8Var);
    }
}
