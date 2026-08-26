package org.telegram.ui.Components.quickforward;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.VideoEditTextureView$$ExternalSyntheticLambda1;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda14;

public final class QuickShareSelectorDrawable extends Drawable implements Animator.AnimatorListener {
    public static final ChatActivity.AnonymousClass5 CLOSE_FACTOR;
    public static final ChatActivity.AnonymousClass5 OPEN_FACTOR;
    public final QuickShareAvatarCell[] avatarCells;
    public BitmapShader bitmapShader;
    public float bubbleOffset;
    public float bulletinImageCx;
    public float bulletinImageCy;
    public Bulletin.LottieLayout bulletinLayout;
    public final ChatMessageCell cell;
    public BlurVisibilityDrawable closeAnimationDrawable;
    public Bitmap globalBlurBitmap;
    public Paint globalBlurBitmapPaint;
    public boolean isDestroyed;
    public boolean isReady;
    public final LinearGradient linearGradient;
    public final MessageObject messageObject;
    public int offsetX;
    public int offsetY;
    public final DialogsActivity$$ExternalSyntheticLambda8 onFinish;
    public final QuickShareSelectorOverlayLayout parent;
    public final Drawable shadowDrawable;
    public static final RectF tmpRectF = new RectF();
    public static final Rect tmpRect = new Rect();
    public static final int[] tmpCords = new int[2];
    public final Paint paintBubbleBg = new Paint(1);
    public final Matrix shaderMatrix = new Matrix();
    public final Path path = new Path();
    public final RectF bubbleStart = new RectF();
    public final RectF buttonCurrent = new RectF();
    public final RectF bubbleCurrent = new RectF();
    public final RectF ballLeft = new RectF();
    public final RectF ballRight = new RectF();
    public float openProgress = 0.0f;
    public float closeProgress = 0.0f;
    public final Matrix bitmapMatrix = new Matrix();
    public boolean openAnimationCompleted = false;
    public boolean closeAnimationCompleted = false;
    public boolean closeAnimationStarted = false;
    public boolean ballsAllowed = true;
    public int selectedIndex = -1;
    public final ObjectAnimator openAnimation = ObjectAnimator.ofFloat(this, OPEN_FACTOR, 1.0f).setDuration(560L);
    public final ObjectAnimator closeAnimation = ObjectAnimator.ofFloat(this, CLOSE_FACTOR, 1.0f).setDuration(240L);

    public abstract class Interpolators {
        public static final DecelerateInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();
        public static final LinearInterpolator LINEAR_INTERPOLATOR;
        public static final QuickShareSelectorDrawable$$ExternalSyntheticLambda0 avatar1;
        public static final QuickShareSelectorDrawable$$ExternalSyntheticLambda0 avatar2;
        public static final QuickShareSelectorDrawable$$ExternalSyntheticLambda0 avatar3;
        public static final QuickShareSelectorDrawable$$ExternalSyntheticLambda0 avatarOvershootCancel;
        public static final QuickShareSelectorDrawable$$ExternalSyntheticLambda0 ballsRadius;
        public static final QuickShareSelectorDrawable$$ExternalSyntheticLambda0 bgOpacity;
        public static final QuickShareSelectorDrawable$$ExternalSyntheticLambda0 bgScale;
        public static final QuickShareSelectorDrawable$$ExternalSyntheticLambda0 bubbleY;
        public static final QuickShareSelectorDrawable$$ExternalSyntheticLambda0 buttonJumpDown;
        public static final QuickShareSelectorDrawable$$ExternalSyntheticLambda0 buttonJumpUp;
        public static final QuickShareSelectorDrawable$$ExternalSyntheticLambda0 buttonRotationDown;
        public static final QuickShareSelectorDrawable$$ExternalSyntheticLambda0 buttonRotationUp;
        public static final QuickShareSelectorDrawable$$ExternalSyntheticLambda0 closeAlpha;
        public static final QuickShareSelectorDrawable$$ExternalSyntheticLambda0 closeAvatarAlpha;
        public static final QuickShareSelectorDrawable$$ExternalSyntheticLambda0 closeAvatarPosition;
        public static final QuickShareSelectorDrawable$$ExternalSyntheticLambda0 heightExpansion;
        public static final QuickShareSelectorDrawable$$ExternalSyntheticLambda0 overshootCancel;
        public static final QuickShareSelectorDrawable$$ExternalSyntheticLambda0 widthExpansion;

