package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class j7 extends au0 {
    public org.telegram.ui.Components.tl0 f38028a;
    public final u7 f38029b;

    public j7(u7 u7Var) {
        this.f38029b = u7Var;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        org.telegram.ui.Cells.r7 r7Var;
        org.telegram.ui.Components.tl0 listView = this.f38029b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i11);
                if (RecyclerView.R(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.r7)) {
                    r7Var = (org.telegram.ui.Cells.r7) childAt;
                    break;
                }
                i11++;
            } else {
                r7Var = null;
                break;
            }
        }
        if (r7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        r7Var.getLocationInWindow(iArr);
        lu0 lu0Var = new lu0();
        lu0Var.f38865b = iArr[0];
        lu0Var.f38866c = iArr[1];
        lu0Var.d = this.f38028a;
        ImageReceiver imageReceiver = r7Var.f23561c;
        lu0Var.f38864a = imageReceiver;
        lu0Var.f38867e = imageReceiver.getBitmapSafe();
        lu0Var.f38872k = r7Var.getScaleX();
        return lu0Var;
    }
}
