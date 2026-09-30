package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z3 implements Utilities.Callback {
    public final Utilities.Callback f19967a;
    public final TLRPC.WallPaper f19968b;
    public final int f19969c;
    public final int d;
    public final long e;

    public z3(Utilities.Callback callback, TLRPC.WallPaper wallPaper, int i10, int i11, long j3) {
        this.f19967a = callback;
        this.f19968b = wallPaper;
        this.f19969c = i10;
        this.d = i11;
        this.e = j3;
    }

    @Override
    public final void run(Object obj) {
        dg.a aVar = (dg.a) obj;
        Utilities.Callback callback = this.f19967a;
        if (aVar != null) {
            callback.run(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.f19968b;
        ImageLocation forDocument = ImageLocation.getForDocument(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setAllowLoadingOnAttachedOnly(false);
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        imageReceiver.setImage(forDocument, (min / AndroidUtilities.density) + "_" + (max / AndroidUtilities.density) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.setDelegate(new org.telegram.tgnet.g(this.f19969c, this.d, this.e, callback));
        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
    }
}
