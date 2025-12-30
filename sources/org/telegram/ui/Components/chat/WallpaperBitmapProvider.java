package org.telegram.ui.Components.chat;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ChatBackgroundDrawable;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceWrapped;
import org.telegram.ui.Components.blur3.utils.BitmapMemoizedMetadata;

public class WallpaperBitmapProvider {
    private static final Rect tmpRect = new Rect();
    private final BlurredBackgroundSourceColor sourceColor = new BlurredBackgroundSourceColor();
    private final BlurredBackgroundSourceBitmap sourceBitmap = new BlurredBackgroundSourceBitmap();
    private final BitmapMemoizedMetadata blurredFromBitmap = new BitmapMemoizedMetadata(new BitmapMemoizedMetadata.Provider() {
        @Override
        public final Object get(Bitmap bitmap) {
            return WallpaperBitmapProvider.blurBitmap(bitmap);
        }

        @Override
        public boolean isValid(Object obj) {
            return BitmapMemoizedMetadata.Provider.CC.$default$isValid(this, obj);
        }
    });
    private final BitmapMemoizedMetadata navbarColorFromBitmap = new BitmapMemoizedMetadata(new BitmapMemoizedMetadata.Provider() {
        @Override
        public final Object get(Bitmap bitmap) {
            return Integer.valueOf(WallpaperBitmapProvider.averageBottomColor(bitmap));
        }

        @Override
        public boolean isValid(Object obj) {
            return BitmapMemoizedMetadata.Provider.CC.$default$isValid(this, obj);
        }
    });

    public BlurredBackgroundSource updateSourceFromBackgroundViewDrawable(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            this.sourceColor.setColor(((ColorDrawable) drawable).getColor());
            return this.sourceColor;
        }
        if (drawable instanceof MotionBackgroundDrawable) {
            MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
            if (motionBackgroundDrawable.getIntensity() < 0) {
                this.sourceColor.setColor(-16777216);
                return this.sourceColor;
            }
            this.sourceBitmap.setBitmap(motionBackgroundDrawable.getBitmap());
            return this.sourceBitmap;
        }
        if (drawable instanceof BitmapDrawable) {
            this.sourceBitmap.setBitmap((Bitmap) this.blurredFromBitmap.get(((BitmapDrawable) drawable).getBitmap()));
            return this.sourceBitmap;
        }
        if (drawable instanceof ChatBackgroundDrawable) {
            return updateSourceFromBackgroundViewDrawable(((ChatBackgroundDrawable) drawable).getDrawable(false));
        }
        if (drawable != null) {
            Canvas canvasBeginRecording = this.sourceBitmap.beginRecording(120, 160);
            Rect rect = tmpRect;
            rect.set(drawable.getBounds());
            drawable.setBounds(0, 0, 120, 160);
            drawable.draw(canvasBeginRecording);
            drawable.setBounds(rect);
            this.sourceBitmap.endRecording();
            BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = this.sourceBitmap;
            blurredBackgroundSourceBitmap.setBitmap((Bitmap) this.blurredFromBitmap.get(blurredBackgroundSourceBitmap.getBitmap()));
        }
        return this.sourceBitmap;
    }

    public int getNavigationBarColor(BlurredBackgroundSource blurredBackgroundSource) {
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceColor) {
            return ((BlurredBackgroundSourceColor) blurredBackgroundSource).getColor();
        }
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceBitmap) {
            return ((Integer) this.navbarColorFromBitmap.get(((BlurredBackgroundSourceBitmap) blurredBackgroundSource).getBitmap())).intValue();
        }
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceWrapped) {
            return getNavigationBarColor(((BlurredBackgroundSourceWrapped) blurredBackgroundSource).getSource());
        }
        return 0;
    }

    public static Bitmap blurBitmap(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        Bitmap bitmapStackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
        bitmapStackBlurBitmapWithScaleFactor.setHasAlpha(false);
        return bitmapStackBlurBitmapWithScaleFactor;
    }

    public static int averageBottomColor(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return 0;
        }
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int i = (int) (height * 0.1f);
        int i2 = height - i;
        int i3 = width * i;
        int[] iArr = new int[i3];
        bitmap.getPixels(iArr, 0, width, 0, i2, width, i);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = iArr[i5];
            j4 += (i6 >>> 24) & 255;
            j3 += (i6 >> 16) & 255;
            j2 += (i6 >> 8) & 255;
            j += i6 & 255;
            i4++;
        }
        if (i4 == 0) {
            return 0;
        }
        long j5 = i4;
        return Color.argb((int) (j4 / j5), (int) (j3 / j5), (int) (j2 / j5), (int) (j / j5));
    }
}
