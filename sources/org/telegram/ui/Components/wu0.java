package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class wu0 extends org.telegram.ui.bu0 {
    public final xu0 f32219a;

    public wu0(xu0 xu0Var) {
        this.f32219a = xu0Var;
    }

    @Override
    public final org.telegram.ui.lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        zu0 zu0Var = this.f32219a.f32455c;
        ku0 ku0Var = zu0Var.f33030r;
        if (ku0Var != null) {
            int childCount = ku0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = zu0Var.f33030r.getChildAt(i11);
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
                    org.telegram.ui.lu0 lu0Var = new org.telegram.ui.lu0();
                    lu0Var.f38918b = iArr[0];
                    lu0Var.f38919c = childAt.getPaddingTop() + iArr[1];
                    lu0Var.d = zu0Var.f33030r;
                    lu0Var.f38926m = null;
                    lu0Var.f38917a = imageReceiver;
                    if (z10) {
                        lu0Var.e = imageReceiver.getBitmapSafe();
                    }
                    lu0Var.h = imageReceiver.getRoundRadius(true);
                    lu0Var.f38923j = 0;
                    lu0Var.f38922i = 0;
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
