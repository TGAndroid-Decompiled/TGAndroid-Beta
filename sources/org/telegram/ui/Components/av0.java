package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class av0 extends org.telegram.ui.bu0 {
    public final bv0 f24819a;

    public av0(bv0 bv0Var) {
        this.f24819a = bv0Var;
    }

    @Override
    public final org.telegram.ui.lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        dv0 dv0Var = this.f24819a.f25108c;
        ou0 ou0Var = dv0Var.f25845r;
        if (ou0Var != null) {
            int childCount = ou0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = dv0Var.f25845r.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.t1) && messageObject != null && (messageObject2 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject2.getId() == messageObject.getId()) {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                        imageReceiver = t1Var.E2(messageObject2.pollMediaMapping.get(i10).intValue());
                    } else {
                        imageReceiver = t1Var.E2(i10);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.lu0 lu0Var = new org.telegram.ui.lu0();
                    lu0Var.f39382b = iArr[0];
                    lu0Var.f39383c = childAt.getPaddingTop() + iArr[1];
                    lu0Var.d = dv0Var.f25845r;
                    lu0Var.f39390m = null;
                    lu0Var.f39381a = imageReceiver;
                    if (z10) {
                        lu0Var.e = imageReceiver.getBitmapSafe();
                    }
                    lu0Var.h = imageReceiver.getRoundRadius(true);
                    lu0Var.f39387j = 0;
                    lu0Var.f39386i = 0;
                    return lu0Var;
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
