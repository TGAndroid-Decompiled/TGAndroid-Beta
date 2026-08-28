package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z3 implements Utilities.Callback {
    public final Utilities.Callback f24004a;
    public final TLRPC.WallPaper f24005b;
    public final int f24006c;
    public final int d;
    public final long f24007e;

    public z3(Utilities.Callback callback, TLRPC.WallPaper wallPaper, int i9, int i10, long j10) {
        this.f24004a = callback;
        this.f24005b = wallPaper;
        this.f24006c = i9;
        this.d = i10;
        this.f24007e = j10;
    }

    @Override
    public final void run(Object obj) {
        lf.a aVar = (lf.a) obj;
        Utilities.Callback callback = this.f24004a;
        if (aVar != null) {
            callback.run(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.f24005b;
        ImageLocation forDocument = ImageLocation.getForDocument(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setAllowLoadingOnAttachedOnly(false);
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        imageReceiver.setImage(forDocument, (min / AndroidUtilities.density) + "_" + (max / AndroidUtilities.density) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.setDelegate(new org.telegram.tgnet.f(this.f24006c, this.d, this.f24007e, callback));
        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
    }
}
