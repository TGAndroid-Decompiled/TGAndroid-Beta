package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class fv0 extends org.telegram.ui.gu0 {
    public final gv0 f28323a;

    public fv0(gv0 gv0Var) {
        this.f28323a = gv0Var;
    }

    @Override
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject2;
        iv0 iv0Var = this.f28323a.f28722c;
        su0 su0Var = iv0Var.f29386r;
        if (su0Var != null) {
            int childCount = su0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = iv0Var.f29386r.getChildAt(i11);
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
                    org.telegram.ui.qu0 qu0Var = new org.telegram.ui.qu0();
                    qu0Var.f42920b = iArr[0];
                    qu0Var.f42921c = childAt.getPaddingTop() + iArr[1];
                    qu0Var.d = iv0Var.f29386r;
                    qu0Var.f42928m = null;
                    qu0Var.f42919a = imageReceiver;
                    if (z10) {
                        qu0Var.e = imageReceiver.getBitmapSafe();
                    }
                    qu0Var.h = imageReceiver.getRoundRadius(true);
                    qu0Var.f42925j = 0;
                    qu0Var.f42924i = 0;
                    return qu0Var;
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
