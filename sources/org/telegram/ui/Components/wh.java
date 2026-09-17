package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class wh extends org.telegram.ui.su0 {
    public final MediaController.PhotoEntry f32269a;
    public final vi f32270b;

    public wh(vi viVar, MediaController.PhotoEntry photoEntry) {
        this.f32270b = viVar;
        this.f32269a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        vi viVar = this.f32270b;
        viVar.f31322s2 = true;
        if (viVar.Z1 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.f32269a;
        photoEntry.editedInfo = videoEditedInfo;
        e5.a0(viVar.J1, viVar.j1() + 1, 0L, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f23835t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f23834s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                wh.this.f32270b.Z1.l0(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
