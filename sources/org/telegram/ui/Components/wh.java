package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class wh extends org.telegram.ui.zu0 {
    public final MediaController.PhotoEntry f30577a;
    public final vi f30578b;

    public wh(vi viVar, MediaController.PhotoEntry photoEntry) {
        this.f30578b = viVar;
        this.f30577a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        vi viVar = this.f30578b;
        viVar.f29723v2 = true;
        if (viVar.f29664c2 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.f30577a;
        photoEntry.editedInfo = videoEditedInfo;
        g5.Z(viVar.M1, viVar.l1() + 1, 0L, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f22721t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f22720s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                wh.this.f30578b.f29664c2.b0(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
