package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class zh extends org.telegram.ui.tu0 {
    public final MediaController.PhotoEntry f33631a;
    public final yi f33632b;

    public zh(yi yiVar, MediaController.PhotoEntry photoEntry) {
        this.f33632b = yiVar;
        this.f33631a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        yi yiVar = this.f33632b;
        yiVar.f33340v2 = true;
        if (yiVar.f33280c2 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.f33631a;
        photoEntry.editedInfo = videoEditedInfo;
        g5.Z(yiVar.M1, yiVar.l1() + 1, 0L, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f24052t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f24051s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                zh.this.f33632b.f33280c2.I1(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
