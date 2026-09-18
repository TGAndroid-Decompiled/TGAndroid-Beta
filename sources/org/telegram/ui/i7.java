package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class i7 extends tu0 {
    public org.telegram.ui.Components.wl0 f34441a;
    public final t7 f34442b;

    public i7(t7 t7Var) {
        this.f34442b = t7Var;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.wl0 listView = this.f34442b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i11);
                if (RecyclerView.S(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.t7)) {
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
        dv0Var.f33093b = iArr[0];
        dv0Var.f33094c = iArr[1];
        dv0Var.d = this.f34441a;
        ImageReceiver imageReceiver = t7Var.f21178c;
        dv0Var.f33092a = imageReceiver;
        dv0Var.e = imageReceiver.getBitmapSafe();
        dv0Var.f33099k = t7Var.getScaleX();
        return dv0Var;
    }
}
