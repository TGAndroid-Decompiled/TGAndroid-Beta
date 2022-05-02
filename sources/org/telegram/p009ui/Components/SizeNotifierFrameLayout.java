package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.p009ui.ActionBar.ActionBarLayout;
import org.telegram.p009ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.p009ui.ActionBar.C1006ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.BlurSettingsBottomSheet;
import org.telegram.p009ui.Components.SizeNotifierFrameLayout;
import org.telegram.p009ui.Components.WallpaperParallaxEffect;

public class SizeNotifierFrameLayout extends FrameLayout {
    private static DispatchQueue blurQueue;
    protected AdjustPanLayoutHelper adjustPanLayoutHelper;
    private boolean animationInProgress;
    private Drawable backgroundDrawable;
    private int backgroundTranslationY;
    protected View backgroundView;
    final BlurBackgroundTask blurBackgroundTask;
    public ArrayList<View> blurBehindViews;
    ValueAnimator blurCrossfade;
    public float blurCrossfadeProgress;
    public boolean blurGeneratingTuskIsRunning;
    public boolean blurIsRunning;
    public Paint blurPaintBottom;
    public Paint blurPaintBottom2;
    public Paint blurPaintTop;
    public Paint blurPaintTop2;
    private int bottomClip;
    int count;
    int count2;
    BlurBitmap currentBitmap;
    private SizeNotifierFrameLayoutDelegate delegate;
    private int emojiHeight;
    private float emojiOffset;
    public boolean invalidateBlur;
    protected int keyboardHeight;
    Matrix matrix;
    Matrix matrix2;
    public boolean needBlur;
    public boolean needBlurBottom;
    private boolean occupyStatusBar;
    private Drawable oldBackgroundDrawable;
    private WallpaperParallaxEffect parallaxEffect;
    private float parallaxScale;
    private ActionBarLayout parentLayout;
    private boolean paused;
    BlurBitmap prevBitmap;
    private Rect rect;
    private Paint selectedBlurPaint;
    private Paint selectedBlurPaint2;
    private boolean skipBackgroundDrawing;
    SnowflakesEffect snowflakesEffect;
    int times;
    int times2;
    private float translationX;
    private float translationY;
    public ArrayList<BlurBitmap> unusedBitmaps;

    public interface SizeNotifierFrameLayoutDelegate {
        void onSizeChanged(int i, boolean z);
    }

    protected AdjustPanLayoutHelper createAdjustPanLayoutHelper() {
        return null;
    }

    public void drawList(Canvas canvas, boolean z) {
    }

    protected float getBottomTranslation() {
        return 0.0f;
    }

    protected float getListTranslationY() {
        return 0.0f;
    }

    protected Theme.ResourcesProvider getResourceProvider() {
        return null;
    }

    protected int getScrollOffset() {
        return 0;
    }

    protected boolean isActionBarVisible() {
        return true;
    }

    public void invalidateBlur() {
        this.invalidateBlur = true;
        invalidate();
    }

    public SizeNotifierFrameLayout(Context context) {
        this(context, null);
    }

