package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CubicBezierInterpolator;

public class VoIPFloatingLayout extends FrameLayout {
    private final float FLOATING_MODE_SCALE;
    private boolean active;
    public boolean alwaysFloating;
    public int bottomOffset;
    float bottomPadding;
    private VoIPFloatingLayoutDelegate delegate;
    private boolean floatingMode;
    public boolean isAppearing;
    int lastH;
    WindowInsets lastInsets;
    int lastW;
    float leftPadding;
    public boolean measuredAsFloatingMode;
    boolean moving;
    ValueAnimator mutedAnimator;
    Drawable mutedDrawable;
    Paint mutedPaint;
    float mutedProgress;
    private ValueAnimator.AnimatorUpdateListener mutedUpdateListener;
    private float overrideCornerRadius;
    final Path path;
    private ValueAnimator.AnimatorUpdateListener progressUpdateListener;
    final RectF rectF;
    public float relativePositionToSetX;
    float relativePositionToSetY;
    float rightPadding;
    public float savedRelativePositionX;
    public float savedRelativePositionY;
    private boolean setedFloatingMode;
    float starX;
    float starY;
    float startMovingFromX;
    float startMovingFromY;
    long startTime;
    ValueAnimator switchToFloatingModeAnimator;
    private boolean switchingToFloatingMode;
    public boolean switchingToPip;
    View.OnClickListener tapListener;
    float toFloatingModeProgress;
    float topPadding;
    float touchSlop;
    private boolean uiVisible;
    public float updatePositionFromX;
    public float updatePositionFromY;
    final Paint xRefPaint;

