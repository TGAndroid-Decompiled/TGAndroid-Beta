package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class o11 extends sl0 {
    public Context f29651c;
    public ArrayList d;

    @Override
    public final boolean D(f2.m1 m1Var) {
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
    public final void v(f2.m1 m1Var, int i10) {
        int b10;
        if (m1Var.f5879f == 0) {
            boolean z4 = true;
            org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) ((ArrayList) this.d.get(i10 - 1)).get(0);
            if (m6Var.f22143f == org.telegram.ui.ActionBar.k6.Nd) {
                b10 = 0;
            } else {
                b10 = m6Var.b();
            }
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) m1Var.f5875a;
            v8Var.f24320a.setText(org.telegram.ui.ActionBar.i5.i(m6Var.f22143f));
            v8Var.f24321b = b10;
            if (b10 != 0) {
                z4 = false;
            }
            v8Var.setWillNotDraw(z4);
            v8Var.invalidate();
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View v8Var;
        Context context = this.f29651c;
        if (i10 != 0) {
            v8Var = new View(context);
            v8Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            v8Var = new org.telegram.ui.Cells.v8(context);
            v8Var.setLayoutParams(new f2.x0(-1, -2));
        }
        return new f2.m1(v8Var);
    }
}
