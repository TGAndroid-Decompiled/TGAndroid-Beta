package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class k7 extends bu0 {
    public org.telegram.ui.Components.im0 f38416a;
    public final v7 f38417b;

    public k7(v7 v7Var) {
        this.f38417b = v7Var;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.s7 s7Var;
        org.telegram.ui.Components.im0 listView = this.f38417b.getListView();
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
        lu0 lu0Var = new lu0();
        lu0Var.f38962b = iArr[0];
        lu0Var.f38963c = iArr[1];
        lu0Var.d = this.f38416a;
        ImageReceiver imageReceiver = s7Var.f23030c;
        lu0Var.f38961a = imageReceiver;
        lu0Var.e = imageReceiver.getBitmapSafe();
        lu0Var.f38968k = s7Var.getScaleX();
        return lu0Var;
    }
}
