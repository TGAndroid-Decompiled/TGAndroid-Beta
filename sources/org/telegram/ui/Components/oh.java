package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class oh extends org.telegram.ui.pt0 {
    public final MediaController.PhotoEntry f31363a;
    public final ni f31364b;

    public oh(ni niVar, MediaController.PhotoEntry photoEntry) {
        this.f31364b = niVar;
        this.f31363a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        ni niVar = this.f31364b;
        niVar.f31033o2 = true;
        if (niVar.V1 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.f31363a;
        photoEntry.editedInfo = videoEditedInfo;
        c5.a0(niVar.F1, niVar.j1() + 1, 0L, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f26255p1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f26254o1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                oh.this.f31364b.V1.B1(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
