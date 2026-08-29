package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class c11 extends il0 {
    public Context f27276c;
    public ArrayList d;

    @Override
    public final boolean D(f2.n1 n1Var) {
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
    public final void v(f2.n1 n1Var, int i10) {
        int b10;
        if (n1Var.f6436f == 0) {
            boolean z10 = true;
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) ((ArrayList) this.d.get(i10 - 1)).get(0);
            if (i6Var.f23536f == org.telegram.ui.ActionBar.g6.Nd) {
                b10 = 0;
            } else {
                b10 = i6Var.b();
            }
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) n1Var.f6432a;
            t8Var.f25707a.setText(org.telegram.ui.ActionBar.e5.i(i6Var.f23536f));
            t8Var.f25708b = b10;
            if (b10 != 0) {
                z10 = false;
            }
            t8Var.setWillNotDraw(z10);
            t8Var.invalidate();
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View t8Var;
        Context context = this.f27276c;
        if (i10 != 0) {
            t8Var = new View(context);
            t8Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            t8Var = new org.telegram.ui.Cells.t8(context);
            t8Var.setLayoutParams(new f2.x0(-1, -2));
        }
        return new f2.n1(t8Var);
    }
}
