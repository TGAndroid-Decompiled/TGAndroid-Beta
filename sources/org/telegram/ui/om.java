package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class om extends bu0 {
    public final ArrayList f39847a;
    public final int[] f39848b = new int[2];
    public final sn f39849c;

    public om(sn snVar, ArrayList arrayList) {
        this.f39849c = snVar;
        this.f39847a = arrayList;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        sn snVar = this.f39849c;
        if (snVar.f41433x0 != null && i10 >= 0) {
            ArrayList arrayList = this.f39847a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = snVar.f41433x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = snVar.f41433x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.u1;
                    int[] iArr = this.f39848b;
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
                        lu0 lu0Var = new lu0();
                        lu0Var.f38938b = iArr[0];
                        lu0Var.f38939c = iArr[1];
                        lu0Var.d = snVar.f41433x0;
                        lu0Var.f38937a = imageReceiver;
                        lu0Var.e = imageReceiver.getBitmapSafe();
                        lu0Var.h = imageReceiver.getRoundRadius(true);
                        lu0Var.f38943j = (int) ((snVar.f41377s9 - snVar.f41403u9) - AndroidUtilities.dp(4.0f));
                        lu0Var.f38942i = (int) (snVar.b9(org.telegram.ui.Components.l31.f28060c) + snVar.v.d() + AndroidUtilities.dp(9.0f) + snVar.Ba + snVar.f41380sc);
                        return lu0Var;
                    }
                }
            }
        }
        return null;
    }
}
