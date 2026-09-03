package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ei0 extends f2.o0 {
    public final Context f33820c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final ui0 e;

    public ei0(ui0 ui0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = ui0Var;
        this.f33820c = context;
        this.d = f6Var;
    }

    @Override
    public final int h() {
        return this.e.K.size();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        ui0 ui0Var = this.e;
        ArrayList arrayList = ui0Var.K;
        boolean z4 = true;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) l1Var.f5774a;
        MessageObject.GroupedMessages l10 = ui0Var.l(messageObject);
        int i11 = 0;
        if (l10 == null) {
            z4 = false;
        }
        s1Var.setInvalidatesParent(z4);
        s1Var.X3(messageObject, l10, false, false, false, false);
        if (!ui0Var.M.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 == i11 && !messageObject.needDrawForwarded()) {
            ui0Var.N = s1Var;
            Point point = AndroidUtilities.displaySize;
            s1Var.Z3(point.x, point.y);
            ui0Var.O = messageObject.getId();
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        ui0 ui0Var = this.e;
        ti0 ti0Var = new ti0(ui0Var, this.f33820c, ui0Var.f38829c, this.d);
        ti0Var.setDelegate(new ab.a(17));
        return new f2.l1(ti0Var);
    }
}
