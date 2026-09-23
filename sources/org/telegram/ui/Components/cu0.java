package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class cu0 extends org.telegram.ui.mu0 {
    public final du0 f23105a;

    public cu0(du0 du0Var) {
        this.f23105a = du0Var;
    }

    @Override
    public final org.telegram.ui.wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        fu0 fu0Var = this.f23105a.f23466c;
        qt0 qt0Var = fu0Var.f24092r;
        if (qt0Var != null) {
            int childCount = qt0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = fu0Var.f24092r.getChildAt(i11);
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
                    org.telegram.ui.wu0 wu0Var = new org.telegram.ui.wu0();
                    wu0Var.f39095b = iArr[0];
                    wu0Var.f39096c = childAt.getPaddingTop() + iArr[1];
                    wu0Var.d = fu0Var.f24092r;
                    wu0Var.f39103m = null;
                    wu0Var.f39094a = imageReceiver;
                    if (z10) {
                        wu0Var.e = imageReceiver.getBitmapSafe();
                    }
                    wu0Var.h = imageReceiver.getRoundRadius(true);
                    wu0Var.f39100j = 0;
                    wu0Var.f39099i = 0;
                    return wu0Var;
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
