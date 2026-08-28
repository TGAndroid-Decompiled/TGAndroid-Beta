package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class il extends rt0 {
    public final Bitmap f39205a;
    public final ArrayList f39206b;
    public final qn f39207c;

    public il(qn qnVar, Bitmap bitmap, ArrayList arrayList) {
        this.f39207c = qnVar;
        this.f39205a = bitmap;
        this.f39206b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i9) {
        return new ImageReceiver.BitmapHolder(this.f39205a, (String) null, 0);
    }

    @Override
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        this.f39207c.r((MediaController.PhotoEntry) this.f39206b.get(0), videoEditedInfo, z10, i10, 0, z11, 0L);
    }
}
