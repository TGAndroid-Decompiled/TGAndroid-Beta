package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ou0 extends org.telegram.ui.lu0 {
    public final pu0 f27121a;

    public ou0(pu0 pu0Var) {
        this.f27121a = pu0Var;
    }

    @Override
    public final org.telegram.ui.vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        ru0 ru0Var = this.f27121a.f27501c;
        cu0 cu0Var = ru0Var.f28064r;
        if (cu0Var != null) {
            int childCount = cu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ru0Var.f28064r.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.u1) && messageObject != null && (messageObject2 = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject2.getId() == messageObject.getId()) {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                        imageReceiver = u1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                    } else {
                        imageReceiver = u1Var.F2(i10);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.vu0 vu0Var = new org.telegram.ui.vu0();
                    vu0Var.f38819b = iArr[0];
                    vu0Var.f38820c = childAt.getPaddingTop() + iArr[1];
                    vu0Var.d = ru0Var.f28064r;
                    vu0Var.f38827m = null;
                    vu0Var.f38818a = imageReceiver;
                    if (z10) {
                        vu0Var.e = imageReceiver.getBitmapSafe();
                    }
                    vu0Var.h = imageReceiver.getRoundRadius(true);
                    vu0Var.f38824j = 0;
                    vu0Var.f38823i = 0;
                    return vu0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
