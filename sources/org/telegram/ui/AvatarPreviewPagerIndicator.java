package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ProfileGalleryView;

public abstract class AvatarPreviewPagerIndicator extends View implements ProfileGalleryView.Callback {
    private float alpha;
    private float[] alphas;
    private final ValueAnimator animator;
    private final float[] animatorValues;
    private final Paint backgroundPaint;
    private final Paint barPaint;
    private final GradientDrawable bottomOverlayGradient;
    private final Rect bottomOverlayRect;
    private float currentAnimationValue;
    private int currentLoadingAnimationDirection;
    private float currentLoadingAnimationProgress;
    private float currentProgress;
    private final RectF indicatorRect;
    private boolean isOverlaysVisible;
    int lastCurrentItem;
    private long lastTime;
    private int overlayCountVisible;
    Path path;
    private final float[] pressedOverlayAlpha;
    private final GradientDrawable[] pressedOverlayGradient;
    private final boolean[] pressedOverlayVisible;
    private int previousSelectedPotision;
    private float previousSelectedProgress;
    protected ProfileGalleryView profileGalleryView;
    private float progressToCounter;
    private final RectF rect;
    RectF rectF;
    private final Paint selectedBarPaint;
    private int selectedPosition;
    private final int statusBarHeight;
    TextPaint textPaint;
    String title;
    private final GradientDrawable topOverlayGradient;
    private final Rect topOverlayRect;

    @Override
    public void onPhotosLoaded() {
    }

