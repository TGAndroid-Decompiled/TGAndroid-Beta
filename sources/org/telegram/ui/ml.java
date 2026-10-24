package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class ml extends bu0 {
    public final Bitmap f39616a;
    public final ArrayList f39617b;
    public final sn f39618c;

    public ml(sn snVar, Bitmap bitmap, ArrayList arrayList) {
        this.f39618c = snVar;
        this.f39616a = bitmap;
        this.f39617b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f39616a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f39618c.s((MediaController.PhotoEntry) this.f39617b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
