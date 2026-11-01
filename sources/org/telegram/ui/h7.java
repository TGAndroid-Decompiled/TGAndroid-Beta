package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class h7 extends xr0 {
    public org.telegram.ui.Components.uk0 f37714a;
    public final t7 f37715b;

    public h7(t7 t7Var) {
        this.f37715b = t7Var;
    }

    @Override
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.s7 s7Var;
        org.telegram.ui.Components.uk0 listView = this.f37715b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i11);
                if (RecyclerView.R(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.s7)) {
                    s7Var = (org.telegram.ui.Cells.s7) childAt;
                    break;
                }
                i11++;
            } else {
                s7Var = null;
                break;
            }
        }
        if (s7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        s7Var.getLocationInWindow(iArr);
        fs0 fs0Var = new fs0();
        fs0Var.f37216b = iArr[0];
        fs0Var.f37217c = iArr[1];
        fs0Var.d = this.f37714a;
        ImageReceiver imageReceiver = s7Var.f23022c;
        fs0Var.f37215a = imageReceiver;
        fs0Var.e = imageReceiver.p();
        fs0Var.f37222k = s7Var.getScaleX();
        return fs0Var;
    }
}
