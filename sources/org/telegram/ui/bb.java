package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class bb extends st0 {

    public final qb f36768a;

    public bb(qb qbVar) {
        this.f36768a = qbVar;
    }

    @Override
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.v0 v0Var;
        MessageObject messageObject2;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject3;
        qb qbVar = this.f36768a;
        int childCount = qbVar.A.getChildCount();
        int i11 = 0;
        while (true) {
            ImageReceiver photoImage = null;
            if (i11 >= childCount) {
                return null;
            }
            View childAt = qbVar.A.getChildAt(i11);
            if (!(childAt instanceof org.telegram.ui.Cells.s1)) {
                if ((childAt instanceof org.telegram.ui.Cells.v0) && (messageObject2 = (v0Var = (org.telegram.ui.Cells.v0) childAt).getMessageObject()) != null) {
                    if (messageObject == null) {
                        if (fileLocation != null && messageObject2.photoThumbs != null) {
                            for (int i12 = 0; i12 < messageObject2.photoThumbs.size(); i12++) {
                                TLRPC.FileLocation fileLocation2 = messageObject2.photoThumbs.get(i12).location;
                                if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                                    photoImage = v0Var.getPhotoImage();
                                    break;
                                }
                            }
                        }
                    } else if (messageObject2.getId() == messageObject.getId()) {
                        photoImage = v0Var.getPhotoImage();
                    }
                }
            } else if (messageObject != null && (messageObject3 = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject3.getId() == messageObject.getId()) {
                photoImage = s1Var.getPhotoImage();
            }
            if (photoImage != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                cu0 cu0Var = new cu0();
                cu0Var.f37154b = iArr[0];
                cu0Var.f37155c = iArr[1];
                cu0Var.d = qbVar.A;
                cu0Var.f37153a = photoImage;
                cu0Var.f37156e = photoImage.getBitmapSafe();
                cu0Var.h = photoImage.getRoundRadius(true);
                cu0Var.f37162l = true;
                return cu0Var;
            }
            i11++;
        }
    }
}
