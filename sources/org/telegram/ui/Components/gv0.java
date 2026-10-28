package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class gv0 extends org.telegram.ui.iu0 {
    public final hv0 f28762a;

    public gv0(hv0 hv0Var) {
        this.f28762a = hv0Var;
    }

    @Override
    public final org.telegram.ui.su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject2;
        jv0 jv0Var = this.f28762a.f29085c;
        tu0 tu0Var = jv0Var.f29773r;
        if (tu0Var != null) {
            int childCount = tu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = jv0Var.f29773r.getChildAt(i11);
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
                    org.telegram.ui.su0 su0Var = new org.telegram.ui.su0();
                    su0Var.f43407b = iArr[0];
                    su0Var.f43408c = childAt.getPaddingTop() + iArr[1];
                    su0Var.d = jv0Var.f29773r;
                    su0Var.f43415m = null;
                    su0Var.f43406a = imageReceiver;
                    if (z10) {
                        su0Var.e = imageReceiver.getBitmapSafe();
                    }
                    su0Var.h = imageReceiver.getRoundRadius(true);
                    su0Var.f43412j = 0;
                    su0Var.f43411i = 0;
                    return su0Var;
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
