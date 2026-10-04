package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class tu0 extends org.telegram.ui.ou0 {
    public final uu0 f31169a;

    public tu0(uu0 uu0Var) {
        this.f31169a = uu0Var;
    }

    @Override
    public final org.telegram.ui.yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        wu0 wu0Var = this.f31169a.f31447c;
        hu0 hu0Var = wu0Var.f32627r;
        if (hu0Var != null) {
            int childCount = hu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = wu0Var.f32627r.getChildAt(i11);
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
                    org.telegram.ui.yu0 yu0Var = new org.telegram.ui.yu0();
                    yu0Var.f43621b = iArr[0];
                    yu0Var.f43622c = childAt.getPaddingTop() + iArr[1];
                    yu0Var.d = wu0Var.f32627r;
                    yu0Var.f43630m = null;
                    yu0Var.f43620a = imageReceiver;
                    if (z10) {
                        yu0Var.f43623e = imageReceiver.getBitmapSafe();
                    }
                    yu0Var.h = imageReceiver.getRoundRadius(true);
                    yu0Var.f43627j = 0;
                    yu0Var.f43626i = 0;
                    return yu0Var;
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
