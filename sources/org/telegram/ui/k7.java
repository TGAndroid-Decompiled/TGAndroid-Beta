package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class k7 extends cu0 {
    public org.telegram.ui.Components.mm0 f38839a;
    public final v7 f38840b;

    public k7(v7 v7Var) {
        this.f38840b = v7Var;
    }

    @Override
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.s7 s7Var;
        org.telegram.ui.Components.mm0 listView = this.f38840b.getListView();
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
        mu0 mu0Var = new mu0();
        mu0Var.f39693b = iArr[0];
        mu0Var.f39694c = iArr[1];
        mu0Var.d = this.f38839a;
        ImageReceiver imageReceiver = s7Var.f23263c;
        mu0Var.f39692a = imageReceiver;
        mu0Var.e = imageReceiver.getBitmapSafe();
        mu0Var.f39699k = s7Var.getScaleX();
        return mu0Var;
    }
}
