package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class h7 extends nq0 {
    public org.telegram.ui.Components.pj0 f46230a;
    public final t7 f46231b;

    public h7(t7 t7Var) {
        this.f46231b = t7Var;
    }

    @Override
    public final wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.ui.Cells.o7 o7Var;
        org.telegram.ui.Components.pj0 listView = this.f46231b.getListView();
        int i10 = 0;
        while (true) {
            if (i10 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i10);
                if (RecyclerView.R(childAt) == i7 && (childAt instanceof org.telegram.ui.Cells.o7)) {
                    o7Var = (org.telegram.ui.Cells.o7) childAt;
                    break;
                }
                i10++;
            } else {
                o7Var = null;
                break;
            }
        }
        if (o7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        o7Var.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.f51479b = iArr[0];
        wq0Var.f51480c = iArr[1];
        wq0Var.d = this.f46230a;
        ImageReceiver imageReceiver = o7Var.f29660c;
        wq0Var.f51478a = imageReceiver;
        wq0Var.f51481e = imageReceiver.p();
        wq0Var.f51486k = o7Var.getScaleX();
        return wq0Var;
    }
}
