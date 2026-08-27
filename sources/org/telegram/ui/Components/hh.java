package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;

public final class hh extends org.telegram.ui.st0 {

    public final MediaController.PhotoEntry f29017a;

    public final gi f29018b;

    public hh(gi giVar, MediaController.PhotoEntry photoEntry) {
        this.f29018b = giVar;
        this.f29017a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        gi giVar = this.f29018b;
        giVar.f28678o2 = true;
        if (giVar.V1 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.f29017a;
        photoEntry.editedInfo = videoEditedInfo;
        y4.a0(giVar.F1, giVar.j1() + 1, 0L, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f26240p1;
                arrayList.clear();
                HashMap map = ChatAttachAlertPhotoLayout.f26239o1;
                map.clear();
                arrayList.add(0);
                map.put(0, photoEntry);
                this.f28622a.f29018b.V1.n0(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
