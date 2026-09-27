package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class b4 implements Utilities.Callback {
    public final Utilities.Callback f18684a;
    public final TLRPC.WallPaper f18685b;
    public final int f18686c;
    public final int d;
    public final long e;

    public b4(Utilities.Callback callback, TLRPC.WallPaper wallPaper, int i10, int i11, long j3) {
        this.f18684a = callback;
        this.f18685b = wallPaper;
        this.f18686c = i10;
        this.d = i11;
        this.e = j3;
    }

    @Override
    public final void run(Object obj) {
        dg.a aVar = (dg.a) obj;
        Utilities.Callback callback = this.f18684a;
        if (aVar != null) {
            callback.run(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.f18685b;
        ImageLocation forDocument = ImageLocation.getForDocument(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setAllowLoadingOnAttachedOnly(false);
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        imageReceiver.setImage(forDocument, (min / AndroidUtilities.density) + "_" + (max / AndroidUtilities.density) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.setDelegate(new org.telegram.tgnet.g(this.f18686c, this.d, this.e, callback));
        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
    }
}
