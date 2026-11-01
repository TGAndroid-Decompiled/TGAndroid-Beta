package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class et0 extends org.telegram.ui.xr0 {
    public final ft0 f25925a;

    public et0(ft0 ft0Var) {
        this.f25925a = ft0Var;
    }

    @Override
    public final org.telegram.ui.fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.kj messageObject;
        ht0 ht0Var = this.f25925a.f26219c;
        ss0 ss0Var = ht0Var.f26918r;
        if (ss0Var != null) {
            int childCount = ss0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ht0Var.f26918r.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.q1) && kjVar != null && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.f1() == kjVar.f1()) {
                    ArrayList arrayList = messageObject.f16713q0;
                    if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                        imageReceiver = q1Var.Q1(((Integer) messageObject.f16713q0.get(i10)).intValue());
                    } else {
                        imageReceiver = q1Var.Q1(i10);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.fs0 fs0Var = new org.telegram.ui.fs0();
                    fs0Var.f37216b = iArr[0];
                    fs0Var.f37217c = childAt.getPaddingTop() + iArr[1];
                    fs0Var.d = ht0Var.f26918r;
                    fs0Var.f37224m = null;
                    fs0Var.f37215a = imageReceiver;
                    if (z10) {
                        fs0Var.e = imageReceiver.p();
                    }
                    fs0Var.h = imageReceiver.E();
                    fs0Var.f37221j = 0;
                    fs0Var.f37220i = 0;
                    return fs0Var;
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
