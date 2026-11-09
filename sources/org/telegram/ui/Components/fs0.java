package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fs0 extends org.telegram.ui.pq0 {
    public final gs0 f33733a;

    public fs0(gs0 gs0Var) {
        this.f33733a = gs0Var;
    }

    @Override
    public final org.telegram.ui.yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        is0 is0Var = this.f33733a.f34049c;
        tr0 tr0Var = is0Var.f34857r;
        if (tr0Var != null) {
            int childCount = tr0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = is0Var.f34857r.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.q1) && ijVar != null && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.e1() == ijVar.e1()) {
                    ArrayList arrayList = messageObject.f23284q0;
                    if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
                        imageReceiver = q1Var.S1(((Integer) messageObject.f23284q0.get(i7)).intValue());
                    } else {
                        imageReceiver = q1Var.S1(i7);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.yq0 yq0Var = new org.telegram.ui.yq0();
                    yq0Var.f52160b = iArr[0];
                    yq0Var.f52161c = childAt.getPaddingTop() + iArr[1];
                    yq0Var.d = is0Var.f34857r;
                    yq0Var.f52169m = null;
                    yq0Var.f52159a = imageReceiver;
                    if (z9) {
                        yq0Var.f52162e = imageReceiver.p();
                    }
                    yq0Var.h = imageReceiver.E();
                    yq0Var.f52166j = 0;
                    yq0Var.f52165i = 0;
                    return yq0Var;
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
