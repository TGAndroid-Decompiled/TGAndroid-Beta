package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class hb extends tu0 {
    public final vb f34116a;

    public hb(vb vbVar) {
        this.f34116a = vbVar;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.w0 w0Var;
        MessageObject messageObject2;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject3;
        vb vbVar = this.f34116a;
        int childCount = vbVar.v.getChildCount();
        int i11 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i11 >= childCount) {
                return null;
            }
            View childAt = vbVar.v.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                if (messageObject != null && (messageObject3 = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject3.getId() == messageObject.getId()) {
                    imageReceiver = u1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.w0) && (messageObject2 = (w0Var = (org.telegram.ui.Cells.w0) childAt).getMessageObject()) != null) {
                if (messageObject != null) {
                    if (messageObject2.getId() == messageObject.getId()) {
                        imageReceiver = w0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject2.photoThumbs != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= messageObject2.photoThumbs.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = messageObject2.photoThumbs.get(i12).location;
                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                            imageReceiver = w0Var.getPhotoImage();
                            break;
                        }
                        i12++;
                    }
                }
            }
            if (imageReceiver != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                dv0 dv0Var = new dv0();
                dv0Var.f33093b = iArr[0];
                dv0Var.f33094c = iArr[1];
                dv0Var.d = vbVar.v;
                dv0Var.f33092a = imageReceiver;
                dv0Var.e = imageReceiver.getBitmapSafe();
                dv0Var.h = imageReceiver.getRoundRadius(true);
                dv0Var.f33100l = true;
                return dv0Var;
            }
            i11++;
        }
    }
}
