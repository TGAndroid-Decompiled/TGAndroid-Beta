package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.Region;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.text.MeasuredText;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BlurSettingsBottomSheet;
import org.telegram.ui.ChatBackgroundDrawable;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.WallpaperParallaxEffect;
public class SizeNotifierFrameLayout extends FrameLayout {
    private static DispatchQueue blurQueue;
    public static boolean drawingBlur;
    private final float DOWN_SCALE;
    private final int TOP_CLIP_OFFSET;
    public AdjustPanLayoutHelper adjustPanLayoutHelper;
    private boolean animationInProgress;
    boolean attached;
    private Drawable backgroundDrawable;
    private boolean backgroundMotion;
    private int backgroundTranslationY;
    protected View backgroundView;
    private float bgAngle;
    final BlurBackgroundTask blurBackgroundTask;
    public ArrayList<View> blurBehindViews;
    ValueAnimator blurCrossfade;
    public float blurCrossfadeProgress;
    public boolean blurGeneratingTuskIsRunning;
    public boolean blurIsRunning;
    private boolean[] blurNodeInvalidated;
    private boolean[] blurNodeInvalidatedThisFrame;
    private RenderNode[] blurNodes;
    public Paint blurPaintBottom;
    public Paint blurPaintBottom2;
    public Paint blurPaintTop;
    public Paint blurPaintTop2;
    private int bottomClip;
    int count;
    int count2;
    BlurBitmap currentBitmap;
    protected SizeNotifierFrameLayoutDelegate delegate;
    private float drawnBottomOffset;
    private int emojiHeight;
    private float emojiOffset;
    public boolean invalidateBlur;
    protected int keyboardHeight;
    private float lastDrawnBottomBlurOffset;
    private final ArrayList<IViewWithInvalidateCallback> lastViews;
    Matrix matrix;
    Matrix matrix2;
    public boolean needBlur;
    public boolean needBlurBottom;
    private boolean occupyStatusBar;
    private Drawable oldBackgroundDrawable;
    private boolean oldBackgroundMotion;
    private WallpaperParallaxEffect parallaxEffect;
    private float parallaxScale;
    private INavigationLayout parentLayout;
    private boolean paused;
    BlurBitmap prevBitmap;
    private android.graphics.Rect rect;
    private Paint selectedBlurPaint;
    private Paint selectedBlurPaint2;
    private boolean skipBackgroundDrawing;
    SnowflakesEffect snowflakesEffect;
    private float themeAnimationValue;
    int times;
    int times2;
    private float translationX;
    private float translationY;
    public ArrayList<BlurBitmap> unusedBitmaps;
    private final ArrayList<IViewWithInvalidateCallback> views;

    public interface IViewWithInvalidateCallback {
        void listenInvalidate(Runnable runnable);
    }

    public interface SizeNotifierFrameLayoutDelegate {
        void onSizeChanged(int i, boolean z);
    }

    private void checkLayerType() {
    }

    protected AdjustPanLayoutHelper createAdjustPanLayoutHelper() {
        return null;
    }

    public void drawList(Canvas canvas, boolean z, ArrayList<IViewWithInvalidateCallback> arrayList) {
    }

