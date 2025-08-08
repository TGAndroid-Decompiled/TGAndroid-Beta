package org.telegram.ui.Components.quickforward;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.content.ContextCompat;
import androidx.core.math.MathUtils;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.quickforward.BlurVisibilityDrawable;

public class QuickShareSelectorDrawable extends Drawable implements Animator.AnimatorListener {
    private static final Property CLOSE_FACTOR;
    private static final Property OPEN_FACTOR;
    private final QuickShareAvatarCell[] avatarCells;
    private BitmapShader bitmapShader;
    private float bubbleOffset;
    private float bulletinImageCx;
    private float bulletinImageCy;
    private Bulletin.LottieLayout bulletinLayout;
    public final ChatMessageCell cell;
    private BlurVisibilityDrawable closeAnimationDrawable;
    private Bitmap globalBlurBitmap;
    private Paint globalBlurBitmapPaint;
    private boolean isDestroyed;
    private boolean isReady;
    public final String key;
    private LinearGradient linearGradient;
    public final MessageObject messageObject;
    private int offsetX;
    private int offsetY;
    private final Runnable onFinish;
    public final QuickShareSelectorOverlayLayout parent;
    private final Drawable shadowDrawable;
    private static final RectF tmpRectF = new RectF();
    private static final Rect tmpRect = new Rect();
    private static final int[] tmpCords = new int[2];
    private final Paint paintBubbleBg = new Paint(1);
    private final Matrix shaderMatrix = new Matrix();
    private final Path path = new Path();
    private final RectF bubbleStart = new RectF();
    private final RectF buttonCurrent = new RectF();
    private final RectF bubbleCurrent = new RectF();
    private final RectF ballLeft = new RectF();
    private final RectF ballRight = new RectF();
    private float openProgress = 0.0f;
    private float closeProgress = 0.0f;
    private Matrix bitmapMatrix = new Matrix();
    private boolean openAnimationCompleted = false;
    private boolean closeAnimationCompleted = false;
    private boolean closeAnimationStarted = false;
    private boolean ballsAllowed = true;
    private int selectedIndex = -1;
    private final ObjectAnimator openAnimation = ObjectAnimator.ofFloat(this, (Property<QuickShareSelectorDrawable, Float>) OPEN_FACTOR, 1.0f).setDuration(560L);
    private final ObjectAnimator closeAnimation = ObjectAnimator.ofFloat(this, (Property<QuickShareSelectorDrawable, Float>) CLOSE_FACTOR, 1.0f).setDuration(240L);

    public static class Sizes {
        public static int AVATAR = 42;
        public static int AVATAR_RADIUS = 21;
        public static int BLUR_RADIUS = 10;
        public static int BUBBLE_HEIGHT = 56;
        public static int CLOSE_AVATAR_JUMP_HEIGHT = 15;
        public static int GAP = 11;
        public static int PADDING_H = 9;
        public static int TEXT_BLUR_RADIUS = 4;
        public static int TEXT_PADDING_EXTERNAL = 16;
        public static int TEXT_PADDING_INTERNAL = 8;
    }

    private static double calculateC0(double d, double d2, double d3, double d4) {
        return (d2 - (d4 * (d * d))) - (d3 * d);
    }

    private static double calculateC1(double d, double d2, double d3, double d4, double d5) {
        double d6 = (d4 - (d5 * ((d3 * d3) - (d * d)))) - d2;
        double d7 = d3 - d;
        if (d7 == 0.0d) {
            return 0.0d;
        }
        return d6 / d7;
    }

    private static double calculateC2(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = (d6 - (((d5 - d) * (d4 - d2)) / (d3 - d))) - d2;
        double d8 = (((d5 * d5) - (d3 * d5)) + (d3 * d)) - (d * d5);
        if (d8 == 0.0d) {
            return 0.0d;
        }
        return d7 / d8;
    }

    private static float fromTo(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    private static float reverseAngle(float f) {
        return f <= 0.0f ? f + 180.0f : f - 180.0f;
    }

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
    }

    @Override
    public void onAnimationRepeat(Animator animator) {
    }

