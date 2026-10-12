package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class j7 extends wu0 {
    public org.telegram.ui.Components.wm0 f39110a;
    public final u7 f39111b;

    public j7(u7 u7Var) {
        this.f39111b = u7Var;
    }

    @Override
    public final gv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.wm0 listView = this.f39111b.getListView();
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
        gv0 gv0Var = new gv0();
        gv0Var.f38148b = iArr[0];
        gv0Var.f38149c = iArr[1];
        gv0Var.d = this.f39110a;
        ImageReceiver imageReceiver = t7Var.f22838c;
        gv0Var.f38147a = imageReceiver;
        gv0Var.f38150e = imageReceiver.getBitmapSafe();
        gv0Var.f38155k = t7Var.getScaleX();
        return gv0Var;
    }
}
