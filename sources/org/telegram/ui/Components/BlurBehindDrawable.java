package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BlurBehindDrawable;

public class BlurBehindDrawable {
    private Bitmap[] backgroundBitmap;
    private Canvas[] backgroundBitmapCanvas;
    private View behindView;
    private float blurAlpha;
    private Canvas[] blurCanvas;
    private Bitmap[] blurredBitmapTmp;
    private boolean error;
    Paint errorBlackoutPaint;
    private int lastH;
    private int lastW;
    private float panTranslationY;
    private View parentView;
    private boolean processingNextFrame;
    DispatchQueue queue;
    private Bitmap[] renderingBitmap;
    private Canvas[] renderingBitmapCanvas;
    private final Theme.ResourcesProvider resourcesProvider;
    private boolean show;
    private boolean skipDraw;
    private int toolbarH;
    private final int type;
    private boolean wasDraw;
    private boolean invalidate = true;
    private boolean animateAlpha = true;
    BlurBackgroundTask blurBackgroundTask = new BlurBackgroundTask();
    Paint emptyPaint = new Paint(2);

    public BlurBehindDrawable(View view, View view2, int i, Theme.ResourcesProvider resourcesProvider) {
        Paint paint = new Paint();
        this.errorBlackoutPaint = paint;
        this.type = i;
        this.behindView = view;
        this.parentView = view2;
        this.resourcesProvider = resourcesProvider;
        paint.setColor(-16777216);
    }

