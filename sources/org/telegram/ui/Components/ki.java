package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class ki extends org.telegram.ui.iu0 {
    public final MediaController.PhotoEntry f29962a;
    public final ti f29963b;

    public ki(ti tiVar, MediaController.PhotoEntry photoEntry) {
        this.f29963b = tiVar;
        this.f29962a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        ti tiVar = this.f29963b;
        tiVar.f33053y2 = true;
        if (tiVar.f32982c2 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.f29962a;
        photoEntry.editedInfo = videoEditedInfo;
        g5.Z(tiVar.M1, tiVar.p1() + 1, 0L, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f26020t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f26019s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                ki.this.f29963b.f32982c2.p0(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
