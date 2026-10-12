package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class lv0 extends org.telegram.ui.wu0 {
    public final mv0 f28286a;

    public lv0(mv0 mv0Var) {
        this.f28286a = mv0Var;
    }

    @Override
    public final org.telegram.ui.gv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        ov0 ov0Var = this.f28286a.f28657c;
        zu0 zu0Var = ov0Var.f29313r;
        if (zu0Var != null) {
            int childCount = zu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ov0Var.f29313r.getChildAt(i11);
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
                    org.telegram.ui.gv0 gv0Var = new org.telegram.ui.gv0();
                    gv0Var.f38148b = iArr[0];
                    gv0Var.f38149c = childAt.getPaddingTop() + iArr[1];
                    gv0Var.d = ov0Var.f29313r;
                    gv0Var.f38157m = null;
                    gv0Var.f38147a = imageReceiver;
                    if (z10) {
                        gv0Var.f38150e = imageReceiver.getBitmapSafe();
                    }
                    gv0Var.h = imageReceiver.getRoundRadius(true);
                    gv0Var.f38154j = 0;
                    gv0Var.f38153i = 0;
                    return gv0Var;
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
