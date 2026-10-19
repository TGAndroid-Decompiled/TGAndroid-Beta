package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class vh extends org.telegram.ui.zt0 {
    public final MediaController.PhotoEntry f31286a;
    public final ti f31287b;

    public vh(ti tiVar, MediaController.PhotoEntry photoEntry) {
        this.f31287b = tiVar;
        this.f31286a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        ti tiVar = this.f31287b;
        tiVar.f30585v2 = true;
        if (tiVar.f30526c2 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.f31286a;
        photoEntry.editedInfo = videoEditedInfo;
        f5.Z(tiVar.M1, tiVar.l1() + 1, 0L, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f24077t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f24076s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                vh.this.f31287b.f30526c2.b0(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
