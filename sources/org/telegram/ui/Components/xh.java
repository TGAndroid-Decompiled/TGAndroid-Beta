package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class xh extends org.telegram.ui.mu0 {
    public final MediaController.PhotoEntry f29995a;
    public final wi f29996b;

    public xh(wi wiVar, MediaController.PhotoEntry photoEntry) {
        this.f29996b = wiVar;
        this.f29995a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, final boolean z10, final int i11, int i12, final boolean z11) {
        wi wiVar = this.f29996b;
        wiVar.f29707s2 = true;
        if (wiVar.Z1 == null) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = this.f29995a;
        photoEntry.editedInfo = videoEditedInfo;
        e5.a0(wiVar.J1, wiVar.j1() + 1, 0L, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f21872t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f21871s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, photoEntry);
                xh.this.f29996b.Z1.B1(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
