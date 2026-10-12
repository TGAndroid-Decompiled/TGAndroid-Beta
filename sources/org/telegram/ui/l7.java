package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class l7 extends av0 {
    public org.telegram.ui.Components.mm0 f37860a;
    public final w7 f37861b;

    public l7(w7 w7Var) {
        this.f37861b = w7Var;
    }

    @Override
    public final kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.mm0 listView = this.f37861b.getListView();
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
        kv0 kv0Var = new kv0();
        kv0Var.f37752b = iArr[0];
        kv0Var.f37753c = iArr[1];
        kv0Var.d = this.f37860a;
        ImageReceiver imageReceiver = t7Var.f22101c;
        kv0Var.f37751a = imageReceiver;
        kv0Var.e = imageReceiver.getBitmapSafe();
        kv0Var.f37758k = t7Var.getScaleX();
        return kv0Var;
    }
}
