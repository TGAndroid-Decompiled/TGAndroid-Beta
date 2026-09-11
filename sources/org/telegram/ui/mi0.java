package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class mi0 extends s4.h0 {
    public final Context f38716c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final cj0 f38717e;

    public mi0(cj0 cj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f38717e = cj0Var;
        this.f38716c = context;
        this.d = f6Var;
    }

    @Override
    public final int h() {
        return this.f38717e.N.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        cj0 cj0Var = this.f38717e;
        ArrayList arrayList = cj0Var.N;
        boolean z10 = true;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) c1Var.f45738a;
        MessageObject.GroupedMessages l4 = cj0Var.l(messageObject);
        int i11 = 0;
        if (l4 == null) {
            z10 = false;
        }
        t1Var.setInvalidatesParent(z10);
        t1Var.X3(messageObject, l4, false, false, false, false);
        if (!cj0Var.P.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 == i11 && !messageObject.needDrawForwarded()) {
            cj0Var.Q = t1Var;
            Point point = AndroidUtilities.displaySize;
            t1Var.Z3(point.x, point.y);
            cj0Var.R = messageObject.getId();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        cj0 cj0Var = this.f38717e;
        bj0 bj0Var = new bj0(cj0Var, this.f38716c, cj0Var.f35131c, this.d);
        bj0Var.setDelegate(new ob.a(17));
        return new s4.c1(bj0Var);
    }
}
