package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class an extends zu0 {
    public final ArrayList f33996a;
    public final int[] f33997b = new int[2];
    public final fo f33998c;

    public an(fo foVar, ArrayList arrayList) {
        this.f33998c = foVar;
        this.f33996a = arrayList;
    }

    @Override
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        fo foVar = this.f33998c;
        if (foVar.f35861x0 != null && i10 >= 0) {
            ArrayList arrayList = this.f33996a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = foVar.f35861x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = foVar.f35861x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.u1;
                    int[] iArr = this.f33997b;
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
                        jv0 jv0Var = new jv0();
                        jv0Var.f37146b = iArr[0];
                        jv0Var.f37147c = iArr[1];
                        jv0Var.d = foVar.f35861x0;
                        jv0Var.f37145a = imageReceiver;
                        jv0Var.e = imageReceiver.getBitmapSafe();
                        jv0Var.h = imageReceiver.getRoundRadius(true);
                        jv0Var.f37151j = (int) ((foVar.f35805s9 - foVar.f35831u9) - AndroidUtilities.dp(4.0f));
                        jv0Var.f37150i = (int) (foVar.b9(org.telegram.ui.Components.u31.f29249c) + foVar.v.d() + AndroidUtilities.dp(9.0f) + foVar.Ba + foVar.f35808sc);
                        return jv0Var;
                    }
                }
            }
        }
        return null;
    }
}
