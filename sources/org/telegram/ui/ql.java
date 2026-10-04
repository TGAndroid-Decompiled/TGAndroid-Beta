package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class ql extends ou0 {
    public final Bitmap f39745a;
    public final ArrayList f39746b;
    public final yn f39747c;

    public ql(yn ynVar, Bitmap bitmap, ArrayList arrayList) {
        this.f39747c = ynVar;
        this.f39745a = bitmap;
        this.f39746b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f39745a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f39747c.q((MediaController.PhotoEntry) this.f39746b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
