package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class lh extends org.telegram.ui.rt0 {
    public final MediaController.PhotoEntry f30451a;
    public final ki f30452b;

    public lh(ki kiVar, MediaController.PhotoEntry photoEntry) {
        this.f30452b = kiVar;
        this.f30451a = photoEntry;
    }

    @Override
    public final void o(int i9, VideoEditedInfo videoEditedInfo, final boolean z10, final int i10, int i11, final boolean z11) {
        ki kiVar = this.f30452b;
        kiVar.f30142o2 = true;
        if (kiVar.V1 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.f30451a;
        photoEntry.editedInfo = videoEditedInfo;
        y4.a0(kiVar.F1, kiVar.j1() + 1, 0L, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f26244p1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f26243o1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                lh.this.f30452b.V1.L(7, true, z10, i10, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
