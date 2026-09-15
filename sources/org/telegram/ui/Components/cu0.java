package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class cu0 extends org.telegram.ui.tu0 {
    public final du0 f23139a;

    public cu0(du0 du0Var) {
        this.f23139a = du0Var;
    }

    @Override
    public final org.telegram.ui.dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        fu0 fu0Var = this.f23139a.f23400c;
        qt0 qt0Var = fu0Var.f24093r;
        if (qt0Var != null) {
            int childCount = qt0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = fu0Var.f24093r.getChildAt(i11);
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
                    org.telegram.ui.dv0 dv0Var = new org.telegram.ui.dv0();
                    dv0Var.f33135b = iArr[0];
                    dv0Var.f33136c = childAt.getPaddingTop() + iArr[1];
                    dv0Var.d = fu0Var.f24093r;
                    dv0Var.f33143m = null;
                    dv0Var.f33134a = imageReceiver;
                    if (z10) {
                        dv0Var.e = imageReceiver.getBitmapSafe();
                    }
                    dv0Var.h = imageReceiver.getRoundRadius(true);
                    dv0Var.f33140j = 0;
                    dv0Var.f33139i = 0;
                    return dv0Var;
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
