package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class nm extends pt0 {
    public final ArrayList f40844a;
    public final int[] f40845b = new int[2];
    public final tn f40846c;

    public nm(tn tnVar, ArrayList arrayList) {
        this.f40846c = tnVar;
        this.f40844a = arrayList;
    }

    @Override
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        tn tnVar = this.f40846c;
        if (tnVar.f42973t0 != null && i10 >= 0) {
            ArrayList arrayList = this.f40844a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = tnVar.f42973t0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = tnVar.f42973t0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.s1;
                    int[] iArr = this.f40845b;
                    if (z12 && (messageObject2 = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && (richMessageLayout = messageObject2.richLayout) != null) {
                        int[] iArr2 = new int[2];
                        imageReceiver = richMessageLayout.findMediaImageReceiver(pageBlock, iArr2);
                        if (imageReceiver != null) {
                            childAt.getLocationInWindow(iArr);
                            iArr[0] = s1Var.getTextX() + iArr2[0] + iArr[0];
                            iArr[1] = s1Var.getTextY() + iArr2[1] + iArr[1];
                        }
                    } else {
                        imageReceiver = null;
                    }
                    if (imageReceiver != null) {
                        zt0 zt0Var = new zt0();
                        zt0Var.f45317b = iArr[0];
                        zt0Var.f45318c = iArr[1];
                        zt0Var.d = tnVar.f42973t0;
                        zt0Var.f45316a = imageReceiver;
                        zt0Var.f45319e = imageReceiver.getBitmapSafe();
                        zt0Var.h = imageReceiver.getRoundRadius(true);
                        zt0Var.f45323j = (int) ((tnVar.f42921o9 - tnVar.q9) - AndroidUtilities.dp(4.0f));
                        zt0Var.f45322i = (int) (tnVar.W8(org.telegram.ui.Components.i21.f29305c) + tnVar.v.c() + AndroidUtilities.dp(9.0f) + tnVar.f43023wa + tnVar.f42923oc);
                        return zt0Var;
                    }
                }
            }
        }
        return null;
    }
}
