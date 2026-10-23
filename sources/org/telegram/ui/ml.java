package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class ml extends cu0 {
    public final Bitmap f39619a;
    public final ArrayList f39620b;
    public final sn f39621c;

    public ml(sn snVar, Bitmap bitmap, ArrayList arrayList) {
        this.f39621c = snVar;
        this.f39619a = bitmap;
        this.f39620b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f39619a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f39621c.s((MediaController.PhotoEntry) this.f39620b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
