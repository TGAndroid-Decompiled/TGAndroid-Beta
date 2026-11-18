package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class g7 extends oq0 {
    public org.telegram.ui.Components.ck0 f47949a;
    public final s7 f47950b;

    public g7(s7 s7Var) {
        this.f47950b = s7Var;
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Cells.o7 o7Var;
        org.telegram.ui.Components.ck0 listView = this.f47950b.getListView();
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
        wq0Var.f53497b = iArr[0];
        wq0Var.f53498c = iArr[1];
        wq0Var.d = this.f47949a;
        ImageReceiver imageReceiver = o7Var.f31179c;
        wq0Var.f53496a = imageReceiver;
        wq0Var.f53499e = imageReceiver.p();
        wq0Var.f53504k = o7Var.getScaleX();
        return wq0Var;
    }
}
