package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ab extends pq0 {
    public final mb f43658a;

    public ab(mb mbVar) {
        this.f43658a = mbVar;
    }

    @Override
    public final yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.ui.Cells.t0 t0Var;
        org.telegram.messenger.ij messageObject;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject2;
        mb mbVar = this.f43658a;
        int childCount = mbVar.f47834w.getChildCount();
        int i10 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i10 >= childCount) {
                return null;
            }
            View childAt = mbVar.f47834w.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                if (ijVar != null && (messageObject2 = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject2.e1() == ijVar.e1()) {
                    imageReceiver = q1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.t0) && (messageObject = (t0Var = (org.telegram.ui.Cells.t0) childAt).getMessageObject()) != null) {
                if (ijVar != null) {
                    if (messageObject.e1() == ijVar.e1()) {
                        imageReceiver = t0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject.f23273n0 != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= messageObject.f23273n0.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = ((TLRPC.PhotoSize) messageObject.f23273n0.get(i11)).location;
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
                yq0 yq0Var = new yq0();
                yq0Var.f52160b = iArr[0];
                yq0Var.f52161c = iArr[1];
                yq0Var.d = mbVar.f47834w;
                yq0Var.f52159a = imageReceiver;
                yq0Var.f52162e = imageReceiver.p();
                yq0Var.h = imageReceiver.E();
                yq0Var.f52168l = true;
                return yq0Var;
            }
            i10++;
        }
    }
}
