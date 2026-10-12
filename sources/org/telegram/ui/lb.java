package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class lb extends av0 {
    public final ac f37907a;

    public lb(ac acVar) {
        this.f37907a = acVar;
    }

    @Override
    public final kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.x0 x0Var;
        MessageObject messageObject2;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject3;
        ac acVar = this.f37907a;
        int childCount = acVar.v.getChildCount();
        int i11 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i11 >= childCount) {
                return null;
            }
            View childAt = acVar.v.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                if (messageObject != null && (messageObject3 = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject3.getId() == messageObject.getId()) {
                    imageReceiver = u1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.x0) && (messageObject2 = (x0Var = (org.telegram.ui.Cells.x0) childAt).getMessageObject()) != null) {
                if (messageObject != null) {
                    if (messageObject2.getId() == messageObject.getId()) {
                        imageReceiver = x0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject2.photoThumbs != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= messageObject2.photoThumbs.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = messageObject2.photoThumbs.get(i12).location;
                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                            imageReceiver = x0Var.getPhotoImage();
                            break;
                        }
                        i12++;
                    }
                }
            }
            if (imageReceiver != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                kv0 kv0Var = new kv0();
                kv0Var.f37752b = iArr[0];
                kv0Var.f37753c = iArr[1];
                kv0Var.d = acVar.v;
                kv0Var.f37751a = imageReceiver;
                kv0Var.e = imageReceiver.getBitmapSafe();
                kv0Var.h = imageReceiver.getRoundRadius(true);
                kv0Var.f37759l = true;
                return kv0Var;
            }
            i11++;
        }
    }
}
