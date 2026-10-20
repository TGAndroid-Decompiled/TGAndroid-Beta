package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class vh extends org.telegram.ui.zt0 {
    public final MediaController.PhotoEntry f31253a;
    public final ti f31254b;

    public vh(ti tiVar, MediaController.PhotoEntry photoEntry) {
        this.f31254b = tiVar;
        this.f31253a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        ti tiVar = this.f31254b;
        tiVar.f30596v2 = true;
        if (tiVar.f30537c2 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.f31253a;
        photoEntry.editedInfo = videoEditedInfo;
        f5.Z(tiVar.M1, tiVar.l1() + 1, 0L, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f24080t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f24079s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                vh.this.f31254b.f30537c2.b0(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
