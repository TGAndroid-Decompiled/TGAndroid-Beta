package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class di0 extends f2.p0 {
    public final Context f36212c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final ti0 f36213e;

    public di0(ti0 ti0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f36213e = ti0Var;
        this.f36212c = context;
        this.d = g6Var;
    }

    @Override
    public final int h() {
        return this.f36213e.K.size();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        ti0 ti0Var = this.f36213e;
        ArrayList arrayList = ti0Var.K;
        boolean z4 = true;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) m1Var.f5875a;
        MessageObject.GroupedMessages l10 = ti0Var.l(messageObject);
        int i11 = 0;
        if (l10 == null) {
            z4 = false;
        }
        t1Var.setInvalidatesParent(z4);
        t1Var.X3(messageObject, l10, false, false, false, false);
        if (!ti0Var.M.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 == i11 && !messageObject.needDrawForwarded()) {
            ti0Var.N = t1Var;
            Point point = AndroidUtilities.displaySize;
            t1Var.Z3(point.x, point.y);
            ti0Var.O = messageObject.getId();
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        ti0 ti0Var = this.f36213e;
        si0 si0Var = new si0(ti0Var, this.f36212c, ti0Var.f41551c, this.d);
        si0Var.setDelegate(new db.a(16));
        return new f2.m1(si0Var);
    }
}
