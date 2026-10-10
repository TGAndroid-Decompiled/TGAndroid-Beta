package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class zh extends org.telegram.ui.uu0 {
    public final MediaController.PhotoEntry f33607a;
    public final yi f33608b;

    public zh(yi yiVar, MediaController.PhotoEntry photoEntry) {
        this.f33608b = yiVar;
        this.f33607a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        yi yiVar = this.f33608b;
        yiVar.f33286v2 = true;
        if (yiVar.f33226c2 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.f33607a;
        photoEntry.editedInfo = videoEditedInfo;
        g5.Z(yiVar.M1, yiVar.l1() + 1, 0L, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f24028t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f24027s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                zh.this.f33608b.f33226c2.I1(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
