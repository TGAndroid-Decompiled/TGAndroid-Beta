package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ps0 extends org.telegram.ui.pq0 {
    public final qs0 f38616a;

    public ps0(qs0 qs0Var) {
        this.f38616a = qs0Var;
    }

    @Override
    public final org.telegram.ui.xq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.gj messageObject;
        ss0 ss0Var = this.f38616a.f38944c;
        cs0 cs0Var = ss0Var.f39640r;
        if (cs0Var != null) {
            int childCount = cs0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ss0Var.f39640r.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.r1) && gjVar != null && (messageObject = (r1Var = (org.telegram.ui.Cells.r1) childAt).getMessageObject()) != null && messageObject.e1() == gjVar.e1()) {
                    ArrayList arrayList = messageObject.f24209s0;
                    if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
                        imageReceiver = r1Var.T1(((Integer) messageObject.f24209s0.get(i7)).intValue());
                    } else {
                        imageReceiver = r1Var.T1(i7);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.xq0 xq0Var = new org.telegram.ui.xq0();
                    xq0Var.f53899b = iArr[0];
                    xq0Var.f53900c = childAt.getPaddingTop() + iArr[1];
                    xq0Var.d = ss0Var.f39640r;
                    xq0Var.f53908m = null;
                    xq0Var.f53898a = imageReceiver;
                    if (z10) {
                        xq0Var.f53901e = imageReceiver.p();
                    }
                    xq0Var.h = imageReceiver.E();
                    xq0Var.f53905j = 0;
                    xq0Var.f53904i = 0;
                    return xq0Var;
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
