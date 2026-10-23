package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ai0 extends s4.g0 {
    public final Context f35686c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final qi0 e;

    public ai0(qi0 qi0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this.e = qi0Var;
        this.f35686c = context;
        this.d = g6Var;
    }

    @Override
    public final int h() {
        return this.e.M.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        qi0 qi0Var = this.e;
        ArrayList arrayList = qi0Var.M;
        boolean z10 = true;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) b1Var.f46343a;
        MessageObject.GroupedMessages k10 = qi0Var.k(messageObject);
        int i11 = 0;
        if (k10 == null) {
            z10 = false;
        }
        t1Var.setInvalidatesParent(z10);
        t1Var.W3(messageObject, k10, false, false, false, false);
        if (!qi0Var.O.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 == i11 && !messageObject.needDrawForwarded()) {
            qi0Var.P = t1Var;
            Point point = AndroidUtilities.displaySize;
            t1Var.Y3(point.x, point.y);
            qi0Var.Q = messageObject.getId();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        qi0 qi0Var = this.e;
        pi0 pi0Var = new pi0(qi0Var, this.f35686c, qi0Var.f40822c, this.d);
        pi0Var.setDelegate(new rb.b(17));
        return new s4.b1(pi0Var);
    }
}
