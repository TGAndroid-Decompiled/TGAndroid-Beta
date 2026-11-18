package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class g7 extends oq0 {
    public org.telegram.ui.Components.ck0 f47913a;
    public final s7 f47914b;

    public g7(s7 s7Var) {
        this.f47914b = s7Var;
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Cells.p7 p7Var;
        org.telegram.ui.Components.ck0 listView = this.f47914b.getListView();
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
        wq0Var.f53448b = iArr[0];
        wq0Var.f53449c = iArr[1];
        wq0Var.d = this.f47913a;
        ImageReceiver imageReceiver = p7Var.f31226c;
        wq0Var.f53447a = imageReceiver;
        wq0Var.f53450e = imageReceiver.p();
        wq0Var.f53455k = p7Var.getScaleX();
        return wq0Var;
    }
}
