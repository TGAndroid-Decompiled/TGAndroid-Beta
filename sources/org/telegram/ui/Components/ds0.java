package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ds0 extends org.telegram.ui.mq0 {
    public final es0 f33029a;

    public ds0(es0 es0Var) {
        this.f33029a = es0Var;
    }

    @Override
    public final org.telegram.ui.vq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        gs0 gs0Var = this.f33029a.f33333c;
        rr0 rr0Var = gs0Var.f34038r;
        if (rr0Var != null) {
            int childCount = rr0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = gs0Var.f34038r.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.q1) && ijVar != null && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.f1() == ijVar.f1()) {
                    ArrayList arrayList = messageObject.f23259q0;
                    if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
                        imageReceiver = q1Var.S1(((Integer) messageObject.f23259q0.get(i7)).intValue());
                    } else {
                        imageReceiver = q1Var.S1(i7);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.vq0 vq0Var = new org.telegram.ui.vq0();
                    vq0Var.f50791b = iArr[0];
                    vq0Var.f50792c = childAt.getPaddingTop() + iArr[1];
                    vq0Var.d = gs0Var.f34038r;
                    vq0Var.f50800m = null;
                    vq0Var.f50790a = imageReceiver;
                    if (z9) {
                        vq0Var.f50793e = imageReceiver.p();
                    }
                    vq0Var.h = imageReceiver.E();
                    vq0Var.f50797j = 0;
                    vq0Var.f50796i = 0;
                    return vq0Var;
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
