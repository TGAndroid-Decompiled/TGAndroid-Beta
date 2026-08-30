package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class bu0 extends org.telegram.ui.yt0 {
    public final cu0 f23750a;

    public bu0(cu0 cu0Var) {
        this.f23750a = cu0Var;
    }

    @Override
    public final org.telegram.ui.ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        eu0 eu0Var = this.f23750a.f24051c;
        pt0 pt0Var = eu0Var.f24678r;
        if (pt0Var != null) {
            int childCount = pt0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = eu0Var.f24678r.getChildAt(i11);
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
                    org.telegram.ui.ju0 ju0Var = new org.telegram.ui.ju0();
                    ju0Var.f35496b = iArr[0];
                    ju0Var.f35497c = childAt.getPaddingTop() + iArr[1];
                    ju0Var.d = eu0Var.f24678r;
                    ju0Var.f35504m = null;
                    ju0Var.f35495a = imageReceiver;
                    if (z4) {
                        ju0Var.e = imageReceiver.getBitmapSafe();
                    }
                    ju0Var.h = imageReceiver.getRoundRadius(true);
                    ju0Var.f35501j = 0;
                    ju0Var.f35500i = 0;
                    return ju0Var;
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
