package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ds0 extends org.telegram.ui.nq0 {
    public final es0 f33071a;

    public ds0(es0 es0Var) {
        this.f33071a = es0Var;
    }

    @Override
    public final org.telegram.ui.wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        gs0 gs0Var = this.f33071a.f33348c;
        rr0 rr0Var = gs0Var.f33994r;
        if (rr0Var != null) {
            int childCount = rr0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = gs0Var.f33994r.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.q1) && ijVar != null && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.f1() == ijVar.f1()) {
                    ArrayList arrayList = messageObject.f23266q0;
                    if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
                        imageReceiver = q1Var.S1(((Integer) messageObject.f23266q0.get(i7)).intValue());
                    } else {
                        imageReceiver = q1Var.S1(i7);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0();
                    wq0Var.f51477b = iArr[0];
                    wq0Var.f51478c = childAt.getPaddingTop() + iArr[1];
                    wq0Var.d = gs0Var.f33994r;
                    wq0Var.f51486m = null;
                    wq0Var.f51476a = imageReceiver;
                    if (z9) {
                        wq0Var.f51479e = imageReceiver.p();
                    }
                    wq0Var.h = imageReceiver.E();
                    wq0Var.f51483j = 0;
                    wq0Var.f51482i = 0;
                    return wq0Var;
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
