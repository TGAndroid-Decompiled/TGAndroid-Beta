package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;

public final class BlurBehindDrawable {
    public Bitmap[] backgroundBitmap;
    public Canvas[] backgroundBitmapCanvas;
    public final View behindView;
    public float blurAlpha;
    public Canvas[] blurCanvas;
    public Bitmap[] blurredBitmapTmp;
    public boolean error;
    public final Paint errorBlackoutPaint;
    public int lastH;
    public int lastW;
    public float panTranslationY;
    public final ChatActivity.AnonymousClass71 parentView;
    public boolean processingNextFrame;
    public DispatchQueue queue;
    public Bitmap[] renderingBitmap;
    public Canvas[] renderingBitmapCanvas;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean show;
    public int toolbarH;
    public final int type;
    public boolean wasDraw;
    public boolean invalidate = true;
    public boolean animateAlpha = true;
    public BlurBackgroundTask blurBackgroundTask = new BlurBackgroundTask();
    public final Paint emptyPaint = new Paint(2);

    public final class BlurBackgroundTask implements Runnable {
        public boolean canceled;
        public int height;
        public int width;

        public BlurBackgroundTask() {
        }

        @Override
        public final void run() {
            Bitmap bitmap;
            BlurBehindDrawable blurBehindDrawable = BlurBehindDrawable.this;
            if (blurBehindDrawable.backgroundBitmap == null) {
                blurBehindDrawable.backgroundBitmap = new Bitmap[2];
                blurBehindDrawable.backgroundBitmapCanvas = new Canvas[2];
            }
            int i = (int) (this.width / 15.0f);
            int i2 = 0;
            while (i2 < 2) {
                int i3 = (int) ((i2 == 0 ? blurBehindDrawable.toolbarH : this.height) / 15.0f);
                Bitmap bitmap2 = blurBehindDrawable.backgroundBitmap[i2];
                if (bitmap2 != null && ((bitmap2.getHeight() != i3 || blurBehindDrawable.backgroundBitmap[i2].getWidth() != i) && (bitmap = blurBehindDrawable.backgroundBitmap[i2]) != null)) {
                    bitmap.recycle();
                    blurBehindDrawable.backgroundBitmap[i2] = null;
                }
                System.currentTimeMillis();
                Bitmap[] bitmapArr = blurBehindDrawable.backgroundBitmap;
                if (bitmapArr[i2] == null) {
                    try {
                        bitmapArr[i2] = Bitmap.createBitmap(i, i3, Bitmap.Config.ARGB_8888);
                        blurBehindDrawable.backgroundBitmapCanvas[i2] = new Canvas(blurBehindDrawable.backgroundBitmap[i2]);
                        blurBehindDrawable.backgroundBitmapCanvas[i2].scale(i / blurBehindDrawable.blurredBitmapTmp[i2].getWidth(), i3 / blurBehindDrawable.blurredBitmapTmp[i2].getHeight());
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                }
                if (i2 == 1) {
                    blurBehindDrawable.backgroundBitmap[i2].eraseColor(Theme.getColor(Theme.key_windowBackgroundWhite, blurBehindDrawable.resourcesProvider));
                } else {
                    blurBehindDrawable.backgroundBitmap[i2].eraseColor(0);
                }
                Paint paint = blurBehindDrawable.emptyPaint;
                paint.setAlpha(255);
                Utilities.stackBlurBitmap(blurBehindDrawable.blurredBitmapTmp[i2], 15);
                Canvas canvas = blurBehindDrawable.backgroundBitmapCanvas[i2];
                if (canvas != null) {
                    canvas.drawBitmap(blurBehindDrawable.blurredBitmapTmp[i2], 0.0f, 0.0f, paint);
                }
                if (this.canceled) {
                    return;
                } else {
                    i2++;
                }
            }
            AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(this, 5));
        }
    }

    public BlurBehindDrawable(View view, ChatActivity.AnonymousClass71 anonymousClass71, Theme.ResourcesProvider resourcesProvider) {
        Paint paint = new Paint();
        this.errorBlackoutPaint = paint;
        this.type = 1;
        this.behindView = view;
        this.parentView = anonymousClass71;
        this.resourcesProvider = resourcesProvider;
        paint.setColor(-16777216);
    }

    public final void generateBlurredBitmaps() {
        Bitmap[] bitmapArr = this.renderingBitmap;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.renderingBitmap = bitmapArr;
            this.renderingBitmapCanvas = new Canvas[2];
        }
        if (this.blurredBitmapTmp == null) {
            this.blurredBitmapTmp = new Bitmap[2];
            this.blurCanvas = new Canvas[2];
        }
        this.blurBackgroundTask.canceled = true;
        this.blurBackgroundTask = new BlurBackgroundTask();
        for (int i = 0; i < 2; i++) {
            ChatActivity.AnonymousClass71 anonymousClass71 = this.parentView;
            int measuredHeight = anonymousClass71.getMeasuredHeight();
            int measuredWidth = anonymousClass71.getMeasuredWidth();
            int iDp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.toolbarH = iDp;
            if (i != 0) {
                iDp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i];
            if (bitmap == null || bitmap.getHeight() != iDp || bitmapArr[i].getWidth() != anonymousClass71.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.queue;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.blurredBitmapTmp;
                int i2 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i] = Bitmap.createBitmap(i2, (int) (iDp / 15.0f), config);
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                if (i == 1) {
                    this.blurredBitmapTmp[i].eraseColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
                }
                this.blurCanvas[i] = new Canvas(this.blurredBitmapTmp[i]);
                if (i == 0) {
                    measuredHeight = this.toolbarH;
                }
                this.renderingBitmap[i] = Bitmap.createBitmap(i2, (int) (measuredHeight / 15.0f), config);
                this.renderingBitmapCanvas[i] = new Canvas(this.renderingBitmap[i]);
                this.renderingBitmapCanvas[i].scale(this.renderingBitmap[i].getWidth() / this.blurredBitmapTmp[i].getWidth(), this.renderingBitmap[i].getHeight() / this.blurredBitmapTmp[i].getHeight());
                this.blurCanvas[i].save();
                this.blurCanvas[i].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.behindView;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (resourcesProvider instanceof ChatActivity.ThemeDelegate) {
                        background = ((ChatActivity.ThemeDelegate) resourcesProvider).getWallpaperDrawable();
                    } else {
                        background = Theme.themedWallpaper;
                        if (background == null) {
                            background = Theme.wallpaper;
                        }
                    }
                }
                view.setTag(67108867, Integer.valueOf(i));
                if (i == 0) {
                    this.blurCanvas[i].translate(0.0f, -this.panTranslationY);
                    view.draw(this.blurCanvas[i]);
                }
                if (i == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.blurCanvas[i]);
                    background.setBounds(bounds);
                    view.draw(this.blurCanvas[i]);
                }
                view.setTag(67108867, null);
                this.blurCanvas[i].restore();
                Utilities.stackBlurBitmap(this.blurredBitmapTmp[i], 15);
                Paint paint = this.emptyPaint;
                paint.setAlpha(255);
                if (i == 1) {
                    this.renderingBitmap[i].eraseColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
                }
                this.renderingBitmapCanvas[i].drawBitmap(this.blurredBitmapTmp[i], 0.0f, 0.0f, paint);
            }
        }
    }

    public final boolean isFullyDrawing() {
        if (this.wasDraw) {
            return (this.blurAlpha == 1.0f || !this.animateAlpha) && this.show && this.parentView.getAlpha() == 1.0f;
        }
        return false;
    }
}
