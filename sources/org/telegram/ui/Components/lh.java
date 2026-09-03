package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class lh extends org.telegram.ui.fu0 {
    public final MediaController.PhotoEntry f26675a;
    public final li f26676b;

    public lh(li liVar, MediaController.PhotoEntry photoEntry) {
        this.f26676b = liVar;
        this.f26675a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z4, final int i11, int i12, final boolean z10) {
        li liVar = this.f26676b;
        liVar.f26726p2 = true;
        if (liVar.W1 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.f26675a;
        photoEntry.editedInfo = videoEditedInfo;
        z4.a0(liVar.G1, liVar.j1() + 1, 0L, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f22870q1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f22869p1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                lh.this.f26676b.W1.G1(7, true, z4, i11, 0, 0L, false, z10, ((Long) obj).longValue());
            }
        });
    }
}
