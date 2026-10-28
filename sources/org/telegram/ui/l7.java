package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class l7 extends iu0 {
    public org.telegram.ui.Components.nm0 f40983a;
    public final x7 f40984b;

    public l7(x7 x7Var) {
        this.f40984b = x7Var;
    }

    @Override
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.w7 w7Var;
        org.telegram.ui.Components.nm0 listView = this.f40984b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i11);
                if (RecyclerView.R(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.w7)) {
                    w7Var = (org.telegram.ui.Cells.w7) childAt;
                    break;
                }
                i11++;
            } else {
                w7Var = null;
                break;
            }
        }
        if (w7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        w7Var.getLocationInWindow(iArr);
        su0 su0Var = new su0();
        su0Var.f43407b = iArr[0];
        su0Var.f43408c = iArr[1];
        su0Var.d = this.f40983a;
        ImageReceiver imageReceiver = w7Var.f25640c;
        su0Var.f43406a = imageReceiver;
        su0Var.e = imageReceiver.getBitmapSafe();
        su0Var.f43413k = w7Var.getScaleX();
        return su0Var;
    }
}
