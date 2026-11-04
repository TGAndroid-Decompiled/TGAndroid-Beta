package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class cs0 extends org.telegram.ui.eq0 {
    public final ds0 f32831a;

    public cs0(ds0 ds0Var) {
        this.f32831a = ds0Var;
    }

    @Override
    public final org.telegram.ui.mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.zi messageObject;
        fs0 fs0Var = this.f32831a.f33189c;
        qr0 qr0Var = fs0Var.f33863r;
        if (qr0Var != null) {
            int childCount = qr0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = fs0Var.f33863r.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.q1) && ziVar != null && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.f1() == ziVar.f1()) {
                    ArrayList arrayList = messageObject.f26890q0;
                    if (arrayList != null && i3 >= 0 && i3 < arrayList.size()) {
                        imageReceiver = q1Var.S1(((Integer) messageObject.f26890q0.get(i3)).intValue());
                    } else {
                        imageReceiver = q1Var.S1(i3);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.mq0 mq0Var = new org.telegram.ui.mq0();
                    mq0Var.f47752b = iArr[0];
                    mq0Var.f47753c = childAt.getPaddingTop() + iArr[1];
                    mq0Var.d = fs0Var.f33863r;
                    mq0Var.f47761m = null;
                    mq0Var.f47751a = imageReceiver;
                    if (z10) {
                        mq0Var.f47754e = imageReceiver.p();
                    }
                    mq0Var.h = imageReceiver.E();
                    mq0Var.f47758j = 0;
                    mq0Var.f47757i = 0;
                    return mq0Var;
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
