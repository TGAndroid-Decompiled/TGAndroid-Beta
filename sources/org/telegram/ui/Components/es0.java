package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class es0 extends org.telegram.ui.mq0 {
    public final fs0 f34432a;

    public es0(fs0 fs0Var) {
        this.f34432a = fs0Var;
    }

    @Override
    public final org.telegram.ui.uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.gj messageObject;
        hs0 hs0Var = this.f34432a.f34692c;
        sr0 sr0Var = hs0Var.f35332r;
        if (sr0Var != null) {
            int childCount = sr0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = hs0Var.f35332r.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.q1) && gjVar != null && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.e1() == gjVar.e1()) {
                    ArrayList arrayList = messageObject.f23851s0;
                    if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
                        imageReceiver = q1Var.T1(((Integer) messageObject.f23851s0.get(i7)).intValue());
                    } else {
                        imageReceiver = q1Var.T1(i7);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.uq0 uq0Var = new org.telegram.ui.uq0();
                    uq0Var.f51998b = iArr[0];
                    uq0Var.f51999c = childAt.getPaddingTop() + iArr[1];
                    uq0Var.d = hs0Var.f35332r;
                    uq0Var.f52007m = null;
                    uq0Var.f51997a = imageReceiver;
                    if (z10) {
                        uq0Var.f52000e = imageReceiver.p();
                    }
                    uq0Var.h = imageReceiver.E();
                    uq0Var.f52004j = 0;
                    uq0Var.f52003i = 0;
                    return uq0Var;
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
