package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class bu0 extends org.telegram.ui.fu0 {
    public final cu0 f25692a;

    public bu0(cu0 cu0Var) {
        this.f25692a = cu0Var;
    }

    @Override
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        eu0 eu0Var = this.f25692a.f26043c;
        pt0 pt0Var = eu0Var.f26667r;
        if (pt0Var != null) {
            int childCount = pt0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = eu0Var.f26667r.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.t1) && messageObject != null && (messageObject2 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject2.getId() == messageObject.getId()) {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                        imageReceiver = t1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                    } else {
                        imageReceiver = t1Var.F2(i10);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.qu0 qu0Var = new org.telegram.ui.qu0();
                    qu0Var.f40679b = iArr[0];
                    qu0Var.f40680c = childAt.getPaddingTop() + iArr[1];
                    qu0Var.d = eu0Var.f26667r;
                    qu0Var.f40688m = null;
                    qu0Var.f40678a = imageReceiver;
                    if (z4) {
                        qu0Var.f40681e = imageReceiver.getBitmapSafe();
                    }
                    qu0Var.h = imageReceiver.getRoundRadius(true);
                    qu0Var.f40685j = 0;
                    qu0Var.f40684i = 0;
                    return qu0Var;
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
