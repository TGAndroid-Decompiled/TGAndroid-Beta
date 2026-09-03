package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class l7 extends fu0 {
    public org.telegram.ui.Components.rl0 f35665a;
    public final w7 f35666b;

    public l7(w7 w7Var) {
        this.f35666b = w7Var;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        org.telegram.ui.Cells.q7 q7Var;
        org.telegram.ui.Components.rl0 listView = this.f35666b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i11);
                if (RecyclerView.R(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.q7)) {
                    q7Var = (org.telegram.ui.Cells.q7) childAt;
                    break;
                }
                i11++;
            } else {
                q7Var = null;
                break;
            }
        }
        if (q7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        q7Var.getLocationInWindow(iArr);
        qu0 qu0Var = new qu0();
        qu0Var.f37488b = iArr[0];
        qu0Var.f37489c = iArr[1];
        qu0Var.d = this.f35665a;
        ImageReceiver imageReceiver = q7Var.f21702c;
        qu0Var.f37487a = imageReceiver;
        qu0Var.e = imageReceiver.getBitmapSafe();
        qu0Var.f37494k = q7Var.getScaleX();
        return qu0Var;
    }
}
