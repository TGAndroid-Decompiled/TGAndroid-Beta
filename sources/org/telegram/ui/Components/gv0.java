package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class gv0 extends org.telegram.ui.uu0 {
    public final hv0 f26852a;

    public gv0(hv0 hv0Var) {
        this.f26852a = hv0Var;
    }

    @Override
    public final org.telegram.ui.ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        jv0 jv0Var = this.f26852a.f27155c;
        uu0 uu0Var = jv0Var.f27796r;
        if (uu0Var != null) {
            int childCount = uu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = jv0Var.f27796r.getChildAt(i11);
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
                    org.telegram.ui.ev0 ev0Var = new org.telegram.ui.ev0();
                    ev0Var.f37401b = iArr[0];
                    ev0Var.f37402c = childAt.getPaddingTop() + iArr[1];
                    ev0Var.d = jv0Var.f27796r;
                    ev0Var.f37410m = null;
                    ev0Var.f37400a = imageReceiver;
                    if (z10) {
                        ev0Var.f37403e = imageReceiver.getBitmapSafe();
                    }
                    ev0Var.h = imageReceiver.getRoundRadius(true);
                    ev0Var.f37407j = 0;
                    ev0Var.f37406i = 0;
                    return ev0Var;
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
