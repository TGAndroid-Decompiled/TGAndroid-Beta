package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;

public final class kl extends st0 {

    public final Bitmap f39802a;

    public final ArrayList f39803b;

    public final rn f39804c;

    public kl(rn rnVar, Bitmap bitmap, ArrayList arrayList) {
        this.f39804c = rnVar;
        this.f39802a = bitmap;
        this.f39803b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f39802a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f39804c.s((MediaController.PhotoEntry) this.f39803b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
