package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class pu0 extends org.telegram.ui.ou0 {
    public final qu0 f27464a;

    public pu0(qu0 qu0Var) {
        this.f27464a = qu0Var;
    }

    @Override
    public final org.telegram.ui.yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        su0 su0Var = this.f27464a.f27836c;
        du0 du0Var = su0Var.f28384r;
        if (du0Var != null) {
            int childCount = du0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = su0Var.f28384r.getChildAt(i11);
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
                    org.telegram.ui.yu0 yu0Var = new org.telegram.ui.yu0();
                    yu0Var.f40326b = iArr[0];
                    yu0Var.f40327c = childAt.getPaddingTop() + iArr[1];
                    yu0Var.d = su0Var.f28384r;
                    yu0Var.f40334m = null;
                    yu0Var.f40325a = imageReceiver;
                    if (z10) {
                        yu0Var.e = imageReceiver.getBitmapSafe();
                    }
                    yu0Var.h = imageReceiver.getRoundRadius(true);
                    yu0Var.f40331j = 0;
                    yu0Var.f40330i = 0;
                    return yu0Var;
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
