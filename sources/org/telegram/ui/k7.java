package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class k7 extends ou0 {
    public org.telegram.ui.Components.yl0 f34918a;
    public final v7 f34919b;

    public k7(v7 v7Var) {
        this.f34919b = v7Var;
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.yl0 listView = this.f34919b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i11);
                if (RecyclerView.S(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.t7)) {
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
        yu0 yu0Var = new yu0();
        yu0Var.f40326b = iArr[0];
        yu0Var.f40327c = iArr[1];
        yu0Var.d = this.f34918a;
        ImageReceiver imageReceiver = t7Var.f21216c;
        yu0Var.f40325a = imageReceiver;
        yu0Var.e = imageReceiver.getBitmapSafe();
        yu0Var.f40332k = t7Var.getScaleX();
        return yu0Var;
    }
}
