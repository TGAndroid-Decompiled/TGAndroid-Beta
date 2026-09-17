package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class h7 extends su0 {
    public org.telegram.ui.Components.ll0 f36894a;
    public final s7 f36895b;

    public h7(s7 s7Var) {
        this.f36895b = s7Var;
    }

    @Override
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.ll0 listView = this.f36895b.getListView();
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
        cv0Var.f35542b = iArr[0];
        cv0Var.f35543c = iArr[1];
        cv0Var.d = this.f36894a;
        ImageReceiver imageReceiver = t7Var.f23263c;
        cv0Var.f35541a = imageReceiver;
        cv0Var.f35544e = imageReceiver.getBitmapSafe();
        cv0Var.f35549k = t7Var.getScaleX();
        return cv0Var;
    }
}
