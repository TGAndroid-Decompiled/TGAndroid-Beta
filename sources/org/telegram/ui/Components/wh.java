package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class wh extends org.telegram.ui.tu0 {
    public final MediaController.PhotoEntry f30050a;
    public final vi f30051b;

    public wh(vi viVar, MediaController.PhotoEntry photoEntry) {
        this.f30051b = viVar;
        this.f30050a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        vi viVar = this.f30051b;
        viVar.f29140s2 = true;
        if (viVar.Z1 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.f30050a;
        photoEntry.editedInfo = videoEditedInfo;
        d5.a0(viVar.J1, viVar.j1() + 1, 0L, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f22122t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f22121s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                wh.this.f30051b.Z1.C1(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
