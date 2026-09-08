package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class bu0 extends org.telegram.ui.su0 {
    public final cu0 f24825a;

    public bu0(cu0 cu0Var) {
        this.f24825a = cu0Var;
    }

    @Override
    public final org.telegram.ui.cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        eu0 eu0Var = this.f24825a.f25124c;
        pt0 pt0Var = eu0Var.f25817r;
        if (pt0Var != null) {
            int childCount = pt0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = eu0Var.f25817r.getChildAt(i11);
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
                    org.telegram.ui.cv0 cv0Var = new org.telegram.ui.cv0();
                    cv0Var.f35568b = iArr[0];
                    cv0Var.f35569c = childAt.getPaddingTop() + iArr[1];
                    cv0Var.d = eu0Var.f25817r;
                    cv0Var.f35577m = null;
                    cv0Var.f35567a = imageReceiver;
                    if (z10) {
                        cv0Var.f35570e = imageReceiver.getBitmapSafe();
                    }
                    cv0Var.h = imageReceiver.getRoundRadius(true);
                    cv0Var.f35574j = 0;
                    cv0Var.f35573i = 0;
                    return cv0Var;
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
