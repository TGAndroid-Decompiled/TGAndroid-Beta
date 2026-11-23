package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class h7 extends oq0 {
    public org.telegram.ui.Components.ek0 f48440a;
    public final t7 f48441b;

    public h7(t7 t7Var) {
        this.f48441b = t7Var;
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Cells.o7 o7Var;
        org.telegram.ui.Components.ek0 listView = this.f48441b.getListView();
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
        wq0Var.f53727b = iArr[0];
        wq0Var.f53728c = iArr[1];
        wq0Var.d = this.f48440a;
        ImageReceiver imageReceiver = o7Var.f31263c;
        wq0Var.f53726a = imageReceiver;
        wq0Var.f53729e = imageReceiver.p();
        wq0Var.f53734k = o7Var.getScaleX();
        return wq0Var;
    }
}
