package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class lh extends org.telegram.ui.fu0 {
    public final MediaController.PhotoEntry f28756a;
    public final mi f28757b;

    public lh(mi miVar, MediaController.PhotoEntry photoEntry) {
        this.f28757b = miVar;
        this.f28756a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z4, final int i11, int i12, final boolean z10) {
        mi miVar = this.f28757b;
        miVar.f29100p2 = true;
        if (miVar.W1 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.f28756a;
        photoEntry.editedInfo = videoEditedInfo;
        z4.a0(miVar.G1, miVar.j1() + 1, 0L, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f24741q1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f24740p1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                lh.this.f28757b.W1.I1(7, true, z4, i11, 0, 0L, false, z10, ((Long) obj).longValue());
            }
        });
    }
}
