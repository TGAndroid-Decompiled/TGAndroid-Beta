package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class g21 extends hm0 {
    public Context f26466c;
    public ArrayList d;

    @Override
    public final boolean D(s4.b1 b1Var) {
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
    public final void v(s4.b1 b1Var, int i10) {
        int c10;
        if (b1Var.f45961f == 0) {
            boolean z10 = true;
            org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) ((ArrayList) this.d.get(i10 - 1)).get(0);
            if (j6Var.f21462f == org.telegram.ui.ActionBar.h6.Nd) {
                c10 = 0;
            } else {
                c10 = j6Var.c();
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) b1Var.f45958a;
            y8Var.f23857a.setText(org.telegram.ui.ActionBar.g5.i(j6Var.f21462f));
            y8Var.f23858b = c10;
            if (c10 != 0) {
                z10 = false;
            }
            y8Var.setWillNotDraw(z10);
            y8Var.invalidate();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View y8Var;
        Context context = this.f26466c;
        if (i10 != 0) {
            y8Var = new View(context);
            y8Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            y8Var = new org.telegram.ui.Cells.y8(context);
            y8Var.setLayoutParams(new s4.o0(-1, -2));
        }
        return new s4.b1(y8Var);
    }
}
