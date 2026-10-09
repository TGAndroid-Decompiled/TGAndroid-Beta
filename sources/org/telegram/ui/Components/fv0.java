package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class fv0 extends org.telegram.ui.uu0 {
    public final gv0 f26493a;

    public fv0(gv0 gv0Var) {
        this.f26493a = gv0Var;
    }

    @Override
    public final org.telegram.ui.ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        iv0 iv0Var = this.f26493a.f26887c;
        tu0 tu0Var = iv0Var.f27493r;
        if (tu0Var != null) {
            int childCount = tu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = iv0Var.f27493r.getChildAt(i11);
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
                    org.telegram.ui.ev0 ev0Var = new org.telegram.ui.ev0();
                    ev0Var.f37357b = iArr[0];
                    ev0Var.f37358c = childAt.getPaddingTop() + iArr[1];
                    ev0Var.d = iv0Var.f27493r;
                    ev0Var.f37366m = null;
                    ev0Var.f37356a = imageReceiver;
                    if (z10) {
                        ev0Var.f37359e = imageReceiver.getBitmapSafe();
                    }
                    ev0Var.h = imageReceiver.getRoundRadius(true);
                    ev0Var.f37363j = 0;
                    ev0Var.f37362i = 0;
                    return ev0Var;
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
