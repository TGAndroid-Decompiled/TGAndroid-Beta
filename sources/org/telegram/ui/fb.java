package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fb extends yr0 {
    public final sb f37220a;

    public fb(sb sbVar) {
        this.f37220a = sbVar;
    }

    @Override
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.s0 s0Var;
        org.telegram.messenger.jj messageObject;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.jj messageObject2;
        sb sbVar = this.f37220a;
        int childCount = sbVar.f41453w.getChildCount();
        int i11 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i11 >= childCount) {
                return null;
            }
            View childAt = sbVar.f41453w.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                if (jjVar != null && (messageObject2 = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject2.f1() == jjVar.f1()) {
                    imageReceiver = q1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.s0) && (messageObject = (s0Var = (org.telegram.ui.Cells.s0) childAt).getMessageObject()) != null) {
                if (jjVar != null) {
                    if (messageObject.f1() == jjVar.f1()) {
                        imageReceiver = s0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject.f16348n0 != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= messageObject.f16348n0.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = ((TLRPC.PhotoSize) messageObject.f16348n0.get(i12)).location;
                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                            imageReceiver = s0Var.getPhotoImage();
                            break;
                        }
                        i12++;
                    }
                }
            }
            if (imageReceiver != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                gs0 gs0Var = new gs0();
                gs0Var.f37628b = iArr[0];
                gs0Var.f37629c = iArr[1];
                gs0Var.d = sbVar.f41453w;
                gs0Var.f37627a = imageReceiver;
                gs0Var.e = imageReceiver.p();
                gs0Var.h = imageReceiver.E();
                gs0Var.f37635l = true;
                return gs0Var;
            }
            i11++;
        }
    }
}
