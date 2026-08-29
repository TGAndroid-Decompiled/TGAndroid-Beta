package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class f7 extends pt0 {
    public org.telegram.ui.Components.jl0 f38008a;
    public final q7 f38009b;

    public f7(q7 q7Var) {
        this.f38009b = q7Var;
    }

    @Override
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.p7 p7Var;
        org.telegram.ui.Components.jl0 listView = this.f38009b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i11);
                if (RecyclerView.R(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.p7)) {
                    p7Var = (org.telegram.ui.Cells.p7) childAt;
                    break;
                }
                i11++;
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
        zt0 zt0Var = new zt0();
        zt0Var.f45317b = iArr[0];
        zt0Var.f45318c = iArr[1];
        zt0Var.d = this.f38008a;
        ImageReceiver imageReceiver = p7Var.f24978c;
        zt0Var.f45316a = imageReceiver;
        zt0Var.f45319e = imageReceiver.getBitmapSafe();
        zt0Var.f45324k = p7Var.getScaleX();
        return zt0Var;
    }
}