    public int getBottomPadding() {
        return 0;
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

    protected boolean invalidateOptimized() {
        return false;
    }

    protected boolean isActionBarVisible() {
        return true;
    }

    public boolean DRAW_USING_RENDERNODE() {
        return Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur;
    }

    public void invalidateBlur() {
        if (SharedConfig.chatBlurEnabled()) {
            this.invalidateBlur = true;
            if (!this.blurIsRunning || this.blurGeneratingTuskIsRunning) {
                return;
            }
            invalidate();
        }
    }

    public void invalidateBackground() {
        View view = this.backgroundView;
        if (view != null) {
            view.invalidate();
        }
    }

    public SizeNotifierFrameLayout(Context context) {
        this(context, null);
    }

    public SizeNotifierFrameLayout(Context context, INavigationLayout iNavigationLayout) {
        super(context);
        this.rect = new android.graphics.Rect();
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
        this.DOWN_SCALE = 12.0f;
        this.TOP_CLIP_OFFSET = 34;
        this.themeAnimationValue = 1.0f;
        this.blurBackgroundTask = new BlurBackgroundTask();
        this.blurNodeInvalidatedThisFrame = new boolean[2];
        this.blurNodeInvalidated = new boolean[2];
        this.lastViews = new ArrayList<>();
        this.views = new ArrayList<>();
        setWillNotDraw(false);
        this.parentLayout = iNavigationLayout;
        this.adjustPanLayoutHelper = createAdjustPanLayoutHelper();
    }

    public class BackgroundView extends View {
        public BackgroundView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float f;
            float f2;
            float f3;
            if (SizeNotifierFrameLayout.this.backgroundDrawable == null || SizeNotifierFrameLayout.this.skipBackgroundDrawing) {
                return;
            }
            Drawable newDrawable = SizeNotifierFrameLayout.this.getNewDrawable();
            boolean newDrawableMotion = SizeNotifierFrameLayout.this.getNewDrawableMotion();
            if (newDrawable != SizeNotifierFrameLayout.this.backgroundDrawable && newDrawable != null) {
                if (Theme.isAnimatingColor()) {
                    SizeNotifierFrameLayout sizeNotifierFrameLayout = SizeNotifierFrameLayout.this;
                    sizeNotifierFrameLayout.oldBackgroundDrawable = sizeNotifierFrameLayout.backgroundDrawable;
                    SizeNotifierFrameLayout sizeNotifierFrameLayout2 = SizeNotifierFrameLayout.this;
                    sizeNotifierFrameLayout2.oldBackgroundMotion = sizeNotifierFrameLayout2.backgroundMotion;
                }
                if (newDrawable instanceof MotionBackgroundDrawable) {
                    ((MotionBackgroundDrawable) newDrawable).setParentView(SizeNotifierFrameLayout.this.backgroundView);
                }
                SizeNotifierFrameLayout.this.backgroundDrawable = newDrawable;
                SizeNotifierFrameLayout sizeNotifierFrameLayout3 = SizeNotifierFrameLayout.this;
                if (sizeNotifierFrameLayout3.attached && (sizeNotifierFrameLayout3.backgroundDrawable instanceof ChatBackgroundDrawable)) {
                    ((ChatBackgroundDrawable) SizeNotifierFrameLayout.this.backgroundDrawable).onAttachedToWindow(this);
                }
                SizeNotifierFrameLayout.this.backgroundMotion = newDrawableMotion;
                SizeNotifierFrameLayout.this.themeAnimationValue = 0.0f;
                SizeNotifierFrameLayout.this.checkMotion();
            }
            SizeNotifierFrameLayout sizeNotifierFrameLayout4 = SizeNotifierFrameLayout.this;
            sizeNotifierFrameLayout4.themeAnimationValue = Utilities.clamp(sizeNotifierFrameLayout4.themeAnimationValue + (AndroidUtilities.screenRefreshTime / 200.0f), 1.0f, 0.0f);
            int i = 0;
            while (i < 2) {
                SizeNotifierFrameLayout sizeNotifierFrameLayout5 = SizeNotifierFrameLayout.this;
                Drawable drawable = i == 0 ? sizeNotifierFrameLayout5.oldBackgroundDrawable : sizeNotifierFrameLayout5.backgroundDrawable;
                if (drawable != null) {
                    if (i == 1 && SizeNotifierFrameLayout.this.oldBackgroundDrawable != null && SizeNotifierFrameLayout.this.parentLayout != null) {
                        drawable.setAlpha((int) (SizeNotifierFrameLayout.this.themeAnimationValue * 255.0f));
                    } else {
                        drawable.setAlpha(255);
                    }
                    SizeNotifierFrameLayout sizeNotifierFrameLayout6 = SizeNotifierFrameLayout.this;
                    if (i == 0 ? sizeNotifierFrameLayout6.oldBackgroundMotion : sizeNotifierFrameLayout6.backgroundMotion) {
                        f = SizeNotifierFrameLayout.this.parallaxScale;
                        f2 = SizeNotifierFrameLayout.this.translationX;
                        f3 = SizeNotifierFrameLayout.this.translationY;
                    } else {
                        f = 1.0f;
                        f2 = 0.0f;
                        f3 = 0.0f;
                    }
                    if (drawable instanceof MotionBackgroundDrawable) {
                        MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
                        if (motionBackgroundDrawable.hasPattern()) {
                            int currentActionBarHeight = (SizeNotifierFrameLayout.this.isActionBarVisible() ? ActionBar.getCurrentActionBarHeight() : 0) + ((Build.VERSION.SDK_INT < 21 || !SizeNotifierFrameLayout.this.occupyStatusBar) ? 0 : AndroidUtilities.statusBarHeight);
                            int measuredHeight = getRootView().getMeasuredHeight() - currentActionBarHeight;
                            float max = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), measuredHeight / drawable.getIntrinsicHeight());
                            int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max * f);
                            int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max * f);
                            int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f2);
                            int i2 = SizeNotifierFrameLayout.this.backgroundTranslationY + ((measuredHeight - ceil2) / 2) + currentActionBarHeight + ((int) f3);
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
                            int measuredHeight2 = (int) ((getRootView().getMeasuredHeight() - SizeNotifierFrameLayout.this.backgroundTranslationY) + f3);
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
                    } else if (!(drawable instanceof BitmapDrawable)) {
                        if (SizeNotifierFrameLayout.this.bottomClip != 0) {
                            canvas.save();
                            canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - SizeNotifierFrameLayout.this.bottomClip);
                        }
                        if (drawable instanceof ChatBackgroundDrawable) {
                            ((ChatBackgroundDrawable) drawable).setParent(this);
                        }
                        float f4 = f - 1.0f;
                        float f5 = (((-getMeasuredWidth()) * f4) / 2.0f) + f2;
                        float f6 = (((-getRootView().getMeasuredHeight()) * f4) / 2.0f) + f3;
                        drawable.setBounds((int) f5, (int) (SizeNotifierFrameLayout.this.backgroundTranslationY + f6), (int) ((getMeasuredWidth() * f) + f5), (int) (SizeNotifierFrameLayout.this.backgroundTranslationY + (getRootView().getMeasuredHeight() * f) + f6));
                        drawable.draw(canvas);
                        SizeNotifierFrameLayout.this.checkSnowflake(canvas);
                        if (SizeNotifierFrameLayout.this.bottomClip != 0) {
                            canvas.restore();
                        }
                    } else if (((BitmapDrawable) drawable).getTileModeX() != Shader.TileMode.REPEAT) {
                        int currentActionBarHeight2 = (SizeNotifierFrameLayout.this.isActionBarVisible() ? ActionBar.getCurrentActionBarHeight() : 0) + ((Build.VERSION.SDK_INT < 21 || !SizeNotifierFrameLayout.this.occupyStatusBar) ? 0 : AndroidUtilities.statusBarHeight);
                        int measuredHeight3 = getRootView().getMeasuredHeight() - currentActionBarHeight2;
                        float max2 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), measuredHeight3 / drawable.getIntrinsicHeight());
                        int ceil3 = (int) Math.ceil(drawable.getIntrinsicWidth() * max2 * f);
                        int ceil4 = (int) Math.ceil(drawable.getIntrinsicHeight() * max2 * f);
                        int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f2);
                        int i3 = SizeNotifierFrameLayout.this.backgroundTranslationY + ((measuredHeight3 - ceil4) / 2) + currentActionBarHeight2 + ((int) f3);
                        canvas.save();
                        canvas.clipRect(0, currentActionBarHeight2, ceil3, getMeasuredHeight() - SizeNotifierFrameLayout.this.bottomClip);
                        drawable.setBounds(measuredWidth2, i3, ceil3 + measuredWidth2, ceil4 + i3);
                        drawable.draw(canvas);
                        SizeNotifierFrameLayout.this.checkSnowflake(canvas);
                        canvas.restore();
                    } else {
                        canvas.save();
                        float f7 = 2.0f / AndroidUtilities.density;
                        canvas.scale(f7, f7);
                        drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f7), (int) Math.ceil(getRootView().getMeasuredHeight() / f7));
                        drawable.draw(canvas);
                        SizeNotifierFrameLayout.this.checkSnowflake(canvas);
                        canvas.restore();
                    }
                    if (i == 0 && SizeNotifierFrameLayout.this.oldBackgroundDrawable != null && SizeNotifierFrameLayout.this.themeAnimationValue >= 1.0f) {
                        SizeNotifierFrameLayout sizeNotifierFrameLayout7 = SizeNotifierFrameLayout.this;
                        if (sizeNotifierFrameLayout7.attached && (sizeNotifierFrameLayout7.oldBackgroundDrawable instanceof ChatBackgroundDrawable)) {
                            ((ChatBackgroundDrawable) SizeNotifierFrameLayout.this.oldBackgroundDrawable).onDetachedFromWindow(SizeNotifierFrameLayout.this.backgroundView);
                        }
                        SizeNotifierFrameLayout.this.oldBackgroundDrawable = null;
                        SizeNotifierFrameLayout.this.oldBackgroundMotion = false;
                        SizeNotifierFrameLayout.this.checkMotion();
                        SizeNotifierFrameLayout.this.backgroundView.invalidate();
                    }
                }
                i++;
            }
            if (SizeNotifierFrameLayout.this.themeAnimationValue != 1.0f) {
                SizeNotifierFrameLayout.this.backgroundView.invalidate();
            }
        }
    }

    public void setBackgroundImage(Drawable drawable, boolean z) {
        if (this.backgroundDrawable == drawable) {
            return;
        }
        if (this.backgroundView == null) {
            BackgroundView backgroundView = new BackgroundView(getContext());
            this.backgroundView = backgroundView;
            addView(backgroundView, 0, LayoutHelper.createFrame(-1, -1.0f));
            checkLayerType();
        }
        if (drawable instanceof MotionBackgroundDrawable) {
            ((MotionBackgroundDrawable) drawable).setParentView(this.backgroundView);
        }
        if (this.attached) {
            Drawable drawable2 = this.backgroundDrawable;
            if (drawable2 instanceof ChatBackgroundDrawable) {
                ((ChatBackgroundDrawable) drawable2).onDetachedFromWindow(this.backgroundView);
            }
        }
        this.backgroundDrawable = drawable;
        if (this.attached && (drawable instanceof ChatBackgroundDrawable)) {
            ((ChatBackgroundDrawable) drawable).onAttachedToWindow(this.backgroundView);
        }
        checkMotion();
        this.backgroundView.invalidate();
        checkLayerType();
    }

    public void checkMotion() {
        if (this.oldBackgroundMotion || this.backgroundMotion) {
            if (this.parallaxEffect == null) {
                WallpaperParallaxEffect wallpaperParallaxEffect = new WallpaperParallaxEffect(getContext());
                this.parallaxEffect = wallpaperParallaxEffect;
                wallpaperParallaxEffect.setCallback(new WallpaperParallaxEffect.Callback() {
                    @Override
                    public final void onOffsetsChanged(int i, int i2, float f) {
                        SizeNotifierFrameLayout.this.lambda$checkMotion$0(i, i2, f);
                    }
                });
                if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                    this.parallaxScale = this.parallaxEffect.getScale(getMeasuredWidth(), getMeasuredHeight());
                }
            }
            if (this.paused) {
                return;
            }
            this.parallaxEffect.setEnabled(true);
            return;
        }
        WallpaperParallaxEffect wallpaperParallaxEffect2 = this.parallaxEffect;
        if (wallpaperParallaxEffect2 != null) {
            wallpaperParallaxEffect2.setEnabled(false);
            this.parallaxEffect = null;
            this.parallaxScale = 1.0f;
            this.translationX = 0.0f;
            this.translationY = 0.0f;
        }
    }

    public void lambda$checkMotion$0(int i, int i2, float f) {
        this.translationX = i;
        this.translationY = i2;
        this.bgAngle = f;
        View view = this.backgroundView;
        if (view != null) {
            view.invalidate();
        }
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
        android.graphics.Rect rect = this.rect;
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = (rootView.getHeight() - (this.rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView);
        android.graphics.Rect rect2 = this.rect;
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
            android.graphics.Point point = AndroidUtilities.displaySize;
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
            View view = this.backgroundView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public void setBackgroundTranslation(int i) {
        if (i != this.backgroundTranslationY) {
            this.backgroundTranslationY = i;
            View view = this.backgroundView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.backgroundDrawable;
        if (drawable instanceof MotionBackgroundDrawable) {
            if (this.animationInProgress) {
                return (int) this.emojiOffset;
            }
            int i = this.emojiHeight;
            return i != 0 ? i : this.backgroundTranslationY;
        } else if (drawable instanceof ChatBackgroundDrawable) {
            return this.backgroundTranslationY;
        } else {
            return 0;
        }
    }

    public int getBackgroundSizeY() {
        int i;
        Drawable drawable = this.backgroundDrawable;
        int i2 = 0;
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
                i2 = i;
            } else if (this.backgroundTranslationY == 0) {
                i2 = -this.keyboardHeight;
            }
        } else if (drawable instanceof ChatBackgroundDrawable) {
            i2 = this.backgroundTranslationY;
        }
        return getMeasuredHeight() - i2;
    }

    public int getHeightWithKeyboard() {
        return this.keyboardHeight + getMeasuredHeight();
    }

    public void setEmojiKeyboardHeight(int i) {
        if (this.emojiHeight != i) {
            this.emojiHeight = i;
            View view = this.backgroundView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public void setEmojiOffset(boolean z, float f) {
        if (this.emojiOffset == f && this.animationInProgress == z) {
            return;
        }
        this.emojiOffset = f;
        this.animationInProgress = z;
        View view = this.backgroundView;
        if (view != null) {
            view.invalidate();
        }
    }

    public void checkSnowflake(Canvas canvas) {
        if (this.backgroundView != null && Theme.canStartHolidayAnimation() && LiteMode.isEnabled(32)) {
            if (this.snowflakesEffect == null) {
                this.snowflakesEffect = new SnowflakesEffect(1);
            }
            this.snowflakesEffect.onDraw(this.backgroundView, canvas);
        }
    }

    public void setSkipBackgroundDrawing(boolean z) {
        if (this.skipBackgroundDrawing != z) {
            this.skipBackgroundDrawing = z;
            View view = this.backgroundView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public Drawable getNewDrawable() {
        return Theme.getCachedWallpaperNonBlocking();
    }

    public boolean getNewDrawableMotion() {
        return Theme.isWallpaperMotion();
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == getBackgroundImage() || super.verifyDrawable(drawable);
    }

    public void startBlur() {
        BlurBitmap blurBitmap;
        if (!this.blurIsRunning || this.blurGeneratingTuskIsRunning || !this.invalidateBlur || !SharedConfig.chatBlurEnabled() || DRAW_USING_RENDERNODE() || Color.alpha(Theme.getColor(Theme.key_chat_BlurAlphaSlow)) == 255) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.dp(100.0f);
        if (measuredWidth == 0 || currentActionBarHeight == 0) {
            return;
        }
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
            blurBitmap.topCanvas = new SimplerCanvas(blurBitmap.topBitmap);
            if (this.needBlurBottom) {
                blurBitmap.bottomBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                blurBitmap.bottomCanvas = new SimplerCanvas(blurBitmap.bottomBitmap);
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
        drawList(blurBitmap.topCanvas, true, null);
        blurBitmap.topCanvas.restore();
        if (this.needBlurBottom) {
            float width2 = blurBitmap.bottomBitmap.getWidth() / f2;
            float height2 = (blurBitmap.bottomBitmap.getHeight() - 34) / f;
            blurBitmap.needBlurBottom = true;
            blurBitmap.bottomOffset = getBottomOffset() - f;
            blurBitmap.drawnListTranslationY = getBottomOffset();
            blurBitmap.bottomCanvas.save();
            float f4 = height2 * 10.0f;
            blurBitmap.bottomCanvas.clipRect(1.0f, f4, blurBitmap.bottomBitmap.getWidth(), blurBitmap.bottomBitmap.getHeight() - 1);
            blurBitmap.bottomCanvas.scale(width2, height2);
            blurBitmap.bottomCanvas.translate(0.0f, (f4 - blurBitmap.bottomOffset) + blurBitmap.pixelFixOffset);
            blurBitmap.bottomScaleX = 1.0f / width2;
            blurBitmap.bottomScaleY = 1.0f / height2;
            drawList(blurBitmap.bottomCanvas, false, null);
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
                FileLog.d(sb.toString());
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

    public void updateBlurContent() {
        if (DRAW_USING_RENDERNODE()) {
            invalidateBlurredViews();
        }
    }

    public void invalidateBlurredViews() {
        boolean[] zArr = this.blurNodeInvalidated;
        zArr[0] = true;
        zArr[1] = true;
        for (int i = 0; i < this.blurBehindViews.size(); i++) {
            this.blurBehindViews.get(i).invalidate();
        }
    }

    protected float getBottomOffset() {
        return getMeasuredHeight();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.blurNodeInvalidatedThisFrame;
        zArr[0] = false;
        zArr[1] = false;
        if (this.blurIsRunning) {
            startBlur();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        if (this.needBlur && !this.blurIsRunning) {
            this.blurIsRunning = true;
            this.invalidateBlur = true;
        }
        Drawable drawable = this.backgroundDrawable;
        if (drawable instanceof ChatBackgroundDrawable) {
            ((ChatBackgroundDrawable) drawable).onAttachedToWindow(this.backgroundView);
        }
        Drawable drawable2 = this.oldBackgroundDrawable;
        if (drawable2 instanceof ChatBackgroundDrawable) {
            ((ChatBackgroundDrawable) drawable2).onAttachedToWindow(this.backgroundView);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
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
        Drawable drawable = this.backgroundDrawable;
        if (drawable instanceof ChatBackgroundDrawable) {
            ((ChatBackgroundDrawable) drawable).onDetachedFromWindow(this.backgroundView);
        }
        Drawable drawable2 = this.oldBackgroundDrawable;
        if (drawable2 instanceof ChatBackgroundDrawable) {
            ((ChatBackgroundDrawable) drawable2).onDetachedFromWindow(this.backgroundView);
        }
    }

    public boolean blurWasDrawn() {
        return SharedConfig.chatBlurEnabled() && (DRAW_USING_RENDERNODE() || this.currentBitmap != null);
    }

    private void drawListWithCallbacks(Canvas canvas, boolean z) {
        if (!invalidateOptimized()) {
            drawList(canvas, z, null);
            return;
        }
        this.lastViews.clear();
        this.lastViews.addAll(this.views);
        this.views.clear();
        drawList(canvas, z, this.views);
        Iterator<IViewWithInvalidateCallback> it = this.lastViews.iterator();
        while (it.hasNext()) {
            it.next().listenInvalidate(null);
        }
        Iterator<IViewWithInvalidateCallback> it2 = this.views.iterator();
        while (it2.hasNext()) {
            it2.next().listenInvalidate(new Runnable() {
                @Override
                public final void run() {
                    SizeNotifierFrameLayout.this.updateBlurContent();
                }
            });
        }
    }

    private float getRenderNodeScale() {
        int dp;
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 1) {
            dp = AndroidUtilities.dp(12.0f);
        } else if (devicePerformanceClass == 2) {
            return AndroidUtilities.density;
        } else {
            dp = AndroidUtilities.dp(15.0f);
        }
        return dp;
    }

    private float getBlurRadius() {
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 1) {
            return devicePerformanceClass != 2 ? 3.0f : 60.0f;
        }
        return 4.0f;
    }

    public void drawBlurRect(Canvas canvas, float f, android.graphics.Rect rect, Paint paint, boolean z) {
        float f2;
        RecordingCanvas beginRecording;
        Shader.TileMode tileMode;
        RenderEffect createBlurEffect;
        RenderEffect createColorFilterEffect;
        RenderEffect createChainEffect;
        int alpha = Color.alpha(Theme.getColor((DRAW_USING_RENDERNODE() && SharedConfig.getDevicePerformanceClass() == 2) ? Theme.key_chat_BlurAlpha : Theme.key_chat_BlurAlphaSlow));
        if (!SharedConfig.chatBlurEnabled()) {
            canvas.drawRect(rect, paint);
        } else if (DRAW_USING_RENDERNODE()) {
            if (!canvas.isHardwareAccelerated()) {
                canvas.drawRect(rect, paint);
                return;
            }
            if (this.blurNodes == null) {
                this.blurNodes = new RenderNode[2];
            }
            float renderNodeScale = getRenderNodeScale();
            int i = !z ? 1 : 0;
            if (!z && !this.blurNodeInvalidated[i] && Math.abs(getBottomOffset() - this.lastDrawnBottomBlurOffset) > 0.1f) {
                this.blurNodeInvalidated[i] = true;
            }
            int dp = AndroidUtilities.dp(36.0f);
            if (alpha < 255 && this.blurNodeInvalidated[i] && !this.blurNodeInvalidatedThisFrame[i]) {
                RenderNode[] renderNodeArr = this.blurNodes;
                if (renderNodeArr[i] == null) {
                    renderNodeArr[i] = new RenderNode("blurNode" + i);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(2.0f);
                    RenderNode renderNode = this.blurNodes[i];
                    float blurRadius = getBlurRadius();
                    float blurRadius2 = getBlurRadius();
                    tileMode = Shader.TileMode.DECAL;
                    createBlurEffect = RenderEffect.createBlurEffect(blurRadius, blurRadius2, tileMode);
                    createColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
                    createChainEffect = RenderEffect.createChainEffect(createBlurEffect, createColorFilterEffect);
                    renderNode.setRenderEffect(createChainEffect);
                }
                int measuredWidth = getMeasuredWidth();
                int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.dp(100.0f);
                this.blurNodes[i].setPosition(0, 0, (int) (measuredWidth / renderNodeScale), (int) (((dp * 2) + currentActionBarHeight) / renderNodeScale));
                beginRecording = this.blurNodes[i].beginRecording();
                drawingBlur = true;
                float f3 = 1.0f / renderNodeScale;
                beginRecording.scale(f3, f3);
                beginRecording.drawPaint(paint);
                beginRecording.translate(0.0f, dp);
                if (!z) {
                    float bottomOffset = getBottomOffset();
                    this.lastDrawnBottomBlurOffset = bottomOffset;
                    float f4 = bottomOffset - currentActionBarHeight;
                    this.drawnBottomOffset = f4;
                    beginRecording.translate(0.0f, -f4);
                }
                drawListWithCallbacks(beginRecording, z);
                drawingBlur = false;
                this.blurNodes[i].endRecording();
                this.blurNodeInvalidatedThisFrame[i] = true;
                this.blurNodeInvalidated[i] = false;
            }
            if (!invalidateOptimized()) {
                this.blurNodeInvalidated[i] = true;
                invalidateBlurredViews();
            }
            canvas.save();
            canvas.drawRect(rect, paint);
            canvas.clipRect(rect);
            RenderNode renderNode2 = this.blurNodes[i];
            if (renderNode2 != null && alpha < 255) {
                renderNode2.setAlpha(1.0f - (alpha / 255.0f));
                if (z) {
                    f2 = 0.0f;
                    canvas.translate(0.0f, (-f) - getTranslationY());
                } else {
                    f2 = 0.0f;
                    canvas.translate(0.0f, ((-f) + this.drawnBottomOffset) - (this.lastDrawnBottomBlurOffset - (getBottomOffset() + getListTranslationY())));
                }
                canvas.translate(f2, -dp);
                canvas.scale(renderNodeScale, renderNodeScale);
                canvas.drawRenderNode(this.blurNodes[i]);
            }
            canvas.restore();
        } else if (this.currentBitmap == null) {
            canvas.drawRect(rect, paint);
        } else {
            updateBlurShaderPosition(f, z);
            paint.setAlpha(255);
            if (this.blurCrossfadeProgress != 1.0f && this.selectedBlurPaint2.getShader() != null) {
                canvas.drawRect(rect, paint);
                canvas.drawRect(rect, this.selectedBlurPaint2);
                canvas.saveLayerAlpha(rect.left, rect.top, rect.right, rect.bottom, (int) (this.blurCrossfadeProgress * 255.0f), 31);
                canvas.drawRect(rect, paint);
                canvas.drawRect(rect, this.selectedBlurPaint);
                canvas.restore();
            } else {
                canvas.drawRect(rect, paint);
                canvas.drawRect(rect, this.selectedBlurPaint);
            }
            paint.setAlpha(alpha);
            canvas.drawRect(rect, paint);
        }
    }

    public void drawBlurCircle(Canvas canvas, float f, float f2, float f3, float f4, Paint paint, boolean z) {
        int alpha = Color.alpha(Theme.getColor(DRAW_USING_RENDERNODE() ? Theme.key_chat_BlurAlpha : Theme.key_chat_BlurAlphaSlow));
        if (this.currentBitmap == null || !SharedConfig.chatBlurEnabled()) {
            canvas.drawCircle(f2, f3, f4, paint);
            return;
        }
        updateBlurShaderPosition(f, z);
        paint.setAlpha(255);
        if (this.blurCrossfadeProgress != 1.0f && this.selectedBlurPaint2.getShader() != null) {
            canvas.drawCircle(f2, f3, f4, paint);
            canvas.drawCircle(f2, f3, f4, this.selectedBlurPaint2);
            canvas.saveLayerAlpha(f2 - f4, f3 - f4, f2 + f4, f3 + f4, (int) (this.blurCrossfadeProgress * 255.0f), 31);
            canvas.drawCircle(f2, f3, f4, paint);
            canvas.drawCircle(f2, f3, f4, this.selectedBlurPaint);
            canvas.restore();
        } else {
            canvas.drawCircle(f2, f3, f4, paint);
            canvas.drawCircle(f2, f3, f4, this.selectedBlurPaint);
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
                this.matrix.setTranslate(0.0f, (((blurBitmap.bottomOffset + f2) - blurBitmap.pixelFixOffset) - 34.0f) - (blurBitmap.drawnListTranslationY - (getBottomOffset() + getListTranslationY())));
                Matrix matrix = this.matrix;
                BlurBitmap blurBitmap2 = this.currentBitmap;
                matrix.preScale(blurBitmap2.bottomScaleX, blurBitmap2.bottomScaleY);
                BlurBitmap blurBitmap3 = this.prevBitmap;
                if (blurBitmap3 != null) {
                    this.matrix2.setTranslate(0.0f, (((f2 + blurBitmap3.bottomOffset) - blurBitmap3.pixelFixOffset) - 34.0f) - (blurBitmap3.drawnListTranslationY - (getBottomOffset() + getListTranslationY())));
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
        float drawnListTranslationY;
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

    public static class SimplerCanvas extends Canvas {
        @Override
        public boolean clipPath(Path path) {
            return false;
        }

        @Override
        public boolean clipPath(Path path, Region.Op op) {
            return false;
        }

        @Override
        public void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        }

        @Override
        public void drawText(String str, float f, float f2, Paint paint) {
        }

        @Override
        public void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        }

        @Override
        public void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        }

        @Override
        public void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        }

        @Override
        public void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        }

        @Override
        public void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        }

        @Override
        public void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        }

        @Override
        public void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        }

        public SimplerCanvas(Bitmap bitmap) {
            super(bitmap);
        }
    }
}
