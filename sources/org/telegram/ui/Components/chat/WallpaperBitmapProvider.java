package org.telegram.ui.Components.chat;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ChatBackgroundDrawable;
import org.telegram.ui.Components.MotionBackgroundDrawable;

public class WallpaperBitmapProvider {
    private final HashMap cachedBitmaps = new HashMap();

    public Bitmap bitmapFromDrawable(Drawable drawable) {
        Bitmap bitmap;
        Bitmap bitmap2 = (Bitmap) this.cachedBitmaps.get(drawable);
        if (bitmap2 != null) {
            return bitmap2;
        }
        if (drawable instanceof ColorDrawable) {
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(((ColorDrawable) drawable).getColor());
            this.cachedBitmaps.put(drawable, createBitmap);
            return createBitmap;
        }
        if (drawable instanceof ChatBackgroundDrawable) {
            return bitmapFromDrawable(((ChatBackgroundDrawable) drawable).getDrawable(false));
        }
        if (drawable instanceof MotionBackgroundDrawable) {
            MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
            Bitmap createBitmap2 = Bitmap.createBitmap(motionBackgroundDrawable.getBitmap());
            if (motionBackgroundDrawable.getIntensity() < 0) {
                createBitmap2.eraseColor(-16777216);
            }
            this.cachedBitmaps.put(drawable, createBitmap2);
            return createBitmap2;
        }
        if (!(drawable instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) drawable).getBitmap()) == null || bitmap.isRecycled()) {
            return null;
        }
        Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 120.0f, bitmap.getHeight() / 160.0f));
        this.cachedBitmaps.put(drawable, stackBlurBitmapWithScaleFactor);
        return stackBlurBitmapWithScaleFactor;
    }
}
