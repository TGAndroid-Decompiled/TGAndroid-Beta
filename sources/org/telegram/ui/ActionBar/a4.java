package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a4 implements Utilities.Callback {
    public final Utilities.Callback f20379a;
    public final TLRPC.WallPaper f20380b;
    public final int f20381c;
    public final int d;
    public final long f20382e;

    public a4(Utilities.Callback callback, TLRPC.WallPaper wallPaper, int i10, int i11, long j3) {
        this.f20379a = callback;
        this.f20380b = wallPaper;
        this.f20381c = i10;
        this.d = i11;
        this.f20382e = j3;
    }

    @Override
    public final void run(Object obj) {
        dg.a aVar = (dg.a) obj;
        Utilities.Callback callback = this.f20379a;
        if (aVar != null) {
            callback.run(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.f20380b;
        ImageLocation forDocument = ImageLocation.getForDocument(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setAllowLoadingOnAttachedOnly(false);
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        imageReceiver.setImage(forDocument, (min / AndroidUtilities.density) + "_" + (max / AndroidUtilities.density) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.setDelegate(new org.telegram.tgnet.g(this.f20381c, this.d, this.f20382e, callback));
        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
    }
}
