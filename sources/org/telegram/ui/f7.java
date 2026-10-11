package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class f7 extends tu0 {
    public org.telegram.ui.Components.sm0 f37559a;
    public final q7 f37560b;

    public f7(q7 q7Var) {
        this.f37560b = q7Var;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.sm0 listView = this.f37560b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i11);
                if (RecyclerView.R(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.t7)) {
                    t7Var = (org.telegram.ui.Cells.t7) childAt;
                    break;
                }
                i11++;
            } else {
                t7Var = null;
                break;
            }
        }
        if (t7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        t7Var.getLocationInWindow(iArr);
        dv0 dv0Var = new dv0();
        dv0Var.f37114b = iArr[0];
        dv0Var.f37115c = iArr[1];
        dv0Var.d = this.f37559a;
        ImageReceiver imageReceiver = t7Var.f23057c;
        dv0Var.f37113a = imageReceiver;
        dv0Var.f37116e = imageReceiver.getBitmapSafe();
        dv0Var.f37121k = t7Var.getScaleX();
        return dv0Var;
    }
}
