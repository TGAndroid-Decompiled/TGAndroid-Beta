package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class nl extends gu0 {
    public final Bitmap f41949a;
    public final ArrayList f41950b;
    public final un f41951c;

    public nl(un unVar, Bitmap bitmap, ArrayList arrayList) {
        this.f41951c = unVar;
        this.f41949a = bitmap;
        this.f41950b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f41949a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f41951c.r((MediaController.PhotoEntry) this.f41950b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
