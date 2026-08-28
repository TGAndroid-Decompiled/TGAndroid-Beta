package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class it0 extends org.telegram.ui.rt0 {
    public final jt0 f29517a;

    public it0(jt0 jt0Var) {
        this.f29517a = jt0Var;
    }

    @Override
    public final org.telegram.ui.bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        lt0 lt0Var = this.f29517a.f29839c;
        ws0 ws0Var = lt0Var.f30549r;
        if (ws0Var != null) {
            int childCount = ws0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = lt0Var.f30549r.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.t1) && messageObject != null && (messageObject2 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject2.getId() == messageObject.getId()) {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    if (arrayList != null && i9 >= 0 && i9 < arrayList.size()) {
                        imageReceiver = t1Var.F2(messageObject2.pollMediaMapping.get(i9).intValue());
                    } else {
                        imageReceiver = t1Var.F2(i9);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.bu0 bu0Var = new org.telegram.ui.bu0();
                    bu0Var.f36979b = iArr[0];
                    bu0Var.f36980c = childAt.getPaddingTop() + iArr[1];
                    bu0Var.d = lt0Var.f30549r;
                    bu0Var.f36988m = null;
                    bu0Var.f36978a = imageReceiver;
                    if (z10) {
                        bu0Var.f36981e = imageReceiver.getBitmapSafe();
                    }
                    bu0Var.h = imageReceiver.getRoundRadius(true);
                    bu0Var.f36985j = 0;
                    bu0Var.f36984i = 0;
                    return bu0Var;
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
