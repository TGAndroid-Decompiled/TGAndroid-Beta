package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class mm extends zt0 {
    public final ArrayList f39312a;
    public final int[] f39313b = new int[2];
    public final qn f39314c;

    public mm(qn qnVar, ArrayList arrayList) {
        this.f39314c = qnVar;
        this.f39312a = arrayList;
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        qn qnVar = this.f39314c;
        if (qnVar.f40903x0 != null && i10 >= 0) {
            ArrayList arrayList = this.f39312a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = qnVar.f40903x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = qnVar.f40903x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.u1;
                    int[] iArr = this.f39313b;
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
                        ju0 ju0Var = new ju0();
                        ju0Var.f38344b = iArr[0];
                        ju0Var.f38345c = iArr[1];
                        ju0Var.d = qnVar.f40903x0;
                        ju0Var.f38343a = imageReceiver;
                        ju0Var.e = imageReceiver.getBitmapSafe();
                        ju0Var.h = imageReceiver.getRoundRadius(true);
                        ju0Var.f38349j = (int) ((qnVar.f40847s9 - qnVar.f40873u9) - AndroidUtilities.dp(4.0f));
                        ju0Var.f38348i = (int) (qnVar.b9(org.telegram.ui.Components.m31.f28383c) + qnVar.v.d() + AndroidUtilities.dp(9.0f) + qnVar.Ba + qnVar.f40863tc);
                        return ju0Var;
                    }
                }
            }
        }
        return null;
    }
}
