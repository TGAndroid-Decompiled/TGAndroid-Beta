package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class g7 extends rt0 {
    public org.telegram.ui.Components.wk0 f38432a;
    public final r7 f38433b;

    public g7(r7 r7Var) {
        this.f38433b = r7Var;
    }

    @Override
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        org.telegram.ui.Cells.r7 r7Var;
        org.telegram.ui.Components.wk0 listView = this.f38433b.getListView();
        int i10 = 0;
        while (true) {
            if (i10 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i10);
                if (RecyclerView.R(childAt) == i9 && (childAt instanceof org.telegram.ui.Cells.r7)) {
                    r7Var = (org.telegram.ui.Cells.r7) childAt;
                    break;
                }
                i10++;
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
        bu0 bu0Var = new bu0();
        bu0Var.f36979b = iArr[0];
        bu0Var.f36980c = iArr[1];
        bu0Var.d = this.f38432a;
        ImageReceiver imageReceiver = r7Var.f25094c;
        bu0Var.f36978a = imageReceiver;
        bu0Var.f36981e = imageReceiver.getBitmapSafe();
        bu0Var.f36986k = r7Var.getScaleX();
        return bu0Var;
    }
}
