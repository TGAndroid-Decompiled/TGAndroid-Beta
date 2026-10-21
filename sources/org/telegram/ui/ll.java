package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class ll extends zt0 {
    public final Bitmap f38947a;
    public final ArrayList f38948b;
    public final qn f38949c;

    public ll(qn qnVar, Bitmap bitmap, ArrayList arrayList) {
        this.f38949c = qnVar;
        this.f38947a = bitmap;
        this.f38948b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f38947a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f38949c.s((MediaController.PhotoEntry) this.f38948b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
