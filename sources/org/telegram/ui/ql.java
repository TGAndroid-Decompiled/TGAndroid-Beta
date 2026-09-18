package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class ql extends tu0 {
    public final Bitmap f36843a;
    public final ArrayList f36844b;
    public final zn f36845c;

    public ql(zn znVar, Bitmap bitmap, ArrayList arrayList) {
        this.f36845c = znVar;
        this.f36843a = bitmap;
        this.f36844b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f36843a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f36845c.q((MediaController.PhotoEntry) this.f36844b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
