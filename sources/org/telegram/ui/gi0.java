package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class gi0 extends s4.h0 {
    public final Context f33576c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final wi0 e;

    public gi0(wi0 wi0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = wi0Var;
        this.f33576c = context;
        this.d = d6Var;
    }

    @Override
    public final int h() {
        return this.e.N.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        wi0 wi0Var = this.e;
        ArrayList arrayList = wi0Var.N;
        boolean z10 = true;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) c1Var.f42627a;
        MessageObject.GroupedMessages l4 = wi0Var.l(messageObject);
        int i11 = 0;
        if (l4 == null) {
            z10 = false;
        }
        t1Var.setInvalidatesParent(z10);
        t1Var.X3(messageObject, l4, false, false, false, false);
        if (!wi0Var.P.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 == i11 && !messageObject.needDrawForwarded()) {
            wi0Var.Q = t1Var;
            Point point = AndroidUtilities.displaySize;
            t1Var.Z3(point.x, point.y);
            wi0Var.R = messageObject.getId();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        wi0 wi0Var = this.e;
        vi0 vi0Var = new vi0(wi0Var, this.f33576c, wi0Var.f39000c, this.d);
        vi0Var.setDelegate(new na.d(17));
        return new s4.c1(vi0Var);
    }
}
