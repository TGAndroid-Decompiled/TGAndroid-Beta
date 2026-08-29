package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class tt0 extends org.telegram.ui.pt0 {
    public final ut0 f33040a;

    public tt0(ut0 ut0Var) {
        this.f33040a = ut0Var;
    }

    @Override
    public final org.telegram.ui.zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject2;
        wt0 wt0Var = this.f33040a.f33317c;
        ht0 ht0Var = wt0Var.f34492r;
        if (ht0Var != null) {
            int childCount = ht0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = wt0Var.f34492r.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.s1) && messageObject != null && (messageObject2 = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject2.getId() == messageObject.getId()) {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                        imageReceiver = s1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                    } else {
                        imageReceiver = s1Var.F2(i10);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.zt0 zt0Var = new org.telegram.ui.zt0();
                    zt0Var.f45317b = iArr[0];
                    zt0Var.f45318c = childAt.getPaddingTop() + iArr[1];
                    zt0Var.d = wt0Var.f34492r;
                    zt0Var.f45326m = null;
                    zt0Var.f45316a = imageReceiver;
                    if (z10) {
                        zt0Var.f45319e = imageReceiver.getBitmapSafe();
                    }
                    zt0Var.h = imageReceiver.getRoundRadius(true);
                    zt0Var.f45323j = 0;
                    zt0Var.f45322i = 0;
                    return zt0Var;
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
