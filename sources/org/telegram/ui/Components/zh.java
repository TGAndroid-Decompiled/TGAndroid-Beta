package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class zh extends org.telegram.ui.tu0 {
    public final MediaController.PhotoEntry f29687a;
    public final yi f29688b;

    public zh(yi yiVar, MediaController.PhotoEntry photoEntry) {
        this.f29688b = yiVar;
        this.f29687a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        yi yiVar = this.f29688b;
        yiVar.f29408s2 = true;
        if (yiVar.Z1 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.f29687a;
        photoEntry.editedInfo = videoEditedInfo;
        d5.a0(yiVar.J1, yiVar.j1() + 1, 0L, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f20986t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f20985s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                zh.this.f29688b.Z1.A1(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
