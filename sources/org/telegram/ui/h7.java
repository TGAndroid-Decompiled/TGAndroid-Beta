package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class h7 extends su0 {
    public org.telegram.ui.Components.ll0 f36893a;
    public final s7 f36894b;

    public h7(s7 s7Var) {
        this.f36894b = s7Var;
    }

    @Override
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.ll0 listView = this.f36894b.getListView();
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
        cv0 cv0Var = new cv0();
        cv0Var.f35541b = iArr[0];
        cv0Var.f35542c = iArr[1];
        cv0Var.d = this.f36893a;
        ImageReceiver imageReceiver = t7Var.f23262c;
        cv0Var.f35540a = imageReceiver;
        cv0Var.f35543e = imageReceiver.getBitmapSafe();
        cv0Var.f35548k = t7Var.getScaleX();
        return cv0Var;
    }
}
