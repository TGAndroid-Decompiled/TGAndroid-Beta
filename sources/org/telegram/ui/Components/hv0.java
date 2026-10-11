package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class hv0 extends org.telegram.ui.tu0 {
    public final iv0 f27084a;

    public hv0(iv0 iv0Var) {
        this.f27084a = iv0Var;
    }

    @Override
    public final org.telegram.ui.dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        kv0 kv0Var = this.f27084a.f27472c;
        vu0 vu0Var = kv0Var.f28093r;
        if (vu0Var != null) {
            int childCount = vu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = kv0Var.f28093r.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.u1) && messageObject != null && (messageObject2 = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject2.getId() == messageObject.getId()) {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                        imageReceiver = u1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                    } else {
                        imageReceiver = u1Var.F2(i10);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.dv0 dv0Var = new org.telegram.ui.dv0();
                    dv0Var.f37114b = iArr[0];
                    dv0Var.f37115c = childAt.getPaddingTop() + iArr[1];
                    dv0Var.d = kv0Var.f28093r;
                    dv0Var.f37123m = null;
                    dv0Var.f37113a = imageReceiver;
                    if (z10) {
                        dv0Var.f37116e = imageReceiver.getBitmapSafe();
                    }
                    dv0Var.h = imageReceiver.getRoundRadius(true);
                    dv0Var.f37120j = 0;
                    dv0Var.f37119i = 0;
                    return dv0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
