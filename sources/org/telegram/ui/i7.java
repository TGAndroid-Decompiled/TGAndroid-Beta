package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class i7 extends tu0 {
    public org.telegram.ui.Components.yl0 f34488a;
    public final t7 f34489b;

    public i7(t7 t7Var) {
        this.f34489b = t7Var;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.u7 u7Var;
        org.telegram.ui.Components.yl0 listView = this.f34489b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i11);
                if (RecyclerView.S(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.u7)) {
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
        dv0 dv0Var = new dv0();
        dv0Var.f33164b = iArr[0];
        dv0Var.f33165c = iArr[1];
        dv0Var.d = this.f34488a;
        ImageReceiver imageReceiver = u7Var.f21638c;
        dv0Var.f33163a = imageReceiver;
        dv0Var.e = imageReceiver.getBitmapSafe();
        dv0Var.f33170k = u7Var.getScaleX();
        return dv0Var;
    }
}
