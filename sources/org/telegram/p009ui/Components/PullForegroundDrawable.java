package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.p009ui.ActionBar.Theme;

public class PullForegroundDrawable {
    private ValueAnimator accentRevalAnimatorIn;
    private ValueAnimator accentRevalAnimatorOut;
    private boolean animateOut;
    private boolean animateToColorize;
    private boolean animateToEndText;
    private boolean animateToTextIn;
    private boolean arrowAnimateTo;
    private ValueAnimator arrowRotateAnimator;
    private boolean bounceIn;
    private float bounceProgress;
    private View cell;
    private boolean isOut;
    private RecyclerListView listView;
    private AnimatorSet outAnimator;
    public float outCx;
    public float outCy;
    public float outImageSize;
    public float outProgress;
    public float outRadius;
    public float pullProgress;
    private String pullTooltip;
    private String releaseTooltip;
    public int scrollDy;
    private float textInProgress;
    private ValueAnimator textIntAnimator;
    private ValueAnimator textSwipingAnimator;
    private final Paint tooltipTextPaint;
    private boolean willDraw;
    private String backgroundColorKey = "chats_archivePullDownBackground";
    private String backgroundActiveColorKey = "chats_archivePullDownBackgroundActive";
    private String avatarBackgroundColorKey = "avatar_backgroundArchivedHidden";
    private boolean changeAvatarColor = true;
    private final Paint paintSecondary = new Paint(1);
    private final Paint paintWhite = new Paint(1);
    private final Paint paintBackgroundAccent = new Paint(1);
    private final Paint backgroundPaint = new Paint();
    private final RectF rectF = new RectF();
    private final ArrowDrawable arrowDrawable = new ArrowDrawable(this);
    private final Path circleClipPath = new Path();
    private float textSwappingProgress = 1.0f;
    private float arrowRotateProgress = 1.0f;
    private float accentRevalProgress = 1.0f;
    private float accentRevalProgressOut = 1.0f;
    private ValueAnimator.AnimatorUpdateListener textSwappingUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
        @Override
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            PullForegroundDrawable.this.lambda$new$0(valueAnimator);
        }
    };
    private ValueAnimator.AnimatorUpdateListener textInUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
        @Override
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            PullForegroundDrawable.this.lambda$new$1(valueAnimator);
        }
    };
    Runnable textInRunnable = new Runnable() {
        @Override
        public void run() {
            PullForegroundDrawable.this.animateToTextIn = true;
            if (PullForegroundDrawable.this.textIntAnimator != null) {
                PullForegroundDrawable.this.textIntAnimator.cancel();
            }
            PullForegroundDrawable.this.textInProgress = 0.0f;
            PullForegroundDrawable.this.textIntAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
            PullForegroundDrawable.this.textIntAnimator.addUpdateListener(PullForegroundDrawable.this.textInUpdateListener);
            PullForegroundDrawable.this.textIntAnimator.setInterpolator(new LinearInterpolator());
            PullForegroundDrawable.this.textIntAnimator.setDuration(150L);
            PullForegroundDrawable.this.textIntAnimator.start();
        }
    };
    boolean wasSendCallback = false;
    private float touchSlop = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();

    protected float getViewOffset() {
        throw null;
    }

    public void lambda$new$0(ValueAnimator valueAnimator) {
        this.textSwappingProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.cell;
        if (view != null) {
            view.invalidate();
        }
    }

    public void lambda$new$1(ValueAnimator valueAnimator) {
        this.textInProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.cell;
        if (view != null) {
            view.invalidate();
        }
    }

    public PullForegroundDrawable(String str, String str2) {
        TextPaint textPaint = new TextPaint(1);
        this.tooltipTextPaint = textPaint;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.m34dp(16.0f));
        this.pullTooltip = str;
        this.releaseTooltip = str2;
    }

    public static int getMaxOverscroll() {
        return AndroidUtilities.m34dp(72.0f);
    }

    public void setCell(View view) {
        this.cell = view;
        updateColors();
    }

    public void updateColors() {
        int color = Theme.getColor(this.backgroundColorKey);
        this.tooltipTextPaint.setColor(-1);
        this.paintWhite.setColor(-1);
        this.paintSecondary.setColor(ColorUtils.setAlphaComponent(-1, 100));
        this.backgroundPaint.setColor(color);
        this.arrowDrawable.setColor(color);
        this.paintBackgroundAccent.setColor(Theme.getColor(this.avatarBackgroundColorKey));
    }

    public void setListView(RecyclerListView recyclerListView) {
        this.listView = recyclerListView;
    }

    public void drawOverScroll(Canvas canvas) {
        draw(canvas, true);
    }

    public void draw(Canvas canvas) {
        draw(canvas, false);
    }

    public void draw(Canvas canvas, boolean z) {
        int i;
        float f;
        int i2;
        int i3;
        float f2;
        int i4;
        int i5;
        int i6;
        float f3;
        float f4;
        if (this.willDraw && !this.isOut && this.cell != null && this.listView != null) {
            int dp = AndroidUtilities.m34dp(28.0f);
            int dp2 = AndroidUtilities.m34dp(8.0f);
            int dp3 = AndroidUtilities.m34dp(9.0f);
            int dp4 = AndroidUtilities.m34dp(18.0f);
            int viewOffset = (int) getViewOffset();
            float f5 = this.pullProgress;
            int height = (int) (this.cell.getHeight() * f5);
            float f6 = this.bounceIn ? (this.bounceProgress * 0.07f) - 0.05f : this.bounceProgress * 0.02f;
            updateTextProgress(f5);
            float f7 = this.outProgress * 2.0f;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            float f8 = this.outCx;
            float f9 = this.outCy;
            if (z) {
                f9 += viewOffset;
            }
            int i7 = dp + dp3;
            int measuredHeight = (this.cell.getMeasuredHeight() - dp2) - dp3;
            if (z) {
                measuredHeight += viewOffset;
            }
            int i8 = dp4 + (dp2 * 2);
            if (height > i8) {
                i = dp3;
                f = 1.0f;
            } else {
                i = dp3;
                f = height / i8;
            }
            canvas.save();
            if (z) {
                i3 = dp4;
                i2 = viewOffset;
                canvas.clipRect(0, 0, this.listView.getMeasuredWidth(), viewOffset + 1);
            } else {
                i3 = dp4;
                i2 = viewOffset;
            }
            if (this.outProgress == 0.0f) {
                if (!(this.accentRevalProgress == 1.0f || this.accentRevalProgressOut == 1.0f)) {
                    canvas.drawPaint(this.backgroundPaint);
                }
                i4 = dp2;
                f2 = f6;
            } else {
                float f10 = this.outRadius;
                float f11 = this.outRadius;
                i4 = dp2;
                float width = f10 + ((this.cell.getWidth() - f11) * (1.0f - this.outProgress)) + (f11 * f6);
                if (!(this.accentRevalProgress == 1.0f || this.accentRevalProgressOut == 1.0f)) {
                    canvas.drawCircle(f8, f9, width, this.backgroundPaint);
                }
                this.circleClipPath.reset();
                f2 = f6;
                this.rectF.set(f8 - width, f9 - width, f8 + width, width + f9);
                this.circleClipPath.addOval(this.rectF, Path.Direction.CW);
                canvas.clipPath(this.circleClipPath);
            }
            if (this.animateToColorize) {
                if (this.accentRevalProgressOut > this.accentRevalProgress) {
                    canvas.save();
                    float f12 = i7;
                    float f13 = this.outProgress;
                    float f14 = measuredHeight;
                    canvas.translate((f8 - f12) * f13, (f9 - f14) * f13);
                    canvas.drawCircle(f12, f14, this.cell.getWidth() * this.accentRevalProgressOut, this.backgroundPaint);
                    canvas.restore();
                }
                if (this.accentRevalProgress > 0.0f) {
                    canvas.save();
                    float f15 = i7;
                    float f16 = this.outProgress;
                    float f17 = measuredHeight;
                    canvas.translate((f8 - f15) * f16, (f9 - f17) * f16);
                    canvas.drawCircle(f15, f17, this.cell.getWidth() * this.accentRevalProgress, this.paintBackgroundAccent);
                    canvas.restore();
                }
            } else {
                if (this.accentRevalProgress > this.accentRevalProgressOut) {
                    canvas.save();
                    float f18 = i7;
                    float f19 = this.outProgress;
                    float f20 = measuredHeight;
                    canvas.translate((f8 - f18) * f19, (f9 - f20) * f19);
                    canvas.drawCircle(f18, f20, this.cell.getWidth() * this.accentRevalProgress, this.paintBackgroundAccent);
                    canvas.restore();
                }
                if (this.accentRevalProgressOut > 0.0f) {
                    canvas.save();
                    float f21 = i7;
                    float f22 = this.outProgress;
                    float f23 = measuredHeight;
                    canvas.translate((f8 - f21) * f22, (f9 - f23) * f22);
                    canvas.drawCircle(f21, f23, this.cell.getWidth() * this.accentRevalProgressOut, this.backgroundPaint);
                    canvas.restore();
                }
            }
            if (height > i8) {
                this.paintSecondary.setAlpha((int) ((1.0f - f7) * 0.4f * f * 255.0f));
                if (z) {
                    i5 = i4;
                    this.rectF.set(dp, i5, dp + i3, i5 + i2 + i);
                } else {
                    i5 = i4;
                    this.rectF.set(dp, ((this.cell.getHeight() - height) + i5) - i2, dp + i3, this.cell.getHeight() - i5);
                }
                i6 = i;
                float f24 = i6;
                canvas.drawRoundRect(this.rectF, f24, f24, this.paintSecondary);
            } else {
                i6 = i;
                i5 = i4;
            }
            if (z) {
                canvas.restore();
                return;
            }
            if (this.outProgress == 0.0f) {
                this.paintWhite.setAlpha((int) (f * 255.0f));
                float f25 = i7;
                float f26 = measuredHeight;
                canvas.drawCircle(f25, f26, i6, this.paintWhite);
                int intrinsicHeight = this.arrowDrawable.getIntrinsicHeight();
                int intrinsicWidth = this.arrowDrawable.getIntrinsicWidth() >> 1;
                f3 = f9;
                int i9 = intrinsicHeight >> 1;
                this.arrowDrawable.setBounds(i7 - intrinsicWidth, measuredHeight - i9, intrinsicWidth + i7, measuredHeight + i9);
                float f27 = 1.0f - this.arrowRotateProgress;
                if (f27 < 0.0f) {
                    f27 = 0.0f;
                }
                float f28 = 1.0f - f27;
                canvas.save();
                canvas.rotate(180.0f * f28, f25, f26);
                canvas.translate(0.0f, (AndroidUtilities.dpf2(1.0f) * 1.0f) - f28);
                this.arrowDrawable.setColor(this.animateToColorize ? this.paintBackgroundAccent.getColor() : Theme.getColor(this.backgroundColorKey));
                this.arrowDrawable.draw(canvas);
                canvas.restore();
            } else {
                f3 = f9;
            }
            if (this.pullProgress > 0.0f) {
                textIn();
            }
            float height2 = (this.cell.getHeight() - (i8 / 2.0f)) + AndroidUtilities.m34dp(6.0f);
            this.tooltipTextPaint.setAlpha((int) (this.textSwappingProgress * 255.0f * f * this.textInProgress));
            float width2 = (this.cell.getWidth() / 2.0f) - AndroidUtilities.m34dp(2.0f);
            float f29 = this.textSwappingProgress;
            if (f29 <= 0.0f || f29 >= 1.0f) {
                f4 = 1.0f;
            } else {
                canvas.save();
                float f30 = (this.textSwappingProgress * 0.2f) + 0.8f;
                f4 = 1.0f;
                canvas.scale(f30, f30, width2, (AndroidUtilities.m34dp(16.0f) * (1.0f - this.textSwappingProgress)) + height2);
            }
            canvas.drawText(this.pullTooltip, width2, (AndroidUtilities.m34dp(8.0f) * (f4 - this.textSwappingProgress)) + height2, this.tooltipTextPaint);
            float f31 = this.textSwappingProgress;
            if (f31 > 0.0f && f31 < f4) {
                canvas.restore();
            }
            float f32 = this.textSwappingProgress;
            if (f32 > 0.0f && f32 < f4) {
                canvas.save();
                float f33 = ((f4 - this.textSwappingProgress) * 0.1f) + 0.9f;
                canvas.scale(f33, f33, width2, height2 - (AndroidUtilities.m34dp(8.0f) * this.textSwappingProgress));
            }
            this.tooltipTextPaint.setAlpha((int) ((1.0f - this.textSwappingProgress) * 255.0f * f * this.textInProgress));
            canvas.drawText(this.releaseTooltip, width2, height2 - (AndroidUtilities.m34dp(8.0f) * this.textSwappingProgress), this.tooltipTextPaint);
            float f34 = this.textSwappingProgress;
            if (f34 > 0.0f && f34 < 1.0f) {
                canvas.restore();
            }
            canvas.restore();
            if (this.changeAvatarColor && this.outProgress > 0.0f) {
                canvas.save();
                int intrinsicWidth2 = Theme.dialogs_archiveAvatarDrawable.getIntrinsicWidth();
                int height3 = (this.cell.getHeight() - i5) - i6;
                float f35 = intrinsicWidth2;
                float dp5 = AndroidUtilities.m34dp(24.0f) / f35;
                float f36 = this.outProgress;
                float f37 = dp5 + ((1.0f - dp5) * f36) + f2;
                canvas.translate((i7 - f8) * (1.0f - f36), (height3 - f3) * (1.0f - f36));
                float f38 = f3;
                canvas.scale(f37, f37, f8, f38);
                Theme.dialogs_archiveAvatarDrawable.setProgress(0.0f);
                if (!Theme.dialogs_archiveAvatarDrawableRecolored) {
                    Theme.dialogs_archiveAvatarDrawable.beginApplyLayerColors();
                    Theme.dialogs_archiveAvatarDrawable.setLayerColor("Arrow1.**", Theme.getNonAnimatedColor(this.avatarBackgroundColorKey));
                    Theme.dialogs_archiveAvatarDrawable.setLayerColor("Arrow2.**", Theme.getNonAnimatedColor(this.avatarBackgroundColorKey));
                    Theme.dialogs_archiveAvatarDrawable.commitApplyLayerColors();
                    Theme.dialogs_archiveAvatarDrawableRecolored = true;
                }
                float f39 = f35 / 2.0f;
                Theme.dialogs_archiveAvatarDrawable.setBounds((int) (f8 - f39), (int) (f38 - f39), (int) (f8 + f39), (int) (f38 + f39));
                Theme.dialogs_archiveAvatarDrawable.draw(canvas);
                canvas.restore();
            }
        }
    }

    private void updateTextProgress(float f) {
        boolean z = f > 0.85f;
        float f2 = 1.0f;
        if (this.animateToEndText != z) {
            this.animateToEndText = z;
            if (this.textInProgress == 0.0f) {
                ValueAnimator valueAnimator = this.textSwipingAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.textSwappingProgress = z ? 0.0f : 1.0f;
            } else {
                ValueAnimator valueAnimator2 = this.textSwipingAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                float[] fArr = new float[2];
                fArr[0] = this.textSwappingProgress;
                fArr[1] = z ? 0.0f : 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                this.textSwipingAnimator = ofFloat;
                ofFloat.addUpdateListener(this.textSwappingUpdateListener);
                this.textSwipingAnimator.setInterpolator(new LinearInterpolator());
                this.textSwipingAnimator.setDuration(170L);
                this.textSwipingAnimator.start();
            }
        }
        if (z != this.arrowAnimateTo) {
            this.arrowAnimateTo = z;
            ValueAnimator valueAnimator3 = this.arrowRotateAnimator;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            float[] fArr2 = new float[2];
            fArr2[0] = this.arrowRotateProgress;
            if (this.arrowAnimateTo) {
                f2 = 0.0f;
            }
            fArr2[1] = f2;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
            this.arrowRotateAnimator = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    PullForegroundDrawable.this.lambda$updateTextProgress$2(valueAnimator4);
                }
            });
            this.arrowRotateAnimator.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
            this.arrowRotateAnimator.setDuration(250L);
            this.arrowRotateAnimator.start();
        }
    }

    public void lambda$updateTextProgress$2(ValueAnimator valueAnimator) {
        this.arrowRotateProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.cell;
        if (view != null) {
            view.invalidate();
        }
    }

    public void colorize(boolean z) {
        if (this.animateToColorize != z) {
            this.animateToColorize = z;
            if (z) {
                ValueAnimator valueAnimator = this.accentRevalAnimatorIn;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.accentRevalAnimatorIn = null;
                }
                this.accentRevalProgress = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.accentRevalAnimatorIn = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        PullForegroundDrawable.this.lambda$colorize$3(valueAnimator2);
                    }
                });
                this.accentRevalAnimatorIn.setInterpolator(AndroidUtilities.accelerateInterpolator);
                this.accentRevalAnimatorIn.setDuration(230L);
                this.accentRevalAnimatorIn.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.accentRevalAnimatorOut;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.accentRevalAnimatorOut = null;
            }
            this.accentRevalProgressOut = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.accentRevalAnimatorOut = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    PullForegroundDrawable.this.lambda$colorize$4(valueAnimator3);
                }
            });
            this.accentRevalAnimatorOut.setInterpolator(AndroidUtilities.accelerateInterpolator);
            this.accentRevalAnimatorOut.setDuration(230L);
            this.accentRevalAnimatorOut.start();
        }
    }

    public void lambda$colorize$3(ValueAnimator valueAnimator) {
        this.accentRevalProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.cell;
        if (view != null) {
            view.invalidate();
        }
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            recyclerListView.invalidate();
        }
    }

    public void lambda$colorize$4(ValueAnimator valueAnimator) {
        this.accentRevalProgressOut = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.cell;
        if (view != null) {
            view.invalidate();
        }
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            recyclerListView.invalidate();
        }
    }

    private void textIn() {
        if (this.animateToTextIn) {
            return;
        }
        if (Math.abs(this.scrollDy) >= this.touchSlop * 0.5f) {
            this.wasSendCallback = true;
            this.cell.removeCallbacks(this.textInRunnable);
            this.cell.postDelayed(this.textInRunnable, 200L);
        } else if (!this.wasSendCallback) {
            this.textInProgress = 1.0f;
            this.animateToTextIn = true;
        }
    }

    public void startOutAnimation() {
        if (!this.animateOut && this.listView != null) {
            AnimatorSet animatorSet = this.outAnimator;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.outAnimator.cancel();
            }
            this.animateOut = true;
            this.bounceIn = true;
            this.bounceProgress = 0.0f;
            this.listView.getTranslationY();
            AndroidUtilities.m34dp(100.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PullForegroundDrawable.this.lambda$startOutAnimation$5(valueAnimator);
                }
            });
            ofFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            ofFloat.setDuration(250L);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PullForegroundDrawable.this.lambda$startOutAnimation$6(valueAnimator);
                }
            });
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_BOTH;
            ofFloat2.setInterpolator(cubicBezierInterpolator);
            ofFloat2.setDuration(150L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PullForegroundDrawable.this.lambda$startOutAnimation$7(valueAnimator);
                }
            });
            ofFloat3.setInterpolator(cubicBezierInterpolator);
            ofFloat3.setDuration(135L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.outAnimator = animatorSet2;
            animatorSet2.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    PullForegroundDrawable.this.doNotShow();
                }
            });
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3);
            animatorSet3.setStartDelay(180L);
            this.outAnimator.playTogether(ofFloat, animatorSet3);
            this.outAnimator.start();
        }
    }

    public void lambda$startOutAnimation$5(ValueAnimator valueAnimator) {
        setOutProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        View view = this.cell;
        if (view != null) {
            view.invalidate();
        }
    }

    public void lambda$startOutAnimation$6(ValueAnimator valueAnimator) {
        this.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.bounceIn = true;
        View view = this.cell;
        if (view != null) {
            view.invalidate();
        }
    }

    public void lambda$startOutAnimation$7(ValueAnimator valueAnimator) {
        this.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.bounceIn = false;
        View view = this.cell;
        if (view != null) {
            view.invalidate();
        }
    }

    private void setOutProgress(float f) {
        this.outProgress = f;
        int blendARGB = ColorUtils.blendARGB(Theme.getNonAnimatedColor(this.avatarBackgroundColorKey), Theme.getNonAnimatedColor(this.backgroundActiveColorKey), 1.0f - this.outProgress);
        this.paintBackgroundAccent.setColor(blendARGB);
        if (this.changeAvatarColor && isDraw()) {
            Theme.dialogs_archiveAvatarDrawable.beginApplyLayerColors();
            Theme.dialogs_archiveAvatarDrawable.setLayerColor("Arrow1.**", blendARGB);
            Theme.dialogs_archiveAvatarDrawable.setLayerColor("Arrow2.**", blendARGB);
            Theme.dialogs_archiveAvatarDrawable.commitApplyLayerColors();
        }
    }

    public void doNotShow() {
        ValueAnimator valueAnimator = this.textSwipingAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.textIntAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        View view = this.cell;
        if (view != null) {
            view.removeCallbacks(this.textInRunnable);
        }
        ValueAnimator valueAnimator3 = this.accentRevalAnimatorIn;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.textSwappingProgress = 1.0f;
        this.arrowRotateProgress = 1.0f;
        this.animateToEndText = false;
        this.arrowAnimateTo = false;
        this.animateToTextIn = false;
        this.wasSendCallback = false;
        this.textInProgress = 0.0f;
        this.isOut = true;
        setOutProgress(1.0f);
        this.animateToColorize = false;
        this.accentRevalProgress = 0.0f;
    }

    public void showHidden() {
        AnimatorSet animatorSet = this.outAnimator;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.outAnimator.cancel();
        }
        setOutProgress(0.0f);
        this.isOut = false;
        this.animateOut = false;
    }

    public boolean isDraw() {
        return this.willDraw && !this.isOut;
    }

    public void setWillDraw(boolean z) {
        this.willDraw = z;
    }

    public void resetText() {
        ValueAnimator valueAnimator = this.textIntAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.cell;
        if (view != null) {
            view.removeCallbacks(this.textInRunnable);
        }
        this.textInProgress = 0.0f;
        this.animateToTextIn = false;
        this.wasSendCallback = false;
    }

    public class ArrowDrawable extends Drawable {
        private float lastDensity;
        private Path path = new Path();
        private Paint paint = new Paint(1);

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public ArrowDrawable(PullForegroundDrawable pullForegroundDrawable) {
            updatePath();
        }

        private void updatePath() {
            int dp = AndroidUtilities.m34dp(18.0f);
            this.path.reset();
            float f = dp >> 1;
            this.path.moveTo(f, AndroidUtilities.dpf2(4.98f));
            this.path.lineTo(AndroidUtilities.dpf2(4.95f), AndroidUtilities.dpf2(9.0f));
            this.path.lineTo(dp - AndroidUtilities.dpf2(4.95f), AndroidUtilities.dpf2(9.0f));
            this.path.lineTo(f, AndroidUtilities.dpf2(4.98f));
            this.paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.paint.setStrokeJoin(Paint.Join.ROUND);
            this.paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
            this.lastDensity = AndroidUtilities.density;
        }

        public void setColor(int i) {
            this.paint.setColor(i);
        }

        @Override
        public int getIntrinsicHeight() {
            return AndroidUtilities.m34dp(18.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return getIntrinsicHeight();
        }

        @Override
        public void draw(Canvas canvas) {
            if (this.lastDensity != AndroidUtilities.density) {
                updatePath();
            }
            canvas.save();
            canvas.translate(getBounds().left, getBounds().top);
            canvas.drawPath(this.path, this.paint);
            canvas.drawRect(AndroidUtilities.dpf2(7.56f), AndroidUtilities.dpf2(8.0f), AndroidUtilities.m34dp(18.0f) - AndroidUtilities.dpf2(7.56f), AndroidUtilities.dpf2(11.1f), this.paint);
            canvas.restore();
        }
    }
}
