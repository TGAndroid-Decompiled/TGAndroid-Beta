package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class lh extends org.telegram.ui.yt0 {
    public final MediaController.PhotoEntry f26678a;
    public final li f26679b;

    public lh(li liVar, MediaController.PhotoEntry photoEntry) {
        this.f26679b = liVar;
        this.f26678a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z4, final int i11, int i12, final boolean z10) {
        li liVar = this.f26679b;
        liVar.f26730p2 = true;
        if (liVar.W1 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.f26678a;
        photoEntry.editedInfo = videoEditedInfo;
        z4.a0(liVar.G1, liVar.j1() + 1, 0L, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f22897q1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f22896p1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                lh.this.f26679b.W1.H(7, true, z4, i11, 0, 0L, false, z10, ((Long) obj).longValue());
            }
        });
    }
}
