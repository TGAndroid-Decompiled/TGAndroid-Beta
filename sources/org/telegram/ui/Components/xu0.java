package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class xu0 extends org.telegram.ui.zt0 {
    public final yu0 f32459a;

    public xu0(yu0 yu0Var) {
        this.f32459a = yu0Var;
    }

    @Override
    public final org.telegram.ui.ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        av0 av0Var = this.f32459a.f32754c;
        lu0 lu0Var = av0Var.f24712r;
        if (lu0Var != null) {
            int childCount = lu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = av0Var.f24712r.getChildAt(i11);
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
                    org.telegram.ui.ju0 ju0Var = new org.telegram.ui.ju0();
                    ju0Var.f38344b = iArr[0];
                    ju0Var.f38345c = childAt.getPaddingTop() + iArr[1];
                    ju0Var.d = av0Var.f24712r;
                    ju0Var.f38352m = null;
                    ju0Var.f38343a = imageReceiver;
                    if (z10) {
                        ju0Var.e = imageReceiver.getBitmapSafe();
                    }
                    ju0Var.h = imageReceiver.getRoundRadius(true);
                    ju0Var.f38349j = 0;
                    ju0Var.f38348i = 0;
                    return ju0Var;
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
