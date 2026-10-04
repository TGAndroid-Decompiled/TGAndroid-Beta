package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class ql extends ou0 {
    public final Bitmap f39746a;
    public final ArrayList f39747b;
    public final yn f39748c;

    public ql(yn ynVar, Bitmap bitmap, ArrayList arrayList) {
        this.f39748c = ynVar;
        this.f39746a = bitmap;
        this.f39747b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f39746a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f39748c.q((MediaController.PhotoEntry) this.f39747b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
