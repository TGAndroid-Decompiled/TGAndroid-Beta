package org.telegram.ui;

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
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ProfileGalleryView;

public abstract class AvatarPreviewPagerIndicator extends View implements ProfileGalleryView.Callback {
    public float alpha;
    public float[] alphas;
    public final float[] animatorValues;
    public final Paint backgroundPaint;
    public final Paint barPaint;
    public final GradientDrawable bottomOverlayGradient;
    public final Rect bottomOverlayRect;
    public int currentLoadingAnimationDirection;
    public float currentLoadingAnimationProgress;
    public float currentProgress;
    public final RectF indicatorRect;
    public int lastCurrentItem;
    public long lastTime;
    public int overlayCountVisible;
    public final Path path;
    public final float[] pressedOverlayAlpha;
    public final GradientDrawable[] pressedOverlayGradient;
    public final boolean[] pressedOverlayVisible;
    public int previousSelectedPotision;
    public float previousSelectedProgress;
    public ProfileGalleryView profileGalleryView;
    public float progressToCounter;
    public final RectF rect;
    public final RectF rectF;
    public final Paint selectedBarPaint;
    public int selectedPosition;
    public final TextPaint textPaint;
    public String title;
    public final GradientDrawable topOverlayGradient;
    public final Rect topOverlayRect;

