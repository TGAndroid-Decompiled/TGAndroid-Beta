package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public final class s01 extends yk0 {

    public Context f32289c;
    public ArrayList d;

    @Override
    public final boolean D(f2.o1 o1Var) {
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
        return i10 == 0 ? 1 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        if (o1Var.f5793f == 0) {
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) ((ArrayList) this.d.get(i10 - 1)).get(0);
            int iB = i6Var.f23517f == org.telegram.ui.ActionBar.g6.Nd ? 0 : i6Var.b();
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) o1Var.f5789a;
            s8Var.f25640a.setText(org.telegram.ui.ActionBar.e5.i(i6Var.f23517f));
            s8Var.f25641b = iB;
            s8Var.setWillNotDraw(iB == 0);
            s8Var.invalidate();
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View s8Var;
        Context context = this.f32289c;
        if (i10 != 0) {
            s8Var = new View(context);
            s8Var.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            s8Var = new org.telegram.ui.Cells.s8(context);
            s8Var.setLayoutParams(new f2.y0(-1, -2));
        }
        return new lk0(s8Var);
    }
}
