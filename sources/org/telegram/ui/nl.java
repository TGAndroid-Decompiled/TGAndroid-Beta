package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class nl extends gu0 {
    public final Bitmap f41946a;
    public final ArrayList f41947b;
    public final un f41948c;

    public nl(un unVar, Bitmap bitmap, ArrayList arrayList) {
        this.f41948c = unVar;
        this.f41946a = bitmap;
        this.f41947b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f41946a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f41948c.r((MediaController.PhotoEntry) this.f41947b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
