package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class z3 implements Utilities.Callback {

    public final Utilities.Callback f23995a;

    public final TLRPC.WallPaper f23996b;

    public final int f23997c;
    public final int d;

    public final long f23998e;

    public z3(Utilities.Callback callback, TLRPC.WallPaper wallPaper, int i10, int i11, long j10) {
        this.f23995a = callback;
        this.f23996b = wallPaper;
        this.f23997c = i10;
        this.d = i11;
        this.f23998e = j10;
    }

    @Override
    public final void run(Object obj) {
        mf.a aVar = (mf.a) obj;
        Utilities.Callback callback = this.f23995a;
        if (aVar != null) {
            callback.run(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.f23996b;
        ImageLocation forDocument = ImageLocation.getForDocument(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setAllowLoadingOnAttachedOnly(false);
        Point point = AndroidUtilities.displaySize;
        int iMin = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        imageReceiver.setImage(forDocument, (iMin / AndroidUtilities.density) + "_" + (Math.max(point2.x, point2.y) / AndroidUtilities.density) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.setDelegate(new org.telegram.tgnet.f(this.f23997c, this.d, this.f23998e, callback));
        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
    }
}
