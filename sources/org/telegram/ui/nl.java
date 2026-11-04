package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class nl extends eq0 {
    public final ArrayList f48016a;
    public final int[] f48017b = new int[2];
    public final wm f48018c;

    public nl(wm wmVar, ArrayList arrayList) {
        this.f48018c = wmVar;
        this.f48016a = arrayList;
    }

    @Override
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        char c2;
        char c10;
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.zi messageObject;
        org.telegram.messenger.cv cvVar;
        TL_iv.PageBlock pageBlock;
        ImageReceiver imageReceiver2;
        nl nlVar = this;
        wm wmVar = nlVar.f48018c;
        if (wmVar.A0 != null && i3 >= 0) {
            ArrayList arrayList = nlVar.f48016a;
            if (i3 >= arrayList.size()) {
                return null;
            }
            TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) arrayList.get(i3);
            int childCount = wmVar.A0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = wmVar.A0.getChildAt(i10);
                boolean z12 = childAt instanceof org.telegram.ui.Cells.q1;
                int[] iArr = nlVar.f48017b;
                if (z12 && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && (cvVar = messageObject.f26915w2) != null) {
                    int[] iArr2 = new int[2];
                    ArrayList arrayList2 = cvVar.f22070g;
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList2.size()) {
                            org.telegram.messenger.xt xtVar = (org.telegram.messenger.xt) arrayList2.get(i11);
                            if (xtVar instanceof org.telegram.messenger.ku) {
                                org.telegram.messenger.ku kuVar = (org.telegram.messenger.ku) xtVar;
                                pageBlock = kuVar.f23872r0;
                                imageReceiver2 = kuVar.Y;
                            } else if (xtVar instanceof org.telegram.messenger.wu) {
                                org.telegram.messenger.wu wuVar = (org.telegram.messenger.wu) xtVar;
                                TL_iv.pageBlockVideo pageblockvideo = wuVar.f26256r0;
                                imageReceiver2 = wuVar.Y;
                                pageBlock = pageblockvideo;
                            } else if (xtVar instanceof org.telegram.messenger.cu) {
                                ArrayList arrayList3 = ((org.telegram.messenger.cu) xtVar).Y;
                                int size = arrayList3.size();
                                c2 = 0;
                                int i12 = 0;
                                while (i12 < size) {
                                    Object obj = arrayList3.get(i12);
                                    i12++;
                                    c10 = 1;
                                    org.telegram.messenger.qt qtVar = (org.telegram.messenger.qt) obj;
                                    if (qtVar.f24951b == pageBlock2) {
                                        Rect rect = xtVar.f26435b;
                                        iArr2[0] = rect.left;
                                        iArr2[1] = xtVar.U + rect.top;
                                        imageReceiver = qtVar.f24952c;
                                        break;
                                    }
                                }
                                i11++;
                            } else {
                                c2 = 0;
                                c10 = 1;
                                if (xtVar instanceof org.telegram.messenger.ou) {
                                    org.telegram.messenger.ou ouVar = (org.telegram.messenger.ou) xtVar;
                                    ArrayList arrayList4 = ouVar.Y;
                                    int i13 = ouVar.f24602b0;
                                    if (i13 >= 0 && i13 < arrayList4.size() && ((org.telegram.messenger.qt) arrayList4.get(i13)).f24951b == pageBlock2) {
                                        Rect rect2 = xtVar.f26435b;
                                        iArr2[0] = rect2.left;
                                        iArr2[1] = xtVar.U + rect2.top;
                                        imageReceiver = ((org.telegram.messenger.qt) arrayList4.get(i13)).f24952c;
                                        break;
                                    }
                                    i11++;
                                } else {
                                    pageBlock = null;
                                    imageReceiver2 = null;
                                    if (pageBlock == pageBlock2 && imageReceiver2 != null) {
                                        Rect rect3 = xtVar.f26435b;
                                        iArr2[c2] = rect3.left;
                                        iArr2[c10] = xtVar.U + rect3.top;
                                        imageReceiver = imageReceiver2;
                                        break;
                                    }
                                    i11++;
                                }
                            }
                            c2 = 0;
                            c10 = 1;
                            if (pageBlock == pageBlock2) {
                                Rect rect32 = xtVar.f26435b;
                                iArr2[c2] = rect32.left;
                                iArr2[c10] = xtVar.U + rect32.top;
                                imageReceiver = imageReceiver2;
                                break;
                            }
                            continue;
                            i11++;
                        } else {
                            c2 = 0;
                            c10 = 1;
                            imageReceiver = null;
                            break;
                        }
                    }
                    if (imageReceiver != null) {
                        childAt.getLocationInWindow(iArr);
                        iArr[c2] = q1Var.getTextX() + iArr2[c2] + iArr[c2];
                        iArr[c10] = q1Var.getTextY() + iArr2[c10] + iArr[c10];
                    }
                } else {
                    c2 = 0;
                    c10 = 1;
                    imageReceiver = null;
                }
                if (imageReceiver == null) {
                    i10++;
                    nlVar = this;
                } else {
                    mq0 mq0Var = new mq0();
                    mq0Var.f47752b = iArr[c2];
                    mq0Var.f47753c = iArr[c10];
                    mq0Var.d = wmVar.A0;
                    mq0Var.f47751a = imageReceiver;
                    mq0Var.f47754e = imageReceiver.p();
                    mq0Var.h = imageReceiver.E();
                    mq0Var.f47758j = (int) ((wmVar.M9 - wmVar.O9) - org.telegram.messenger.g0.L(4.0f));
                    mq0Var.f47757i = (int) (wmVar.r9(org.telegram.ui.Components.c11.f32503c) + wmVar.f51520w.d() + org.telegram.messenger.g0.L(9.0f) + wmVar.Va + wmVar.Xc);
                    return mq0Var;
                }
            }
            return null;
        }
        return null;
    }
}
