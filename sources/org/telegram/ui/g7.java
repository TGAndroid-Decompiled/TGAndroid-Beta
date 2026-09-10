package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class g7 extends tu0 {
    public org.telegram.ui.Components.vl0 f33028a;
    public final r7 f33029b;

    public g7(r7 r7Var) {
        this.f33029b = r7Var;
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.u7 u7Var;
        org.telegram.ui.Components.vl0 listView = this.f33029b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i11);
                if (RecyclerView.R(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.u7)) {
                    u7Var = (org.telegram.ui.Cells.u7) childAt;
                    break;
                }
                i11++;
            } else {
                u7Var = null;
                break;
            }
        }
        if (u7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        u7Var.getLocationInWindow(iArr);
        ev0 ev0Var = new ev0();
        ev0Var.f32617b = iArr[0];
        ev0Var.f32618c = iArr[1];
        ev0Var.d = this.f33028a;
        ImageReceiver imageReceiver = u7Var.f20497c;
        ev0Var.f32616a = imageReceiver;
        ev0Var.e = imageReceiver.getBitmapSafe();
        ev0Var.f32623k = u7Var.getScaleX();
        return ev0Var;
    }
}
