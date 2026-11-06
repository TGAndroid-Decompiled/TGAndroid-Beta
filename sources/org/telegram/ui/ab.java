package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ab extends mq0 {
    public final mb f43588a;

    public ab(mb mbVar) {
        this.f43588a = mbVar;
    }

    @Override
    public final vq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.ui.Cells.t0 t0Var;
        org.telegram.messenger.ij messageObject;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject2;
        mb mbVar = this.f43588a;
        int childCount = mbVar.f47746w.getChildCount();
        int i10 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i10 >= childCount) {
                return null;
            }
            View childAt = mbVar.f47746w.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                if (ijVar != null && (messageObject2 = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject2.f1() == ijVar.f1()) {
                    imageReceiver = q1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.t0) && (messageObject = (t0Var = (org.telegram.ui.Cells.t0) childAt).getMessageObject()) != null) {
                if (ijVar != null) {
                    if (messageObject.f1() == ijVar.f1()) {
                        imageReceiver = t0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject.f23248n0 != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= messageObject.f23248n0.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = ((TLRPC.PhotoSize) messageObject.f23248n0.get(i11)).location;
                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                            imageReceiver = t0Var.getPhotoImage();
                            break;
                        }
                        i11++;
                    }
                }
            }
            if (imageReceiver != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                vq0 vq0Var = new vq0();
                vq0Var.f50791b = iArr[0];
                vq0Var.f50792c = iArr[1];
                vq0Var.d = mbVar.f47746w;
                vq0Var.f50790a = imageReceiver;
                vq0Var.f50793e = imageReceiver.p();
                vq0Var.h = imageReceiver.E();
                vq0Var.f50799l = true;
                return vq0Var;
            }
            i10++;
        }
    }
}
