package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wallpaper.WallpaperBitmapHolder;
import org.telegram.messenger.wallpaper.WallpaperGiftBitmapDrawable;
import org.telegram.tgnet.ConnectionsManager;

public final class EmojiThemes$$ExternalSyntheticLambda4 implements OnSuccessListener, OnFailureListener, ImageReceiver.ImageReceiverDelegate {
    public final int f$0;
    public final Object f$1;
    public final int f$2;
    public final long f$3;

    public EmojiThemes$$ExternalSyntheticLambda4(int i, long j, String str, int i2) {
        this.f$0 = i;
        this.f$3 = j;
        this.f$2 = i2;
        this.f$1 = str;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        List list;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        ImageReceiver.BitmapHolder drawableSafe = imageReceiver.getDrawableSafe();
        if (!z || bitmapSafe == null) {
            return;
        }
        if (drawableSafe != null) {
            Drawable drawable = drawableSafe.drawable;
            if (drawable instanceof WallpaperGiftBitmapDrawable) {
                list = ((WallpaperGiftBitmapDrawable) drawable).patternPositions;
            } else {
                list = null;
            }
        } else {
            list = null;
        }
        Bitmap bitmap = bitmapSafe.bitmap;
        if (bitmap == null) {
            Drawable drawable2 = bitmapSafe.drawable;
            if (drawable2 instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable2).getBitmap();
            }
        }
        WallpaperBitmapHolder wallpaperBitmapHolder = new WallpaperBitmapHolder(bitmap, this.f$0, list);
        Utilities.Callback callback = (Utilities.Callback) this.f$1;
        if (callback != null) {
            callback.run(wallpaperBitmapHolder);
        }
        ChatThemeController.getInstance(this.f$2).saveWallpaperBitmap(wallpaperBitmapHolder, this.f$3);
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void onFailure(Exception exc) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$26(this.f$0, this.f$3, this.f$2, (String) this.f$1, exc);
    }

    @Override
    public void onSuccess(Object obj) {
        long j = this.f$3;
        int i = this.f$2;
        ConnectionsManager.lambda$onIntegrityCheckClassic$25(this.f$0, j, i, (String) this.f$1, (IntegrityTokenResponse) obj);
    }

    public EmojiThemes$$ExternalSyntheticLambda4(int i, Utilities.Callback callback, int i2, long j) {
        this.f$0 = i;
        this.f$1 = callback;
        this.f$2 = i2;
        this.f$3 = j;
    }
}
