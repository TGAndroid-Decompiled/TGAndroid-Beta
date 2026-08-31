package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class cu0 extends org.telegram.ui.au0 {
    public final du0 f26087a;

    public cu0(du0 du0Var) {
        this.f26087a = du0Var;
    }

    @Override
    public final org.telegram.ui.lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        fu0 fu0Var = this.f26087a.f26323c;
        qt0 qt0Var = fu0Var.f27016r;
        if (qt0Var != null) {
            int childCount = qt0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = fu0Var.f27016r.getChildAt(i11);
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
                    org.telegram.ui.lu0 lu0Var = new org.telegram.ui.lu0();
                    lu0Var.f38865b = iArr[0];
                    lu0Var.f38866c = childAt.getPaddingTop() + iArr[1];
                    lu0Var.d = fu0Var.f27016r;
                    lu0Var.f38874m = null;
                    lu0Var.f38864a = imageReceiver;
                    if (z4) {
                        lu0Var.f38867e = imageReceiver.getBitmapSafe();
                    }
                    lu0Var.h = imageReceiver.getRoundRadius(true);
                    lu0Var.f38871j = 0;
                    lu0Var.f38870i = 0;
                    return lu0Var;
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
