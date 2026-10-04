package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ji0 extends s4.h0 {
    public final Context f37704c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final zi0 f37705e;

    public ji0(zi0 zi0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f37705e = zi0Var;
        this.f37704c = context;
        this.d = d6Var;
    }

    @Override
    public final int h() {
        return this.f37705e.N.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        zi0 zi0Var = this.f37705e;
        ArrayList arrayList = zi0Var.N;
        boolean z10 = true;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) c1Var.f46523a;
        MessageObject.GroupedMessages l4 = zi0Var.l(messageObject);
        int i11 = 0;
        if (l4 == null) {
            z10 = false;
        }
        u1Var.setInvalidatesParent(z10);
        u1Var.X3(messageObject, l4, false, false, false, false);
        if (!zi0Var.P.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 == i11 && !messageObject.needDrawForwarded()) {
            zi0Var.Q = u1Var;
            Point point = AndroidUtilities.displaySize;
            u1Var.Z3(point.x, point.y);
            zi0Var.R = messageObject.getId();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        zi0 zi0Var = this.f37705e;
        yi0 yi0Var = new yi0(zi0Var, this.f37704c, zi0Var.f43795c, this.d);
        yi0Var.setDelegate(new na.d(17));
        return new s4.c1(yi0Var);
    }
}
