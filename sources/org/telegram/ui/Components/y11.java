package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class y11 extends wl0 {
    public Context f30543c;
    public ArrayList d;

    @Override
    public final boolean D(s4.c1 c1Var) {
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
    public final void v(s4.c1 c1Var, int i10) {
        int c10;
        if (c1Var.f42962f == 0) {
            boolean z10 = true;
            org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) ((ArrayList) this.d.get(i10 - 1)).get(0);
            if (j6Var.f19517f == org.telegram.ui.ActionBar.h6.Nd) {
                c10 = 0;
            } else {
                c10 = j6Var.c();
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) c1Var.f42959a;
            z8Var.f21923a.setText(org.telegram.ui.ActionBar.e5.i(j6Var.f19517f));
            z8Var.f21924b = c10;
            if (c10 != 0) {
                z10 = false;
            }
            z8Var.setWillNotDraw(z10);
            z8Var.invalidate();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View z8Var;
        Context context = this.f30543c;
        if (i10 != 0) {
            z8Var = new View(context);
            z8Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setLayoutParams(new s4.p0(-1, -2));
        }
        return new s4.c1(z8Var);
    }
}
