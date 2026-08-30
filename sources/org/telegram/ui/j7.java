package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class j7 extends yt0 {
    public org.telegram.ui.Components.sl0 f35247a;
    public final u7 f35248b;

    public j7(u7 u7Var) {
        this.f35248b = u7Var;
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        org.telegram.ui.Cells.r7 r7Var;
        org.telegram.ui.Components.sl0 listView = this.f35248b.getListView();
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
        ju0 ju0Var = new ju0();
        ju0Var.f35496b = iArr[0];
        ju0Var.f35497c = iArr[1];
        ju0Var.d = this.f35247a;
        ImageReceiver imageReceiver = r7Var.f21769c;
        ju0Var.f35495a = imageReceiver;
        ju0Var.e = imageReceiver.getBitmapSafe();
        ju0Var.f35502k = r7Var.getScaleX();
        return ju0Var;
    }
}
