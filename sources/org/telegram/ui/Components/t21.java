package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class t21 extends lm0 {
    public Context f32818c;
    public ArrayList d;

    @Override
    public final boolean D(s4.e1 e1Var) {
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
    public final void v(s4.e1 e1Var, int i10) {
        int c10;
        if (e1Var.f47741f == 0) {
            boolean z10 = true;
            org.telegram.ui.ActionBar.h7 h7Var = (org.telegram.ui.ActionBar.h7) ((ArrayList) this.d.get(i10 - 1)).get(0);
            if (h7Var.e == org.telegram.ui.ActionBar.y6.Nd) {
                c10 = 0;
            } else {
                c10 = h7Var.c();
            }
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) e1Var.f47738a;
            d9Var.f24015a.setText(org.telegram.ui.ActionBar.m5.c(h7Var.e));
            d9Var.f24016b = c10;
            if (c10 != 0) {
                z10 = false;
            }
            d9Var.setWillNotDraw(z10);
            d9Var.invalidate();
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View d9Var;
        Context context = this.f32818c;
        if (i10 != 0) {
            d9Var = new View(context);
            d9Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            d9Var = new org.telegram.ui.Cells.d9(context);
            d9Var.setLayoutParams(new s4.q0(-1, -2));
        }
        return new s4.e1(d9Var);
    }
}
