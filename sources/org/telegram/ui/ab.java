package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ab extends qq0 {
    public final mb f43625a;

    public ab(mb mbVar) {
        this.f43625a = mbVar;
    }

    @Override
    public final zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.ui.Cells.t0 t0Var;
        org.telegram.messenger.ij messageObject;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject2;
        mb mbVar = this.f43625a;
        int childCount = mbVar.f47901w.getChildCount();
        int i10 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i10 >= childCount) {
                return null;
            }
            View childAt = mbVar.f47901w.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                if (ijVar != null && (messageObject2 = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject2.e1() == ijVar.e1()) {
                    imageReceiver = q1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.t0) && (messageObject = (t0Var = (org.telegram.ui.Cells.t0) childAt).getMessageObject()) != null) {
                if (ijVar != null) {
                    if (messageObject.e1() == ijVar.e1()) {
                        imageReceiver = t0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject.f23277n0 != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= messageObject.f23277n0.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = ((TLRPC.PhotoSize) messageObject.f23277n0.get(i11)).location;
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
                zq0 zq0Var = new zq0();
                zq0Var.f52504b = iArr[0];
                zq0Var.f52505c = iArr[1];
                zq0Var.d = mbVar.f47901w;
                zq0Var.f52503a = imageReceiver;
                zq0Var.f52506e = imageReceiver.p();
                zq0Var.h = imageReceiver.E();
                zq0Var.f52512l = true;
                return zq0Var;
            }
            i10++;
        }
    }
}
