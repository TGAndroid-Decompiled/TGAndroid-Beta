package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class n11 extends ql0 {
    public Context f27170c;
    public ArrayList d;

    @Override
    public final boolean D(f2.l1 l1Var) {
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
    public final void v(f2.l1 l1Var, int i10) {
        int b10;
        if (l1Var.f5777f == 0) {
            boolean z4 = true;
            org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) ((ArrayList) this.d.get(i10 - 1)).get(0);
            if (l6Var.f20409f == org.telegram.ui.ActionBar.j6.Nd) {
                b10 = 0;
            } else {
                b10 = l6Var.b();
            }
            org.telegram.ui.Cells.u8 u8Var = (org.telegram.ui.Cells.u8) l1Var.f5774a;
            u8Var.f22380a.setText(org.telegram.ui.ActionBar.h5.i(l6Var.f20409f));
            u8Var.f22381b = b10;
            if (b10 != 0) {
                z4 = false;
            }
            u8Var.setWillNotDraw(z4);
            u8Var.invalidate();
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View u8Var;
        Context context = this.f27170c;
        if (i10 != 0) {
            u8Var = new View(context);
            u8Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            u8Var = new org.telegram.ui.Cells.u8(context);
            u8Var.setLayoutParams(new f2.w0(-1, -2));
        }
        return new f2.l1(u8Var);
    }
}
