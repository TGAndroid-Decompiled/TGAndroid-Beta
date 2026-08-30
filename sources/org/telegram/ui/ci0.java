package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ci0 extends f2.o0 {
    public final Context f33381c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final si0 e;

    public ci0(si0 si0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = si0Var;
        this.f33381c = context;
        this.d = f6Var;
    }

    @Override
    public final int h() {
        return this.e.K.size();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        si0 si0Var = this.e;
        ArrayList arrayList = si0Var.K;
        boolean z4 = true;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) l1Var.f5785a;
        MessageObject.GroupedMessages l10 = si0Var.l(messageObject);
        int i11 = 0;
        if (l10 == null) {
            z4 = false;
        }
        t1Var.setInvalidatesParent(z4);
        t1Var.X3(messageObject, l10, false, false, false, false);
        if (!si0Var.M.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 == i11 && !messageObject.needDrawForwarded()) {
            si0Var.N = t1Var;
            Point point = AndroidUtilities.displaySize;
            t1Var.Z3(point.x, point.y);
            si0Var.O = messageObject.getId();
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        si0 si0Var = this.e;
        ri0 ri0Var = new ri0(si0Var, this.f33381c, si0Var.f38354c, this.d);
        ri0Var.setDelegate(new db.a(16));
        return new f2.l1(ri0Var);
    }
}
