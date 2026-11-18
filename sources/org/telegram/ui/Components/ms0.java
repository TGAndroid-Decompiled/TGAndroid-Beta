package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ms0 extends org.telegram.ui.oq0 {
    public final ns0 f37623a;

    public ms0(ns0 ns0Var) {
        this.f37623a = ns0Var;
    }

    @Override
    public final org.telegram.ui.wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.fj messageObject;
        ps0 ps0Var = this.f37623a.f37853c;
        as0 as0Var = ps0Var.f38547r;
        if (as0Var != null) {
            int childCount = as0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ps0Var.f38547r.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.q1) && fjVar != null && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.e1() == fjVar.e1()) {
                    ArrayList arrayList = messageObject.f24000s0;
                    if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
                        imageReceiver = q1Var.T1(((Integer) messageObject.f24000s0.get(i7)).intValue());
                    } else {
                        imageReceiver = q1Var.T1(i7);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0();
                    wq0Var.f53497b = iArr[0];
                    wq0Var.f53498c = childAt.getPaddingTop() + iArr[1];
                    wq0Var.d = ps0Var.f38547r;
                    wq0Var.f53506m = null;
                    wq0Var.f53496a = imageReceiver;
                    if (z10) {
                        wq0Var.f53499e = imageReceiver.p();
                    }
                    wq0Var.h = imageReceiver.E();
                    wq0Var.f53503j = 0;
                    wq0Var.f53502i = 0;
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
