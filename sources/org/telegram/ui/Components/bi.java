package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class bi extends org.telegram.ui.wu0 {
    public final MediaController.PhotoEntry f24647a;
    public final aj f24648b;

    public bi(aj ajVar, MediaController.PhotoEntry photoEntry) {
        this.f24648b = ajVar;
        this.f24647a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        aj ajVar = this.f24648b;
        ajVar.f24389v2 = true;
        if (ajVar.f24329c2 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.f24647a;
        photoEntry.editedInfo = videoEditedInfo;
        g5.Z(ajVar.M1, ajVar.l1() + 1, 0L, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f23802t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f23801s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                bi.this.f24648b.f24329c2.I1(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
