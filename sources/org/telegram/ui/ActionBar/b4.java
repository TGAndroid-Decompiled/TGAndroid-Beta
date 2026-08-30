package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class b4 implements Utilities.Callback {
    public final Utilities.Callback f19526a;
    public final TLRPC.WallPaper f19527b;
    public final int f19528c;
    public final int d;
    public final long e;

    public b4(Utilities.Callback callback, TLRPC.WallPaper wallPaper, int i10, int i11, long j10) {
        this.f19526a = callback;
        this.f19527b = wallPaper;
        this.f19528c = i10;
        this.d = i11;
        this.e = j10;
    }

    @Override
    public final void run(Object obj) {
        qf.a aVar = (qf.a) obj;
        Utilities.Callback callback = this.f19526a;
        if (aVar != null) {
            callback.run(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.f19527b;
        ImageLocation forDocument = ImageLocation.getForDocument(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setAllowLoadingOnAttachedOnly(false);
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        imageReceiver.setImage(forDocument, (min / AndroidUtilities.density) + "_" + (max / AndroidUtilities.density) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.setDelegate(new org.telegram.tgnet.f(this.f19528c, this.d, this.e, callback));
        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
    }
}
