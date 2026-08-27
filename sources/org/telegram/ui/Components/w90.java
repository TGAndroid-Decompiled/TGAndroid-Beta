package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

public final class w90 extends org.telegram.ui.st0 {

    public final aa0 f34149a;

    public w90(aa0 aa0Var) {
        this.f34149a = aa0Var;
    }

    @Override
    public final org.telegram.ui.cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        if (i10 >= 0) {
            aa0 aa0Var = this.f34149a;
            if (i10 < aa0Var.L.size()) {
                int childCount = aa0Var.getListView().getChildCount();
                Object obj = aa0Var.L.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = aa0Var.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.d2) {
                        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                        if (d2Var.getResult() == obj) {
                            photoImage = d2Var.getPhotoImage();
                        } else {
                            photoImage = null;
                        }
                    } else {
                        photoImage = null;
                    }
                    if (photoImage != null) {
                        int[] iArr = new int[2];
                        childAt.getLocationInWindow(iArr);
                        org.telegram.ui.cu0 cu0Var = new org.telegram.ui.cu0();
                        cu0Var.f37154b = iArr[0];
                        cu0Var.f37155c = iArr[1];
                        cu0Var.d = aa0Var.getListView();
                        cu0Var.f37153a = photoImage;
                        cu0Var.f37156e = photoImage.getBitmapSafe();
                        cu0Var.h = photoImage.getRoundRadius(true);
                        return cu0Var;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            aa0 aa0Var = this.f34149a;
            if (i10 >= aa0Var.L.size()) {
                return;
            }
            aa0Var.f26708x.c((TLRPC.BotInlineResult) aa0Var.L.get(i10), z10, i11);
        }
    }
}