    public AvatarPreviewPagerIndicator(Context context) {
        super(context);
        this.indicatorRect = new RectF();
        this.statusBarHeight = 0;
        this.overlayCountVisible = 1;
        this.topOverlayRect = new Rect();
        this.bottomOverlayRect = new Rect();
        this.rect = new RectF();
        this.animatorValues = new float[]{0.0f, 1.0f};
        this.path = new Path();
        this.rectF = new RectF();
        this.pressedOverlayGradient = new GradientDrawable[2];
        this.pressedOverlayVisible = new boolean[2];
        this.pressedOverlayAlpha = new float[2];
        this.alpha = 0.0f;
        this.alphas = null;
        this.previousSelectedPotision = -1;
        this.currentLoadingAnimationDirection = 1;
        this.lastCurrentItem = -1;
        Paint paint = new Paint(1);
        this.barPaint = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.selectedBarPaint = paint2;
        paint2.setColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
        this.topOverlayGradient = gradientDrawable;
        gradientDrawable.setShape(0);
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1107296256, 0});
        this.bottomOverlayGradient = gradientDrawable2;
        gradientDrawable2.setShape(0);
        int i = 0;
        while (i < 2) {
            this.pressedOverlayGradient[i] = new GradientDrawable(i == 0 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
            this.pressedOverlayGradient[i].setShape(0);
            i++;
        }
        Paint paint3 = new Paint(1);
        this.backgroundPaint = paint3;
        paint3.setColor(-16777216);
        paint3.setAlpha(66);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AvatarPreviewPagerIndicator.m1346$r8$lambda$wXg0i3IKSb4KfUj5y5ToQNbcjc(this.f$0, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (AvatarPreviewPagerIndicator.this.isOverlaysVisible) {
                    return;
                }
                AvatarPreviewPagerIndicator.this.setVisibility(8);
            }

            @Override
            public void onAnimationStart(Animator animator) {
                AvatarPreviewPagerIndicator.this.setVisibility(0);
            }
        });
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        textPaint.setColor(-1);
        this.textPaint.setTypeface(Typeface.SANS_SERIF);
        this.textPaint.setTextAlign(Paint.Align.CENTER);
        this.textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
    }

    public static void m1346$r8$lambda$wXg0i3IKSb4KfUj5y5ToQNbcjc(AvatarPreviewPagerIndicator avatarPreviewPagerIndicator, ValueAnimator valueAnimator) {
        float[] fArr = avatarPreviewPagerIndicator.animatorValues;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        avatarPreviewPagerIndicator.currentAnimationValue = animatedFraction;
        avatarPreviewPagerIndicator.setAlphaValue(AndroidUtilities.lerp(fArr, animatedFraction), true);
    }

    public void saveCurrentPageProgress() {
        this.previousSelectedProgress = this.currentProgress;
        this.previousSelectedPotision = this.selectedPosition;
        this.currentLoadingAnimationProgress = 0.0f;
        this.currentLoadingAnimationDirection = 1;
    }

    public void setAlphaValue(float f, boolean z) {
        int i = (int) (255.0f * f);
        this.topOverlayGradient.setAlpha(i);
        this.bottomOverlayGradient.setAlpha(i);
        this.backgroundPaint.setAlpha((int) (66.0f * f));
        this.barPaint.setAlpha((int) (85.0f * f));
        this.selectedBarPaint.setAlpha(i);
        this.alpha = f;
        if (!z) {
            this.currentAnimationValue = f;
        }
        invalidate();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.path.reset();
        this.rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        this.path.addRoundRect(this.rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
        this.topOverlayRect.set(0, 0, i, (int) (currentActionBarHeight * 0.5f));
        this.bottomOverlayRect.set(0, (int) (i2 - (AndroidUtilities.dp(72.0f) * 0.5f)), i, i2);
        this.topOverlayGradient.setBounds(0, this.topOverlayRect.bottom, i, currentActionBarHeight + AndroidUtilities.dp(16.0f));
        this.bottomOverlayGradient.setBounds(0, (i2 - AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(24.0f), i, this.bottomOverlayRect.top);
        int i5 = i / 5;
        this.pressedOverlayGradient[0].setBounds(0, 0, i5, i2);
        this.pressedOverlayGradient[1].setBounds(i - i5, 0, i, i2);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        boolean z;
        float f3;
        int i2;
        float currentItemProgress;
        Paint paint;
        for (int i3 = 0; i3 < 2; i3++) {
            float f4 = this.pressedOverlayAlpha[i3];
            if (f4 > 0.0f) {
                this.pressedOverlayGradient[i3].setAlpha((int) (f4 * 255.0f));
                this.pressedOverlayGradient[i3].draw(canvas);
            }
        }
        this.topOverlayGradient.draw(canvas);
        canvas.drawRect(this.topOverlayRect, this.backgroundPaint);
        int realCount = this.profileGalleryView.getRealCount();
        this.selectedPosition = this.profileGalleryView.getRealPosition();
        float[] fArr = this.alphas;
        if (fArr == null || fArr.length != realCount) {
            float[] fArr2 = new float[realCount];
            this.alphas = fArr2;
            Arrays.fill(fArr2, 0.0f);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.lastTime;
        if (j < 0 || j > 20) {
            j = 17;
        }
        this.lastTime = jElapsedRealtime;
        if (realCount <= 1 || realCount > 20) {
            f = 8.0f;
            f2 = 180.0f;
            i = 20;
            z = false;
        } else {
            int i4 = this.overlayCountVisible;
            if (i4 == 0) {
                this.alpha = 0.0f;
                this.overlayCountVisible = 3;
            } else if (i4 == 1) {
                this.alpha = 0.0f;
                this.overlayCountVisible = 2;
            }
            if (this.overlayCountVisible == 2) {
                this.barPaint.setAlpha((int) (this.alpha * 85.0f));
                this.selectedBarPaint.setAlpha((int) (this.alpha * 255.0f));
            }
            int measuredWidth = ((getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - AndroidUtilities.dp((realCount - 1) * 2)) / realCount;
            int iDp = AndroidUtilities.dp(8.0f);
            z = false;
            for (int i5 = 0; i5 < realCount; i5++) {
                int iDp2 = AndroidUtilities.dp((i5 * 2) + 5) + (measuredWidth * i5);
                if (i5 == this.previousSelectedPotision && Math.abs(this.previousSelectedProgress - 1.0f) > 1.0E-4f) {
                    currentItemProgress = this.previousSelectedProgress;
                    canvas.save();
                    float f5 = iDp2;
                    float f6 = iDp;
                    float f7 = iDp2 + measuredWidth;
                    canvas.clipRect((measuredWidth * currentItemProgress) + f5, f6, f7, iDp + AndroidUtilities.dp(2.0f));
                    this.rect.set(f5, f6, f7, AndroidUtilities.dp(2.0f) + iDp);
                    this.barPaint.setAlpha((int) (this.alpha * 85.0f));
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), this.barPaint);
                    canvas.restore();
                } else {
                    i2 = 85;
                    if (i5 == this.selectedPosition) {
                        if (this.profileGalleryView.isCurrentItemVideo()) {
                            currentItemProgress = this.profileGalleryView.getCurrentItemProgress();
                            this.currentProgress = currentItemProgress;
                            if ((currentItemProgress <= 0.0f && this.profileGalleryView.isLoadingCurrentVideo()) || this.currentLoadingAnimationProgress > 0.0f) {
                                float f8 = this.currentLoadingAnimationProgress;
                                int i6 = this.currentLoadingAnimationDirection;
                                float f9 = f8 + ((((long) i6) * j) / 500.0f);
                                this.currentLoadingAnimationProgress = f9;
                                if (f9 > 1.0f) {
                                    this.currentLoadingAnimationProgress = 1.0f;
                                    this.currentLoadingAnimationDirection = i6 * (-1);
                                } else if (f9 <= 0.0f) {
                                    this.currentLoadingAnimationProgress = 0.0f;
                                    this.currentLoadingAnimationDirection = i6 * (-1);
                                }
                            }
                            this.rect.set(iDp2, iDp, iDp2 + measuredWidth, AndroidUtilities.dp(2.0f) + iDp);
                            this.barPaint.setAlpha((int) (((this.currentLoadingAnimationProgress * 48.0f) + 85.0f) * this.alpha));
                            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), this.barPaint);
                        } else {
                            this.currentProgress = 1.0f;
                        }
                    }
                    currentItemProgress = 1.0f;
                    float f10 = iDp2;
                    this.rect.set(f10, iDp, (measuredWidth * currentItemProgress) + f10, AndroidUtilities.dp(2.0f) + iDp);
                    if (i5 != this.selectedPosition) {
                        if (this.overlayCountVisible == 3) {
                            this.barPaint.setAlpha((int) (AndroidUtilities.lerp(i2, 255, CubicBezierInterpolator.EASE_BOTH.getInterpolation(this.alphas[i5])) * this.alpha));
                        }
                    } else {
                        this.alphas[i5] = 0.75f;
                    }
                    RectF rectF = this.rect;
                    float fDp = AndroidUtilities.dp(1.0f);
                    float fDp2 = AndroidUtilities.dp(1.0f);
                    if (i5 == this.selectedPosition) {
                        paint = this.selectedBarPaint;
                    } else {
                        paint = this.barPaint;
                    }
                    canvas.drawRoundRect(rectF, fDp, fDp2, paint);
                }
                i2 = 80;
                z = true;
                float f11 = iDp2;
                this.rect.set(f11, iDp, (measuredWidth * currentItemProgress) + f11, AndroidUtilities.dp(2.0f) + iDp);
                if (i5 != this.selectedPosition) {
                    if (this.overlayCountVisible == 3) {
                        this.barPaint.setAlpha((int) (AndroidUtilities.lerp(i2, 255, CubicBezierInterpolator.EASE_BOTH.getInterpolation(this.alphas[i5])) * this.alpha));
                    }
                } else {
                    this.alphas[i5] = 0.75f;
                }
                RectF rectF2 = this.rect;
                float fDp3 = AndroidUtilities.dp(1.0f);
                float fDp4 = AndroidUtilities.dp(1.0f);
                if (i5 == this.selectedPosition) {
                    paint = this.selectedBarPaint;
                } else {
                    paint = this.barPaint;
                }
                canvas.drawRoundRect(rectF2, fDp3, fDp4, paint);
            }
            f = 8.0f;
            f2 = 180.0f;
            int i7 = this.overlayCountVisible;
            if (i7 == 2) {
                float f12 = this.alpha;
                if (f12 < 1.0f) {
                    float f13 = f12 + (j / 180.0f);
                    this.alpha = f13;
                    if (f13 > 1.0f) {
                        this.alpha = 1.0f;
                    }
                    i = 20;
                    z = true;
                } else {
                    this.overlayCountVisible = 3;
                }
            } else if (i7 == 3) {
                int i8 = 0;
                while (true) {
                    float[] fArr3 = this.alphas;
                    if (i8 >= fArr3.length) {
                        break;
                    }
                    if (i8 != this.selectedPosition) {
                        float f14 = fArr3[i8];
                        if (f14 > 0.0f) {
                            float f15 = f14 - (j / 500.0f);
                            fArr3[i8] = f15;
                            if (f15 <= 0.0f) {
                                fArr3[i8] = 0.0f;
                                if (i8 == this.previousSelectedPotision) {
                                    this.previousSelectedPotision = -1;
                                }
                            }
                            z = true;
                        } else if (i8 == this.previousSelectedPotision) {
                            this.previousSelectedPotision = -1;
                        }
                    } else if (i8 == this.previousSelectedPotision) {
                        this.previousSelectedPotision = -1;
                    }
                    i8++;
                }
            }
            i = 20;
        }
        if (realCount > i || this.progressToCounter != 0.0f) {
            float fMeasureText = this.textPaint.measureText(getCurrentTitle());
            this.indicatorRect.right = getMeasuredWidth() - AndroidUtilities.dp(f);
            RectF rectF3 = this.indicatorRect;
            rectF3.left = rectF3.right - (fMeasureText + AndroidUtilities.dpf2(16.0f));
            this.indicatorRect.top = AndroidUtilities.dp(f);
            RectF rectF4 = this.indicatorRect;
            rectF4.bottom = rectF4.top + AndroidUtilities.dp(26.0f);
            float fDpf2 = AndroidUtilities.dpf2(12.0f);
            canvas.save();
            boolean z2 = realCount > 20;
            if (z2) {
                float f16 = this.progressToCounter;
                if (f16 != 1.0f) {
                    this.progressToCounter = f16 + (j / 150.0f);
                } else if (!z2) {
                    f3 = this.progressToCounter;
                    if (f3 != 0.0f) {
                        this.progressToCounter = f3 - (j / 150.0f);
                    }
                }
            } else if (!z2) {
                f3 = this.progressToCounter;
                if (f3 != 0.0f) {
                    this.progressToCounter = f3 - (j / 150.0f);
                }
            }
            float f17 = this.progressToCounter;
            if (f17 >= 1.0f) {
                this.progressToCounter = 1.0f;
            } else if (f17 <= 0.0f) {
                this.progressToCounter = 0.0f;
            } else {
                invalidate();
            }
            float f18 = this.progressToCounter;
            canvas.scale(f18, f18, this.indicatorRect.centerX(), this.indicatorRect.centerY());
            canvas.drawRoundRect(this.indicatorRect, fDpf2, fDpf2, this.backgroundPaint);
            canvas.drawText(getCurrentTitle(), this.indicatorRect.centerX(), this.indicatorRect.top + AndroidUtilities.dpf2(18.5f), this.textPaint);
            canvas.restore();
        }
        for (int i9 = 0; i9 < 2; i9++) {
            if (this.pressedOverlayVisible[i9]) {
                float[] fArr4 = this.pressedOverlayAlpha;
                float f19 = fArr4[i9];
                if (f19 < 1.0f) {
                    float f20 = f19 + (j / f2);
                    fArr4[i9] = f20;
                    if (f20 > 1.0f) {
                        fArr4[i9] = 1.0f;
                    }
                    z = true;
                }
            } else {
                float[] fArr5 = this.pressedOverlayAlpha;
                float f21 = fArr5[i9];
                if (f21 > 0.0f) {
                    float f22 = f21 - (j / f2);
                    fArr5[i9] = f22;
                    if (f22 < 0.0f) {
                        fArr5[i9] = 0.0f;
                    }
                    z = true;
                }
            }
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    private String getCurrentTitle() {
        if (this.lastCurrentItem != this.profileGalleryView.getCurrentItem()) {
            this.title = this.profileGalleryView.getAdapter().getPageTitle(this.profileGalleryView.getCurrentItem()).toString();
            this.lastCurrentItem = this.profileGalleryView.getCurrentItem();
        }
        return this.title;
    }

    @Override
    public void onDown(boolean z) {
        this.pressedOverlayVisible[!z ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public void onRelease() {
        Arrays.fill(this.pressedOverlayVisible, false);
        postInvalidateOnAnimation();
    }

    @Override
    public void onVideoSet() {
        invalidate();
    }

    public void setProfileGalleryView(ProfileGalleryView profileGalleryView) {
        this.profileGalleryView = profileGalleryView;
    }

    public ProfileGalleryView getProfileGalleryView() {
        return this.profileGalleryView;
    }
}