    public AvatarPreviewPagerIndicator(Context context) {
        super(context);
        this.indicatorRect = new RectF();
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
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
        valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 3));
        valueAnimatorOfFloat.addListener(new ArticleViewer.AnonymousClass25(this, 5));
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
    }

    private String getCurrentTitle() {
        if (this.lastCurrentItem != this.profileGalleryView.getCurrentItem()) {
            this.title = ((String) this.profileGalleryView.getAdapter().getPageTitle(this.profileGalleryView.getCurrentItem())).toString();
            this.lastCurrentItem = this.profileGalleryView.getCurrentItem();
        }
        return this.title;
    }

    public ProfileGalleryView getProfileGalleryView() {
        return this.profileGalleryView;
    }

    @Override
    public final void onDown(boolean z) {
        this.pressedOverlayVisible[!z ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float[] fArr;
        Paint paint;
        float[] fArr2;
        int i;
        float f;
        float f2;
        int i2;
        boolean z;
        float f3;
        Paint paint2;
        float[] fArr3;
        Paint paint3;
        int i3;
        float currentItemProgress;
        ArrayList arrayList;
        Paint paint4;
        int i4 = 0;
        while (true) {
            fArr = this.pressedOverlayAlpha;
            if (i4 >= 2) {
                break;
            }
            float f4 = fArr[i4];
            if (f4 > 0.0f) {
                GradientDrawable[] gradientDrawableArr = this.pressedOverlayGradient;
                gradientDrawableArr[i4].setAlpha((int) (f4 * 255.0f));
                gradientDrawableArr[i4].draw(canvas);
            }
            i4++;
        }
        this.topOverlayGradient.draw(canvas);
        Paint paint5 = this.backgroundPaint;
        canvas.drawRect(this.topOverlayRect, paint5);
        int realCount = this.profileGalleryView.getRealCount();
        this.selectedPosition = this.profileGalleryView.getRealPosition();
        float[] fArr4 = this.alphas;
        if (fArr4 == null || fArr4.length != realCount) {
            float[] fArr5 = new float[realCount];
            this.alphas = fArr5;
            Arrays.fill(fArr5, 0.0f);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.lastTime;
        if (j < 0 || j > 20) {
            j = 17;
        }
        this.lastTime = jElapsedRealtime;
        float f5 = 1.0f;
        if (realCount <= 1 || realCount > 20) {
            paint = paint5;
            fArr2 = fArr;
            i = realCount;
            f = 180.0f;
            f2 = 8.0f;
            i2 = 20;
            z = false;
        } else {
            int i5 = this.overlayCountVisible;
            if (i5 == 0) {
                this.alpha = 0.0f;
                this.overlayCountVisible = 3;
            } else if (i5 == 1) {
                this.alpha = 0.0f;
                this.overlayCountVisible = 2;
            }
            int i6 = this.overlayCountVisible;
            Paint paint6 = this.selectedBarPaint;
            f = 180.0f;
            Paint paint7 = this.barPaint;
            if (i6 == 2) {
                paint7.setAlpha((int) (this.alpha * 85.0f));
                paint6.setAlpha((int) (this.alpha * 255.0f));
            }
            f2 = 8.0f;
            int iM$2 = OKLCH.m$2((realCount - 1) * 2, getMeasuredWidth() - AndroidUtilities.dp(10.0f), realCount);
            int iDp = AndroidUtilities.dp(8.0f);
            int i7 = 0;
            z = false;
            while (i7 < realCount) {
                int iDp2 = (iM$2 * i7) + AndroidUtilities.dp((i7 * 2) + 5);
                int i8 = this.previousSelectedPotision;
                RectF rectF = this.rect;
                if (i7 != i8 || Math.abs(this.previousSelectedProgress - f5) <= 1.0E-4f) {
                    paint2 = paint5;
                    fArr3 = fArr;
                    paint3 = paint6;
                    if (i7 == this.selectedPosition) {
                        ProfileGalleryView profileGalleryView = this.profileGalleryView;
                        int realPosition = profileGalleryView.getRealPosition();
                        if (profileGalleryView.hasActiveVideo) {
                            if (realPosition != 0) {
                                realPosition--;
                                if (realPosition >= 0) {
                                    arrayList = profileGalleryView.videoLocations;
                                    if (realPosition < arrayList.size()) {
                                        currentItemProgress = this.profileGalleryView.getCurrentItemProgress();
                                        this.currentProgress = currentItemProgress;
                                        realCount = currentItemProgress > 0.0f ? realCount : realCount;
                                        rectF.set(iDp2, iDp, iDp2 + iM$2, AndroidUtilities.dp(2.0f) + iDp);
                                        paint7.setAlpha((int) (((this.currentLoadingAnimationProgress * 48.0f) + 85.0f) * this.alpha));
                                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint7);
                                    }
                                }
                            }
                        } else if (realPosition >= 0) {
                            arrayList = profileGalleryView.videoLocations;
                            if (realPosition < arrayList.size() && arrayList.get(realPosition) != null) {
                                currentItemProgress = this.profileGalleryView.getCurrentItemProgress();
                                this.currentProgress = currentItemProgress;
                                if ((currentItemProgress > 0.0f && this.profileGalleryView.isLoadingCurrentVideo()) || this.currentLoadingAnimationProgress > 0.0f) {
                                    float f6 = this.currentLoadingAnimationProgress;
                                    int i9 = this.currentLoadingAnimationDirection;
                                    realCount = realCount;
                                    float f7 = ((((long) i9) * j) / 500.0f) + f6;
                                    this.currentLoadingAnimationProgress = f7;
                                    if (f7 > 1.0f) {
                                        this.currentLoadingAnimationProgress = 1.0f;
                                        this.currentLoadingAnimationDirection = i9 * (-1);
                                    } else if (f7 <= 0.0f) {
                                        this.currentLoadingAnimationProgress = 0.0f;
                                        this.currentLoadingAnimationDirection = i9 * (-1);
                                    }
                                }
                                rectF.set(iDp2, iDp, iDp2 + iM$2, AndroidUtilities.dp(2.0f) + iDp);
                                paint7.setAlpha((int) (((this.currentLoadingAnimationProgress * 48.0f) + 85.0f) * this.alpha));
                                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint7);
                            }
                        }
                        this.currentProgress = 1.0f;
                    }
                    i3 = 85;
                    currentItemProgress = 1.0f;
                    float f8 = iDp2;
                    rectF.set(f8, iDp, (iM$2 * currentItemProgress) + f8, AndroidUtilities.dp(2.0f) + iDp);
                    if (i7 != this.selectedPosition) {
                        this.alphas[i7] = 0.75f;
                    } else if (this.overlayCountVisible == 3) {
                        paint7.setAlpha((int) (AndroidUtilities.lerp(i3, 255, CubicBezierInterpolator.EASE_BOTH.getInterpolation(this.alphas[i7])) * this.alpha));
                    }
                    float fDp = AndroidUtilities.dp(1.0f);
                    float fDp2 = AndroidUtilities.dp(1.0f);
                    if (i7 == this.selectedPosition) {
                        paint4 = paint3;
                    } else {
                        paint4 = paint7;
                    }
                    canvas.drawRoundRect(rectF, fDp, fDp2, paint4);
                    i7++;
                    realCount = realCount;
                    fArr = fArr3;
                    paint6 = paint3;
                    paint5 = paint2;
                    f5 = 1.0f;
                } else {
                    float f9 = this.previousSelectedProgress;
                    canvas.save();
                    float f10 = iDp2;
                    fArr3 = fArr;
                    float f11 = iDp;
                    paint3 = paint6;
                    float f12 = iDp2 + iM$2;
                    paint2 = paint5;
                    canvas.clipRect((iM$2 * f9) + f10, f11, f12, AndroidUtilities.dp(2.0f) + iDp);
                    rectF.set(f10, f11, f12, AndroidUtilities.dp(2.0f) + iDp);
                    paint7.setAlpha((int) (this.alpha * 85.0f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint7);
                    canvas.restore();
                    realCount = realCount;
                    currentItemProgress = f9;
                }
                i3 = 80;
                z = true;
                float f13 = iDp2;
                rectF.set(f13, iDp, (iM$2 * currentItemProgress) + f13, AndroidUtilities.dp(2.0f) + iDp);
                if (i7 != this.selectedPosition) {
                    this.alphas[i7] = 0.75f;
                } else if (this.overlayCountVisible == 3) {
                    paint7.setAlpha((int) (AndroidUtilities.lerp(i3, 255, CubicBezierInterpolator.EASE_BOTH.getInterpolation(this.alphas[i7])) * this.alpha));
                }
                float fDp3 = AndroidUtilities.dp(1.0f);
                float fDp4 = AndroidUtilities.dp(1.0f);
                if (i7 == this.selectedPosition) {
                    paint4 = paint3;
                } else {
                    paint4 = paint7;
                }
                canvas.drawRoundRect(rectF, fDp3, fDp4, paint4);
                i7++;
                realCount = realCount;
                fArr = fArr3;
                paint6 = paint3;
                paint5 = paint2;
                f5 = 1.0f;
            }
            paint = paint5;
            fArr2 = fArr;
            i = realCount;
            int i10 = this.overlayCountVisible;
            if (i10 == 2) {
                float f14 = this.alpha;
                if (f14 < 1.0f) {
                    float f15 = (j / 180.0f) + f14;
                    this.alpha = f15;
                    if (f15 > 1.0f) {
                        this.alpha = 1.0f;
                    }
                    i2 = 20;
                    z = true;
                } else {
                    this.overlayCountVisible = 3;
                }
            } else if (i10 == 3) {
                int i11 = 0;
                while (true) {
                    float[] fArr6 = this.alphas;
                    if (i11 >= fArr6.length) {
                        break;
                    }
                    if (i11 != this.selectedPosition) {
                        float f16 = fArr6[i11];
                        if (f16 > 0.0f) {
                            float f17 = f16 - (j / 500.0f);
                            fArr6[i11] = f17;
                            if (f17 <= 0.0f) {
                                fArr6[i11] = 0.0f;
                                if (i11 == this.previousSelectedPotision) {
                                    this.previousSelectedPotision = -1;
                                }
                            }
                            z = true;
                        } else if (i11 == this.previousSelectedPotision) {
                            this.previousSelectedPotision = -1;
                        }
                    } else if (i11 == this.previousSelectedPotision) {
                        this.previousSelectedPotision = -1;
                    }
                    i11++;
                }
            }
            i2 = 20;
        }
        if (i > i2 || this.progressToCounter != 0.0f) {
            TextPaint textPaint = this.textPaint;
            float fMeasureText = textPaint.measureText(getCurrentTitle());
            RectF rectF2 = this.indicatorRect;
            float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(f2);
            rectF2.right = measuredWidth;
            rectF2.left = measuredWidth - (AndroidUtilities.dpf2(16.0f) + fMeasureText);
            float fDp5 = AndroidUtilities.dp(f2);
            rectF2.top = fDp5;
            rectF2.bottom = fDp5 + AndroidUtilities.dp(26.0f);
            float fDpf2 = AndroidUtilities.dpf2(12.0f);
            canvas.save();
            boolean z2 = i > 20;
            if (z2) {
                float f18 = this.progressToCounter;
                if (f18 != 1.0f) {
                    this.progressToCounter = (j / 150.0f) + f18;
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
            float f19 = this.progressToCounter;
            if (f19 >= 1.0f) {
                this.progressToCounter = 1.0f;
            } else if (f19 <= 0.0f) {
                this.progressToCounter = 0.0f;
            } else {
                invalidate();
            }
            float f20 = this.progressToCounter;
            canvas.scale(f20, f20, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, fDpf2, fDpf2, paint);
            canvas.drawText(getCurrentTitle(), rectF2.centerX(), AndroidUtilities.dpf2(18.5f) + rectF2.top, textPaint);
            canvas.restore();
        }
        for (int i12 = 0; i12 < 2; i12++) {
            if (this.pressedOverlayVisible[i12]) {
                float f21 = fArr2[i12];
                if (f21 < 1.0f) {
                    float f22 = (j / f) + f21;
                    fArr2[i12] = f22;
                    if (f22 > 1.0f) {
                        fArr2[i12] = 1.0f;
                    }
                    z = true;
                }
            } else {
                float f23 = fArr2[i12];
                if (f23 > 0.0f) {
                    float f24 = f23 - (j / f);
                    fArr2[i12] = f24;
                    if (f24 < 0.0f) {
                        fArr2[i12] = 0.0f;
                    }
                    z = true;
                }
            }
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Path path = this.path;
        path.reset();
        RectF rectF = this.rectF;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
    }

    @Override
    public void onPhotosLoaded() {
    }

    @Override
    public final void onRelease() {
        Arrays.fill(this.pressedOverlayVisible, false);
        postInvalidateOnAnimation();
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
        Rect rect = this.topOverlayRect;
        rect.set(0, 0, i, (int) (currentActionBarHeight * 0.5f));
        int iDp = (int) (i2 - (AndroidUtilities.dp(72.0f) * 0.5f));
        Rect rect2 = this.bottomOverlayRect;
        rect2.set(0, iDp, i, i2);
        this.topOverlayGradient.setBounds(0, rect.bottom, i, AndroidUtilities.dp(16.0f) + currentActionBarHeight);
        this.bottomOverlayGradient.setBounds(0, (i2 - AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(24.0f), i, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.pressedOverlayGradient;
        int i5 = i / 5;
        gradientDrawableArr[0].setBounds(0, 0, i5, i2);
        gradientDrawableArr[1].setBounds(i - i5, 0, i, i2);
    }

    @Override
    public final void onVideoSet() {
        invalidate();
    }

    public void setProfileGalleryView(ProfileGalleryView profileGalleryView) {
        this.profileGalleryView = profileGalleryView;
    }
}
