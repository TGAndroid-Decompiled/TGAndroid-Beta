package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class k7 extends zt0 {
    public org.telegram.ui.Components.jm0 f38433a;
    public final v7 f38434b;

    public k7(v7 v7Var) {
        this.f38434b = v7Var;
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.s7 s7Var;
        org.telegram.ui.Components.jm0 listView = this.f38434b.getListView();
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
        ju0 ju0Var = new ju0();
        ju0Var.f38352b = iArr[0];
        ju0Var.f38353c = iArr[1];
        ju0Var.d = this.f38433a;
        ImageReceiver imageReceiver = s7Var.f23027c;
        ju0Var.f38351a = imageReceiver;
        ju0Var.e = imageReceiver.getBitmapSafe();
        ju0Var.f38358k = s7Var.getScaleX();
        return ju0Var;
    }
}
