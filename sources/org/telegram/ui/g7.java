package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class g7 extends oq0 {
    public org.telegram.ui.Components.ek0 f47983a;
    public final s7 f47984b;

    public g7(s7 s7Var) {
        this.f47984b = s7Var;
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Cells.p7 p7Var;
        org.telegram.ui.Components.ek0 listView = this.f47984b.getListView();
        int i10 = 0;
        while (true) {
            if (i10 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i10);
                if (RecyclerView.R(childAt) == i7 && (childAt instanceof org.telegram.ui.Cells.p7)) {
                    p7Var = (org.telegram.ui.Cells.p7) childAt;
                    break;
                }
                i10++;
            } else {
                p7Var = null;
                break;
            }
        }
        if (p7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        p7Var.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.f53494b = iArr[0];
        wq0Var.f53495c = iArr[1];
        wq0Var.d = this.f47983a;
        ImageReceiver imageReceiver = p7Var.f31254c;
        wq0Var.f53493a = imageReceiver;
        wq0Var.f53496e = imageReceiver.p();
        wq0Var.f53501k = p7Var.getScaleX();
        return wq0Var;
    }
}
