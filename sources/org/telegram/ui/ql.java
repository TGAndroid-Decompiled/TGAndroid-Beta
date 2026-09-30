package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class ql extends lu0 {
    public final Bitmap f37040a;
    public final ArrayList f37041b;
    public final wn f37042c;

    public ql(wn wnVar, Bitmap bitmap, ArrayList arrayList) {
        this.f37042c = wnVar;
        this.f37040a = bitmap;
        this.f37041b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f37040a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f37042c.q((MediaController.PhotoEntry) this.f37041b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