    @Override
    public void onAnimationStart(Animator animator) {
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    static {
        String str = "openFactor";
        OPEN_FACTOR = new AnimationProperties.FloatProperty(str) {
            @Override
            public Float get(QuickShareSelectorDrawable quickShareSelectorDrawable) {
                return Float.valueOf(quickShareSelectorDrawable.openProgress);
            }

            @Override
            public void setValue(QuickShareSelectorDrawable quickShareSelectorDrawable, float f) {
                quickShareSelectorDrawable.openProgress = f;
                quickShareSelectorDrawable.calculateOpeningAnimationPositions();
                quickShareSelectorDrawable.invalidateSelf();
            }
        };
        CLOSE_FACTOR = new AnimationProperties.FloatProperty(str) {
            @Override
            public Float get(QuickShareSelectorDrawable quickShareSelectorDrawable) {
                return Float.valueOf(quickShareSelectorDrawable.closeProgress);
            }

            @Override
            public void setValue(QuickShareSelectorDrawable quickShareSelectorDrawable, float f) {
                quickShareSelectorDrawable.closeProgress = f;
                quickShareSelectorDrawable.invalidateSelf();
            }
        };
    }

    public int getBubbleWidth() {
        int i = Sizes.AVATAR;
        int i2 = Sizes.GAP;
        return AndroidUtilities.dp((((i + i2) * this.avatarCells.length) - i2) + (Sizes.PADDING_H * 2));
    }

    public QuickShareSelectorDrawable(QuickShareSelectorOverlayLayout quickShareSelectorOverlayLayout, ChatMessageCell chatMessageCell, List list, String str, Runnable runnable) {
        int i = 0;
        this.onFinish = runnable;
        this.parent = quickShareSelectorOverlayLayout;
        this.cell = chatMessageCell;
        this.messageObject = chatMessageCell.getMessageObject();
        this.key = str;
        this.avatarCells = new QuickShareAvatarCell[Math.min(5, list.size())];
        while (true) {
            QuickShareAvatarCell[] quickShareAvatarCellArr = this.avatarCells;
            if (i < quickShareAvatarCellArr.length) {
                quickShareAvatarCellArr[i] = new QuickShareAvatarCell(this, ((Long) list.get(i)).longValue());
                i++;
            } else {
                this.paintBubbleBg.setStyle(Paint.Style.FILL);
                this.shadowDrawable = ContextCompat.getDrawable(quickShareSelectorOverlayLayout.getContext(), R.drawable.reactions_bubble_shadow).mutate();
                chatMessageCell.setHideSideButtonByQuickShare(true);
                quickShareSelectorOverlayLayout.performHapticFeedback(3, 1);
                updateColors();
                ObjectAnimator objectAnimator = this.openAnimation;
                Interpolator interpolator = Interpolators.LINEAR_INTERPOLATOR;
                objectAnimator.setInterpolator(interpolator);
                this.openAnimation.addListener(this);
                this.closeAnimation.setInterpolator(interpolator);
                this.closeAnimation.addListener(this);
                AndroidUtilities.makeGlobalBlurBitmap(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        QuickShareSelectorDrawable.this.lambda$new$0((Bitmap) obj);
                    }
                }, 15.0f);
                return;
            }
        }
    }

    public void lambda$new$0(Bitmap bitmap) {
        if (this.isDestroyed) {
            this.globalBlurBitmap.recycle();
            return;
        }
        this.globalBlurBitmap = bitmap;
        Bitmap bitmap2 = this.globalBlurBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
        Paint paint = new Paint(2);
        this.globalBlurBitmapPaint = paint;
        paint.setShader(this.bitmapShader);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? 0.08f : 1.25f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? 0.02f : -0.15f);
        this.globalBlurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.bitmapMatrix.reset();
        this.bitmapMatrix.setScale(15.0f, 15.0f);
        this.bitmapShader.setLocalMatrix(this.bitmapMatrix);
    }

    public Paint getBlurBitmapPaint() {
        return this.globalBlurBitmapPaint;
    }

    private void calculateCords() {
        ChatMessageCell chatMessageCell = this.cell;
        int[] iArr = tmpCords;
        chatMessageCell.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        this.parent.getLocationInWindow(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        this.offsetX = i - i3;
        this.offsetY = i2 - i4;
        float dp = AndroidUtilities.dp(16.0f);
        float sideButtonStartX = this.offsetX + this.cell.getSideButtonStartX() + dp;
        float sideButtonStartY = this.offsetY + this.cell.getSideButtonStartY() + dp;
        this.bubbleStart.set(sideButtonStartX - dp, sideButtonStartY - dp, sideButtonStartX + dp, sideButtonStartY + dp);
        float dp2 = AndroidUtilities.dp(16.0f);
        if (this.bubbleStart.right + AndroidUtilities.dp(48.0f) + dp2 > this.parent.getMeasuredWidth()) {
            this.bubbleOffset = Math.max(0.0f, (this.parent.getMeasuredWidth() - dp2) - this.bubbleStart.right);
        } else if (((this.bubbleStart.right + AndroidUtilities.dp(48.0f)) - getBubbleWidth()) - dp2 < 0.0f) {
            this.bubbleOffset = Math.max(0.0f, (dp2 + getBubbleWidth()) - this.bubbleStart.right);
        } else {
            this.bubbleOffset = AndroidUtilities.dp(48.0f);
        }
    }

    private void prepare() {
        calculateCords();
        this.openAnimation.start();
        this.isReady = true;
    }

    public boolean isDestroyed() {
        return this.isDestroyed;
    }

    public void onTouchMoveEvent(float f, float f2) {
        if (this.openAnimationCompleted) {
            RectF rectF = this.bubbleCurrent;
            float f3 = (f - rectF.left) + this.offsetX;
            float f4 = (f2 - rectF.top) + this.offsetY;
            setIndex((((float) (-AndroidUtilities.dp((float) (Sizes.TEXT_PADDING_EXTERNAL + 21)))) >= f4 || f4 >= this.bubbleCurrent.height()) ? -1 : MathUtils.clamp((int) Math.floor((f3 - (AndroidUtilities.dp(Sizes.PADDING_H) - (AndroidUtilities.dp(Sizes.GAP) / 2.0f))) / AndroidUtilities.dp(Sizes.AVATAR + Sizes.GAP)), 0, this.avatarCells.length - 1));
        }
    }

    public void close(Bulletin bulletin) {
        if (bulletin == null) {
            this.selectedIndex = -1;
            closeImpl();
            return;
        }
        Bulletin.Layout layout = bulletin.getLayout();
        if (!(layout instanceof Bulletin.LottieLayout)) {
            closeImpl();
            return;
        }
        Bulletin.LottieLayout lottieLayout = (Bulletin.LottieLayout) layout;
        this.bulletinLayout = lottieLayout;
        lottieLayout.imageView.setVisibility(4);
        final ViewTreeObserver viewTreeObserver = this.bulletinLayout.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {
                viewTreeObserver.removeOnPreDrawListener(this);
                QuickShareSelectorDrawable.this.initBulletin();
                QuickShareSelectorDrawable.this.closeImpl();
                return true;
            }
        });
    }

    public void closeImpl() {
        this.closeAnimation.start();
        this.closeAnimationStarted = true;
        if (this.openAnimationCompleted && !this.isDestroyed) {
            BlurVisibilityDrawable blurVisibilityDrawable = new BlurVisibilityDrawable(new BlurVisibilityDrawable.DrawRunnable() {
                @Override
                public final void draw(Canvas canvas, int i) {
                    QuickShareSelectorDrawable.this.drawBubble(canvas, i);
                }
            });
            this.closeAnimationDrawable = blurVisibilityDrawable;
            blurVisibilityDrawable.render((int) this.bubbleCurrent.width(), (int) (this.bubbleCurrent.height() + AndroidUtilities.dp(30.0f)), AndroidUtilities.dp(Sizes.BLUR_RADIUS), 4.0f);
        }
        invalidateSelf();
    }

    public long getSelectedDialogId() {
        int i = this.selectedIndex;
        if (i != -1) {
            return this.avatarCells[i].dialogId;
        }
        return 0L;
    }

    public void destroy() {
        this.cell.setHideSideButtonByQuickShare(false);
        if (this.isDestroyed) {
            return;
        }
        this.isDestroyed = true;
        Bitmap bitmap = this.globalBlurBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        BlurVisibilityDrawable blurVisibilityDrawable = this.closeAnimationDrawable;
        if (blurVisibilityDrawable != null) {
            blurVisibilityDrawable.recycle();
        }
        for (QuickShareAvatarCell quickShareAvatarCell : this.avatarCells) {
            quickShareAvatarCell.recycle();
        }
    }

    public void initBulletin() {
        Bulletin.LottieLayout lottieLayout = this.bulletinLayout;
        if (lottieLayout == null) {
            return;
        }
        int[] iArr = tmpCords;
        lottieLayout.getLocationInWindow(iArr);
        float f = iArr[0];
        float translationY = iArr[1] - this.bulletinLayout.getTranslationY();
        Bulletin.LottieLayout lottieLayout2 = this.bulletinLayout;
        float topOffset = translationY + (lottieLayout2.top ? lottieLayout2.getTopOffset() : -lottieLayout2.getBottomOffset());
        this.parent.getLocationInWindow(iArr);
        float f2 = iArr[0];
        float f3 = iArr[1];
        this.bulletinImageCx = (f - f2) + this.bulletinLayout.imageView.getLeft() + (this.bulletinLayout.imageView.getMeasuredWidth() / 2.0f);
        this.bulletinImageCy = (topOffset - f3) + this.bulletinLayout.imageView.getTop() + (this.bulletinLayout.imageView.getMeasuredHeight() / 2.0f);
    }

    public void drawBubble(Canvas canvas, int i) {
        canvas.save();
        RectF rectF = this.bubbleCurrent;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        draw(canvas, i, true);
        canvas.restore();
    }

    public boolean isActive() {
        return !this.closeAnimationStarted;
    }

    @Override
    public void draw(Canvas canvas) {
        draw(canvas, 255, false);
    }

    public void draw(Canvas canvas, int i, boolean z) {
        int i2;
        int i3;
        float min;
        if (!this.isReady) {
            prepare();
        }
        BlurVisibilityDrawable blurVisibilityDrawable = this.closeAnimationDrawable;
        if (blurVisibilityDrawable != null && !z) {
            RectF rectF = this.bubbleCurrent;
            int i4 = (int) rectF.left;
            int dp = (int) (rectF.top - AndroidUtilities.dp(30.0f));
            RectF rectF2 = this.bubbleCurrent;
            blurVisibilityDrawable.setBounds(i4, dp, (int) rectF2.right, (int) rectF2.bottom);
            this.closeAnimationDrawable.setAlpha((int) ((1.0f - Interpolators.closeAlpha.getInterpolation(this.closeProgress)) * 255.0f));
            this.closeAnimationDrawable.draw(canvas);
            if (this.selectedIndex != -1) {
                float interpolation = 1.0f - Interpolators.closeAvatarAlpha.getInterpolation(this.closeProgress);
                float interpolation2 = Interpolators.closeAvatarPosition.getInterpolation(this.closeProgress);
                float centerX = this.bubbleCurrent.centerX() + (AndroidUtilities.dp(Sizes.AVATAR + Sizes.GAP) * (this.selectedIndex - 2));
                float centerY = this.bubbleCurrent.centerY();
                float f = this.bulletinImageCx;
                float f2 = this.bulletinImageCy;
                float f3 = (centerX + f) / 2.0f;
                Bulletin.LottieLayout lottieLayout = this.bulletinLayout;
                if (lottieLayout != null && lottieLayout.top) {
                    min = Math.max(centerY, f2) + AndroidUtilities.dp(Sizes.CLOSE_AVATAR_JUMP_HEIGHT);
                } else {
                    min = Math.min(centerY, f2) - AndroidUtilities.dp(Sizes.CLOSE_AVATAR_JUMP_HEIGHT);
                }
                this.avatarCells[this.selectedIndex].drawBlurredAvatar(canvas, fromTo(centerX, f, interpolation2), findParabola(centerX, centerY, f, f2, f3, min, interpolation2), fromTo((AndroidUtilities.dp(Sizes.AVATAR) / 2.0f) + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), interpolation2), interpolation);
                return;
            }
            return;
        }
        float f4 = !z ? 1.0f - this.closeProgress : i / 255.0f;
        float fromTo = fromTo(0.3f, 0.075f, Interpolators.bgScale.getInterpolation(this.openProgress));
        this.shaderMatrix.reset();
        this.shaderMatrix.setScale(fromTo, fromTo);
        this.shaderMatrix.postTranslate(0.0f, this.bubbleCurrent.bottom);
        this.linearGradient.setLocalMatrix(this.shaderMatrix);
        this.paintBubbleBg.setAlpha((int) (Interpolators.bgOpacity.getInterpolation(this.openProgress) * 255.0f * f4));
        RectF rectF3 = tmpRectF;
        rectF3.set(this.bubbleCurrent);
        rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        Rect rect = tmpRect;
        rectF3.round(rect);
        this.shadowDrawable.setAlpha((int) (255.0f * f4));
        this.shadowDrawable.setBounds(rect);
        this.shadowDrawable.draw(canvas);
        int i5 = 1;
        if (!this.openAnimationCompleted) {
            float interpolation3 = (Interpolators.buttonRotationUp.getInterpolation(this.openProgress) - Interpolators.buttonRotationDown.getInterpolation(this.openProgress)) * (-40.0f);
            canvas.save();
            RectF rectF4 = this.buttonCurrent;
            canvas.translate(rectF4.left, rectF4.top);
            canvas.rotate(interpolation3, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            canvas.translate(-this.cell.getSideButtonStartX(), -this.cell.getSideButtonStartY());
            this.cell.drawSideButton(canvas, true);
            canvas.restore();
        }
        if (this.ballsAllowed && !this.openAnimationCompleted) {
            canvas.drawPath(this.path, this.paintBubbleBg);
        } else {
            float min2 = Math.min(this.bubbleCurrent.width(), this.bubbleCurrent.height()) / 2.0f;
            float min3 = Math.min(this.buttonCurrent.width(), this.buttonCurrent.height()) / 2.0f;
            canvas.drawRoundRect(this.bubbleCurrent, min2, min2, this.paintBubbleBg);
            if (!this.openAnimationCompleted) {
                canvas.drawRoundRect(this.buttonCurrent, min3, min3, this.paintBubbleBg);
            }
        }
        float dp2 = AndroidUtilities.dp(2.0f) * Interpolators.avatarOvershootCancel.getInterpolation(this.openProgress);
        float dp3 = ((AndroidUtilities.dp(Sizes.AVATAR + 2) * Interpolators.avatar1.getInterpolation(this.openProgress)) / 2.0f) - dp2;
        float dp4 = ((AndroidUtilities.dp(Sizes.AVATAR + 2) * Interpolators.avatar2.getInterpolation(this.openProgress)) / 2.0f) - dp2;
        float dp5 = ((AndroidUtilities.dp(Sizes.AVATAR + 2) * Interpolators.avatar3.getInterpolation(this.openProgress)) / 2.0f) - dp2;
        int i6 = 0;
        while (i6 < 2) {
            int i7 = 0;
            while (true) {
                if (i7 < this.avatarCells.length) {
                    if (!(i6 == 0 && i7 == this.selectedIndex) && (i6 != i5 || i7 == this.selectedIndex)) {
                        float length = i7 - ((r1.length / 2.0f) - 0.5f);
                        float f5 = i7 == 2 ? dp3 : (i7 == i5 || i7 == 3) ? dp4 : dp5;
                        float centerX2 = this.bubbleCurrent.centerX() + (AndroidUtilities.dp(Sizes.AVATAR + Sizes.GAP) * length);
                        float centerY2 = this.bubbleCurrent.centerY();
                        QuickShareAvatarCell quickShareAvatarCell = this.avatarCells[i7];
                        float dp6 = AndroidUtilities.dp(Sizes.TEXT_PADDING_EXTERNAL);
                        float measuredWidth = this.parent.getMeasuredWidth() - AndroidUtilities.dp(Sizes.TEXT_PADDING_EXTERNAL);
                        RectF rectF5 = this.bubbleCurrent;
                        float f6 = rectF5.left;
                        float f7 = rectF5.right;
                        boolean z2 = i7 == this.selectedIndex && this.closeAnimationStarted;
                        i2 = i7;
                        float f8 = f5;
                        i3 = i6;
                        quickShareAvatarCell.draw(canvas, dp6, measuredWidth, f6, f7, centerX2, centerY2, f8, f4, z2);
                    } else {
                        i2 = i7;
                        i3 = i6;
                    }
                    i7 = i2 + 1;
                    i6 = i3;
                    i5 = 1;
                }
            }
            i6++;
            i5 = 1;
        }
    }

    private void updateColors() {
        int color = Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, this.cell.getResourcesProvider());
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_messagePanelShadow), PorterDuff.Mode.MULTIPLY));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(100.0f), new int[]{color, 16777215 & color}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.linearGradient = linearGradient;
        this.paintBubbleBg.setShader(linearGradient);
    }

    public void calculateOpeningAnimationPositions() {
        float interpolation = 1.0f - Interpolators.overshootCancel.getInterpolation(this.openProgress);
        float interpolation2 = (Interpolators.buttonJumpUp.getInterpolation(this.openProgress) - Interpolators.buttonJumpDown.getInterpolation(this.openProgress)) * AndroidUtilities.dp(13.0f);
        this.buttonCurrent.set(this.bubbleStart);
        this.buttonCurrent.offset(0.0f, -interpolation2);
        float fromTo = fromTo(this.buttonCurrent.height(), AndroidUtilities.dp(Sizes.BUBBLE_HEIGHT) + (AndroidUtilities.dp(2.0f) * interpolation), Interpolators.heightExpansion.getInterpolation(this.openProgress)) / 2.0f;
        Interpolator interpolator = Interpolators.widthExpansion;
        float fromTo2 = fromTo(this.buttonCurrent.width(), getBubbleWidth() + (AndroidUtilities.dp(10.0f) * interpolation), interpolator.getInterpolation(this.openProgress));
        float f = fromTo * 2.0f;
        float max = Math.max(fromTo2, f);
        float centerX = this.bubbleStart.centerX() + fromTo + (Math.min(AndroidUtilities.dp(-12.0f) + this.bubbleOffset, (max - Math.max(this.buttonCurrent.width(), f)) / 2.0f) * interpolator.getInterpolation(this.openProgress));
        float dp = ((this.bubbleStart.bottom - fromTo) - 1.0f) - ((AndroidUtilities.dp(38.0f) + (AndroidUtilities.dp(6.0f) * interpolation)) * Interpolators.bubbleY.getInterpolation(this.openProgress));
        RectF rectF = this.bubbleCurrent;
        rectF.left = centerX - max;
        rectF.top = dp - fromTo;
        rectF.right = centerX;
        rectF.bottom = dp + fromTo;
        if (!this.ballsAllowed || this.openAnimationCompleted) {
            return;
        }
        float fromTo3 = fromTo(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), Interpolators.ballsRadius.getInterpolation(this.openProgress));
        float f2 = this.bubbleCurrent.bottom + fromTo3;
        float findOtherLeg = (float) findOtherLeg((this.buttonCurrent.width() / 2.0f) + fromTo3, Math.abs(f2 - this.buttonCurrent.centerY()));
        float centerX2 = this.buttonCurrent.centerX() - findOtherLeg;
        RectF rectF2 = this.bubbleCurrent;
        boolean z = centerX2 < rectF2.left + (rectF2.height() / 2.0f);
        if (z) {
            float centerX3 = this.buttonCurrent.centerX();
            float centerY = this.buttonCurrent.centerY();
            float height = (this.buttonCurrent.height() / 2.0f) + fromTo3;
            RectF rectF3 = this.bubbleCurrent;
            PointF findIntersectionWithGravity = findIntersectionWithGravity(centerX3, centerY, height, rectF3.left + (rectF3.height() / 2.0f), this.bubbleCurrent.centerY(), (this.bubbleCurrent.height() / 2.0f) + fromTo3, true);
            if (findIntersectionWithGravity != null) {
                centerX2 = findIntersectionWithGravity.x;
                f2 = findIntersectionWithGravity.y;
            } else {
                this.ballsAllowed = false;
            }
        }
        this.ballLeft.set(centerX2 - fromTo3, f2 - fromTo3, centerX2 + fromTo3, f2 + fromTo3);
        float f3 = this.bubbleCurrent.bottom + fromTo3;
        float centerX4 = this.buttonCurrent.centerX() + findOtherLeg;
        RectF rectF4 = this.bubbleCurrent;
        boolean z2 = centerX4 > rectF4.right - (rectF4.height() / 2.0f);
        if (z2) {
            float centerX5 = this.buttonCurrent.centerX();
            float centerY2 = this.buttonCurrent.centerY();
            float height2 = (this.buttonCurrent.height() / 2.0f) + fromTo3;
            RectF rectF5 = this.bubbleCurrent;
            PointF findIntersectionWithGravity2 = findIntersectionWithGravity(centerX5, centerY2, height2, rectF5.right - (rectF5.height() / 2.0f), this.bubbleCurrent.centerY(), (this.bubbleCurrent.height() / 2.0f) + fromTo3, false);
            if (findIntersectionWithGravity2 != null) {
                centerX4 = findIntersectionWithGravity2.x;
                f3 = findIntersectionWithGravity2.y;
            } else {
                this.ballsAllowed = false;
            }
        }
        this.ballRight.set(centerX4 - fromTo3, f3 - fromTo3, centerX4 + fromTo3, f3 + fromTo3);
        float abs = Math.abs(this.ballLeft.centerX() - this.ballRight.centerX());
        float abs2 = Math.abs(this.ballLeft.centerY() - this.ballRight.centerY());
        if (Math.sqrt((abs * abs) + (abs2 * abs2)) <= (this.ballLeft.width() + this.ballRight.width()) / 2.0f && this.ballsAllowed) {
            this.ballsAllowed = false;
        }
        if (this.ballsAllowed) {
            buildPath(this.path, this.buttonCurrent, this.bubbleCurrent, this.ballLeft, this.ballRight, z, z2);
        }
    }

    private void onOpenAnimationEnd() {
        this.cell.setHideSideButtonByQuickShare(false);
        this.openAnimationCompleted = true;
        invalidateSelf();
        if (this.closeAnimationCompleted) {
            this.onFinish.run();
        }
    }

    private void onCloseAnimationEnd() {
        this.closeAnimationCompleted = true;
        invalidateSelf();
        Bulletin.LottieLayout lottieLayout = this.bulletinLayout;
        if (lottieLayout != null) {
            lottieLayout.imageView.setVisibility(0);
        }
        if (this.openAnimationCompleted) {
            this.onFinish.run();
        }
    }

    private void setIndex(int i) {
        if (this.selectedIndex == i) {
            return;
        }
        this.parent.performHapticFeedback(3, 1);
        this.selectedIndex = i;
        int i2 = 0;
        while (true) {
            QuickShareAvatarCell[] quickShareAvatarCellArr = this.avatarCells;
            if (i2 >= quickShareAvatarCellArr.length) {
                return;
            }
            quickShareAvatarCellArr[i2].setSelected(i == i2, true);
            this.avatarCells[i2].setFullVisible(i == i2 || i == -1, true);
            i2++;
        }
    }

    private void buildPath(Path path, RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, boolean z, boolean z2) {
        path.reset();
        float calculateAngle = calculateAngle(rectF.centerX(), rectF.centerY(), rectF4.centerX(), rectF4.centerY());
        float calculateAngle2 = calculateAngle(rectF.centerX(), rectF.centerY(), rectF3.centerX(), rectF3.centerY());
        arcTo(path, rectF, calculateAngle, calculateAngle2, false);
        float calculateAngle3 = z ? calculateAngle(rectF3.centerX(), rectF3.centerY(), rectF2.left + (rectF2.height() / 2.0f), rectF2.centerY()) : -90.0f;
        arcTo(path, rectF3, reverseAngle(calculateAngle2), calculateAngle3, true, true);
        if (!z) {
            path.lineTo(rectF2.left + (rectF2.height() / 2.0f), rectF2.bottom);
        }
        RectF rectF5 = tmpRectF;
        float f = rectF2.left;
        rectF5.set(f, rectF2.top, rectF2.height() + f, rectF2.bottom);
        arcTo(path, rectF5, reverseAngle(calculateAngle3), -90.0f, false);
        path.lineTo(rectF2.right - (rectF2.height() / 2.0f), rectF2.top);
        float calculateAngle4 = z2 ? calculateAngle(rectF4.centerX(), rectF4.centerY(), rectF2.right - (rectF2.height() / 2.0f), rectF2.centerY()) : -90.0f;
        rectF5.set(rectF2.right - rectF2.height(), rectF2.top, rectF2.right, rectF2.bottom);
        arcTo(path, rectF5, -90.0f, reverseAngle(calculateAngle4), false);
        if (!z2) {
            path.lineTo(rectF4.centerX(), rectF2.bottom);
        }
        arcTo(path, rectF4, calculateAngle4, reverseAngle(calculateAngle), true, true);
        path.close();
    }

    private void arcTo(Path path, RectF rectF, float f, float f2, boolean z) {
        arcTo(path, rectF, f, f2, z, false);
    }

    private void arcTo(Path path, RectF rectF, float f, float f2, boolean z, boolean z2) {
        float f3 = f2 - f;
        if (z) {
            if (f3 > 0.0f) {
                f3 -= 360.0f;
            }
        } else if (f3 < 0.0f) {
            f3 += 360.0f;
        }
        if (Math.abs(f3) > 270.0f && z2) {
            this.ballsAllowed = false;
        }
        path.arcTo(rectF, f, f3);
    }

    private static double findOtherLeg(double d, double d2) {
        if (d <= d2) {
            return 0.0d;
        }
        return Math.sqrt((d * d) - (d2 * d2));
    }

    public static PointF findIntersectionWithGravity(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        float f7 = f4 - f;
        float f8 = f5 - f2;
        float sqrt = (float) Math.sqrt(Math.pow(f7, 2.0d) + Math.pow(f8, 2.0d));
        if (sqrt > f3 + f6 || sqrt < Math.abs(f3 - f6)) {
            return null;
        }
        float f9 = (((f3 * f3) - (f6 * f6)) + (sqrt * sqrt)) / (2.0f * sqrt);
        float sqrt2 = (float) Math.sqrt(r8 - (f9 * f9));
        float f10 = f + ((f9 * f7) / sqrt);
        float f11 = f2 + ((f9 * f8) / sqrt);
        float f12 = (f8 * sqrt2) / sqrt;
        float f13 = f10 + f12;
        float f14 = (sqrt2 * f7) / sqrt;
        float f15 = f11 - f14;
        float f16 = f10 - f12;
        float f17 = f11 + f14;
        if (f13 == f16 || f13 >= f16) {
            if (f15 > f17) {
                return new PointF(f13, f15);
            }
            return new PointF(f16, f17);
        }
        if (z) {
            return new PointF(f13, f15);
        }
        return new PointF(f16, f17);
    }

    private static float calculateAngle(float f, float f2, float f3, float f4) {
        return (float) Math.toDegrees((float) Math.atan2(f4 - f2, f3 - f));
    }

    public static Interpolator interpolator(Interpolator interpolator, int i, int i2, int i3) {
        return interpolator(interpolator, i, i2, i3, false);
    }

    public static Interpolator interpolator(final Interpolator interpolator, int i, int i2, int i3, final boolean z) {
        float f = i3;
        final float f2 = i / f;
        final float f3 = i2 / f;
        return new Interpolator() {
            @Override
            public final float getInterpolation(float f4) {
                float lambda$interpolator$1;
                lambda$interpolator$1 = QuickShareSelectorDrawable.lambda$interpolator$1(z, f2, f3, interpolator, f4);
                return lambda$interpolator$1;
            }
        };
    }

    public static float lambda$interpolator$1(boolean z, float f, float f2, Interpolator interpolator, float f3) {
        if (z) {
            return 1.0f - interpolator.getInterpolation(1.0f - MathUtils.clamp((f3 - f) / (f2 - f), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(MathUtils.clamp((f3 - f) / (f2 - f), 0.0f, 1.0f));
    }

    private static float findParabola(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        double d = f;
        double d2 = f2;
        double d3 = f3;
        double d4 = f4;
        double calculateC2 = calculateC2(d, d2, d3, d4, f5, f6);
        double calculateC1 = calculateC1(d, d2, d3, d4, calculateC2);
        double calculateC0 = calculateC0(d, d2, calculateC1, calculateC2);
        double fromTo = fromTo(f, f3, f7);
        return (float) ((calculateC2 * fromTo * fromTo) + (calculateC1 * fromTo) + calculateC0);
    }

    public static class Interpolators {
        public static final Interpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();
        public static final Interpolator LINEAR_INTERPOLATOR;
        public static final Interpolator avatar1;
        public static final Interpolator avatar2;
        public static final Interpolator avatar3;
        public static final Interpolator avatarOvershootCancel;
        public static final Interpolator ballsRadius;
        public static final Interpolator bgOpacity;
        public static final Interpolator bgScale;
        public static final Interpolator bubbleY;
        public static final Interpolator buttonJumpDown;
        public static final Interpolator buttonJumpUp;
        public static final Interpolator buttonRotationDown;
        public static final Interpolator buttonRotationUp;
        public static final Interpolator closeAlpha;
        public static final Interpolator closeAvatarAlpha;
        public static final Interpolator closeAvatarPosition;
        public static final Interpolator heightExpansion;
        public static final Interpolator overshootCancel;
        public static final Interpolator widthExpansion;

        static {
            LinearInterpolator linearInterpolator = new LinearInterpolator();
            LINEAR_INTERPOLATOR = linearInterpolator;
            closeAlpha = QuickShareSelectorDrawable.interpolator(new DecelerateInterpolator(), 0, 240, 240);
            closeAvatarPosition = QuickShareSelectorDrawable.interpolator(linearInterpolator, 0, 240, 240);
            closeAvatarAlpha = QuickShareSelectorDrawable.interpolator(new DecelerateInterpolator(), 220, 240, 240);
            buttonRotationUp = QuickShareSelectorDrawable.interpolator(new CubicBezierInterpolator(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560);
            buttonRotationDown = QuickShareSelectorDrawable.interpolator(new CubicBezierInterpolator(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
            buttonJumpUp = QuickShareSelectorDrawable.interpolator(new DecelerateInterpolator(), 0, 150, 560);
            buttonJumpDown = QuickShareSelectorDrawable.interpolator(new DecelerateInterpolator(), 210, 425, 560);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            bgOpacity = QuickShareSelectorDrawable.interpolator(cubicBezierInterpolator, 0, 320, 560);
            bgScale = QuickShareSelectorDrawable.interpolator(cubicBezierInterpolator, 40, 320, 560);
            heightExpansion = QuickShareSelectorDrawable.interpolator(new DecelerateInterpolator(), 0, 250, 560);
            widthExpansion = QuickShareSelectorDrawable.interpolator(cubicBezierInterpolator, 0, 460, 560);
            bubbleY = QuickShareSelectorDrawable.interpolator(cubicBezierInterpolator, 0, 325, 560);
            ballsRadius = QuickShareSelectorDrawable.interpolator(new DecelerateInterpolator(), 150, 250, 560);
            overshootCancel = QuickShareSelectorDrawable.interpolator(new DecelerateInterpolator(), 200, 480, 560);
            avatar1 = QuickShareSelectorDrawable.interpolator(cubicBezierInterpolator, 60, 320, 560);
            avatar2 = QuickShareSelectorDrawable.interpolator(cubicBezierInterpolator, 90, 380, 560);
            avatar3 = QuickShareSelectorDrawable.interpolator(cubicBezierInterpolator, 110, 440, 560);
            avatarOvershootCancel = QuickShareSelectorDrawable.interpolator(new DecelerateInterpolator(), 200, 460, 560);
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        if (animator == this.openAnimation) {
            onOpenAnimationEnd();
        } else if (animator == this.closeAnimation) {
            onCloseAnimationEnd();
        }
    }
}
