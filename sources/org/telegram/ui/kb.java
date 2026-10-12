package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class kb extends wu0 {
    public final yb f39437a;

    public kb(yb ybVar) {
        this.f39437a = ybVar;
    }

    @Override
    public final gv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.w0 w0Var;
        MessageObject messageObject2;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject3;
        yb ybVar = this.f39437a;
        int childCount = ybVar.v.getChildCount();
        int i11 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i11 >= childCount) {
                return null;
            }
            View childAt = ybVar.v.getChildAt(i11);
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
                gv0 gv0Var = new gv0();
                gv0Var.f38148b = iArr[0];
                gv0Var.f38149c = iArr[1];
                gv0Var.d = ybVar.v;
                gv0Var.f38147a = imageReceiver;
                gv0Var.f38150e = imageReceiver.getBitmapSafe();
                gv0Var.h = imageReceiver.getRoundRadius(true);
                gv0Var.f38156l = true;
                return gv0Var;
            }
            i11++;
        }
    }
}
