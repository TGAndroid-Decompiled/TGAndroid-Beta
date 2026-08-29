package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z3 implements Utilities.Callback {
    public final Utilities.Callback f24008a;
    public final TLRPC.WallPaper f24009b;
    public final int f24010c;
    public final int d;
    public final long f24011e;

    public z3(Utilities.Callback callback, TLRPC.WallPaper wallPaper, int i10, int i11, long j10) {
        this.f24008a = callback;
        this.f24009b = wallPaper;
        this.f24010c = i10;
        this.d = i11;
        this.f24011e = j10;
    }

    @Override
    public final void run(Object obj) {
        of.a aVar = (of.a) obj;
        Utilities.Callback callback = this.f24008a;
        if (aVar != null) {
            callback.run(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.f24009b;
        ImageLocation forDocument = ImageLocation.getForDocument(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setAllowLoadingOnAttachedOnly(false);
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        imageReceiver.setImage(forDocument, (min / AndroidUtilities.density) + "_" + (max / AndroidUtilities.density) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.setDelegate(new org.telegram.tgnet.f(this.f24010c, this.d, this.f24011e, callback));
        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
    }
}
