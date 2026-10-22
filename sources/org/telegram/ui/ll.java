package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class ll extends zt0 {
    public final Bitmap f38950a;
    public final ArrayList f38951b;
    public final qn f38952c;

    public ll(qn qnVar, Bitmap bitmap, ArrayList arrayList) {
        this.f38952c = qnVar;
        this.f38950a = bitmap;
        this.f38951b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f38950a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f38952c.s((MediaController.PhotoEntry) this.f38951b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
