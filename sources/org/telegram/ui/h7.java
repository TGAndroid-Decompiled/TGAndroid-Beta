package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class h7 extends lu0 {
    public org.telegram.ui.Components.wl0 f34134a;
    public final s7 f34135b;

    public h7(s7 s7Var) {
        this.f34135b = s7Var;
    }

    @Override
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.wl0 listView = this.f34135b.getListView();
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
        vu0 vu0Var = new vu0();
        vu0Var.f38821b = iArr[0];
        vu0Var.f38822c = iArr[1];
        vu0Var.d = this.f34134a;
        ImageReceiver imageReceiver = t7Var.f21215c;
        vu0Var.f38820a = imageReceiver;
        vu0Var.e = imageReceiver.getBitmapSafe();
        vu0Var.f38827k = t7Var.getScaleX();
        return vu0Var;
    }
}
