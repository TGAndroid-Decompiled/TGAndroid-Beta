package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class x11 extends ul0 {
    public Context f28908c;
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
        int b10;
        if (c1Var.f41613f == 0) {
            boolean z10 = true;
            org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) ((ArrayList) this.d.get(i10 - 1)).get(0);
            if (l6Var.f18457f == org.telegram.ui.ActionBar.j6.Nd) {
                b10 = 0;
            } else {
                b10 = l6Var.b();
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) c1Var.f41610a;
            a9Var.f18888a.setText(org.telegram.ui.ActionBar.i5.i(l6Var.f18457f));
            a9Var.f18889b = b10;
            if (b10 != 0) {
                z10 = false;
            }
            a9Var.setWillNotDraw(z10);
            a9Var.invalidate();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View a9Var;
        Context context = this.f28908c;
        if (i10 != 0) {
            a9Var = new View(context);
            a9Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            a9Var = new org.telegram.ui.Cells.a9(context);
            a9Var.setLayoutParams(new s4.p0(-1, -2));
        }
        return new s4.c1(a9Var);
    }
}
