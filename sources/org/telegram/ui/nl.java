package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class nl extends bu0 {
    public final Bitmap f39493a;
    public final ArrayList f39494b;
    public final sn f39495c;

    public nl(sn snVar, Bitmap bitmap, ArrayList arrayList) {
        this.f39495c = snVar;
        this.f39493a = bitmap;
        this.f39494b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f39493a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f39495c.r((MediaController.PhotoEntry) this.f39494b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
