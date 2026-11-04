package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class i7 extends eq0 {
    public org.telegram.ui.Components.tj0 f46129a;
    public final u7 f46130b;

    public i7(u7 u7Var) {
        this.f46130b = u7Var;
    }

    @Override
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        org.telegram.ui.Cells.n7 n7Var;
        org.telegram.ui.Components.tj0 listView = this.f46130b.getListView();
        int i10 = 0;
        while (true) {
            if (i10 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i10);
                if (RecyclerView.R(childAt) == i3 && (childAt instanceof org.telegram.ui.Cells.n7)) {
                    n7Var = (org.telegram.ui.Cells.n7) childAt;
                    break;
                }
                i10++;
            } else {
                n7Var = null;
                break;
            }
        }
        if (n7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        n7Var.getLocationInWindow(iArr);
        mq0 mq0Var = new mq0();
        mq0Var.f47752b = iArr[0];
        mq0Var.f47753c = iArr[1];
        mq0Var.d = this.f46129a;
        ImageReceiver imageReceiver = n7Var.f29683c;
        mq0Var.f47751a = imageReceiver;
        mq0Var.f47754e = imageReceiver.p();
        mq0Var.f47759k = n7Var.getScaleX();
        return mq0Var;
    }
}
