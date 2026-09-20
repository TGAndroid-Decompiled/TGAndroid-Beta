package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class nu0 extends org.telegram.ui.tu0 {
    public final ou0 f26740a;

    public nu0(ou0 ou0Var) {
        this.f26740a = ou0Var;
    }

    @Override
    public final org.telegram.ui.dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        qu0 qu0Var = this.f26740a.f27044c;
        bu0 bu0Var = qu0Var.f27667r;
        if (bu0Var != null) {
            int childCount = bu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = qu0Var.f27667r.getChildAt(i11);
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
                    dv0Var.f33144b = iArr[0];
                    dv0Var.f33145c = childAt.getPaddingTop() + iArr[1];
                    dv0Var.d = qu0Var.f27667r;
                    dv0Var.f33152m = null;
                    dv0Var.f33143a = imageReceiver;
                    if (z10) {
                        dv0Var.e = imageReceiver.getBitmapSafe();
                    }
                    dv0Var.h = imageReceiver.getRoundRadius(true);
                    dv0Var.f33149j = 0;
                    dv0Var.f33148i = 0;
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
