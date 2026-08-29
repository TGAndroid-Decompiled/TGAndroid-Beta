package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class ll extends pt0 {
    public final Bitmap f40241a;
    public final ArrayList f40242b;
    public final tn f40243c;

    public ll(tn tnVar, Bitmap bitmap, ArrayList arrayList) {
        this.f40243c = tnVar;
        this.f40241a = bitmap;
        this.f40242b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f40241a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f40243c.r((MediaController.PhotoEntry) this.f40242b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
