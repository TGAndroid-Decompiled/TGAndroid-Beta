package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class oi extends org.telegram.ui.ou0 {
    public final MediaController.PhotoEntry f29467a;
    public final xi f29468b;

    public oi(xi xiVar, MediaController.PhotoEntry photoEntry) {
        this.f29468b = xiVar;
        this.f29467a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        xi xiVar = this.f29468b;
        xiVar.f32952s2 = true;
        if (xiVar.Z1 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.f29467a;
        photoEntry.editedInfo = videoEditedInfo;
        e5.a0(xiVar.J1, xiVar.j1() + 1, 0L, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f24028t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f24027s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                oi.this.f29468b.Z1.B1(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
