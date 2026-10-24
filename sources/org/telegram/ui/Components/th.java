package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class th extends org.telegram.ui.bu0 {
    public final MediaController.PhotoEntry f30843a;
    public final ri f30844b;

    public th(ri riVar, MediaController.PhotoEntry photoEntry) {
        this.f30844b = riVar;
        this.f30843a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        ri riVar = this.f30844b;
        riVar.f30209y2 = true;
        if (riVar.f30138c2 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.f30843a;
        photoEntry.editedInfo = videoEditedInfo;
        d5.Z(riVar.M1, riVar.o1() + 1, 0L, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f24226t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f24225s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                th.this.f30844b.f30138c2.b0(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
