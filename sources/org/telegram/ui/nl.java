package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class nl extends bu0 {
    public final Bitmap f39475a;
    public final ArrayList f39476b;
    public final sn f39477c;

    public nl(sn snVar, Bitmap bitmap, ArrayList arrayList) {
        this.f39477c = snVar;
        this.f39475a = bitmap;
        this.f39476b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f39475a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f39477c.r((MediaController.PhotoEntry) this.f39476b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
