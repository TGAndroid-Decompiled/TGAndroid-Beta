package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class os0 extends org.telegram.ui.oq0 {
    public final ps0 f38265a;

    public os0(ps0 ps0Var) {
        this.f38265a = ps0Var;
    }

    @Override
    public final org.telegram.ui.wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.fj messageObject;
        rs0 rs0Var = this.f38265a.f38573c;
        cs0 cs0Var = rs0Var.f39402r;
        if (cs0Var != null) {
            int childCount = cs0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = rs0Var.f39402r.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.r1) && fjVar != null && (messageObject = (r1Var = (org.telegram.ui.Cells.r1) childAt).getMessageObject()) != null && messageObject.e1() == fjVar.e1()) {
                    ArrayList arrayList = messageObject.f24105s0;
                    if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
                        imageReceiver = r1Var.T1(((Integer) messageObject.f24105s0.get(i7)).intValue());
                    } else {
                        imageReceiver = r1Var.T1(i7);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0();
                    wq0Var.f53727b = iArr[0];
                    wq0Var.f53728c = childAt.getPaddingTop() + iArr[1];
                    wq0Var.d = rs0Var.f39402r;
                    wq0Var.f53736m = null;
                    wq0Var.f53726a = imageReceiver;
                    if (z10) {
                        wq0Var.f53729e = imageReceiver.p();
                    }
                    wq0Var.h = imageReceiver.F();
                    wq0Var.f53733j = 0;
                    wq0Var.f53732i = 0;
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
