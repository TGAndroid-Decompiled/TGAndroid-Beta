package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class an extends av0 {
    public final ArrayList f34282a;
    public final int[] f34283b = new int[2];
    public final fo f34284c;

    public an(fo foVar, ArrayList arrayList) {
        this.f34284c = foVar;
        this.f34282a = arrayList;
    }

    @Override
    public final kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        fo foVar = this.f34284c;
        if (foVar.f36160x0 != null && i10 >= 0) {
            ArrayList arrayList = this.f34282a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = foVar.f36160x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = foVar.f36160x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.u1;
                    int[] iArr = this.f34283b;
                    if (z12 && (messageObject2 = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && (richMessageLayout = messageObject2.richLayout) != null) {
                        int[] iArr2 = new int[2];
                        imageReceiver = richMessageLayout.findMediaImageReceiver(pageBlock, iArr2);
                        if (imageReceiver != null) {
                            childAt.getLocationInWindow(iArr);
                            iArr[0] = u1Var.getTextX() + iArr2[0] + iArr[0];
                            iArr[1] = u1Var.getTextY() + iArr2[1] + iArr[1];
                        }
                    } else {
                        imageReceiver = null;
                    }
                    if (imageReceiver != null) {
                        kv0 kv0Var = new kv0();
                        kv0Var.f37752b = iArr[0];
                        kv0Var.f37753c = iArr[1];
                        kv0Var.d = foVar.f36160x0;
                        kv0Var.f37751a = imageReceiver;
                        kv0Var.e = imageReceiver.getBitmapSafe();
                        kv0Var.h = imageReceiver.getRoundRadius(true);
                        kv0Var.f37757j = (int) ((foVar.f36104s9 - foVar.f36130u9) - AndroidUtilities.dp(4.0f));
                        kv0Var.f37756i = (int) (foVar.b9(org.telegram.ui.Components.u31.f29578c) + foVar.v.d() + AndroidUtilities.dp(9.0f) + foVar.Ba + foVar.f36107sc);
                        return kv0Var;
                    }
                }
            }
        }
        return null;
    }
}
