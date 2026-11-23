package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class g7 extends pq0 {
    public org.telegram.ui.Components.ek0 f47934a;
    public final s7 f47935b;

    public g7(s7 s7Var) {
        this.f47935b = s7Var;
    }

    @Override
    public final xq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Cells.p7 p7Var;
        org.telegram.ui.Components.ek0 listView = this.f47935b.getListView();
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
        xq0 xq0Var = new xq0();
        xq0Var.f53899b = iArr[0];
        xq0Var.f53900c = iArr[1];
        xq0Var.d = this.f47934a;
        ImageReceiver imageReceiver = p7Var.f31223c;
        xq0Var.f53898a = imageReceiver;
        xq0Var.f53901e = imageReceiver.p();
        xq0Var.f53906k = p7Var.getScaleX();
        return xq0Var;
    }
}
