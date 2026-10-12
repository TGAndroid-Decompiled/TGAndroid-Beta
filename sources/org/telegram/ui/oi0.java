package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class oi0 extends s4.i0 {
    public final Context f40727c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final ej0 f40728e;

    public oi0(ej0 ej0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f40728e = ej0Var;
        this.f40727c = context;
        this.d = c6Var;
    }

    @Override
    public final int h() {
        return this.f40728e.N.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        ej0 ej0Var = this.f40728e;
        ArrayList arrayList = ej0Var.N;
        boolean z10 = true;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) d1Var.f47889a;
        MessageObject.GroupedMessages l4 = ej0Var.l(messageObject);
        int i11 = 0;
        if (l4 == null) {
            z10 = false;
        }
        u1Var.setInvalidatesParent(z10);
        u1Var.X3(messageObject, l4, false, false, false, false);
        if (!ej0Var.P.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 == i11 && !messageObject.needDrawForwarded()) {
            ej0Var.Q = u1Var;
            Point point = AndroidUtilities.displaySize;
            u1Var.Z3(point.x, point.y);
            ej0Var.R = messageObject.getId();
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        ej0 ej0Var = this.f40728e;
        dj0 dj0Var = new dj0(ej0Var, this.f40727c, ej0Var.f37129c, this.d);
        dj0Var.setDelegate(new na.d(17));
        return new s4.d1(dj0Var);
    }
}
