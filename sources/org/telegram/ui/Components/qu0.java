package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class qu0 extends org.telegram.ui.lu0 {
    public final ru0 f27727a;

    public qu0(ru0 ru0Var) {
        this.f27727a = ru0Var;
    }

    @Override
    public final org.telegram.ui.vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        tu0 tu0Var = this.f27727a.f28134c;
        eu0 eu0Var = tu0Var.f28661r;
        if (eu0Var != null) {
            int childCount = eu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = tu0Var.f28661r.getChildAt(i11);
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
                    org.telegram.ui.vu0 vu0Var = new org.telegram.ui.vu0();
                    vu0Var.f38908b = iArr[0];
                    vu0Var.f38909c = childAt.getPaddingTop() + iArr[1];
                    vu0Var.d = tu0Var.f28661r;
                    vu0Var.f38916m = null;
                    vu0Var.f38907a = imageReceiver;
                    if (z10) {
                        vu0Var.e = imageReceiver.getBitmapSafe();
                    }
                    vu0Var.h = imageReceiver.getRoundRadius(true);
                    vu0Var.f38913j = 0;
                    vu0Var.f38912i = 0;
                    return vu0Var;
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
