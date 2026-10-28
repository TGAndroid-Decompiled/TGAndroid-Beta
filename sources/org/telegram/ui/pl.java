package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class pl extends iu0 {
    public final Bitmap f42452a;
    public final ArrayList f42453b;
    public final wn f42454c;

    public pl(wn wnVar, Bitmap bitmap, ArrayList arrayList) {
        this.f42454c = wnVar;
        this.f42452a = bitmap;
        this.f42453b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f42452a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f42454c.r((MediaController.PhotoEntry) this.f42453b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
