package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class ql extends lu0 {
    public final Bitmap f36925a;
    public final ArrayList f36926b;
    public final wn f36927c;

    public ql(wn wnVar, Bitmap bitmap, ArrayList arrayList) {
        this.f36927c = wnVar;
        this.f36925a = bitmap;
        this.f36926b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f36925a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f36927c.q((MediaController.PhotoEntry) this.f36926b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
