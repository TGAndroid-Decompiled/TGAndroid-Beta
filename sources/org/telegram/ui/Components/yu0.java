package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class yu0 extends org.telegram.ui.zt0 {
    public final zu0 f32738a;

    public yu0(zu0 zu0Var) {
        this.f32738a = zu0Var;
    }

    @Override
    public final org.telegram.ui.ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        bv0 bv0Var = this.f32738a.f33050c;
        mu0 mu0Var = bv0Var.f25048r;
        if (mu0Var != null) {
            int childCount = mu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = bv0Var.f25048r.getChildAt(i11);
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
                    org.telegram.ui.ju0 ju0Var = new org.telegram.ui.ju0();
                    ju0Var.f38356b = iArr[0];
                    ju0Var.f38357c = childAt.getPaddingTop() + iArr[1];
                    ju0Var.d = bv0Var.f25048r;
                    ju0Var.f38364m = null;
                    ju0Var.f38355a = imageReceiver;
                    if (z10) {
                        ju0Var.e = imageReceiver.getBitmapSafe();
                    }
                    ju0Var.h = imageReceiver.getRoundRadius(true);
                    ju0Var.f38361j = 0;
                    ju0Var.f38360i = 0;
                    return ju0Var;
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
