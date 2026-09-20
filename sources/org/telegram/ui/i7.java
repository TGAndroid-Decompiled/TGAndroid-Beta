package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class i7 extends tu0 {
    public org.telegram.ui.Components.vl0 f34468a;
    public final t7 f34469b;

    public i7(t7 t7Var) {
        this.f34469b = t7Var;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.u7 u7Var;
        org.telegram.ui.Components.vl0 listView = this.f34469b.getListView();
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
        dv0Var.f33144b = iArr[0];
        dv0Var.f33145c = iArr[1];
        dv0Var.d = this.f34468a;
        ImageReceiver imageReceiver = u7Var.f21623c;
        dv0Var.f33143a = imageReceiver;
        dv0Var.e = imageReceiver.getBitmapSafe();
        dv0Var.f33150k = u7Var.getScaleX();
        return dv0Var;
    }
}
