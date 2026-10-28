package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ib extends iu0 {
    public final wb f40102a;

    public ib(wb wbVar) {
        this.f40102a = wbVar;
    }

    @Override
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.v0 v0Var;
        MessageObject messageObject2;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject3;
        wb wbVar = this.f40102a;
        int childCount = wbVar.v.getChildCount();
        int i11 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i11 >= childCount) {
                return null;
            }
            View childAt = wbVar.v.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.s1) {
                if (messageObject != null && (messageObject3 = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject3.getId() == messageObject.getId()) {
                    imageReceiver = s1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.v0) && (messageObject2 = (v0Var = (org.telegram.ui.Cells.v0) childAt).getMessageObject()) != null) {
                if (messageObject != null) {
                    if (messageObject2.getId() == messageObject.getId()) {
                        imageReceiver = v0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject2.photoThumbs != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= messageObject2.photoThumbs.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = messageObject2.photoThumbs.get(i12).location;
                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                            imageReceiver = v0Var.getPhotoImage();
                            break;
                        }
                        i12++;
                    }
                }
            }
            if (imageReceiver != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                su0 su0Var = new su0();
                su0Var.f43407b = iArr[0];
                su0Var.f43408c = iArr[1];
                su0Var.d = wbVar.v;
                su0Var.f43406a = imageReceiver;
                su0Var.e = imageReceiver.getBitmapSafe();
                su0Var.h = imageReceiver.getRoundRadius(true);
                su0Var.f43414l = true;
                return su0Var;
            }
            i11++;
        }
    }
}
