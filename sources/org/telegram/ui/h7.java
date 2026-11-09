package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class h7 extends pq0 {
    public org.telegram.ui.Components.qj0 f46181a;
    public final t7 f46182b;

    public h7(t7 t7Var) {
        this.f46182b = t7Var;
    }

    @Override
    public final yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.ui.Cells.o7 o7Var;
        org.telegram.ui.Components.qj0 listView = this.f46182b.getListView();
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
        yq0 yq0Var = new yq0();
        yq0Var.f52160b = iArr[0];
        yq0Var.f52161c = iArr[1];
        yq0Var.d = this.f46181a;
        ImageReceiver imageReceiver = o7Var.f29668c;
        yq0Var.f52159a = imageReceiver;
        yq0Var.f52162e = imageReceiver.p();
        yq0Var.f52167k = o7Var.getScaleX();
        return yq0Var;
    }
}
