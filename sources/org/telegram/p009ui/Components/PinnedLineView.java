package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.ActionBar.Theme;

public class PinnedLineView extends View {
    float animateFromPosition;
    int animateFromTotal;
    int animateToPosition;
    int animateToTotal;
    boolean animationInProgress;
    float animationProgress;
    ValueAnimator animator;
    private int color;
    private int lineHFrom;
    private int lineHTo;
    boolean replaceInProgress;
    private final Theme.ResourcesProvider resourcesProvider;
    private float startOffsetFrom;
    private float startOffsetTo;
    int selectedPosition = -1;
    int totalCount = 0;
    RectF rectF = new RectF();
    Paint paint = new Paint(1);
    Paint selectedPaint = new Paint(1);
    private int nextPosition = -1;
    Paint fadePaint = new Paint();
    Paint fadePaint2 = new Paint();

    public PinnedLineView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.selectedPaint.setStyle(Paint.Style.FILL);
        this.selectedPaint.setStrokeCap(Paint.Cap.ROUND);
        this.fadePaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.m34dp(6.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        this.fadePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.fadePaint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.m34dp(6.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        this.fadePaint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        updateColors();
    }

    public void updateColors() {
        int themedColor = getThemedColor("chat_topPanelLine");
        this.color = themedColor;
        this.paint.setColor(ColorUtils.setAlphaComponent(themedColor, (int) ((Color.alpha(themedColor) / 255.0f) * 112.0f)));
        this.selectedPaint.setColor(this.color);
    }

    public void selectPosition(int i) {
        if (this.replaceInProgress) {
            this.nextPosition = i;
            return;
        }
        if (!this.animationInProgress) {
            this.animateFromPosition = this.selectedPosition;
        } else if (this.animateToPosition != i) {
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f = this.animateFromPosition;
            float f2 = this.animationProgress;
            this.animateFromPosition = (f * (1.0f - f2)) + (this.animateToPosition * f2);
        } else {
            return;
        }
        if (i != this.selectedPosition) {
            this.animateToPosition = i;
            this.animationInProgress = true;
            this.animationProgress = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.animator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    PinnedLineView.this.lambda$selectPosition$0(valueAnimator2);
                }
            });
            this.animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    PinnedLineView pinnedLineView = PinnedLineView.this;
                    pinnedLineView.animationInProgress = false;
                    pinnedLineView.selectedPosition = pinnedLineView.animateToPosition;
                    pinnedLineView.invalidate();
                    if (PinnedLineView.this.nextPosition >= 0) {
                        PinnedLineView pinnedLineView2 = PinnedLineView.this;
                        pinnedLineView2.selectPosition(pinnedLineView2.nextPosition);
                        PinnedLineView.this.nextPosition = -1;
                    }
                }
            });
            this.animator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.animator.setDuration(220L);
            this.animator.start();
        }
    }

    public void lambda$selectPosition$0(ValueAnimator valueAnimator) {
        this.animationProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        int i2;
        int i3;
        int i4;
        int i5;
        super.onDraw(canvas);
        if (this.selectedPosition >= 0 && (i = this.totalCount) != 0) {
            if (this.replaceInProgress) {
                i = Math.max(this.animateFromTotal, this.animateToTotal);
            }
            boolean z = i > 3;
            if (z) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            }
            int dp = AndroidUtilities.m34dp(8.0f);
            if (this.replaceInProgress) {
                float f3 = this.animationProgress;
                f = (this.lineHFrom * (1.0f - f3)) + (this.lineHTo * f3);
            } else if (this.totalCount != 0) {
                f = (getMeasuredHeight() - (dp * 2)) / Math.min(this.totalCount, 3);
            } else {
                return;
            }
            float f4 = 0.0f;
            if (f != 0.0f) {
                float dpf2 = AndroidUtilities.dpf2(0.7f);
                if (this.replaceInProgress) {
                    float f5 = this.startOffsetFrom;
                    float f6 = this.animationProgress;
                    f2 = (f5 * (1.0f - f6)) + (this.startOffsetTo * f6);
                } else {
                    if (this.animationInProgress) {
                        float f7 = this.animationProgress;
                        f2 = ((this.animateFromPosition - 1.0f) * f * (1.0f - f7)) + ((this.animateToPosition - 1) * f * f7);
                    } else {
                        f2 = (this.selectedPosition - 1) * f;
                    }
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    } else {
                        float f8 = dp;
                        if ((((this.totalCount - 1) * f) + f8) - f2 < (getMeasuredHeight() - dp) - f) {
                            f2 = (f8 + ((this.totalCount - 1) * f)) - ((getMeasuredHeight() - dp) - f);
                        }
                    }
                }
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float f9 = dp;
                int max = Math.max(0, (int) (((f9 + f2) / f) - 1.0f));
                int min = Math.min(max + 6, this.replaceInProgress ? Math.max(this.animateFromTotal, this.animateToTotal) : this.totalCount);
                while (max < min) {
                    float f10 = ((max * f) + f9) - f2;
                    float f11 = f10 + f;
                    if (f11 >= f4 && f10 <= getMeasuredHeight()) {
                        this.rectF.set(f4, f10 + dpf2, getMeasuredWidth(), f11 - dpf2);
                        boolean z2 = this.replaceInProgress;
                        if (z2 && max >= this.animateToTotal) {
                            this.paint.setColor(ColorUtils.setAlphaComponent(this.color, (int) ((Color.alpha(i4) / 255.0f) * 76.0f * (1.0f - this.animationProgress))));
                            canvas.drawRoundRect(this.rectF, measuredWidth, measuredWidth, this.paint);
                            this.paint.setColor(ColorUtils.setAlphaComponent(this.color, (int) ((Color.alpha(i5) / 255.0f) * 76.0f)));
                        } else if (!z2 || max < this.animateFromTotal) {
                            canvas.drawRoundRect(this.rectF, measuredWidth, measuredWidth, this.paint);
                        } else {
                            this.paint.setColor(ColorUtils.setAlphaComponent(this.color, (int) ((Color.alpha(i2) / 255.0f) * 76.0f * this.animationProgress)));
                            canvas.drawRoundRect(this.rectF, measuredWidth, measuredWidth, this.paint);
                            this.paint.setColor(ColorUtils.setAlphaComponent(this.color, (int) ((Color.alpha(i3) / 255.0f) * 76.0f)));
                        }
                    }
                    max++;
                    f4 = 0.0f;
                }
                if (this.animationInProgress) {
                    float f12 = this.animateFromPosition;
                    float f13 = this.animationProgress;
                    float f14 = (f9 + (((f12 * (1.0f - f13)) + (this.animateToPosition * f13)) * f)) - f2;
                    this.rectF.set(0.0f, f14 + dpf2, getMeasuredWidth(), (f14 + f) - dpf2);
                    canvas.drawRoundRect(this.rectF, measuredWidth, measuredWidth, this.selectedPaint);
                } else {
                    float f15 = (f9 + (this.selectedPosition * f)) - f2;
                    this.rectF.set(0.0f, f15 + dpf2, getMeasuredWidth(), (f15 + f) - dpf2);
                    canvas.drawRoundRect(this.rectF, measuredWidth, measuredWidth, this.selectedPaint);
                }
                if (z) {
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.m34dp(6.0f), this.fadePaint);
                    canvas.drawRect(0.0f, getMeasuredHeight() - AndroidUtilities.m34dp(6.0f), getMeasuredWidth(), getMeasuredHeight(), this.fadePaint);
                    canvas.translate(0.0f, getMeasuredHeight() - AndroidUtilities.m34dp(6.0f));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.m34dp(6.0f), this.fadePaint2);
                }
            }
        }
    }

    public void set(int i, int i2, boolean z) {
        int dp;
        int i3;
        int i4;
        int i5 = this.selectedPosition;
        if (i5 < 0 || i2 == 0 || this.totalCount == 0) {
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
        } else if (this.totalCount != i2 || (Math.abs(i5 - i) > 2 && !this.animationInProgress && !this.replaceInProgress)) {
            ValueAnimator valueAnimator2 = this.animator;
            if (valueAnimator2 != null) {
                this.nextPosition = 0;
                valueAnimator2.cancel();
            }
            int dp2 = AndroidUtilities.m34dp(8.0f) * 2;
            this.lineHFrom = (getMeasuredHeight() - dp2) / Math.min(this.totalCount, 3);
            this.lineHTo = (getMeasuredHeight() - dp2) / Math.min(i2, 3);
            float f = (this.selectedPosition - 1) * this.lineHFrom;
            this.startOffsetFrom = f;
            if (f < 0.0f) {
                this.startOffsetFrom = 0.0f;
            } else {
                int i6 = this.lineHFrom;
                if ((((this.totalCount - 1) * i3) + dp) - f < (getMeasuredHeight() - dp) - i6) {
                    this.startOffsetFrom = (((this.totalCount - 1) * i6) + dp) - ((getMeasuredHeight() - dp) - this.lineHFrom);
                }
            }
            float f2 = (i - 1) * this.lineHTo;
            this.startOffsetTo = f2;
            if (f2 < 0.0f) {
                this.startOffsetTo = 0.0f;
            } else {
                int i7 = i2 - 1;
                int i8 = this.lineHTo;
                if (((i4 * i7) + dp) - f2 < (getMeasuredHeight() - dp) - i8) {
                    this.startOffsetTo = ((i7 * i8) + dp) - ((getMeasuredHeight() - dp) - this.lineHTo);
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
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.animator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    PinnedLineView.this.lambda$set$1(valueAnimator3);
                }
            });
            this.animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    PinnedLineView pinnedLineView = PinnedLineView.this;
                    pinnedLineView.replaceInProgress = false;
                    pinnedLineView.animationInProgress = false;
                    pinnedLineView.invalidate();
                    if (PinnedLineView.this.nextPosition >= 0) {
                        PinnedLineView pinnedLineView2 = PinnedLineView.this;
                        pinnedLineView2.selectPosition(pinnedLineView2.nextPosition);
                        PinnedLineView.this.nextPosition = -1;
                    }
                }
            });
            this.animator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.animator.setDuration(220L);
            this.animator.start();
        } else {
            selectPosition(i);
        }
    }

    public void lambda$set$1(ValueAnimator valueAnimator) {
        this.animationProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
