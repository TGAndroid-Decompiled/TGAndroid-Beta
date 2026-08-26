package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wallpaper.WallpaperBitmapHolder;
import org.telegram.tgnet.TLRPC;

public final class EmojiThemes$$ExternalSyntheticLambda1 implements Utilities.Callback {
    public final Utilities.Callback f$0;
    public final TLRPC.WallPaper f$1;
    public final int f$2;
    public final int f$3;
    public final long f$4;

    public EmojiThemes$$ExternalSyntheticLambda1(Utilities.Callback callback, TLRPC.WallPaper wallPaper, int i, int i2, long j) {
        this.f$0 = callback;
        this.f$1 = wallPaper;
        this.f$2 = i;
        this.f$3 = i2;
        this.f$4 = j;
    }

    @Override
    public final void run(Object obj) {
        WallpaperBitmapHolder wallpaperBitmapHolder = (WallpaperBitmapHolder) obj;
        Utilities.Callback callback = this.f$0;
        if (wallpaperBitmapHolder != null) {
            callback.run(wallpaperBitmapHolder);
            return;
        }
        TLRPC.WallPaper wallPaper = this.f$1;
        ImageLocation forDocument = ImageLocation.getForDocument(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setAllowLoadingOnAttachedOnly(false);
        Point point = AndroidUtilities.displaySize;
        int iMin = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        imageReceiver.setImage(forDocument, (iMin / AndroidUtilities.density) + "_" + (Math.max(point2.x, point2.y) / AndroidUtilities.density) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.setDelegate(new EmojiThemes$$ExternalSyntheticLambda5(this.f$2, this.f$4, this.f$3, callback));
        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
    }
}
