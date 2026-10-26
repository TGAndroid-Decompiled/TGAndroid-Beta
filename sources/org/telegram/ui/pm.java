package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class pm extends gu0 {
    public final ArrayList f42573a;
    public final int[] f42574b = new int[2];
    public final un f42575c;

    public pm(un unVar, ArrayList arrayList) {
        this.f42575c = unVar;
        this.f42573a = arrayList;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        un unVar = this.f42575c;
        if (unVar.f44471x0 != null && i10 >= 0) {
            ArrayList arrayList = this.f42573a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = unVar.f44471x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = unVar.f44471x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.s1;
                    int[] iArr = this.f42574b;
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
                        qu0 qu0Var = new qu0();
                        qu0Var.f42920b = iArr[0];
                        qu0Var.f42921c = iArr[1];
                        qu0Var.d = unVar.f44471x0;
                        qu0Var.f42919a = imageReceiver;
                        qu0Var.e = imageReceiver.getBitmapSafe();
                        qu0Var.h = imageReceiver.getRoundRadius(true);
                        qu0Var.f42925j = (int) ((unVar.E9 - unVar.G9) - AndroidUtilities.dp(4.0f));
                        qu0Var.f42924i = (int) (unVar.g9(org.telegram.ui.Components.a41.f26410c) + unVar.v.d() + AndroidUtilities.dp(9.0f) + unVar.Na + unVar.Pc);
                        return qu0Var;
                    }
                }
            }
        }
        return null;
    }
}
