package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class l7 extends gu0 {
    public org.telegram.ui.Components.mm0 f41155a;
    public final x7 f41156b;

    public l7(x7 x7Var) {
        this.f41156b = x7Var;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.w7 w7Var;
        org.telegram.ui.Components.mm0 listView = this.f41156b.getListView();
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
        qu0 qu0Var = new qu0();
        qu0Var.f42917b = iArr[0];
        qu0Var.f42918c = iArr[1];
        qu0Var.d = this.f41155a;
        ImageReceiver imageReceiver = w7Var.f25636c;
        qu0Var.f42916a = imageReceiver;
        qu0Var.e = imageReceiver.getBitmapSafe();
        qu0Var.f42923k = w7Var.getScaleX();
        return qu0Var;
    }
}
