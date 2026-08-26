package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public final class PinnedLineView extends View {
    public float animateFromPosition;
    public int animateFromTotal;
    public int animateToPosition;
    public int animateToTotal;
    public boolean animationInProgress;
    public float animationProgress;
    public ValueAnimator animator;
    public int color;
    public final Paint fadePaint;
    public final Paint fadePaint2;
    public int lineHFrom;
    public int lineHTo;
    public boolean needDrawFade;
    public int nextPosition;
    public final Paint paint;
    public final RectF rectF;
    public boolean replaceInProgress;
    public final Theme.ResourcesProvider resourcesProvider;
    public final Paint selectedPaint;
    public int selectedPosition;
    public float startOffsetFrom;
    public float startOffsetTo;
    public int totalCount;

    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final PinnedLineView this$0;

        public AnonymousClass1(PinnedLineView pinnedLineView, int i) {
            this.$r8$classId = i;
            this.this$0 = pinnedLineView;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    PinnedLineView pinnedLineView = this.this$0;
                    pinnedLineView.animationInProgress = false;
                    pinnedLineView.selectedPosition = pinnedLineView.animateToPosition;
                    pinnedLineView.invalidate();
                    int i = pinnedLineView.nextPosition;
                    if (i >= 0) {
                        pinnedLineView.selectPosition(i);
                        pinnedLineView.nextPosition = -1;
                    }
                    break;
                default:
                    PinnedLineView pinnedLineView2 = this.this$0;
                    pinnedLineView2.replaceInProgress = false;
                    pinnedLineView2.animationInProgress = false;
                    pinnedLineView2.invalidate();
                    int i2 = pinnedLineView2.nextPosition;
                    if (i2 >= 0) {
                        pinnedLineView2.selectPosition(i2);
                        pinnedLineView2.nextPosition = -1;
                    }
                    pinnedLineView2.checkLayerType();
                    break;
            }
        }
    }

    public PinnedLineView(Activity activity, Theme.ResourcesProvider resourcesProvider) {
        super(activity);
        this.selectedPosition = -1;
        this.totalCount = 0;
        this.rectF = new RectF();
        Paint paint = new Paint(1);
        this.paint = paint;
        Paint paint2 = new Paint(1);
        this.selectedPaint = paint2;
        this.nextPosition = -1;
        this.resourcesProvider = resourcesProvider;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint();
        this.fadePaint = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(6.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        this.fadePaint2 = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(6.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        int color = Theme.getColor(Theme.key_chat_topPanelLine, resourcesProvider);
        this.color = color;
        paint.setColor(ColorUtils.setAlphaComponent(color, (int) ((Color.alpha(color) / 255.0f) * 112.0f)));
        paint2.setColor(this.color);
    }

    public final void checkLayerType() {
        boolean z = (this.replaceInProgress ? Math.max(this.animateFromTotal, this.animateToTotal) : this.totalCount) > 3;
        int i = z ? 2 : 0;
        if (getLayerType() != i) {
            setLayerType(i, null);
            invalidate();
        }
        this.needDrawFade = z;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredHeight;
        float measuredHeight2;
        RectF rectF;
        super.onDraw(canvas);
        if (this.selectedPosition < 0 || this.totalCount == 0) {
            return;
        }
        int iDp = AndroidUtilities.dp(8.0f);
        if (this.replaceInProgress) {
            float f = this.lineHFrom;
            float f2 = this.animationProgress;
            measuredHeight = (this.lineHTo * f2) + ((1.0f - f2) * f);
        } else if (this.totalCount == 0) {
            return;
        } else {
            measuredHeight = (getMeasuredHeight() - (iDp * 2)) / Math.min(this.totalCount, 3);
        }
        if (measuredHeight == 0.0f) {
            return;
        }
        float fDpf2 = AndroidUtilities.dpf2(0.7f);
        if (this.replaceInProgress) {
            float f3 = this.startOffsetFrom;
            float f4 = this.animationProgress;
            measuredHeight2 = (this.startOffsetTo * f4) + ((1.0f - f4) * f3);
        } else {
            if (this.animationInProgress) {
                float f5 = (this.animateFromPosition - 1.0f) * measuredHeight;
                float f6 = (this.animateToPosition - 1) * measuredHeight;
                float f7 = this.animationProgress;
                measuredHeight2 = (f6 * f7) + ((1.0f - f7) * f5);
            } else {
                measuredHeight2 = (this.selectedPosition - 1) * measuredHeight;
            }
            if (measuredHeight2 < 0.0f) {
                measuredHeight2 = 0.0f;
            } else {
                float f8 = iDp;
                if ((((this.totalCount - 1) * measuredHeight) + f8) - measuredHeight2 < (getMeasuredHeight() - iDp) - measuredHeight) {
                    measuredHeight2 = (((this.totalCount - 1) * measuredHeight) + f8) - ((getMeasuredHeight() - iDp) - measuredHeight);
                }
            }
        }
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float f9 = iDp;
        int iMax = Math.max(0, (int) (((f9 + measuredHeight2) / measuredHeight) - 1.0f));
        int iMin = Math.min(iMax + 6, this.replaceInProgress ? Math.max(this.animateFromTotal, this.animateToTotal) : this.totalCount);
        while (true) {
            rectF = this.rectF;
            if (iMax >= iMin) {
                break;
            }
            float f10 = ((iMax * measuredHeight) + f9) - measuredHeight2;
            float f11 = f10 + measuredHeight;
            if (f11 >= 0.0f && f10 <= getMeasuredHeight()) {
                rectF.set(0.0f, f10 + fDpf2, getMeasuredWidth(), f11 - fDpf2);
                boolean z = this.replaceInProgress;
                Paint paint = this.paint;
                if (z && iMax >= this.animateToTotal) {
                    int i = this.color;
                    paint.setColor(ColorUtils.setAlphaComponent(i, (int) ((1.0f - this.animationProgress) * (Color.alpha(i) / 255.0f) * 76.0f)));
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                    int i2 = this.color;
                    paint.setColor(ColorUtils.setAlphaComponent(i2, (int) ((Color.alpha(i2) / 255.0f) * 76.0f)));
                } else if (!z || iMax < this.animateFromTotal) {
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                } else {
                    int i3 = this.color;
                    paint.setColor(ColorUtils.setAlphaComponent(i3, (int) ((Color.alpha(i3) / 255.0f) * 76.0f * this.animationProgress)));
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                    int i4 = this.color;
                    paint.setColor(ColorUtils.setAlphaComponent(i4, (int) ((Color.alpha(i4) / 255.0f) * 76.0f)));
                }
            }
            iMax++;
        }
        boolean z2 = this.animationInProgress;
        Paint paint2 = this.selectedPaint;
        if (z2) {
            float f12 = this.animateFromPosition;
            float f13 = this.animationProgress;
            float f14 = ((((this.animateToPosition * f13) + ((1.0f - f13) * f12)) * measuredHeight) + f9) - measuredHeight2;
            rectF.set(0.0f, f14 + fDpf2, getMeasuredWidth(), (f14 + measuredHeight) - fDpf2);
            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
        } else {
            float f15 = ((this.selectedPosition * measuredHeight) + f9) - measuredHeight2;
            rectF.set(0.0f, f15 + fDpf2, getMeasuredWidth(), (f15 + measuredHeight) - fDpf2);
            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
        }
        if (this.needDrawFade) {
            float measuredWidth2 = getMeasuredWidth();
            float fDp = AndroidUtilities.dp(6.0f);
            Paint paint3 = this.fadePaint;
            canvas.drawRect(0.0f, 0.0f, measuredWidth2, fDp, paint3);
            canvas.drawRect(0.0f, getMeasuredHeight() - AndroidUtilities.dp(6.0f), getMeasuredWidth(), getMeasuredHeight(), paint3);
            canvas.translate(0.0f, getMeasuredHeight() - AndroidUtilities.dp(6.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(6.0f), this.fadePaint2);
        }
    }

    public final void selectPosition(int i) {
        if (this.replaceInProgress) {
            this.nextPosition = i;
            return;
        }
        if (!this.animationInProgress) {
            this.animateFromPosition = this.selectedPosition;
        } else {
            if (this.animateToPosition == i) {
                return;
            }
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f = this.animateFromPosition;
            float f2 = this.animationProgress;
            this.animateFromPosition = (this.animateToPosition * f2) + ((1.0f - f2) * f);
        }
        if (i != this.selectedPosition) {
            this.animateToPosition = i;
            this.animationInProgress = true;
            this.animationProgress = 0.0f;
            invalidate();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.animator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new PinnedLineView$$ExternalSyntheticLambda0(this, 1));
            this.animator.addListener(new AnonymousClass1(this, 0));
            this.animator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.animator.setDuration(220L);
            this.animator.start();
        }
    }

    public final void set(int i, int i2, boolean z) {
        int i3 = 1;
        int i4 = this.selectedPosition;
        if (i4 < 0 || i2 == 0 || this.totalCount == 0) {
            z = false;
        }
        if (!z) {
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.selectedPosition = i;
            this.totalCount = i2;
            invalidate();
        } else if (this.totalCount == i2 && (Math.abs(i4 - i) <= 2 || this.animationInProgress || this.replaceInProgress)) {
            selectPosition(i);
        } else {
            ValueAnimator valueAnimator2 = this.animator;
            if (valueAnimator2 != null) {
                this.nextPosition = 0;
                valueAnimator2.cancel();
            }
            int iDp = AndroidUtilities.dp(8.0f);
            int i5 = iDp * 2;
            this.lineHFrom = (getMeasuredHeight() - i5) / Math.min(this.totalCount, 3);
            this.lineHTo = (getMeasuredHeight() - i5) / Math.min(i2, 3);
            int i6 = this.selectedPosition - 1;
            int i7 = this.lineHFrom;
            float f = i6 * i7;
            this.startOffsetFrom = f;
            if (f < 0.0f) {
                this.startOffsetFrom = 0.0f;
            } else {
                float fM = zzkv.m(this.totalCount, 1, i7, iDp) - f;
                int measuredHeight = getMeasuredHeight() - iDp;
                int i8 = this.lineHFrom;
                if (fM < measuredHeight - i8) {
                    this.startOffsetFrom = zzkv.m(this.totalCount, 1, i8, iDp) - ((getMeasuredHeight() - iDp) - this.lineHFrom);
                }
            }
            int i9 = this.lineHTo;
            float f2 = (i - 1) * i9;
            this.startOffsetTo = f2;
            if (f2 < 0.0f) {
                this.startOffsetTo = 0.0f;
            } else {
                int i10 = i2 - 1;
                float f3 = ((i9 * i10) + iDp) - f2;
                int measuredHeight2 = getMeasuredHeight() - iDp;
                int i11 = this.lineHTo;
                if (f3 < measuredHeight2 - i11) {
                    this.startOffsetTo = ((i10 * i11) + iDp) - ((getMeasuredHeight() - iDp) - this.lineHTo);
                }
            }
            this.animateFromPosition = this.selectedPosition;
            this.animateToPosition = i;
            this.selectedPosition = i;
            this.animateFromTotal = this.totalCount;
            this.animateToTotal = i2;
            this.totalCount = i2;
            this.replaceInProgress = true;
            this.animationInProgress = true;
            this.animationProgress = 0.0f;
            invalidate();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.animator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new PinnedLineView$$ExternalSyntheticLambda0(this, 0));
            this.animator.addListener(new AnonymousClass1(this, i3));
            this.animator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.animator.setDuration(220L);
            this.animator.start();
        }
        checkLayerType();
    }
}