    public interface VoIPFloatingLayoutDelegate {
        void onChange(float f, boolean z);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void lambda$new$0(ValueAnimator valueAnimator) {
        this.mutedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public VoIPFloatingLayout(Context context) {
        super(context);
        this.FLOATING_MODE_SCALE = 0.23f;
        this.path = new Path();
        this.rectF = new RectF();
        this.xRefPaint = new Paint(1);
        this.mutedPaint = new Paint(1);
        this.relativePositionToSetX = -1.0f;
        this.relativePositionToSetY = -1.0f;
        this.toFloatingModeProgress = 0.0f;
        this.mutedProgress = 0.0f;
        this.overrideCornerRadius = -1.0f;
        this.active = true;
        this.progressUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoIPFloatingLayout.this.toFloatingModeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (VoIPFloatingLayout.this.delegate != null) {
                    VoIPFloatingLayoutDelegate voIPFloatingLayoutDelegate = VoIPFloatingLayout.this.delegate;
                    VoIPFloatingLayout voIPFloatingLayout = VoIPFloatingLayout.this;
                    voIPFloatingLayoutDelegate.onChange(voIPFloatingLayout.toFloatingModeProgress, voIPFloatingLayout.measuredAsFloatingMode);
                }
                VoIPFloatingLayout.this.invalidate();
            }
        };
        this.mutedUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoIPFloatingLayout.this.lambda$new$0(valueAnimator);
            }
        };
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new ViewOutlineProvider() {
                @Override
                @TargetApi(21)
                public void getOutline(View view, Outline outline) {
                    if (VoIPFloatingLayout.this.overrideCornerRadius >= 0.0f) {
                        if (VoIPFloatingLayout.this.overrideCornerRadius >= 1.0f) {
                            outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), VoIPFloatingLayout.this.overrideCornerRadius);
                            return;
                        } else {
                            outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                            return;
                        }
                    }
                    if (VoIPFloatingLayout.this.floatingMode) {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), VoIPFloatingLayout.this.floatingMode ? AndroidUtilities.dp(4.0f) : 0.0f);
                    } else {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    }
                }
            });
            setClipToOutline(true);
        }
        this.mutedPaint.setColor(ColorUtils.setAlphaComponent(-16777216, 102));
        this.mutedDrawable = ContextCompat.getDrawable(context, R.drawable.calls_mute_mini);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.measuredAsFloatingMode = false;
        if (this.floatingMode) {
            size = (int) (size * 0.23f);
            size2 = (int) (size2 * 0.23f);
            this.measuredAsFloatingMode = true;
        } else if (!this.switchingToPip) {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }
        VoIPFloatingLayoutDelegate voIPFloatingLayoutDelegate = this.delegate;
        if (voIPFloatingLayoutDelegate != null) {
            voIPFloatingLayoutDelegate.onChange(this.toFloatingModeProgress, this.measuredAsFloatingMode);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        if (getMeasuredHeight() != this.lastH && getMeasuredWidth() != this.lastW) {
            this.path.reset();
            this.rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.path.addRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Path.Direction.CW);
            this.path.toggleInverseFillType();
        }
        this.lastH = getMeasuredHeight();
        this.lastW = getMeasuredWidth();
        updatePadding();
    }

    private void updatePadding() {
        this.leftPadding = AndroidUtilities.dp(16.0f);
        this.rightPadding = AndroidUtilities.dp(16.0f);
        this.topPadding = this.uiVisible ? AndroidUtilities.dp(60.0f) : AndroidUtilities.dp(16.0f);
        this.bottomPadding = AndroidUtilities.dp(this.uiVisible ? 100.0f : 16.0f) + this.bottomOffset;
    }

    public void setDelegate(VoIPFloatingLayoutDelegate voIPFloatingLayoutDelegate) {
        this.delegate = voIPFloatingLayoutDelegate;
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.VoIPFloatingLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (this.updatePositionFromX >= 0.0f) {
            if (!this.isAppearing) {
                animate().setListener(null).cancel();
            }
            setTranslationX(this.updatePositionFromX);
            setTranslationY(this.updatePositionFromY);
            if (!this.isAppearing) {
                setScaleX(1.0f);
                setScaleY(1.0f);
                setAlpha(1.0f);
            }
            this.updatePositionFromX = -1.0f;
            this.updatePositionFromY = -1.0f;
        }
        if (this.relativePositionToSetX >= 0.0f && this.floatingMode && getMeasuredWidth() > 0) {
            setRelativePositionInternal(this.relativePositionToSetX, this.relativePositionToSetY, getMeasuredWidth(), getMeasuredHeight(), false);
            this.relativePositionToSetX = -1.0f;
            this.relativePositionToSetY = -1.0f;
        }
        super.dispatchDraw(canvas);
        if (!this.switchingToFloatingMode) {
            boolean z = this.floatingMode;
            boolean z2 = this.setedFloatingMode;
            if (z != z2) {
                setFloatingMode(z2, true);
            }
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - ((int) ((AndroidUtilities.dp(18.0f) * 1.0f) / getScaleY()));
        canvas.save();
        float f = measuredWidth;
        float f2 = measuredHeight;
        canvas.scale((1.0f / getScaleX()) * this.toFloatingModeProgress * this.mutedProgress, (1.0f / getScaleY()) * this.toFloatingModeProgress * this.mutedProgress, f, f2);
        canvas.drawCircle(f, f2, AndroidUtilities.dp(14.0f), this.mutedPaint);
        Drawable drawable = this.mutedDrawable;
        drawable.setBounds(measuredWidth - (drawable.getIntrinsicWidth() / 2), measuredHeight - (this.mutedDrawable.getIntrinsicHeight() / 2), measuredWidth + (this.mutedDrawable.getIntrinsicWidth() / 2), measuredHeight + (this.mutedDrawable.getIntrinsicHeight() / 2));
        this.mutedDrawable.draw(canvas);
        canvas.restore();
        if (this.switchingToFloatingMode) {
            invalidate();
        }
    }

    public void setInsets(WindowInsets windowInsets) {
        this.lastInsets = windowInsets;
    }

    public void setRelativePosition(float f, float f2) {
        Object parent = getParent();
        if (!this.floatingMode || parent == null || ((View) parent).getMeasuredWidth() > 0 || getMeasuredWidth() == 0 || getMeasuredHeight() == 0) {
            this.relativePositionToSetX = f;
            this.relativePositionToSetY = f2;
        } else {
            setRelativePositionInternal(f, f2, getMeasuredWidth(), getMeasuredHeight(), true);
        }
    }

    public void setUiVisible(boolean z) {
        if (getParent() == null) {
            this.uiVisible = z;
        } else {
            this.uiVisible = z;
        }
    }

    public void setBottomOffset(int i, boolean z) {
        if (getParent() == null || !z) {
            this.bottomOffset = i;
        } else {
            this.bottomOffset = i;
        }
    }

    private void setRelativePositionInternal(float f, float f2, int i, int i2, boolean z) {
        float f3;
        WindowInsets windowInsets;
        int systemWindowInsetBottom;
        WindowInsets windowInsets2;
        int systemWindowInsetTop;
        Object parent = getParent();
        if (parent == null || !this.floatingMode || this.switchingToFloatingMode || !this.active) {
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        float f4 = 0.0f;
        if (i3 < 20 || (windowInsets2 = this.lastInsets) == null) {
            f3 = 0.0f;
        } else {
            systemWindowInsetTop = windowInsets2.getSystemWindowInsetTop();
            f3 = systemWindowInsetTop + this.topPadding;
        }
        if (i3 >= 20 && (windowInsets = this.lastInsets) != null) {
            systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            f4 = this.bottomPadding + systemWindowInsetBottom;
        }
        View view = (View) parent;
        float measuredWidth = this.leftPadding + ((((view.getMeasuredWidth() - this.leftPadding) - this.rightPadding) - i) * f);
        float measuredHeight = f3 + ((((view.getMeasuredHeight() - f4) - f3) - i2) * f2);
        if (z) {
            animate().setListener(null).cancel();
            animate().scaleX(1.0f).scaleY(1.0f).translationX(measuredWidth).translationY(measuredHeight).alpha(1.0f).setStartDelay(this.uiVisible ? 0L : 150L).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            return;
        }
        if (!this.alwaysFloating) {
            animate().setListener(null).cancel();
            setScaleX(1.0f);
            setScaleY(1.0f);
            animate().alpha(1.0f).setDuration(150L).start();
        }
        setTranslationX(measuredWidth);
        setTranslationY(measuredHeight);
    }

    public void setFloatingMode(boolean z, boolean z2) {
        if (getMeasuredWidth() <= 0 || getVisibility() != 0) {
            z2 = false;
        }
        if (!z2) {
            if (this.floatingMode != z) {
                this.floatingMode = z;
                this.setedFloatingMode = z;
                this.toFloatingModeProgress = z ? 1.0f : 0.0f;
                requestLayout();
                if (Build.VERSION.SDK_INT >= 21) {
                    invalidateOutline();
                    return;
                }
                return;
            }
            return;
        }
        if (this.switchingToFloatingMode) {
            this.setedFloatingMode = z;
            return;
        }
        if (z && !this.floatingMode) {
            this.floatingMode = true;
            this.setedFloatingMode = z;
            updatePadding();
            float f = this.relativePositionToSetX;
            if (f >= 0.0f) {
                setRelativePositionInternal(f, this.relativePositionToSetY, (int) (getMeasuredWidth() * 0.23f), (int) (getMeasuredHeight() * 0.23f), false);
            }
            this.floatingMode = false;
            this.switchingToFloatingMode = true;
            final float translationX = getTranslationX();
            final float translationY = getTranslationY();
            setTranslationX(0.0f);
            setTranslationY(0.0f);
            invalidate();
            ValueAnimator valueAnimator = this.switchToFloatingModeAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.toFloatingModeProgress, 1.0f);
            this.switchToFloatingModeAnimator = ofFloat;
            ofFloat.addUpdateListener(this.progressUpdateListener);
            this.switchToFloatingModeAnimator.setDuration(300L);
            this.switchToFloatingModeAnimator.start();
            animate().setListener(null).cancel();
            ViewPropertyAnimator duration = animate().scaleX(0.23f).scaleY(0.23f).translationX(translationX - ((getMeasuredWidth() - (getMeasuredWidth() * 0.23f)) / 2.0f)).translationY(translationY - ((getMeasuredHeight() - (getMeasuredHeight() * 0.23f)) / 2.0f)).alpha(1.0f).setStartDelay(0L).setDuration(300L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            duration.setInterpolator(cubicBezierInterpolator).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    VoIPFloatingLayout.this.switchingToFloatingMode = false;
                    VoIPFloatingLayout.this.floatingMode = true;
                    VoIPFloatingLayout voIPFloatingLayout = VoIPFloatingLayout.this;
                    voIPFloatingLayout.updatePositionFromX = translationX;
                    voIPFloatingLayout.updatePositionFromY = translationY;
                    voIPFloatingLayout.requestLayout();
                }
            }).setInterpolator(cubicBezierInterpolator).start();
            return;
        }
        if (!z && this.floatingMode) {
            this.setedFloatingMode = z;
            final float translationX2 = getTranslationX();
            final float translationY2 = getTranslationY();
            updatePadding();
            this.floatingMode = false;
            this.switchingToFloatingMode = true;
            requestLayout();
            animate().setListener(null).cancel();
            getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public boolean onPreDraw() {
                    VoIPFloatingLayout voIPFloatingLayout = VoIPFloatingLayout.this;
                    if (voIPFloatingLayout.measuredAsFloatingMode) {
                        voIPFloatingLayout.floatingMode = false;
                        VoIPFloatingLayout.this.requestLayout();
                    } else {
                        ValueAnimator valueAnimator2 = voIPFloatingLayout.switchToFloatingModeAnimator;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        VoIPFloatingLayout voIPFloatingLayout2 = VoIPFloatingLayout.this;
                        voIPFloatingLayout2.switchToFloatingModeAnimator = ValueAnimator.ofFloat(voIPFloatingLayout2.toFloatingModeProgress, 0.0f);
                        VoIPFloatingLayout voIPFloatingLayout3 = VoIPFloatingLayout.this;
                        voIPFloatingLayout3.switchToFloatingModeAnimator.addUpdateListener(voIPFloatingLayout3.progressUpdateListener);
                        VoIPFloatingLayout.this.switchToFloatingModeAnimator.setDuration(300L);
                        VoIPFloatingLayout.this.switchToFloatingModeAnimator.start();
                        float measuredWidth = translationX2 - ((VoIPFloatingLayout.this.getMeasuredWidth() - (VoIPFloatingLayout.this.getMeasuredWidth() * 0.23f)) / 2.0f);
                        float measuredHeight = translationY2 - ((VoIPFloatingLayout.this.getMeasuredHeight() - (VoIPFloatingLayout.this.getMeasuredHeight() * 0.23f)) / 2.0f);
                        VoIPFloatingLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
                        VoIPFloatingLayout.this.setTranslationX(measuredWidth);
                        VoIPFloatingLayout.this.setTranslationY(measuredHeight);
                        VoIPFloatingLayout.this.setScaleX(0.23f);
                        VoIPFloatingLayout.this.setScaleY(0.23f);
                        VoIPFloatingLayout.this.animate().setListener(null).cancel();
                        VoIPFloatingLayout.this.animate().setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                VoIPFloatingLayout.this.switchingToFloatingMode = false;
                                VoIPFloatingLayout.this.requestLayout();
                            }
                        }).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    }
                    return false;
                }
            });
            return;
        }
        this.toFloatingModeProgress = this.floatingMode ? 1.0f : 0.0f;
        this.floatingMode = z;
        this.setedFloatingMode = z;
        requestLayout();
    }

    public void setMuted(boolean z, boolean z2) {
        if (!z2) {
            ValueAnimator valueAnimator = this.mutedAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.mutedProgress = z ? 1.0f : 0.0f;
            invalidate();
            return;
        }
        ValueAnimator valueAnimator2 = this.mutedAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.mutedProgress, z ? 1.0f : 0.0f);
        this.mutedAnimator = ofFloat;
        ofFloat.addUpdateListener(this.mutedUpdateListener);
        this.mutedAnimator.setDuration(150L);
        this.mutedAnimator.start();
    }

    public void setCornerRadius(float f) {
        this.overrideCornerRadius = f;
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setOnTapListener(View.OnClickListener onClickListener) {
        this.tapListener = onClickListener;
    }

    public void setRelativePosition(VoIPFloatingLayout voIPFloatingLayout) {
        float f;
        float f2;
        WindowInsets windowInsets;
        int systemWindowInsetBottom;
        WindowInsets windowInsets2;
        int systemWindowInsetTop;
        Object parent = getParent();
        if (parent == null) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 20 || (windowInsets2 = this.lastInsets) == null) {
            f = 0.0f;
        } else {
            systemWindowInsetTop = windowInsets2.getSystemWindowInsetTop();
            f = systemWindowInsetTop + this.topPadding;
        }
        if (i < 20 || (windowInsets = this.lastInsets) == null) {
            f2 = 0.0f;
        } else {
            systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            f2 = systemWindowInsetBottom + this.bottomPadding;
        }
        View view = (View) parent;
        setRelativePosition(Math.min(1.0f, Math.max(0.0f, (voIPFloatingLayout.getTranslationX() - this.leftPadding) / (((view.getMeasuredWidth() - this.leftPadding) - this.rightPadding) - voIPFloatingLayout.getMeasuredWidth()))), Math.min(1.0f, Math.max(0.0f, (voIPFloatingLayout.getTranslationY() - f) / (((view.getMeasuredHeight() - f2) - f) - voIPFloatingLayout.getMeasuredHeight()))));
    }

    public void setIsActive(boolean z) {
        this.active = z;
    }

    public void saveRelativePosition() {
        float f;
        float f2;
        WindowInsets windowInsets;
        int systemWindowInsetBottom;
        WindowInsets windowInsets2;
        int systemWindowInsetTop;
        if (getMeasuredWidth() > 0 && this.relativePositionToSetX < 0.0f) {
            Object parent = getParent();
            if (parent == null) {
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if (i < 20 || (windowInsets2 = this.lastInsets) == null) {
                f = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets2.getSystemWindowInsetTop();
                f = systemWindowInsetTop + this.topPadding;
            }
            if (i < 20 || (windowInsets = this.lastInsets) == null) {
                f2 = 0.0f;
            } else {
                systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
                f2 = systemWindowInsetBottom + this.bottomPadding;
            }
            View view = (View) parent;
            this.savedRelativePositionX = (getTranslationX() - this.leftPadding) / (((view.getMeasuredWidth() - this.leftPadding) - this.rightPadding) - getMeasuredWidth());
            this.savedRelativePositionY = (getTranslationY() - f) / (((view.getMeasuredHeight() - f2) - f) - getMeasuredHeight());
            this.savedRelativePositionX = Math.max(0.0f, Math.min(1.0f, this.savedRelativePositionX));
            this.savedRelativePositionY = Math.max(0.0f, Math.min(1.0f, this.savedRelativePositionY));
            return;
        }
        this.savedRelativePositionX = -1.0f;
        this.savedRelativePositionY = -1.0f;
    }

    public void restoreRelativePosition() {
        updatePadding();
        float f = this.savedRelativePositionX;
        if (f < 0.0f || this.switchingToFloatingMode) {
            return;
        }
        setRelativePositionInternal(f, this.savedRelativePositionY, getMeasuredWidth(), getMeasuredHeight(), true);
        this.savedRelativePositionX = -1.0f;
        this.savedRelativePositionY = -1.0f;
    }
}