    public SizeNotifierFrameLayout(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.rect = new Rect();
        this.occupyStatusBar = true;
        this.parallaxScale = 1.0f;
        this.paused = true;
        this.unusedBitmaps = new ArrayList<>(10);
        this.blurBehindViews = new ArrayList<>();
        this.matrix = new Matrix();
        this.matrix2 = new Matrix();
        this.blurPaintTop = new Paint();
        this.blurPaintTop2 = new Paint();
        this.blurPaintBottom = new Paint();
        this.blurPaintBottom2 = new Paint();
        this.blurBackgroundTask = new BlurBackgroundTask();
        setWillNotDraw(false);
        this.parentLayout = actionBarLayout;
        this.adjustPanLayoutHelper = createAdjustPanLayoutHelper();
        View view = new View(context) {
            @Override
            protected void onDraw(Canvas canvas) {
                if (SizeNotifierFrameLayout.this.backgroundDrawable != null && !SizeNotifierFrameLayout.this.skipBackgroundDrawing) {
                    Drawable newDrawable = SizeNotifierFrameLayout.this.getNewDrawable();
                    if (!(newDrawable == SizeNotifierFrameLayout.this.backgroundDrawable || newDrawable == null)) {
                        if (Theme.isAnimatingColor()) {
                            SizeNotifierFrameLayout sizeNotifierFrameLayout = SizeNotifierFrameLayout.this;
                            sizeNotifierFrameLayout.oldBackgroundDrawable = sizeNotifierFrameLayout.backgroundDrawable;
                        }
                        if (newDrawable instanceof MotionBackgroundDrawable) {
                            ((MotionBackgroundDrawable) newDrawable).setParentView(SizeNotifierFrameLayout.this.backgroundView);
                        }
                        SizeNotifierFrameLayout.this.backgroundDrawable = newDrawable;
                    }
                    float themeAnimationValue = SizeNotifierFrameLayout.this.parentLayout != null ? SizeNotifierFrameLayout.this.parentLayout.getThemeAnimationValue() : 1.0f;
                    int i = 0;
                    while (i < 2) {
                        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = SizeNotifierFrameLayout.this;
                        Drawable drawable = i == 0 ? sizeNotifierFrameLayout2.oldBackgroundDrawable : sizeNotifierFrameLayout2.backgroundDrawable;
                        if (drawable != null) {
                            if (i != 1 || SizeNotifierFrameLayout.this.oldBackgroundDrawable == null || SizeNotifierFrameLayout.this.parentLayout == null) {
                                drawable.setAlpha(255);
                            } else {
                                drawable.setAlpha((int) (255.0f * themeAnimationValue));
                            }
                            if (drawable instanceof MotionBackgroundDrawable) {
                                MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
                                if (motionBackgroundDrawable.hasPattern()) {
                                    int currentActionBarHeight = (SizeNotifierFrameLayout.this.isActionBarVisible() ? C1006ActionBar.getCurrentActionBarHeight() : 0) + ((Build.VERSION.SDK_INT < 21 || !SizeNotifierFrameLayout.this.occupyStatusBar) ? 0 : AndroidUtilities.statusBarHeight);
                                    int measuredHeight = getRootView().getMeasuredHeight() - currentActionBarHeight;
                                    float max = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), measuredHeight / drawable.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max * SizeNotifierFrameLayout.this.parallaxScale);
                                    int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max * SizeNotifierFrameLayout.this.parallaxScale);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) SizeNotifierFrameLayout.this.translationX);
                                    int i2 = SizeNotifierFrameLayout.this.backgroundTranslationY + ((measuredHeight - ceil2) / 2) + currentActionBarHeight + ((int) SizeNotifierFrameLayout.this.translationY);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight, ceil, getMeasuredHeight() - SizeNotifierFrameLayout.this.bottomClip);
                                    drawable.setBounds(measuredWidth, i2, ceil + measuredWidth, ceil2 + i2);
                                    drawable.draw(canvas);
                                    SizeNotifierFrameLayout.this.checkSnowflake(canvas);
                                    canvas.restore();
                                } else {
                                    if (SizeNotifierFrameLayout.this.bottomClip != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - SizeNotifierFrameLayout.this.bottomClip);
                                    }
                                    motionBackgroundDrawable.setTranslationY(SizeNotifierFrameLayout.this.backgroundTranslationY);
                                    int measuredHeight2 = (int) ((getRootView().getMeasuredHeight() - SizeNotifierFrameLayout.this.backgroundTranslationY) + SizeNotifierFrameLayout.this.translationY);
                                    if (SizeNotifierFrameLayout.this.animationInProgress) {
                                        measuredHeight2 = (int) (measuredHeight2 - SizeNotifierFrameLayout.this.emojiOffset);
                                    } else if (SizeNotifierFrameLayout.this.emojiHeight != 0) {
                                        measuredHeight2 -= SizeNotifierFrameLayout.this.emojiHeight;
                                    }
                                    drawable.setBounds(0, 0, getMeasuredWidth(), measuredHeight2);
                                    drawable.draw(canvas);
                                    if (SizeNotifierFrameLayout.this.bottomClip != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else if (drawable instanceof ColorDrawable) {
                                if (SizeNotifierFrameLayout.this.bottomClip != 0) {
                                    canvas.save();
                                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - SizeNotifierFrameLayout.this.bottomClip);
                                }
                                drawable.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                drawable.draw(canvas);
                                SizeNotifierFrameLayout.this.checkSnowflake(canvas);
                                if (SizeNotifierFrameLayout.this.bottomClip != 0) {
                                    canvas.restore();
                                }
                            } else if (drawable instanceof GradientDrawable) {
                                if (SizeNotifierFrameLayout.this.bottomClip != 0) {
                                    canvas.save();
                                    canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - SizeNotifierFrameLayout.this.bottomClip);
                                }
                                drawable.setBounds(0, SizeNotifierFrameLayout.this.backgroundTranslationY, getMeasuredWidth(), SizeNotifierFrameLayout.this.backgroundTranslationY + getRootView().getMeasuredHeight());
                                drawable.draw(canvas);
                                SizeNotifierFrameLayout.this.checkSnowflake(canvas);
                                if (SizeNotifierFrameLayout.this.bottomClip != 0) {
                                    canvas.restore();
                                }
                            } else if (drawable instanceof BitmapDrawable) {
                                if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                    canvas.save();
                                    float f = 2.0f / AndroidUtilities.density;
                                    canvas.scale(f, f);
                                    drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f), (int) Math.ceil(getRootView().getMeasuredHeight() / f));
                                    drawable.draw(canvas);
                                    SizeNotifierFrameLayout.this.checkSnowflake(canvas);
                                    canvas.restore();
                                } else {
                                    int currentActionBarHeight2 = (SizeNotifierFrameLayout.this.isActionBarVisible() ? C1006ActionBar.getCurrentActionBarHeight() : 0) + ((Build.VERSION.SDK_INT < 21 || !SizeNotifierFrameLayout.this.occupyStatusBar) ? 0 : AndroidUtilities.statusBarHeight);
                                    int measuredHeight3 = getRootView().getMeasuredHeight() - currentActionBarHeight2;
                                    float max2 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), measuredHeight3 / drawable.getIntrinsicHeight());
                                    int ceil3 = (int) Math.ceil(drawable.getIntrinsicWidth() * max2 * SizeNotifierFrameLayout.this.parallaxScale);
                                    int ceil4 = (int) Math.ceil(drawable.getIntrinsicHeight() * max2 * SizeNotifierFrameLayout.this.parallaxScale);
                                    int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) SizeNotifierFrameLayout.this.translationX);
                                    int i3 = SizeNotifierFrameLayout.this.backgroundTranslationY + ((measuredHeight3 - ceil4) / 2) + currentActionBarHeight2 + ((int) SizeNotifierFrameLayout.this.translationY);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight2, ceil3, getMeasuredHeight() - SizeNotifierFrameLayout.this.bottomClip);
                                    drawable.setBounds(measuredWidth2, i3, ceil3 + measuredWidth2, ceil4 + i3);
                                    drawable.draw(canvas);
                                    SizeNotifierFrameLayout.this.checkSnowflake(canvas);
                                    canvas.restore();
                                }
                            }
                            if (i == 0 && SizeNotifierFrameLayout.this.oldBackgroundDrawable != null && themeAnimationValue >= 1.0f) {
                                SizeNotifierFrameLayout.this.oldBackgroundDrawable = null;
                                SizeNotifierFrameLayout.this.backgroundView.invalidate();
                            }
                        }
                        i++;
                    }
                }
            }
        };
        this.backgroundView = view;
        addView(view, LayoutHelper.createFrame(-1, -1.0f));
    }

    public void setBackgroundImage(Drawable drawable, boolean z) {
        if (this.backgroundDrawable != drawable) {
            if (drawable instanceof MotionBackgroundDrawable) {
                ((MotionBackgroundDrawable) drawable).setParentView(this.backgroundView);
            }
            this.backgroundDrawable = drawable;
            if (z) {
                if (this.parallaxEffect == null) {
                    WallpaperParallaxEffect wallpaperParallaxEffect = new WallpaperParallaxEffect(getContext());
                    this.parallaxEffect = wallpaperParallaxEffect;
                    wallpaperParallaxEffect.setCallback(new WallpaperParallaxEffect.Callback() {
                        @Override
                        public final void onOffsetsChanged(int i, int i2, float f) {
                            SizeNotifierFrameLayout.this.lambda$setBackgroundImage$0(i, i2, f);
                        }
                    });
                    if (!(getMeasuredWidth() == 0 || getMeasuredHeight() == 0)) {
                        this.parallaxScale = this.parallaxEffect.getScale(getMeasuredWidth(), getMeasuredHeight());
                    }
                }
                if (!this.paused) {
                    this.parallaxEffect.setEnabled(true);
                }
            } else {
                WallpaperParallaxEffect wallpaperParallaxEffect2 = this.parallaxEffect;
                if (wallpaperParallaxEffect2 != null) {
                    wallpaperParallaxEffect2.setEnabled(false);
                    this.parallaxEffect = null;
                    this.parallaxScale = 1.0f;
                    this.translationX = 0.0f;
                    this.translationY = 0.0f;
                }
            }
            this.backgroundView.invalidate();
        }
    }

    public void lambda$setBackgroundImage$0(int i, int i2, float f) {
        this.translationX = i;
        this.translationY = i2;
        this.backgroundView.invalidate();
    }

    public Drawable getBackgroundImage() {
        return this.backgroundDrawable;
    }

    public void setDelegate(SizeNotifierFrameLayoutDelegate sizeNotifierFrameLayoutDelegate) {
        this.delegate = sizeNotifierFrameLayoutDelegate;
    }

    public void setOccupyStatusBar(boolean z) {
        this.occupyStatusBar = z;
    }

    public void onPause() {
        WallpaperParallaxEffect wallpaperParallaxEffect = this.parallaxEffect;
        if (wallpaperParallaxEffect != null) {
            wallpaperParallaxEffect.setEnabled(false);
        }
        this.paused = true;
    }

    public void onResume() {
        WallpaperParallaxEffect wallpaperParallaxEffect = this.parallaxEffect;
        if (wallpaperParallaxEffect != null) {
            wallpaperParallaxEffect.setEnabled(true);
        }
        this.paused = false;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        notifyHeightChanged();
    }

    public int measureKeyboardHeight() {
        View rootView = getRootView();
        getWindowVisibleDisplayFrame(this.rect);
        Rect rect = this.rect;
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = (rootView.getHeight() - (this.rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView);
        Rect rect2 = this.rect;
        int max = Math.max(0, height - (rect2.bottom - rect2.top));
        this.keyboardHeight = max;
        return max;
    }

    public int getKeyboardHeight() {
        return this.keyboardHeight;
    }

    public void notifyHeightChanged() {
        WallpaperParallaxEffect wallpaperParallaxEffect = this.parallaxEffect;
        if (wallpaperParallaxEffect != null) {
            this.parallaxScale = wallpaperParallaxEffect.getScale(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.delegate != null) {
            this.keyboardHeight = measureKeyboardHeight();
            Point point = AndroidUtilities.displaySize;
            final boolean z = point.x > point.y;
            post(new Runnable() {
                @Override
                public final void run() {
                    SizeNotifierFrameLayout.this.lambda$notifyHeightChanged$1(z);
                }
            });
        }
    }

    public void lambda$notifyHeightChanged$1(boolean z) {
        SizeNotifierFrameLayoutDelegate sizeNotifierFrameLayoutDelegate = this.delegate;
        if (sizeNotifierFrameLayoutDelegate != null) {
            sizeNotifierFrameLayoutDelegate.onSizeChanged(this.keyboardHeight, z);
        }
    }

    public void setBottomClip(int i) {
        if (i != this.bottomClip) {
            this.bottomClip = i;
            this.backgroundView.invalidate();
        }
    }

    public void setBackgroundTranslation(int i) {
        if (i != this.backgroundTranslationY) {
            this.backgroundTranslationY = i;
            this.backgroundView.invalidate();
        }
    }

    public int getBackgroundTranslationY() {
        if (!(this.backgroundDrawable instanceof MotionBackgroundDrawable)) {
            return 0;
        }
        if (this.animationInProgress) {
            return (int) this.emojiOffset;
        }
        int i = this.emojiHeight;
        return i != 0 ? i : this.backgroundTranslationY;
    }

    public int getBackgroundSizeY() {
        Drawable drawable = this.backgroundDrawable;
        int i = 0;
        if (drawable instanceof MotionBackgroundDrawable) {
            if (!((MotionBackgroundDrawable) drawable).hasPattern()) {
                if (this.animationInProgress) {
                    i = (int) this.emojiOffset;
                } else {
                    i = this.emojiHeight;
                    if (i == 0) {
                        i = this.backgroundTranslationY;
                    }
                }
            } else if (this.backgroundTranslationY == 0) {
                i = -this.keyboardHeight;
            }
        }
        return getMeasuredHeight() - i;
    }

    public int getHeightWithKeyboard() {
        return this.keyboardHeight + getMeasuredHeight();
    }

    public void setEmojiKeyboardHeight(int i) {
        if (this.emojiHeight != i) {
            this.emojiHeight = i;
            this.backgroundView.invalidate();
        }
    }

    public void setEmojiOffset(boolean z, float f) {
        if (this.emojiOffset != f || this.animationInProgress != z) {
            this.emojiOffset = f;
            this.animationInProgress = z;
            this.backgroundView.invalidate();
        }
    }

    public void checkSnowflake(Canvas canvas) {
        if (Theme.canStartHolidayAnimation()) {
            if (this.snowflakesEffect == null) {
                this.snowflakesEffect = new SnowflakesEffect(1);
            }
            this.snowflakesEffect.onDraw(this, canvas);
        }
    }

    public void setSkipBackgroundDrawing(boolean z) {
        if (this.skipBackgroundDrawing != z) {
            this.skipBackgroundDrawing = z;
            this.backgroundView.invalidate();
        }
    }

    public Drawable getNewDrawable() {
        return Theme.getCachedWallpaperNonBlocking();
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == getBackgroundImage() || super.verifyDrawable(drawable);
    }

    public void startBlur() {
        BlurBitmap blurBitmap;
        if (this.blurIsRunning && !this.blurGeneratingTuskIsRunning && this.invalidateBlur && SharedConfig.chatBlurEnabled() && Color.alpha(Theme.getColor("chat_BlurAlpha")) != 255) {
            int measuredWidth = getMeasuredWidth();
            int currentActionBarHeight = C1006ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.m34dp(100.0f);
            if (measuredWidth != 0 && currentActionBarHeight != 0) {
                this.invalidateBlur = false;
                this.blurGeneratingTuskIsRunning = true;
                float f = currentActionBarHeight;
                int i = ((int) (f / 12.0f)) + 34;
                float f2 = measuredWidth;
                int i2 = (int) (f2 / 12.0f);
                long currentTimeMillis = System.currentTimeMillis();
                if (this.unusedBitmaps.size() > 0) {
                    ArrayList<BlurBitmap> arrayList = this.unusedBitmaps;
                    blurBitmap = arrayList.remove(arrayList.size() - 1);
                } else {
                    blurBitmap = null;
                }
                if (blurBitmap == null) {
                    blurBitmap = new BlurBitmap();
                    blurBitmap.topBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                    blurBitmap.topCanvas = new Canvas(blurBitmap.topBitmap);
                    if (this.needBlurBottom) {
                        blurBitmap.bottomBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                        blurBitmap.bottomCanvas = new Canvas(blurBitmap.bottomBitmap);
                    }
                } else {
                    blurBitmap.topBitmap.eraseColor(0);
                    Bitmap bitmap = blurBitmap.bottomBitmap;
                    if (bitmap != null) {
                        bitmap.eraseColor(0);
                    }
                }
                float width = blurBitmap.topBitmap.getWidth() / f2;
                float height = (blurBitmap.topBitmap.getHeight() - 34) / f;
                blurBitmap.topCanvas.save();
                blurBitmap.pixelFixOffset = getScrollOffset() % 24;
                float f3 = height * 10.0f;
                blurBitmap.topCanvas.clipRect(1.0f, f3, blurBitmap.topBitmap.getWidth(), blurBitmap.topBitmap.getHeight() - 1);
                blurBitmap.topCanvas.scale(width, height);
                blurBitmap.topCanvas.translate(0.0f, f3 + blurBitmap.pixelFixOffset);
                blurBitmap.topScaleX = 1.0f / width;
                blurBitmap.topScaleY = 1.0f / height;
                drawList(blurBitmap.topCanvas, true);
                blurBitmap.topCanvas.restore();
                if (this.needBlurBottom) {
                    float width2 = blurBitmap.bottomBitmap.getWidth() / f2;
                    float height2 = (blurBitmap.bottomBitmap.getHeight() - 34) / f;
                    blurBitmap.needBlurBottom = true;
                    blurBitmap.bottomOffset = getBottomOffset() - f;
                    blurBitmap.drawnLisetTranslationY = getBottomOffset();
                    blurBitmap.bottomCanvas.save();
                    float f4 = 10.0f * height2;
                    blurBitmap.bottomCanvas.clipRect(1.0f, f4, blurBitmap.bottomBitmap.getWidth(), blurBitmap.bottomBitmap.getHeight() - 1);
                    blurBitmap.bottomCanvas.scale(width2, height2);
                    blurBitmap.bottomCanvas.translate(0.0f, (f4 - blurBitmap.bottomOffset) + blurBitmap.pixelFixOffset);
                    blurBitmap.bottomScaleX = 1.0f / width2;
                    blurBitmap.bottomScaleY = 1.0f / height2;
                    drawList(blurBitmap.bottomCanvas, false);
                    blurBitmap.bottomCanvas.restore();
                } else {
                    blurBitmap.needBlurBottom = false;
                }
                this.times2 = (int) (this.times2 + (System.currentTimeMillis() - currentTimeMillis));
                int i3 = this.count2 + 1;
                this.count2 = i3;
                if (i3 >= 20) {
                    this.count2 = 0;
                    this.times2 = 0;
                }
                if (blurQueue == null) {
                    blurQueue = new DispatchQueue("BlurQueue");
                }
                this.blurBackgroundTask.radius = (int) (((int) (Math.max(6, Math.max(currentActionBarHeight, measuredWidth) / 180) * 2.5f)) * BlurSettingsBottomSheet.blurRadius);
                BlurBackgroundTask blurBackgroundTask = this.blurBackgroundTask;
                blurBackgroundTask.finalBitmap = blurBitmap;
                blurQueue.postRunnable(blurBackgroundTask);
            }
        }
    }

    public class BlurBackgroundTask implements Runnable {
        BlurBitmap finalBitmap;
        int radius;

        private BlurBackgroundTask() {
        }

        @Override
        public void run() {
            Bitmap bitmap;
            long currentTimeMillis = System.currentTimeMillis();
            Utilities.stackBlurBitmap(this.finalBitmap.topBitmap, this.radius);
            BlurBitmap blurBitmap = this.finalBitmap;
            if (blurBitmap.needBlurBottom && (bitmap = blurBitmap.bottomBitmap) != null) {
                Utilities.stackBlurBitmap(bitmap, this.radius);
            }
            SizeNotifierFrameLayout sizeNotifierFrameLayout = SizeNotifierFrameLayout.this;
            sizeNotifierFrameLayout.times = (int) (sizeNotifierFrameLayout.times + (System.currentTimeMillis() - currentTimeMillis));
            SizeNotifierFrameLayout sizeNotifierFrameLayout2 = SizeNotifierFrameLayout.this;
            int i = sizeNotifierFrameLayout2.count + 1;
            sizeNotifierFrameLayout2.count = i;
            if (i > 1000) {
                StringBuilder sb = new StringBuilder();
                sb.append("chat blur generating average time");
                SizeNotifierFrameLayout sizeNotifierFrameLayout3 = SizeNotifierFrameLayout.this;
                sb.append(sizeNotifierFrameLayout3.times / sizeNotifierFrameLayout3.count);
                FileLog.m33d(sb.toString());
                SizeNotifierFrameLayout sizeNotifierFrameLayout4 = SizeNotifierFrameLayout.this;
                sizeNotifierFrameLayout4.count = 0;
                sizeNotifierFrameLayout4.times = 0;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SizeNotifierFrameLayout.BlurBackgroundTask.this.lambda$run$2();
                }
            });
        }

        public void lambda$run$2() {
            SizeNotifierFrameLayout sizeNotifierFrameLayout = SizeNotifierFrameLayout.this;
            if (!sizeNotifierFrameLayout.blurIsRunning) {
                BlurBitmap blurBitmap = this.finalBitmap;
                if (blurBitmap != null) {
                    blurBitmap.recycle();
                }
                SizeNotifierFrameLayout.this.blurGeneratingTuskIsRunning = false;
                return;
            }
            final BlurBitmap blurBitmap2 = sizeNotifierFrameLayout.currentBitmap;
            sizeNotifierFrameLayout.prevBitmap = blurBitmap2;
            sizeNotifierFrameLayout.blurPaintTop2.setShader(sizeNotifierFrameLayout.blurPaintTop.getShader());
            SizeNotifierFrameLayout sizeNotifierFrameLayout2 = SizeNotifierFrameLayout.this;
            sizeNotifierFrameLayout2.blurPaintBottom2.setShader(sizeNotifierFrameLayout2.blurPaintBottom.getShader());
            Bitmap bitmap = this.finalBitmap.topBitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            SizeNotifierFrameLayout.this.blurPaintTop.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            BlurBitmap blurBitmap3 = this.finalBitmap;
            if (blurBitmap3.needBlurBottom && blurBitmap3.bottomBitmap != null) {
                Bitmap bitmap2 = this.finalBitmap.bottomBitmap;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                SizeNotifierFrameLayout.this.blurPaintBottom.setShader(new BitmapShader(bitmap2, tileMode2, tileMode2));
            }
            ValueAnimator valueAnimator = SizeNotifierFrameLayout.this.blurCrossfade;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            SizeNotifierFrameLayout sizeNotifierFrameLayout3 = SizeNotifierFrameLayout.this;
            sizeNotifierFrameLayout3.blurCrossfadeProgress = 0.0f;
            sizeNotifierFrameLayout3.blurCrossfade = ValueAnimator.ofFloat(0.0f, 1.0f);
            SizeNotifierFrameLayout.this.blurCrossfade.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SizeNotifierFrameLayout.BlurBackgroundTask.this.lambda$run$0(valueAnimator2);
                }
            });
            SizeNotifierFrameLayout.this.blurCrossfade.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SizeNotifierFrameLayout sizeNotifierFrameLayout4 = SizeNotifierFrameLayout.this;
                    sizeNotifierFrameLayout4.blurCrossfadeProgress = 1.0f;
                    sizeNotifierFrameLayout4.unusedBitmaps.add(blurBitmap2);
                    SizeNotifierFrameLayout.this.blurPaintTop2.setShader(null);
                    SizeNotifierFrameLayout.this.blurPaintBottom2.setShader(null);
                    SizeNotifierFrameLayout.this.invalidateBlurredViews();
                    super.onAnimationEnd(animator);
                }
            });
            SizeNotifierFrameLayout.this.blurCrossfade.setDuration(50L);
            SizeNotifierFrameLayout.this.blurCrossfade.start();
            SizeNotifierFrameLayout.this.invalidateBlurredViews();
            SizeNotifierFrameLayout.this.currentBitmap = this.finalBitmap;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SizeNotifierFrameLayout.BlurBackgroundTask.this.lambda$run$1();
                }
            }, 16L);
        }

        public void lambda$run$0(ValueAnimator valueAnimator) {
            SizeNotifierFrameLayout.this.blurCrossfadeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SizeNotifierFrameLayout.this.invalidateBlurredViews();
        }

        public void lambda$run$1() {
            SizeNotifierFrameLayout sizeNotifierFrameLayout = SizeNotifierFrameLayout.this;
            sizeNotifierFrameLayout.blurGeneratingTuskIsRunning = false;
            sizeNotifierFrameLayout.startBlur();
        }
    }

    public void invalidateBlurredViews() {
        for (int i = 0; i < this.blurBehindViews.size(); i++) {
            this.blurBehindViews.get(i).invalidate();
        }
    }

    protected float getBottomOffset() {
        return getMeasuredHeight();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.blurIsRunning) {
            startBlur();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.needBlur && !this.blurIsRunning) {
            this.blurIsRunning = true;
            this.invalidateBlur = true;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.blurPaintTop.setShader(null);
        this.blurPaintTop2.setShader(null);
        this.blurPaintBottom.setShader(null);
        this.blurPaintBottom2.setShader(null);
        ValueAnimator valueAnimator = this.blurCrossfade;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        BlurBitmap blurBitmap = this.currentBitmap;
        if (blurBitmap != null) {
            blurBitmap.recycle();
            this.currentBitmap = null;
        }
        for (int i = 0; i < this.unusedBitmaps.size(); i++) {
            if (this.unusedBitmaps.get(i) != null) {
                this.unusedBitmaps.get(i).recycle();
            }
        }
        this.unusedBitmaps.clear();
        this.blurIsRunning = false;
    }

    public void drawBlurRect(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
        int alpha = Color.alpha(Theme.getColor("chat_BlurAlpha"));
        if (this.currentBitmap == null || !SharedConfig.chatBlurEnabled()) {
            canvas.drawRect(rect, paint);
            return;
        }
        updateBlurShaderPosition(f, z);
        paint.setAlpha(255);
        if (this.blurCrossfadeProgress == 1.0f || this.selectedBlurPaint2.getShader() == null) {
            canvas.drawRect(rect, paint);
            canvas.drawRect(rect, this.selectedBlurPaint);
        } else {
            canvas.drawRect(rect, paint);
            canvas.drawRect(rect, this.selectedBlurPaint2);
            canvas.saveLayerAlpha(rect.left, rect.top, rect.right, rect.bottom, (int) (this.blurCrossfadeProgress * 255.0f), 31);
            canvas.drawRect(rect, paint);
            canvas.drawRect(rect, this.selectedBlurPaint);
            canvas.restore();
        }
        paint.setAlpha(alpha);
        canvas.drawRect(rect, paint);
    }

    public void drawBlurCircle(Canvas canvas, float f, float f2, float f3, float f4, Paint paint, boolean z) {
        int alpha = Color.alpha(Theme.getColor("chat_BlurAlpha"));
        if (this.currentBitmap == null || !SharedConfig.chatBlurEnabled()) {
            canvas.drawCircle(f2, f3, f4, paint);
            return;
        }
        updateBlurShaderPosition(f, z);
        paint.setAlpha(255);
        if (this.blurCrossfadeProgress == 1.0f || this.selectedBlurPaint2.getShader() == null) {
            canvas.drawCircle(f2, f3, f4, paint);
            canvas.drawCircle(f2, f3, f4, this.selectedBlurPaint);
        } else {
            canvas.drawCircle(f2, f3, f4, paint);
            canvas.drawCircle(f2, f3, f4, this.selectedBlurPaint2);
            canvas.saveLayerAlpha(f2 - f4, f3 - f4, f2 + f4, f3 + f4, (int) (this.blurCrossfadeProgress * 255.0f), 31);
            canvas.drawCircle(f2, f3, f4, paint);
            canvas.drawCircle(f2, f3, f4, this.selectedBlurPaint);
            canvas.restore();
        }
        paint.setAlpha(alpha);
        canvas.drawCircle(f2, f3, f4, paint);
    }

    private void updateBlurShaderPosition(float f, boolean z) {
        this.selectedBlurPaint = z ? this.blurPaintTop : this.blurPaintBottom;
        this.selectedBlurPaint2 = z ? this.blurPaintTop2 : this.blurPaintBottom2;
        if (z) {
            f += getTranslationY();
        }
        if (this.selectedBlurPaint.getShader() != null) {
            this.matrix.reset();
            this.matrix2.reset();
            if (!z) {
                float f2 = -f;
                BlurBitmap blurBitmap = this.currentBitmap;
                this.matrix.setTranslate(0.0f, (((blurBitmap.bottomOffset + f2) - blurBitmap.pixelFixOffset) - 34.0f) - (blurBitmap.drawnLisetTranslationY - (getBottomOffset() + getListTranslationY())));
                Matrix matrix = this.matrix;
                BlurBitmap blurBitmap2 = this.currentBitmap;
                matrix.preScale(blurBitmap2.bottomScaleX, blurBitmap2.bottomScaleY);
                BlurBitmap blurBitmap3 = this.prevBitmap;
                if (blurBitmap3 != null) {
                    this.matrix2.setTranslate(0.0f, (((f2 + blurBitmap3.bottomOffset) - blurBitmap3.pixelFixOffset) - 34.0f) - (blurBitmap3.drawnLisetTranslationY - (getBottomOffset() + getListTranslationY())));
                    Matrix matrix2 = this.matrix2;
                    BlurBitmap blurBitmap4 = this.prevBitmap;
                    matrix2.preScale(blurBitmap4.bottomScaleX, blurBitmap4.bottomScaleY);
                }
            } else {
                float f3 = -f;
                this.matrix.setTranslate(0.0f, (f3 - this.currentBitmap.pixelFixOffset) - 34.0f);
                Matrix matrix3 = this.matrix;
                BlurBitmap blurBitmap5 = this.currentBitmap;
                matrix3.preScale(blurBitmap5.topScaleX, blurBitmap5.topScaleY);
                BlurBitmap blurBitmap6 = this.prevBitmap;
                if (blurBitmap6 != null) {
                    this.matrix2.setTranslate(0.0f, (f3 - blurBitmap6.pixelFixOffset) - 34.0f);
                    Matrix matrix4 = this.matrix2;
                    BlurBitmap blurBitmap7 = this.prevBitmap;
                    matrix4.preScale(blurBitmap7.topScaleX, blurBitmap7.topScaleY);
                }
            }
            this.selectedBlurPaint.getShader().setLocalMatrix(this.matrix);
            if (this.selectedBlurPaint2.getShader() != null) {
                this.selectedBlurPaint2.getShader().setLocalMatrix(this.matrix);
            }
        }
    }

    public static class BlurBitmap {
        Bitmap bottomBitmap;
        Canvas bottomCanvas;
        float bottomOffset;
        float bottomScaleX;
        float bottomScaleY;
        float drawnLisetTranslationY;
        public boolean needBlurBottom;
        int pixelFixOffset;
        Bitmap topBitmap;
        Canvas topCanvas;
        float topScaleX;
        float topScaleY;

        private BlurBitmap() {
        }

        public void recycle() {
            this.topBitmap.recycle();
            Bitmap bitmap = this.bottomBitmap;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
