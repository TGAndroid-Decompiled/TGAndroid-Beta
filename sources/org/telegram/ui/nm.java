package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class nm extends cu0 {
    public final ArrayList f39927a;
    public final int[] f39928b = new int[2];
    public final sn f39929c;

    public nm(sn snVar, ArrayList arrayList) {
        this.f39929c = snVar;
        this.f39927a = arrayList;
    }

    @Override
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        sn snVar = this.f39929c;
        if (snVar.f41737x0 != null && i10 >= 0) {
            ArrayList arrayList = this.f39927a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = snVar.f41737x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = snVar.f41737x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.t1;
                    int[] iArr = this.f39928b;
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
                        mu0 mu0Var = new mu0();
                        mu0Var.f39693b = iArr[0];
                        mu0Var.f39694c = iArr[1];
                        mu0Var.d = snVar.f41737x0;
                        mu0Var.f39692a = imageReceiver;
                        mu0Var.e = imageReceiver.getBitmapSafe();
                        mu0Var.h = imageReceiver.getRoundRadius(true);
                        mu0Var.f39698j = (int) ((snVar.E9 - snVar.G9) - AndroidUtilities.dp(4.0f));
                        mu0Var.f39697i = (int) (snVar.b9(org.telegram.ui.Components.s31.f30371c) + snVar.v.d() + AndroidUtilities.dp(9.0f) + snVar.Na + snVar.Gc);
                        return mu0Var;
                    }
                }
            }
        }
        return null;
    }
}
