package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ab extends rt0 {
    public final pb f36447a;

    public ab(pb pbVar) {
        this.f36447a = pbVar;
    }

    @Override
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        org.telegram.ui.Cells.w0 w0Var;
        MessageObject messageObject2;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject3;
        pb pbVar = this.f36447a;
        int childCount = pbVar.A.getChildCount();
        int i10 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i10 >= childCount) {
                return null;
            }
            View childAt = pbVar.A.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                if (messageObject != null && (messageObject3 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject3.getId() == messageObject.getId()) {
                    imageReceiver = t1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.w0) && (messageObject2 = (w0Var = (org.telegram.ui.Cells.w0) childAt).getMessageObject()) != null) {
                if (messageObject != null) {
                    if (messageObject2.getId() == messageObject.getId()) {
                        imageReceiver = w0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject2.photoThumbs != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= messageObject2.photoThumbs.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = messageObject2.photoThumbs.get(i11).location;
                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                            imageReceiver = w0Var.getPhotoImage();
                            break;
                        }
                        i11++;
                    }
                }
            }
            if (imageReceiver != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                bu0 bu0Var = new bu0();
                bu0Var.f36979b = iArr[0];
                bu0Var.f36980c = iArr[1];
                bu0Var.d = pbVar.A;
                bu0Var.f36978a = imageReceiver;
                bu0Var.f36981e = imageReceiver.getBitmapSafe();
                bu0Var.h = imageReceiver.getRoundRadius(true);
                bu0Var.f36987l = true;
                return bu0Var;
            }
            i10++;
        }
    }
}