        static {
            LinearInterpolator linearInterpolator = new LinearInterpolator();
            LINEAR_INTERPOLATOR = linearInterpolator;
            closeAlpha = QuickShareSelectorDrawable.interpolator(new DecelerateInterpolator(), 0, 240, 240, false);
            closeAvatarPosition = QuickShareSelectorDrawable.interpolator(linearInterpolator, 0, 240, 240, false);
            closeAvatarAlpha = QuickShareSelectorDrawable.interpolator(new DecelerateInterpolator(), 220, 240, 240, false);
            buttonRotationUp = QuickShareSelectorDrawable.interpolator(new CubicBezierInterpolator(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
            buttonRotationDown = QuickShareSelectorDrawable.interpolator(new CubicBezierInterpolator(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
            buttonJumpUp = QuickShareSelectorDrawable.interpolator(new DecelerateInterpolator(), 0, 150, 560, false);
            buttonJumpDown = QuickShareSelectorDrawable.interpolator(new DecelerateInterpolator(), 210, 425, 560, false);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            bgOpacity = QuickShareSelectorDrawable.interpolator(cubicBezierInterpolator, 0, 320, 560, false);
            bgScale = QuickShareSelectorDrawable.interpolator(cubicBezierInterpolator, 40, 320, 560, false);
            heightExpansion = QuickShareSelectorDrawable.interpolator(new DecelerateInterpolator(), 0, 250, 560, false);
            widthExpansion = QuickShareSelectorDrawable.interpolator(cubicBezierInterpolator, 0, 460, 560, false);
            bubbleY = QuickShareSelectorDrawable.interpolator(cubicBezierInterpolator, 0, 325, 560, false);
            ballsRadius = QuickShareSelectorDrawable.interpolator(new DecelerateInterpolator(), 150, 250, 560, false);
            overshootCancel = QuickShareSelectorDrawable.interpolator(new DecelerateInterpolator(), 200, 480, 560, false);
            avatar1 = QuickShareSelectorDrawable.interpolator(cubicBezierInterpolator, 60, 320, 560, false);
            avatar2 = QuickShareSelectorDrawable.interpolator(cubicBezierInterpolator, 90, 380, 560, false);
            avatar3 = QuickShareSelectorDrawable.interpolator(cubicBezierInterpolator, 110, 440, 560, false);
            avatarOvershootCancel = QuickShareSelectorDrawable.interpolator(new DecelerateInterpolator(), 200, 460, 560, false);
        }
    }

    static {
        String str = "openFactor";
        OPEN_FACTOR = new ChatActivity.AnonymousClass5(str, 14);
        CLOSE_FACTOR = new ChatActivity.AnonymousClass5(str, 15);
    }

    public QuickShareSelectorDrawable(QuickShareSelectorOverlayLayout quickShareSelectorOverlayLayout, ChatMessageCell chatMessageCell, ArrayList arrayList, DialogsActivity$$ExternalSyntheticLambda8 dialogsActivity$$ExternalSyntheticLambda8) {
        this.onFinish = dialogsActivity$$ExternalSyntheticLambda8;
        this.parent = quickShareSelectorOverlayLayout;
        this.cell = chatMessageCell;
        this.messageObject = chatMessageCell.getMessageObject();
        this.avatarCells = new QuickShareAvatarCell[Math.min(5, arrayList.size())];
        int i = 0;
        while (true) {
            QuickShareAvatarCell[] quickShareAvatarCellArr = this.avatarCells;
            if (i >= quickShareAvatarCellArr.length) {
                this.paintBubbleBg.setStyle(Paint.Style.FILL);
                Drawable drawableMutate = quickShareSelectorOverlayLayout.getContext().getDrawable(R.drawable.reactions_bubble_shadow).mutate();
                this.shadowDrawable = drawableMutate;
                chatMessageCell.setHideSideButtonByQuickShare(true);
                quickShareSelectorOverlayLayout.performHapticFeedback(3, 1);
                int color = Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, this.cell.getResourcesProvider());
                drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelShadow, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(100.0f), new int[]{color, 16777215 & color}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.linearGradient = linearGradient;
                this.paintBubbleBg.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.openAnimation;
                LinearInterpolator linearInterpolator = Interpolators.LINEAR_INTERPOLATOR;
                objectAnimator.setInterpolator(linearInterpolator);
                this.openAnimation.addListener(this);
                this.closeAnimation.setInterpolator(linearInterpolator);
                this.closeAnimation.addListener(this);
                AndroidUtilities.makeGlobalBlurBitmap(new PollItemMenu$$ExternalSyntheticLambda14(this, 9), 15.0f);
                return;
            }
            quickShareAvatarCellArr[i] = new QuickShareAvatarCell(this, ((Long) arrayList.get(i)).longValue());
            i++;
        }
    }

    public static PointF findIntersectionWithGravity(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        float f7 = f4 - f;
        float f8 = f5 - f2;
        float fSqrt = (float) Math.sqrt(Math.pow(f8, 2.0d) + Math.pow(f7, 2.0d));
        if (fSqrt > f3 + f6 || fSqrt < Math.abs(f3 - f6)) {
            return null;
        }
        float f9 = f3 * f3;
        float f10 = ((fSqrt * fSqrt) + (f9 - (f6 * f6))) / (2.0f * fSqrt);
        float fSqrt2 = (float) Math.sqrt(f9 - (f10 * f10));
        float fM = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(f10, f7, fSqrt, f);
        float fM2 = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(f10, f8, fSqrt, f2);
        float f11 = (f8 * fSqrt2) / fSqrt;
        float f12 = fM + f11;
        float f13 = (fSqrt2 * f7) / fSqrt;
        float f14 = fM2 - f13;
        float f15 = fM - f11;
        float f16 = fM2 + f13;
        if (f12 == f15 || f12 >= f15) {
            return f14 > f16 ? new PointF(f12, f14) : new PointF(f15, f16);
        }
        return z ? new PointF(f12, f14) : new PointF(f15, f16);
    }

    public static QuickShareSelectorDrawable$$ExternalSyntheticLambda0 interpolator(Interpolator interpolator, int i, int i2, int i3, boolean z) {
        float f = i3;
        return new QuickShareSelectorDrawable$$ExternalSyntheticLambda0(z, i / f, i2 / f, interpolator);
    }

    public final void arcTo(Path path, RectF rectF, float f, float f2, boolean z, boolean z2) {
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

    public final void closeImpl() {
        this.closeAnimation.start();
        this.closeAnimationStarted = true;
        if (this.openAnimationCompleted && !this.isDestroyed) {
            BlurVisibilityDrawable blurVisibilityDrawable = new BlurVisibilityDrawable(new VideoEditTextureView$$ExternalSyntheticLambda1(this, 6));
            this.closeAnimationDrawable = blurVisibilityDrawable;
            RectF rectF = this.bubbleCurrent;
            blurVisibilityDrawable.render((int) rectF.width(), (int) (rectF.height() + AndroidUtilities.dp(30.0f)), 4.0f, AndroidUtilities.dp(10));
        }
        invalidateSelf();
    }

    public final void destroy() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        this.cell.setHideSideButtonByQuickShare(false);
        if (this.isDestroyed) {
            return;
        }
        this.isDestroyed = true;
        Bitmap bitmap4 = this.globalBlurBitmap;
        if (bitmap4 != null) {
            bitmap4.recycle();
        }
        BlurVisibilityDrawable blurVisibilityDrawable = this.closeAnimationDrawable;
        if (blurVisibilityDrawable != null && (bitmap3 = blurVisibilityDrawable.bitmap) != null) {
            bitmap3.recycle();
            blurVisibilityDrawable.bitmap = null;
        }
        for (QuickShareAvatarCell quickShareAvatarCell : this.avatarCells) {
            BlurVisibilityDrawable blurVisibilityDrawable2 = quickShareAvatarCell.blurredTextDrawable;
            if (blurVisibilityDrawable2 != null && (bitmap2 = blurVisibilityDrawable2.bitmap) != null) {
                bitmap2.recycle();
                blurVisibilityDrawable2.bitmap = null;
            }
            BlurVisibilityDrawable blurVisibilityDrawable3 = quickShareAvatarCell.blurredAvatarDrawable;
            if (blurVisibilityDrawable3 != null && (bitmap = blurVisibilityDrawable3.bitmap) != null) {
                bitmap.recycle();
                blurVisibilityDrawable3.bitmap = null;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        draw(canvas, false, 255);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator = this.openAnimation;
        DialogsActivity$$ExternalSyntheticLambda8 dialogsActivity$$ExternalSyntheticLambda8 = this.onFinish;
        if (animator == objectAnimator) {
            this.cell.setHideSideButtonByQuickShare(false);
            this.openAnimationCompleted = true;
            invalidateSelf();
            if (this.closeAnimationCompleted) {
                dialogsActivity$$ExternalSyntheticLambda8.run();
                return;
            }
            return;
        }
        if (animator == this.closeAnimation) {
            this.closeAnimationCompleted = true;
            invalidateSelf();
            Bulletin.LottieLayout lottieLayout = this.bulletinLayout;
            if (lottieLayout != null) {
                lottieLayout.imageView.setVisibility(0);
            }
            if (this.openAnimationCompleted) {
                dialogsActivity$$ExternalSyntheticLambda8.run();
            }
        }
    }

    @Override
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas, boolean z, int i) {
        float f;
        float f2;
        int i2;
        float f3;
        QuickShareSelectorOverlayLayout quickShareSelectorOverlayLayout;
        StaticLayout staticLayout;
        QuickShareSelectorDrawable quickShareSelectorDrawable = this;
        boolean z2 = quickShareSelectorDrawable.isReady;
        int i3 = 53;
        QuickShareSelectorOverlayLayout quickShareSelectorOverlayLayout2 = quickShareSelectorDrawable.parent;
        QuickShareAvatarCell[] quickShareAvatarCellArr = quickShareSelectorDrawable.avatarCells;
        ChatMessageCell chatMessageCell = quickShareSelectorDrawable.cell;
        int i4 = 1;
        if (!z2) {
            int[] iArr = tmpCords;
            chatMessageCell.getLocationInWindow(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            quickShareSelectorOverlayLayout2.getLocationInWindow(iArr);
            int i7 = iArr[0];
            int i8 = iArr[1];
            quickShareSelectorDrawable.offsetX = i5 - i7;
            quickShareSelectorDrawable.offsetY = i6 - i8;
            float fDp = AndroidUtilities.dp(16.0f);
            float sideButtonStartX = chatMessageCell.getSideButtonStartX() + quickShareSelectorDrawable.offsetX + fDp;
            float sideButtonStartY = chatMessageCell.getSideButtonStartY() + quickShareSelectorDrawable.offsetY + fDp;
            RectF rectF = quickShareSelectorDrawable.bubbleStart;
            rectF.set(sideButtonStartX - fDp, sideButtonStartY - fDp, sideButtonStartX + fDp, sideButtonStartY + fDp);
            float fDp2 = AndroidUtilities.dp(16.0f);
            if (rectF.right + AndroidUtilities.dp(48.0f) + fDp2 > quickShareSelectorOverlayLayout2.getMeasuredWidth()) {
                quickShareSelectorDrawable.bubbleOffset = Math.max(0.0f, (quickShareSelectorOverlayLayout2.getMeasuredWidth() - fDp2) - rectF.right);
            } else if (((rectF.right + AndroidUtilities.dp(48.0f)) - AndroidUtilities.dp((quickShareAvatarCellArr.length * 53) + 7)) - fDp2 < 0.0f) {
                quickShareSelectorDrawable.bubbleOffset = Math.max(0.0f, (fDp2 + AndroidUtilities.dp((quickShareAvatarCellArr.length * 53) + 7)) - rectF.right);
            } else {
                quickShareSelectorDrawable.bubbleOffset = AndroidUtilities.dp(48.0f);
            }
            quickShareSelectorDrawable.openAnimation.start();
            quickShareSelectorDrawable.isReady = true;
        }
        BlurVisibilityDrawable blurVisibilityDrawable = quickShareSelectorDrawable.closeAnimationDrawable;
        RectF rectF2 = quickShareSelectorDrawable.bubbleCurrent;
        int i9 = 2;
        if (blurVisibilityDrawable != null && !z) {
            blurVisibilityDrawable.setBounds((int) rectF2.left, (int) (rectF2.top - AndroidUtilities.dp(30.0f)), (int) rectF2.right, (int) rectF2.bottom);
            quickShareSelectorDrawable.closeAnimationDrawable.alpha = (int) ((1.0f - Interpolators.closeAlpha.getInterpolation(quickShareSelectorDrawable.closeProgress)) * 255.0f);
            quickShareSelectorDrawable.closeAnimationDrawable.draw(canvas);
            if (quickShareSelectorDrawable.selectedIndex != -1) {
                float interpolation = 1.0f - Interpolators.closeAvatarAlpha.getInterpolation(quickShareSelectorDrawable.closeProgress);
                float interpolation2 = Interpolators.closeAvatarPosition.getInterpolation(quickShareSelectorDrawable.closeProgress);
                float fCenterX = rectF2.centerX() + (AndroidUtilities.dp(53) * (quickShareSelectorDrawable.selectedIndex - 2));
                float fCenterY = rectF2.centerY();
                float f4 = quickShareSelectorDrawable.bulletinImageCx;
                float f5 = quickShareSelectorDrawable.bulletinImageCy;
                float f6 = (fCenterX + f4) / 2.0f;
                Bulletin.LottieLayout lottieLayout = quickShareSelectorDrawable.bulletinLayout;
                float fMin = (lottieLayout == null || !lottieLayout.top) ? Math.min(fCenterY, f5) - AndroidUtilities.dp(15) : Math.max(fCenterY, f5) + AndroidUtilities.dp(15);
                float fM = DiffUtil.m(f4, fCenterX, interpolation2, fCenterX);
                double d = fCenterX;
                double d2 = fCenterY;
                double d3 = f4;
                double d4 = f5;
                double d5 = f6;
                double d6 = d3 - d;
                double d7 = ((d3 * d) + ((d5 * d5) - (d3 * d5))) - (d5 * d);
                double d8 = d7 == 0.0d ? 0.0d : ((((double) fMin) - (((d4 - d2) * (d5 - d)) / d6)) - d2) / d7;
                double d9 = d * d;
                double d10 = d6 != 0.0d ? ((d4 - (((d3 * d3) - d9) * d8)) - d2) / d6 : 0.0d;
                double d11 = fM;
                float f7 = (float) ((d10 * d11) + (d8 * d11 * d11) + ((d2 - (d9 * d8)) - (d10 * d)));
                float f8 = 42;
                float fDp3 = (AndroidUtilities.dp(f8) / 2.0f) + AndroidUtilities.dp(2.0f);
                float fM2 = DiffUtil.m(AndroidUtilities.dp(12.0f), fDp3, interpolation2, fDp3);
                final QuickShareAvatarCell quickShareAvatarCell = quickShareAvatarCellArr[quickShareSelectorDrawable.selectedIndex];
                if (quickShareAvatarCell.blurredAvatarDrawable == null) {
                    final int i10 = 1;
                    BlurVisibilityDrawable blurVisibilityDrawable2 = new BlurVisibilityDrawable(new BlurVisibilityDrawable.DrawRunnable() {
                        @Override
                        public final void draw(Canvas canvas2, int i11) {
                            float f9;
                            switch (i10) {
                                case 0:
                                    QuickShareAvatarCell quickShareAvatarCell2 = quickShareAvatarCell;
                                    quickShareAvatarCell2.getClass();
                                    canvas2.save();
                                    canvas2.translate(-quickShareAvatarCell2.bgX1, -quickShareAvatarCell2.bgY);
                                    float f10 = quickShareAvatarCell2.bgX1;
                                    float f11 = quickShareAvatarCell2.bgY;
                                    float f12 = i11 / 255.0f;
                                    RectF rectF3 = AndroidUtilities.rectTmp;
                                    float fDp4 = AndroidUtilities.dp(21.0f) / 2.0f;
                                    StaticLayout staticLayout2 = quickShareAvatarCell2.textLayout;
                                    float f13 = 8;
                                    rectF3.set(f10, f11, staticLayout2.getWidth() + f10 + (AndroidUtilities.dp(f13) * 2), AndroidUtilities.dp(21.0f) + f11);
                                    ChatMessageCell chatMessageCell2 = quickShareAvatarCell2.cell;
                                    boolean zHasGradientService = chatMessageCell2.hasGradientService();
                                    Paint paint = quickShareAvatarCell2.blurredTextPaint;
                                    if (paint != null) {
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (255.0f * f12));
                                        canvas2.drawRoundRect(rectF3, fDp4, fDp4, paint);
                                        paint.setAlpha(alpha);
                                        f9 = 21.0f;
                                    } else {
                                        Point point = AndroidUtilities.displaySize;
                                        f9 = 21.0f;
                                        chatMessageCell2.applyServiceShaderMatrix(0.0f, 0.0f, point.x, point.y);
                                        Paint themedPaint = chatMessageCell2.getThemedPaint("paintChatActionBackground");
                                        int alpha2 = themedPaint.getAlpha();
                                        themedPaint.setAlpha((int) ((zHasGradientService ? alpha2 : 229.5f) * f12));
                                        canvas2.drawRoundRect(rectF3, fDp4, fDp4, themedPaint);
                                        themedPaint.setAlpha(alpha2);
                                    }
                                    if (zHasGradientService || paint != null) {
                                        int alpha3 = Theme.chat_actionBackgroundGradientDarkenPaint.getAlpha();
                                        Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha((int) (alpha3 * f12));
                                        canvas2.drawRoundRect(rectF3, fDp4, fDp4, Theme.chat_actionBackgroundGradientDarkenPaint);
                                        Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha(alpha3);
                                    }
                                    canvas2.save();
                                    canvas2.translate(f10 + AndroidUtilities.dp(f13), ((AndroidUtilities.dp(f9) - staticLayout2.getHeight()) / 2.0f) + f11);
                                    int alpha4 = staticLayout2.getPaint().getAlpha();
                                    staticLayout2.getPaint().setAlpha((int) (alpha4 * f12));
                                    staticLayout2.draw(canvas2);
                                    staticLayout2.getPaint().setAlpha(alpha4);
                                    canvas2.restore();
                                    canvas2.restore();
                                    break;
                                default:
                                    QuickShareAvatarCell quickShareAvatarCell3 = quickShareAvatarCell;
                                    quickShareAvatarCell3.getClass();
                                    float f14 = 21;
                                    float fDp5 = AndroidUtilities.dp(f14);
                                    canvas2.save();
                                    float f15 = fDp5 - fDp5;
                                    canvas2.translate(f15, f15);
                                    canvas2.scale(fDp5 / AndroidUtilities.dp(f14), fDp5 / AndroidUtilities.dp(f14));
                                    ImageReceiver imageReceiver = quickShareAvatarCell3.imageReceiver;
                                    imageReceiver.setAlpha(((quickShareAvatarCell3.alphaFactor * 0.25f) + 0.75f) * (i11 / 255.0f));
                                    imageReceiver.draw(canvas2);
                                    canvas2.restore();
                                    break;
                            }
                        }
                    });
                    quickShareAvatarCell.blurredAvatarDrawable = blurVisibilityDrawable2;
                    blurVisibilityDrawable2.render(AndroidUtilities.dp(f8), AndroidUtilities.dp(f8), 4.0f, AndroidUtilities.dp(10));
                }
                canvas.save();
                canvas.translate(fM - fM2, f7 - fM2);
                float f9 = 21;
                canvas.scale(fM2 / AndroidUtilities.dp(f9), fM2 / AndroidUtilities.dp(f9));
                BlurVisibilityDrawable blurVisibilityDrawable3 = quickShareAvatarCell.blurredAvatarDrawable;
                blurVisibilityDrawable3.alpha = (int) (interpolation * 255.0f);
                blurVisibilityDrawable3.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        float f10 = !z ? 1.0f - quickShareSelectorDrawable.closeProgress : i / 255.0f;
        float interpolation3 = (Interpolators.bgScale.getInterpolation(quickShareSelectorDrawable.openProgress) * (-0.22500001f)) + 0.3f;
        Matrix matrix = quickShareSelectorDrawable.shaderMatrix;
        matrix.reset();
        matrix.setScale(interpolation3, interpolation3);
        matrix.postTranslate(0.0f, rectF2.bottom);
        quickShareSelectorDrawable.linearGradient.setLocalMatrix(matrix);
        Paint paint = quickShareSelectorDrawable.paintBubbleBg;
        paint.setAlpha((int) (Interpolators.bgOpacity.getInterpolation(quickShareSelectorDrawable.openProgress) * 255.0f * f10));
        RectF rectF3 = tmpRectF;
        rectF3.set(rectF2);
        rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        Rect rect = tmpRect;
        rectF3.round(rect);
        Drawable drawable = quickShareSelectorDrawable.shadowDrawable;
        drawable.setAlpha((int) (f10 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z3 = quickShareSelectorDrawable.openAnimationCompleted;
        RectF rectF4 = quickShareSelectorDrawable.buttonCurrent;
        if (z3) {
            f = 0.0f;
        } else {
            f = 0.0f;
            float interpolation4 = (Interpolators.buttonRotationUp.getInterpolation(quickShareSelectorDrawable.openProgress) - Interpolators.buttonRotationDown.getInterpolation(quickShareSelectorDrawable.openProgress)) * (-40.0f);
            canvas.save();
            canvas.translate(rectF4.left, rectF4.top);
            canvas.rotate(interpolation4, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            canvas.translate(-chatMessageCell.getSideButtonStartX(), -chatMessageCell.getSideButtonStartY());
            chatMessageCell.drawSideButton(canvas, true);
            canvas.restore();
        }
        if (!quickShareSelectorDrawable.ballsAllowed || quickShareSelectorDrawable.openAnimationCompleted) {
            float fMin2 = Math.min(rectF2.width(), rectF2.height()) / 2.0f;
            float fMin3 = Math.min(rectF4.width(), rectF4.height()) / 2.0f;
            canvas.drawRoundRect(rectF2, fMin2, fMin2, paint);
            if (!quickShareSelectorDrawable.openAnimationCompleted) {
                canvas.drawRoundRect(rectF4, fMin3, fMin3, paint);
            }
        } else {
            canvas.drawPath(quickShareSelectorDrawable.path, paint);
        }
        float interpolation5 = Interpolators.avatarOvershootCancel.getInterpolation(quickShareSelectorDrawable.openProgress) * AndroidUtilities.dp(2.0f);
        float f11 = 44;
        float interpolation6 = ((Interpolators.avatar1.getInterpolation(quickShareSelectorDrawable.openProgress) * AndroidUtilities.dp(f11)) / 2.0f) - interpolation5;
        float interpolation7 = ((Interpolators.avatar2.getInterpolation(quickShareSelectorDrawable.openProgress) * AndroidUtilities.dp(f11)) / 2.0f) - interpolation5;
        float interpolation8 = ((Interpolators.avatar3.getInterpolation(quickShareSelectorDrawable.openProgress) * AndroidUtilities.dp(f11)) / 2.0f) - interpolation5;
        int i11 = 0;
        while (i11 < i9) {
            int i12 = 0;
            while (i12 < quickShareAvatarCellArr.length) {
                if (!(i11 == 0 && i12 == quickShareSelectorDrawable.selectedIndex) && (i11 != i4 || i12 == quickShareSelectorDrawable.selectedIndex)) {
                    float length = i12 - ((quickShareAvatarCellArr.length / 2.0f) - 0.5f);
                    if (i12 == i9) {
                        f2 = interpolation6;
                    } else {
                        f2 = (i12 == i4 || i12 == 3) ? interpolation7 : interpolation8;
                    }
                    float fDp4 = (AndroidUtilities.dp(i3) * length) + rectF2.centerX();
                    float fCenterY2 = rectF2.centerY();
                    final QuickShareAvatarCell quickShareAvatarCell2 = quickShareAvatarCellArr[i12];
                    float f12 = 16;
                    float fDp5 = AndroidUtilities.dp(f12);
                    float measuredWidth = quickShareSelectorOverlayLayout2.getMeasuredWidth() - AndroidUtilities.dp(f12);
                    i2 = i11;
                    float f13 = rectF2.left;
                    f3 = interpolation8;
                    float f14 = rectF2.right;
                    quickShareSelectorOverlayLayout = quickShareSelectorOverlayLayout2;
                    if (!(i12 == quickShareSelectorDrawable.selectedIndex && quickShareSelectorDrawable.closeAnimationStarted)) {
                        quickShareAvatarCell2.getClass();
                        float fDp6 = (AndroidUtilities.dp(2.0f) * quickShareAvatarCell2.selectedFactor) + f2;
                        canvas.save();
                        canvas.translate(fDp4 - fDp6, fCenterY2 - fDp6);
                        float f15 = 21;
                        canvas.scale(fDp6 / AndroidUtilities.dp(f15), fDp6 / AndroidUtilities.dp(f15));
                        ImageReceiver imageReceiver = quickShareAvatarCell2.imageReceiver;
                        imageReceiver.setAlpha(((quickShareAvatarCell2.alphaFactor * 0.25f) + 0.75f) * f10);
                        imageReceiver.draw(canvas);
                        canvas.restore();
                    }
                    float f16 = quickShareAvatarCell2.selectedFactor;
                    if (f16 > f && (staticLayout = quickShareAvatarCell2.textLayout) != null) {
                        float f17 = (f16 * 0.15f) + 0.85f;
                        canvas.save();
                        canvas.scale(f17, f17, fDp4, fCenterY2);
                        float f18 = quickShareAvatarCell2.selectedFactor * f10;
                        float fM3 = RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2, 8, staticLayout.getWidth());
                        quickShareAvatarCell2.bgX1 = QuickShareAvatarCell.fixX(QuickShareAvatarCell.fixX(fDp4, fM3, f13, f14), fM3, fDp5, measuredWidth) - (fM3 / 2.0f);
                        quickShareAvatarCell2.bgY = fCenterY2 - AndroidUtilities.dp(58.0f);
                        if (quickShareAvatarCell2.blurredTextDrawable == null) {
                            QuickShareSelectorDrawable quickShareSelectorDrawable2 = quickShareAvatarCell2.parent;
                            if (!quickShareSelectorDrawable2.isDestroyed) {
                                quickShareAvatarCell2.blurredTextPaint = quickShareSelectorDrawable2.globalBlurBitmapPaint;
                                final int i13 = 0;
                                BlurVisibilityDrawable blurVisibilityDrawable4 = new BlurVisibilityDrawable(new BlurVisibilityDrawable.DrawRunnable() {
                                    @Override
                                    public final void draw(Canvas canvas2, int i14) {
                                        float f19;
                                        switch (i13) {
                                            case 0:
                                                QuickShareAvatarCell quickShareAvatarCell3 = quickShareAvatarCell2;
                                                quickShareAvatarCell3.getClass();
                                                canvas2.save();
                                                canvas2.translate(-quickShareAvatarCell3.bgX1, -quickShareAvatarCell3.bgY);
                                                float f110 = quickShareAvatarCell3.bgX1;
                                                float f111 = quickShareAvatarCell3.bgY;
                                                float f112 = i14 / 255.0f;
                                                RectF rectF5 = AndroidUtilities.rectTmp;
                                                float fDp7 = AndroidUtilities.dp(21.0f) / 2.0f;
                                                StaticLayout staticLayout2 = quickShareAvatarCell3.textLayout;
                                                float f113 = 8;
                                                rectF5.set(f110, f111, staticLayout2.getWidth() + f110 + (AndroidUtilities.dp(f113) * 2), AndroidUtilities.dp(21.0f) + f111);
                                                ChatMessageCell chatMessageCell2 = quickShareAvatarCell3.cell;
                                                boolean zHasGradientService = chatMessageCell2.hasGradientService();
                                                Paint paint2 = quickShareAvatarCell3.blurredTextPaint;
                                                if (paint2 != null) {
                                                    int alpha = paint2.getAlpha();
                                                    paint2.setAlpha((int) (255.0f * f112));
                                                    canvas2.drawRoundRect(rectF5, fDp7, fDp7, paint2);
                                                    paint2.setAlpha(alpha);
                                                    f19 = 21.0f;
                                                } else {
                                                    Point point = AndroidUtilities.displaySize;
                                                    f19 = 21.0f;
                                                    chatMessageCell2.applyServiceShaderMatrix(0.0f, 0.0f, point.x, point.y);
                                                    Paint themedPaint = chatMessageCell2.getThemedPaint("paintChatActionBackground");
                                                    int alpha2 = themedPaint.getAlpha();
                                                    themedPaint.setAlpha((int) ((zHasGradientService ? alpha2 : 229.5f) * f112));
                                                    canvas2.drawRoundRect(rectF5, fDp7, fDp7, themedPaint);
                                                    themedPaint.setAlpha(alpha2);
                                                }
                                                if (zHasGradientService || paint2 != null) {
                                                    int alpha3 = Theme.chat_actionBackgroundGradientDarkenPaint.getAlpha();
                                                    Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha((int) (alpha3 * f112));
                                                    canvas2.drawRoundRect(rectF5, fDp7, fDp7, Theme.chat_actionBackgroundGradientDarkenPaint);
                                                    Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha(alpha3);
                                                }
                                                canvas2.save();
                                                canvas2.translate(f110 + AndroidUtilities.dp(f113), ((AndroidUtilities.dp(f19) - staticLayout2.getHeight()) / 2.0f) + f111);
                                                int alpha4 = staticLayout2.getPaint().getAlpha();
                                                staticLayout2.getPaint().setAlpha((int) (alpha4 * f112));
                                                staticLayout2.draw(canvas2);
                                                staticLayout2.getPaint().setAlpha(alpha4);
                                                canvas2.restore();
                                                canvas2.restore();
                                                break;
                                            default:
                                                QuickShareAvatarCell quickShareAvatarCell4 = quickShareAvatarCell2;
                                                quickShareAvatarCell4.getClass();
                                                float f114 = 21;
                                                float fDp8 = AndroidUtilities.dp(f114);
                                                canvas2.save();
                                                float f115 = fDp8 - fDp8;
                                                canvas2.translate(f115, f115);
                                                canvas2.scale(fDp8 / AndroidUtilities.dp(f114), fDp8 / AndroidUtilities.dp(f114));
                                                ImageReceiver imageReceiver2 = quickShareAvatarCell4.imageReceiver;
                                                imageReceiver2.setAlpha(((quickShareAvatarCell4.alphaFactor * 0.25f) + 0.75f) * (i14 / 255.0f));
                                                imageReceiver2.draw(canvas2);
                                                canvas2.restore();
                                                break;
                                        }
                                    }
                                });
                                quickShareAvatarCell2.blurredTextDrawable = blurVisibilityDrawable4;
                                blurVisibilityDrawable4.render((int) fM3, AndroidUtilities.dp(21.0f), 3.0f, AndroidUtilities.dp(4));
                            }
                        }
                        BlurVisibilityDrawable blurVisibilityDrawable5 = quickShareAvatarCell2.blurredTextDrawable;
                        if (blurVisibilityDrawable5 != null) {
                            float f19 = quickShareAvatarCell2.bgX1;
                            float f20 = quickShareAvatarCell2.bgY;
                            blurVisibilityDrawable5.setBounds((int) f19, (int) f20, (int) (f19 + fM3), (int) (f20 + AndroidUtilities.dp(21.0f)));
                            BlurVisibilityDrawable blurVisibilityDrawable6 = quickShareAvatarCell2.blurredTextDrawable;
                            blurVisibilityDrawable6.alpha = (int) (f18 * 255.0f);
                            blurVisibilityDrawable6.draw(canvas);
                        }
                        canvas.restore();
                    }
                    i12++;
                    quickShareSelectorDrawable = this;
                    interpolation8 = f3;
                    i11 = i2;
                    quickShareSelectorOverlayLayout2 = quickShareSelectorOverlayLayout;
                    i3 = 53;
                    i4 = 1;
                    i9 = 2;
                } else {
                    i2 = i11;
                    f3 = interpolation8;
                    quickShareSelectorOverlayLayout = quickShareSelectorOverlayLayout2;
                }
                i12++;
                quickShareSelectorDrawable = this;
                interpolation8 = f3;
                i11 = i2;
                quickShareSelectorOverlayLayout2 = quickShareSelectorOverlayLayout;
                i3 = 53;
                i4 = 1;
                i9 = 2;
            }
            i11++;
            quickShareSelectorDrawable = this;
            i3 = 53;
            i4 = 1;
            i9 = 2;
        }
    }
}
