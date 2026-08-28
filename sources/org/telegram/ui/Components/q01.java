package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class q01 extends vk0 {
    public Context f31792c;
    public ArrayList d;

    @Override
    public final boolean D(f2.q1 q1Var) {
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
    public final int j(int i9) {
        if (i9 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int b10;
        if (q1Var.f5505f == 0) {
            boolean z10 = true;
            org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) ((ArrayList) this.d.get(i9 - 1)).get(0);
            if (h6Var.f23498f == org.telegram.ui.ActionBar.f6.Nd) {
                b10 = 0;
            } else {
                b10 = h6Var.b();
            }
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) q1Var.f5501a;
            w8Var.f25911a.setText(org.telegram.ui.ActionBar.e5.i(h6Var.f23498f));
            w8Var.f25912b = b10;
            if (b10 != 0) {
                z10 = false;
            }
            w8Var.setWillNotDraw(z10);
            w8Var.invalidate();
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View w8Var;
        Context context = this.f31792c;
        if (i9 != 0) {
            w8Var = new View(context);
            w8Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(56.0f)));
        } else {
            w8Var = new org.telegram.ui.Cells.w8(context);
            w8Var.setLayoutParams(new f2.a1(-1, -2));
        }
        return new f2.q1(w8Var);
    }
}
