package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class bv0 extends org.telegram.ui.zu0 {
    public final cv0 f23556a;

    public bv0(cv0 cv0Var) {
        this.f23556a = cv0Var;
    }

    @Override
    public final org.telegram.ui.jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        ev0 ev0Var = this.f23556a.f23902c;
        pu0 pu0Var = ev0Var.f24494r;
        if (pu0Var != null) {
            int childCount = pu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ev0Var.f24494r.getChildAt(i11);
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
                    org.telegram.ui.jv0 jv0Var = new org.telegram.ui.jv0();
                    jv0Var.f37146b = iArr[0];
                    jv0Var.f37147c = childAt.getPaddingTop() + iArr[1];
                    jv0Var.d = ev0Var.f24494r;
                    jv0Var.f37154m = null;
                    jv0Var.f37145a = imageReceiver;
                    if (z10) {
                        jv0Var.e = imageReceiver.getBitmapSafe();
                    }
                    jv0Var.h = imageReceiver.getRoundRadius(true);
                    jv0Var.f37151j = 0;
                    jv0Var.f37150i = 0;
                    return jv0Var;
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