    public void draw(Canvas canvas) {
        View view = this.parentView;
        if (view != null) {
            if (view.getMeasuredHeight() == 0 && this.parentView.getMeasuredWidth() == 0) {
                return;
            }
            if (this.type == 1 && !this.wasDraw && !this.animateAlpha) {
                generateBlurredBitmaps();
                this.invalidate = false;
            }
            Bitmap[] bitmapArr = this.renderingBitmap;
            if ((bitmapArr != null || this.error) && this.animateAlpha) {
                boolean z = this.show;
                if (z) {
                    float f = this.blurAlpha;
                    if (f != 1.0f) {
                        float f2 = f + 0.09f;
                        this.blurAlpha = f2;
                        if (f2 > 1.0f) {
                            this.blurAlpha = 1.0f;
                        }
                        this.parentView.invalidate();
                    }
                }
                if (!z) {
                    float f3 = this.blurAlpha;
                    if (f3 != 0.0f) {
                        float f4 = f3 - 0.09f;
                        this.blurAlpha = f4;
                        if (f4 < 0.0f) {
                            this.blurAlpha = 0.0f;
                        }
                        this.parentView.invalidate();
                    }
                }
            }
            float f5 = this.animateAlpha ? this.blurAlpha : 1.0f;
            if (bitmapArr == null && this.error) {
                this.errorBlackoutPaint.setAlpha((int) (f5 * 50.0f));
                canvas.drawPaint(this.errorBlackoutPaint);
                return;
            }
            if (f5 == 1.0f) {
                canvas.save();
            } else {
                canvas.saveLayerAlpha(0.0f, 0.0f, this.parentView.getMeasuredWidth(), this.parentView.getMeasuredHeight(), (int) (f5 * 255.0f), 31);
            }
            if (bitmapArr != null) {
                this.emptyPaint.setAlpha((int) (f5 * 255.0f));
                if (this.type == 1) {
                    canvas.translate(0.0f, this.panTranslationY);
                }
                canvas.save();
                canvas.scale(this.parentView.getMeasuredWidth() / bitmapArr[1].getWidth(), this.parentView.getMeasuredHeight() / bitmapArr[1].getHeight());
                canvas.drawBitmap(bitmapArr[1], 0.0f, 0.0f, this.emptyPaint);
                canvas.restore();
                canvas.save();
                if (this.type == 0) {
                    canvas.translate(0.0f, this.panTranslationY);
                }
                canvas.scale(this.parentView.getMeasuredWidth() / bitmapArr[0].getWidth(), this.toolbarH / bitmapArr[0].getHeight());
                canvas.drawBitmap(bitmapArr[0], 0.0f, 0.0f, this.emptyPaint);
                canvas.restore();
                this.wasDraw = true;
                canvas.drawColor(436207616);
            }
            canvas.restore();
            if (!this.show || this.processingNextFrame) {
                return;
            }
            if (this.renderingBitmap == null || this.invalidate) {
                this.processingNextFrame = true;
                this.invalidate = false;
                if (this.blurredBitmapTmp == null) {
                    this.blurredBitmapTmp = new Bitmap[2];
                    this.blurCanvas = new Canvas[2];
                }
                for (int i = 0; i < 2; i++) {
                    if (this.blurredBitmapTmp[i] == null || this.parentView.getMeasuredWidth() != this.lastW || this.parentView.getMeasuredHeight() != this.lastH) {
                        int measuredHeight = this.parentView.getMeasuredHeight();
                        int measuredWidth = this.parentView.getMeasuredWidth();
                        int dp = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(200.0f);
                        this.toolbarH = dp;
                        if (i == 0) {
                            measuredHeight = dp;
                        }
                        try {
                            this.blurredBitmapTmp[i] = Bitmap.createBitmap((int) (measuredWidth / 6.0f), (int) (measuredHeight / 6.0f), Bitmap.Config.ARGB_8888);
                            this.blurCanvas[i] = new Canvas(this.blurredBitmapTmp[i]);
                        } catch (Exception e) {
                            FileLog.e(e);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    BlurBehindDrawable.this.lambda$draw$0();
                                }
                            });
                            return;
                        }
                    } else {
                        this.blurredBitmapTmp[i].eraseColor(0);
                    }
                    if (i == 1) {
                        this.blurredBitmapTmp[i].eraseColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    }
                    this.blurCanvas[i].save();
                    this.blurCanvas[i].scale(0.16666667f, 0.16666667f, 0.0f, 0.0f);
                    Drawable background = this.behindView.getBackground();
                    if (background == null) {
                        background = getBackgroundDrawable();
                    }
                    this.behindView.setTag(67108867, Integer.valueOf(i));
                    if (i == 0) {
                        this.blurCanvas[i].translate(0.0f, -this.panTranslationY);
                        this.behindView.draw(this.blurCanvas[i]);
                    }
                    if (background != null && i == 1) {
                        android.graphics.Rect bounds = background.getBounds();
                        background.setBounds(0, 0, this.behindView.getMeasuredWidth(), this.behindView.getMeasuredHeight());
                        background.draw(this.blurCanvas[i]);
                        background.setBounds(bounds);
                        this.behindView.draw(this.blurCanvas[i]);
                    }
                    this.behindView.setTag(67108867, null);
                    this.blurCanvas[i].restore();
                }
                this.lastH = this.parentView.getMeasuredHeight();
                this.lastW = this.parentView.getMeasuredWidth();
                this.blurBackgroundTask.width = this.parentView.getMeasuredWidth();
                this.blurBackgroundTask.height = this.parentView.getMeasuredHeight();
                BlurBackgroundTask blurBackgroundTask = this.blurBackgroundTask;
                if (blurBackgroundTask.width == 0 || blurBackgroundTask.height == 0) {
                    this.processingNextFrame = false;
                    return;
                }
                if (this.queue == null) {
                    this.queue = new DispatchQueue("blur_thread_" + this);
                }
                this.queue.postRunnable(this.blurBackgroundTask);
            }
        }
    }

    public void lambda$draw$0() {
        this.error = true;
        this.parentView.invalidate();
    }

    public int getBlurRadius() {
        return Math.max(7, Math.max(this.lastH, this.lastW) / 180);
    }

    public void clear() {
        this.invalidate = true;
        this.wasDraw = false;
        this.error = false;
        this.blurAlpha = 0.0f;
        this.lastW = 0;
        this.lastH = 0;
        DispatchQueue dispatchQueue = this.queue;
        if (dispatchQueue != null) {
            dispatchQueue.cleanupQueue();
            this.queue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    BlurBehindDrawable.this.lambda$clear$2();
                }
            });
        }
    }

    public void lambda$clear$2() {
        Bitmap[] bitmapArr = this.renderingBitmap;
        if (bitmapArr != null) {
            if (bitmapArr[0] != null) {
                bitmapArr[0].recycle();
            }
            Bitmap[] bitmapArr2 = this.renderingBitmap;
            if (bitmapArr2[1] != null) {
                bitmapArr2[1].recycle();
            }
            this.renderingBitmap = null;
        }
        Bitmap[] bitmapArr3 = this.backgroundBitmap;
        if (bitmapArr3 != null) {
            if (bitmapArr3[0] != null) {
                bitmapArr3[0].recycle();
            }
            Bitmap[] bitmapArr4 = this.backgroundBitmap;
            if (bitmapArr4[1] != null) {
                bitmapArr4[1].recycle();
            }
            this.backgroundBitmap = null;
        }
        this.renderingBitmapCanvas = null;
        this.skipDraw = false;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BlurBehindDrawable.this.lambda$clear$1();
            }
        });
    }

    public void lambda$clear$1() {
        DispatchQueue dispatchQueue = this.queue;
        if (dispatchQueue != null) {
            dispatchQueue.recycle();
            this.queue = null;
        }
    }

    public void invalidate() {
        this.invalidate = true;
        View view = this.parentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public boolean isFullyDrawing() {
        return !this.skipDraw && this.wasDraw && (this.blurAlpha == 1.0f || !this.animateAlpha) && this.show && this.parentView.getAlpha() == 1.0f;
    }

    public void checkSizes() {
        if (this.renderingBitmap == null || this.parentView.getMeasuredHeight() == 0 || this.parentView.getMeasuredWidth() == 0) {
            return;
        }
        generateBlurredBitmaps();
        this.lastH = this.parentView.getMeasuredHeight();
        this.lastW = this.parentView.getMeasuredWidth();
    }

    private void generateBlurredBitmaps() {
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
            int measuredHeight = this.parentView.getMeasuredHeight();
            int measuredWidth = this.parentView.getMeasuredWidth();
            int dp = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(200.0f);
            this.toolbarH = dp;
            if (i != 0) {
                dp = measuredHeight;
            }
            if (bitmapArr[i] == null || bitmapArr[i].getHeight() != dp || bitmapArr[i].getWidth() != this.parentView.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.queue;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                int i2 = (int) (measuredWidth / 6.0f);
                this.blurredBitmapTmp[i] = Bitmap.createBitmap(i2, (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
                if (i == 1) {
                    this.blurredBitmapTmp[i].eraseColor(getThemedColor(Theme.key_windowBackgroundWhite));
                }
                this.blurCanvas[i] = new Canvas(this.blurredBitmapTmp[i]);
                if (i == 0) {
                    measuredHeight = this.toolbarH;
                }
                this.renderingBitmap[i] = Bitmap.createBitmap(i2, (int) (measuredHeight / 6.0f), Bitmap.Config.ARGB_8888);
                this.renderingBitmapCanvas[i] = new Canvas(this.renderingBitmap[i]);
                this.renderingBitmapCanvas[i].scale(this.renderingBitmap[i].getWidth() / this.blurredBitmapTmp[i].getWidth(), this.renderingBitmap[i].getHeight() / this.blurredBitmapTmp[i].getHeight());
                this.blurCanvas[i].save();
                this.blurCanvas[i].scale(0.16666667f, 0.16666667f, 0.0f, 0.0f);
                Drawable background = this.behindView.getBackground();
                if (background == null) {
                    background = getBackgroundDrawable();
                }
                this.behindView.setTag(67108867, Integer.valueOf(i));
                if (i == 0) {
                    this.blurCanvas[i].translate(0.0f, -this.panTranslationY);
                    this.behindView.draw(this.blurCanvas[i]);
                }
                if (i == 1) {
                    android.graphics.Rect bounds = background.getBounds();
                    background.setBounds(0, 0, this.behindView.getMeasuredWidth(), this.behindView.getMeasuredHeight());
                    background.draw(this.blurCanvas[i]);
                    background.setBounds(bounds);
                    this.behindView.draw(this.blurCanvas[i]);
                }
                this.behindView.setTag(67108867, null);
                this.blurCanvas[i].restore();
                Utilities.stackBlurBitmap(this.blurredBitmapTmp[i], getBlurRadius());
                this.emptyPaint.setAlpha(255);
                if (i == 1) {
                    this.renderingBitmap[i].eraseColor(getThemedColor(Theme.key_windowBackgroundWhite));
                }
                this.renderingBitmapCanvas[i].drawBitmap(this.blurredBitmapTmp[i], 0.0f, 0.0f, this.emptyPaint);
            }
        }
    }

    public void show(boolean z) {
        this.show = z;
    }

    public void setAnimateAlpha(boolean z) {
        this.animateAlpha = z;
    }

    public void onPanTranslationUpdate(float f) {
        this.panTranslationY = f;
        this.parentView.invalidate();
    }

    public class BlurBackgroundTask implements Runnable {
        boolean canceled;
        int height;
        int width;

        public BlurBackgroundTask() {
        }

        @Override
        public void run() {
            if (BlurBehindDrawable.this.backgroundBitmap == null) {
                BlurBehindDrawable.this.backgroundBitmap = new Bitmap[2];
                BlurBehindDrawable.this.backgroundBitmapCanvas = new Canvas[2];
            }
            int i = (int) (this.width / 6.0f);
            int i2 = 0;
            while (i2 < 2) {
                int i3 = (int) ((i2 == 0 ? BlurBehindDrawable.this.toolbarH : this.height) / 6.0f);
                if (BlurBehindDrawable.this.backgroundBitmap[i2] != null && ((BlurBehindDrawable.this.backgroundBitmap[i2].getHeight() != i3 || BlurBehindDrawable.this.backgroundBitmap[i2].getWidth() != i) && BlurBehindDrawable.this.backgroundBitmap[i2] != null)) {
                    BlurBehindDrawable.this.backgroundBitmap[i2].recycle();
                    BlurBehindDrawable.this.backgroundBitmap[i2] = null;
                }
                System.currentTimeMillis();
                if (BlurBehindDrawable.this.backgroundBitmap[i2] == null) {
                    try {
                        BlurBehindDrawable.this.backgroundBitmap[i2] = Bitmap.createBitmap(i, i3, Bitmap.Config.ARGB_8888);
                        BlurBehindDrawable.this.backgroundBitmapCanvas[i2] = new Canvas(BlurBehindDrawable.this.backgroundBitmap[i2]);
                        BlurBehindDrawable.this.backgroundBitmapCanvas[i2].scale(i / BlurBehindDrawable.this.blurredBitmapTmp[i2].getWidth(), i3 / BlurBehindDrawable.this.blurredBitmapTmp[i2].getHeight());
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                }
                if (i2 == 1) {
                    BlurBehindDrawable.this.backgroundBitmap[i2].eraseColor(BlurBehindDrawable.this.getThemedColor(Theme.key_windowBackgroundWhite));
                } else {
                    BlurBehindDrawable.this.backgroundBitmap[i2].eraseColor(0);
                }
                BlurBehindDrawable.this.emptyPaint.setAlpha(255);
                Utilities.stackBlurBitmap(BlurBehindDrawable.this.blurredBitmapTmp[i2], BlurBehindDrawable.this.getBlurRadius());
                if (BlurBehindDrawable.this.backgroundBitmapCanvas[i2] != null) {
                    BlurBehindDrawable.this.backgroundBitmapCanvas[i2].drawBitmap(BlurBehindDrawable.this.blurredBitmapTmp[i2], 0.0f, 0.0f, BlurBehindDrawable.this.emptyPaint);
                }
                if (this.canceled) {
                    return;
                } else {
                    i2++;
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    BlurBehindDrawable.BlurBackgroundTask.this.lambda$run$0();
                }
            });
        }

        public void lambda$run$0() {
            if (this.canceled) {
                return;
            }
            Bitmap[] bitmapArr = BlurBehindDrawable.this.renderingBitmap;
            Canvas[] canvasArr = BlurBehindDrawable.this.renderingBitmapCanvas;
            BlurBehindDrawable blurBehindDrawable = BlurBehindDrawable.this;
            blurBehindDrawable.renderingBitmap = blurBehindDrawable.backgroundBitmap;
            BlurBehindDrawable blurBehindDrawable2 = BlurBehindDrawable.this;
            blurBehindDrawable2.renderingBitmapCanvas = blurBehindDrawable2.backgroundBitmapCanvas;
            BlurBehindDrawable.this.backgroundBitmap = bitmapArr;
            BlurBehindDrawable.this.backgroundBitmapCanvas = canvasArr;
            BlurBehindDrawable.this.processingNextFrame = false;
            if (BlurBehindDrawable.this.parentView != null) {
                BlurBehindDrawable.this.parentView.invalidate();
            }
        }
    }

    private Drawable getBackgroundDrawable() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider instanceof ChatActivity.ThemeDelegate) {
            return ((ChatActivity.ThemeDelegate) resourcesProvider).getWallpaperDrawable();
        }
        return Theme.getCachedWallpaperNonBlocking();
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
