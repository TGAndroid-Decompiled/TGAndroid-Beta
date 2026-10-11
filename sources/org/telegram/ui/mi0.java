package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class mi0 extends s4.i0 {
    public final Context f39952c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final cj0 f39953e;

    public mi0(cj0 cj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f39953e = cj0Var;
        this.f39952c = context;
        this.d = d6Var;
    }

    @Override
    public final int h() {
        return this.f39953e.N.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        cj0 cj0Var = this.f39953e;
        ArrayList arrayList = cj0Var.N;
        boolean z10 = true;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) d1Var.f47748a;
        MessageObject.GroupedMessages l4 = cj0Var.l(messageObject);
        int i11 = 0;
        if (l4 == null) {
            z10 = false;
        }
        u1Var.setInvalidatesParent(z10);
        u1Var.X3(messageObject, l4, false, false, false, false);
        if (!cj0Var.P.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 == i11 && !messageObject.needDrawForwarded()) {
            cj0Var.Q = u1Var;
            Point point = AndroidUtilities.displaySize;
            u1Var.Z3(point.x, point.y);
            cj0Var.R = messageObject.getId();
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        cj0 cj0Var = this.f39953e;
        bj0 bj0Var = new bj0(cj0Var, this.f39952c, cj0Var.f36727c, this.d);
        bj0Var.setDelegate(new na.d(17));
        return new s4.d1(bj0Var);
    }
}
