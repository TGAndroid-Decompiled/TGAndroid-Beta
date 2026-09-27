package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ii0 extends s4.h0 {
    public final Context f34492c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final yi0 e;

    public ii0(yi0 yi0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = yi0Var;
        this.f34492c = context;
        this.d = e6Var;
    }

    @Override
    public final int h() {
        return this.e.N.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        yi0 yi0Var = this.e;
        ArrayList arrayList = yi0Var.N;
        boolean z10 = true;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) c1Var.f43005a;
        MessageObject.GroupedMessages l4 = yi0Var.l(messageObject);
        int i11 = 0;
        if (l4 == null) {
            z10 = false;
        }
        u1Var.setInvalidatesParent(z10);
        u1Var.X3(messageObject, l4, false, false, false, false);
        if (!yi0Var.P.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 == i11 && !messageObject.needDrawForwarded()) {
            yi0Var.Q = u1Var;
            Point point = AndroidUtilities.displaySize;
            u1Var.Z3(point.x, point.y);
            yi0Var.R = messageObject.getId();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        yi0 yi0Var = this.e;
        xi0 xi0Var = new xi0(yi0Var, this.f34492c, yi0Var.f40225c, this.d);
        xi0Var.setDelegate(new na.d(17));
        return new s4.c1(xi0Var);
    }
}
