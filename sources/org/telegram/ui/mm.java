package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

public final class mm extends st0 {

    public final ArrayList f40547a;

    public final int[] f40548b = new int[2];

    public final rn f40549c;

    public mm(rn rnVar, ArrayList arrayList) {
        this.f40549c = rnVar;
        this.f40547a = arrayList;
    }

    @Override
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiverFindMediaImageReceiver;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        rn rnVar = this.f40549c;
        if (rnVar.f42213t0 != null && i10 >= 0) {
            ArrayList arrayList = this.f40547a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = rnVar.f42213t0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = rnVar.f42213t0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.s1;
                    int[] iArr = this.f40548b;
                    if (!z12 || (messageObject2 = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) == null || (richMessageLayout = messageObject2.richLayout) == null) {
                        imageReceiverFindMediaImageReceiver = null;
                    } else {
                        int[] iArr2 = new int[2];
                        imageReceiverFindMediaImageReceiver = richMessageLayout.findMediaImageReceiver(pageBlock, iArr2);
                        if (imageReceiverFindMediaImageReceiver != null) {
                            childAt.getLocationInWindow(iArr);
                            iArr[0] = s1Var.getTextX() + iArr2[0] + iArr[0];
                            iArr[1] = s1Var.getTextY() + iArr2[1] + iArr[1];
                        }
                    }
                    if (imageReceiverFindMediaImageReceiver != null) {
                        cu0 cu0Var = new cu0();
                        cu0Var.f37154b = iArr[0];
                        cu0Var.f37155c = iArr[1];
                        cu0Var.d = rnVar.f42213t0;
                        cu0Var.f37153a = imageReceiverFindMediaImageReceiver;
                        cu0Var.f37156e = imageReceiverFindMediaImageReceiver.getBitmapSafe();
                        cu0Var.h = imageReceiverFindMediaImageReceiver.getRoundRadius(true);
                        cu0Var.f37160j = (int) ((rnVar.f42160o9 - rnVar.q9) - AndroidUtilities.dp(4.0f));
                        cu0Var.f37159i = (int) (rnVar.W8(org.telegram.ui.Components.z11.f35132c) + rnVar.v.c() + AndroidUtilities.dp(9.0f) + rnVar.wa + rnVar.f42163oc);
                        return cu0Var;
                    }
                }
            }
        }
        return null;
    }
}
