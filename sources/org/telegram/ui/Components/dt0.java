package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class dt0 extends org.telegram.ui.yr0 {
    public final et0 f25533a;

    public dt0(et0 et0Var) {
        this.f25533a = et0Var;
    }

    @Override
    public final org.telegram.ui.gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.jj messageObject;
        gt0 gt0Var = this.f25533a.f25860c;
        rs0 rs0Var = gt0Var.f26521r;
        if (rs0Var != null) {
            int childCount = rs0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = gt0Var.f26521r.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.q1) && jjVar != null && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.f1() == jjVar.f1()) {
                    ArrayList arrayList = messageObject.f16360q0;
                    if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                        imageReceiver = q1Var.Q1(((Integer) messageObject.f16360q0.get(i10)).intValue());
                    } else {
                        imageReceiver = q1Var.Q1(i10);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.gs0 gs0Var = new org.telegram.ui.gs0();
                    gs0Var.f37628b = iArr[0];
                    gs0Var.f37629c = childAt.getPaddingTop() + iArr[1];
                    gs0Var.d = gt0Var.f26521r;
                    gs0Var.f37636m = null;
                    gs0Var.f37627a = imageReceiver;
                    if (z10) {
                        gs0Var.e = imageReceiver.p();
                    }
                    gs0Var.h = imageReceiver.E();
                    gs0Var.f37633j = 0;
                    gs0Var.f37632i = 0;
                    return gs0Var;
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
