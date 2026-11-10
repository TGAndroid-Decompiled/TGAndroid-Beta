package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class es0 extends org.telegram.ui.qq0 {
    public final fs0 f33331a;

    public es0(fs0 fs0Var) {
        this.f33331a = fs0Var;
    }

    @Override
    public final org.telegram.ui.zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        hs0 hs0Var = this.f33331a.f33643c;
        sr0 sr0Var = hs0Var.f34457r;
        if (sr0Var != null) {
            int childCount = sr0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = hs0Var.f34457r.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.q1) && ijVar != null && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.e1() == ijVar.e1()) {
                    ArrayList arrayList = messageObject.f23288q0;
                    if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
                        imageReceiver = q1Var.S1(((Integer) messageObject.f23288q0.get(i7)).intValue());
                    } else {
                        imageReceiver = q1Var.S1(i7);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.zq0 zq0Var = new org.telegram.ui.zq0();
                    zq0Var.f52504b = iArr[0];
                    zq0Var.f52505c = childAt.getPaddingTop() + iArr[1];
                    zq0Var.d = hs0Var.f34457r;
                    zq0Var.f52513m = null;
                    zq0Var.f52503a = imageReceiver;
                    if (z9) {
                        zq0Var.f52506e = imageReceiver.p();
                    }
                    zq0Var.h = imageReceiver.E();
                    zq0Var.f52510j = 0;
                    zq0Var.f52509i = 0;
                    return zq0Var;
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
