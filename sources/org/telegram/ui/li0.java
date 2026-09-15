package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class li0 extends s4.h0 {
    public final Context f35516c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final bj0 e;

    public li0(bj0 bj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = bj0Var;
        this.f35516c = context;
        this.d = e6Var;
    }

    @Override
    public final int h() {
        return this.e.N.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        bj0 bj0Var = this.e;
        ArrayList arrayList = bj0Var.N;
        boolean z10 = true;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) c1Var.f42675a;
        MessageObject.GroupedMessages l4 = bj0Var.l(messageObject);
        int i11 = 0;
        if (l4 == null) {
            z10 = false;
        }
        t1Var.setInvalidatesParent(z10);
        t1Var.X3(messageObject, l4, false, false, false, false);
        if (!bj0Var.P.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 == i11 && !messageObject.needDrawForwarded()) {
            bj0Var.Q = t1Var;
            Point point = AndroidUtilities.displaySize;
            t1Var.Z3(point.x, point.y);
            bj0Var.R = messageObject.getId();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        bj0 bj0Var = this.e;
        aj0 aj0Var = new aj0(bj0Var, this.f35516c, bj0Var.f32179c, this.d);
        aj0Var.setDelegate(new na.d(17));
        return new s4.c1(aj0Var);
    }
}
