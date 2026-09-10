package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class lu0 extends org.telegram.ui.tu0 {
    public final mu0 f25113a;

    public lu0(mu0 mu0Var) {
        this.f25113a = mu0Var;
    }

    @Override
    public final org.telegram.ui.ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        ou0 ou0Var = this.f25113a.f25288c;
        zt0 zt0Var = ou0Var.f25917r;
        if (zt0Var != null) {
            int childCount = zt0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ou0Var.f25917r.getChildAt(i11);
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
                    org.telegram.ui.ev0 ev0Var = new org.telegram.ui.ev0();
                    ev0Var.f32617b = iArr[0];
                    ev0Var.f32618c = childAt.getPaddingTop() + iArr[1];
                    ev0Var.d = ou0Var.f25917r;
                    ev0Var.f32625m = null;
                    ev0Var.f32616a = imageReceiver;
                    if (z10) {
                        ev0Var.e = imageReceiver.getBitmapSafe();
                    }
                    ev0Var.h = imageReceiver.getRoundRadius(true);
                    ev0Var.f32622j = 0;
                    ev0Var.f32621i = 0;
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
