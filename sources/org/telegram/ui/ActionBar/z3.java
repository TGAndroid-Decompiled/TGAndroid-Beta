package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z3 implements Utilities.Callback {
    public final Utilities.Callback f20539a;
    public final TLRPC.WallPaper f20540b;
    public final int f20541c;
    public final int d;
    public final long e;

    public z3(Utilities.Callback callback, TLRPC.WallPaper wallPaper, int i10, int i11, long j10) {
        this.f20539a = callback;
        this.f20540b = wallPaper;
        this.f20541c = i10;
        this.d = i11;
        this.e = j10;
    }

    @Override
    public final void run(Object obj) {
        eg.a aVar = (eg.a) obj;
        Utilities.Callback callback = this.f20539a;
        if (aVar != null) {
            callback.run(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.f20540b;
        ImageLocation forDocument = ImageLocation.getForDocument(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setAllowLoadingOnAttachedOnly(false);
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        imageReceiver.setImage(forDocument, (min / AndroidUtilities.density) + "_" + (max / AndroidUtilities.density) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.setDelegate(new org.telegram.tgnet.g(this.f20541c, this.d, this.e, callback));
        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
    }
}
