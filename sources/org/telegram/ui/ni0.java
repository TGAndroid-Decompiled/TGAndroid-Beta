package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ni0 extends s4.i0 {
    public final Context f40218c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final dj0 f40219e;

    public ni0(dj0 dj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f40219e = dj0Var;
        this.f40218c = context;
        this.d = e6Var;
    }

    @Override
    public final int h() {
        return this.f40219e.N.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        dj0 dj0Var = this.f40219e;
        ArrayList arrayList = dj0Var.N;
        boolean z10 = true;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) d1Var.f47656a;
        MessageObject.GroupedMessages l4 = dj0Var.l(messageObject);
        int i11 = 0;
        if (l4 == null) {
            z10 = false;
        }
        u1Var.setInvalidatesParent(z10);
        u1Var.X3(messageObject, l4, false, false, false, false);
        if (!dj0Var.P.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 == i11 && !messageObject.needDrawForwarded()) {
            dj0Var.Q = u1Var;
            Point point = AndroidUtilities.displaySize;
            u1Var.Z3(point.x, point.y);
            dj0Var.R = messageObject.getId();
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        dj0 dj0Var = this.f40219e;
        cj0 cj0Var = new cj0(dj0Var, this.f40218c, dj0Var.f36992c, this.d);
        cj0Var.setDelegate(new na.d(17));
        return new s4.d1(cj0Var);
    }
}
