package org.telegram.ui.Components.chat;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ChatBackgroundDrawable;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;

public class WallpaperBitmapProvider {
    private static final Rect tmpRect = new Rect();
    private long lastInputBitmapGeneration;
    private final BlurredBackgroundSourceColor sourceColor = new BlurredBackgroundSourceColor();
    private final BlurredBackgroundSourceBitmap sourceBitmap = new BlurredBackgroundSourceBitmap();
    private WeakReference lastInputBitmap = new WeakReference(null);
    private WeakReference lastOutputBitmap = new WeakReference(null);

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
            this.sourceBitmap.setBitmap(blurBitmap(blurBitmap(((BitmapDrawable) drawable).getBitmap())));
            return this.sourceBitmap;
        }
        if (drawable instanceof ChatBackgroundDrawable) {
            return updateSourceFromBackgroundViewDrawable(((ChatBackgroundDrawable) drawable).getDrawable(false));
        }
        Canvas beginRecording = this.sourceBitmap.beginRecording(120, 160);
        Rect rect = tmpRect;
        rect.set(drawable.getBounds());
        drawable.setBounds(0, 0, 120, 160);
        drawable.draw(beginRecording);
        drawable.setBounds(rect);
        this.sourceBitmap.endRecording();
        BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = this.sourceBitmap;
        blurredBackgroundSourceBitmap.setBitmap(blurBitmap(blurredBackgroundSourceBitmap.getBitmap()));
        return this.sourceBitmap;
    }

    private Bitmap blurBitmap(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        Bitmap bitmap2 = (Bitmap) this.lastInputBitmap.get();
        Bitmap bitmap3 = (Bitmap) this.lastOutputBitmap.get();
        if (bitmap2 == bitmap && bitmap.getGenerationId() == this.lastInputBitmapGeneration && bitmap3 != null) {
            return bitmap3;
        }
        Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 120.0f, bitmap.getHeight() / 160.0f));
        this.lastInputBitmap = new WeakReference(bitmap);
        this.lastOutputBitmap = new WeakReference(stackBlurBitmapWithScaleFactor);
        this.lastInputBitmapGeneration = bitmap.getGenerationId();
        return stackBlurBitmapWithScaleFactor;
    }
}
