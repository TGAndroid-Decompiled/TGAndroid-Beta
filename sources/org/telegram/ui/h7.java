package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class h7 extends mq0 {
    public org.telegram.ui.Components.uj0 f47614a;
    public final t7 f47615b;

    public h7(t7 t7Var) {
        this.f47615b = t7Var;
    }

    @Override
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Cells.n7 n7Var;
        org.telegram.ui.Components.uj0 listView = this.f47615b.getListView();
        int i10 = 0;
        while (true) {
            if (i10 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i10);
                if (RecyclerView.R(childAt) == i7 && (childAt instanceof org.telegram.ui.Cells.n7)) {
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
        uq0 uq0Var = new uq0();
        uq0Var.f51998b = iArr[0];
        uq0Var.f51999c = iArr[1];
        uq0Var.d = this.f47614a;
        ImageReceiver imageReceiver = n7Var.f30744c;
        uq0Var.f51997a = imageReceiver;
        uq0Var.f52000e = imageReceiver.p();
        uq0Var.f52005k = n7Var.getScaleX();
        return uq0Var;
    }
}
