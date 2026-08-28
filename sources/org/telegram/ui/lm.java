package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class lm extends rt0 {
    public final ArrayList f40191a;
    public final int[] f40192b = new int[2];
    public final qn f40193c;

    public lm(qn qnVar, ArrayList arrayList) {
        this.f40193c = qnVar;
        this.f40191a = arrayList;
    }

    @Override
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        qn qnVar = this.f40193c;
        if (qnVar.f42077t0 != null && i9 >= 0) {
            ArrayList arrayList = this.f40191a;
            if (i9 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i9);
                int childCount = qnVar.f42077t0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = qnVar.f42077t0.getChildAt(i10);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.t1;
                    int[] iArr = this.f40192b;
                    if (z12 && (messageObject2 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && (richMessageLayout = messageObject2.richLayout) != null) {
                        int[] iArr2 = new int[2];
                        imageReceiver = richMessageLayout.findMediaImageReceiver(pageBlock, iArr2);
                        if (imageReceiver != null) {
                            childAt.getLocationInWindow(iArr);
                            iArr[0] = t1Var.getTextX() + iArr2[0] + iArr[0];
                            iArr[1] = t1Var.getTextY() + iArr2[1] + iArr[1];
                        }
                    } else {
                        imageReceiver = null;
                    }
                    if (imageReceiver != null) {
                        bu0 bu0Var = new bu0();
                        bu0Var.f36979b = iArr[0];
                        bu0Var.f36980c = iArr[1];
                        bu0Var.d = qnVar.f42077t0;
                        bu0Var.f36978a = imageReceiver;
                        bu0Var.f36981e = imageReceiver.getBitmapSafe();
                        bu0Var.h = imageReceiver.getRoundRadius(true);
                        bu0Var.f36985j = (int) ((qnVar.o9 - qnVar.f42045q9) - AndroidUtilities.dp(4.0f));
                        bu0Var.f36984i = (int) (qnVar.W8(org.telegram.ui.Components.w11.f34073c) + qnVar.v.c() + AndroidUtilities.dp(9.0f) + qnVar.f42123wa + qnVar.f42024oc);
                        return bu0Var;
                    }
                }
            }
        }
        return null;
    }
}
