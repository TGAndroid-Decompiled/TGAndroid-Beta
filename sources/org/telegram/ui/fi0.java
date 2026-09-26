package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class fi0 extends s4.h0 {
    public final Context f33690c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final vi0 e;

    public fi0(vi0 vi0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = vi0Var;
        this.f33690c = context;
        this.d = d6Var;
    }

    @Override
    public final int h() {
        return this.e.N.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        vi0 vi0Var = this.e;
        ArrayList arrayList = vi0Var.N;
        boolean z10 = true;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) c1Var.f42960a;
        MessageObject.GroupedMessages l4 = vi0Var.l(messageObject);
        int i11 = 0;
        if (l4 == null) {
            z10 = false;
        }
        u1Var.setInvalidatesParent(z10);
        u1Var.X3(messageObject, l4, false, false, false, false);
        if (!vi0Var.P.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 == i11 && !messageObject.needDrawForwarded()) {
            vi0Var.Q = u1Var;
            Point point = AndroidUtilities.displaySize;
            u1Var.Z3(point.x, point.y);
            vi0Var.R = messageObject.getId();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        vi0 vi0Var = this.e;
        ui0 ui0Var = new ui0(vi0Var, this.f33690c, vi0Var.f38730c, this.d);
        ui0Var.setDelegate(new na.d(17));
        return new s4.c1(ui0Var);
    }
}
