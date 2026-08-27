package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class kt0 extends org.telegram.ui.st0 {

    public final lt0 f30181a;

    public kt0(lt0 lt0Var) {
        this.f30181a = lt0Var;
    }

    @Override
    public final org.telegram.ui.cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiverE2;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject2;
        nt0 nt0Var = this.f30181a.f30464c;
        ys0 ys0Var = nt0Var.f31033r;
        if (ys0Var != null) {
            int childCount = ys0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = nt0Var.f31033r.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.s1) || messageObject == null || (messageObject2 = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) == null || messageObject2.getId() != messageObject.getId()) {
                    imageReceiverE2 = null;
                } else {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    imageReceiverE2 = (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? s1Var.E2(i10) : s1Var.E2(messageObject2.pollMediaMapping.get(i10).intValue());
                }
                if (imageReceiverE2 != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.cu0 cu0Var = new org.telegram.ui.cu0();
                    cu0Var.f37154b = iArr[0];
                    cu0Var.f37155c = childAt.getPaddingTop() + iArr[1];
                    cu0Var.d = nt0Var.f31033r;
                    cu0Var.f37163m = null;
                    cu0Var.f37153a = imageReceiverE2;
                    if (z10) {
                        cu0Var.f37156e = imageReceiverE2.getBitmapSafe();
                    }
                    cu0Var.h = imageReceiverE2.getRoundRadius(true);
                    cu0Var.f37160j = 0;
                    cu0Var.f37159i = 0;
                    return cu0Var;
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
