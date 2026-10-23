package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class bv0 extends org.telegram.ui.cu0 {
    public final cv0 f25155a;

    public bv0(cv0 cv0Var) {
        this.f25155a = cv0Var;
    }

    @Override
    public final org.telegram.ui.mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        ev0 ev0Var = this.f25155a.f25439c;
        pu0 pu0Var = ev0Var.f26083r;
        if (pu0Var != null) {
            int childCount = pu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ev0Var.f26083r.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.t1) && messageObject != null && (messageObject2 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject2.getId() == messageObject.getId()) {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                        imageReceiver = t1Var.E2(messageObject2.pollMediaMapping.get(i10).intValue());
                    } else {
                        imageReceiver = t1Var.E2(i10);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.mu0 mu0Var = new org.telegram.ui.mu0();
                    mu0Var.f39693b = iArr[0];
                    mu0Var.f39694c = childAt.getPaddingTop() + iArr[1];
                    mu0Var.d = ev0Var.f26083r;
                    mu0Var.f39701m = null;
                    mu0Var.f39692a = imageReceiver;
                    if (z10) {
                        mu0Var.e = imageReceiver.getBitmapSafe();
                    }
                    mu0Var.h = imageReceiver.getRoundRadius(true);
                    mu0Var.f39698j = 0;
                    mu0Var.f39697i = 0;
                    return mu0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
