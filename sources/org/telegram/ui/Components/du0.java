package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class du0 extends org.telegram.ui.vu0 {
    public final eu0 f23389a;

    public du0(eu0 eu0Var) {
        this.f23389a = eu0Var;
    }

    @Override
    public final org.telegram.ui.fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        gu0 gu0Var = this.f23389a.f23673c;
        rt0 rt0Var = gu0Var.f24401r;
        if (rt0Var != null) {
            int childCount = rt0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = gu0Var.f24401r.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.t1) && messageObject != null && (messageObject2 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject2.getId() == messageObject.getId()) {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                        imageReceiver = t1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                    } else {
                        imageReceiver = t1Var.F2(i10);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.fv0 fv0Var = new org.telegram.ui.fv0();
                    fv0Var.f33764b = iArr[0];
                    fv0Var.f33765c = childAt.getPaddingTop() + iArr[1];
                    fv0Var.d = gu0Var.f24401r;
                    fv0Var.f33772m = null;
                    fv0Var.f33763a = imageReceiver;
                    if (z10) {
                        fv0Var.e = imageReceiver.getBitmapSafe();
                    }
                    fv0Var.h = imageReceiver.getRoundRadius(true);
                    fv0Var.f33769j = 0;
                    fv0Var.f33768i = 0;
                    return fv0Var;
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
