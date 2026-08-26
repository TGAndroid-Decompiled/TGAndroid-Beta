package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Tooltip;
import org.telegram.ui.PhotoViewer$73$$ExternalSyntheticLambda0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda12;

public final class VoIPFloatingLayout extends FrameLayout {
    public boolean active;
    public boolean alwaysFloating;
    public int bottomOffset;
    public float bottomPadding;
    public VoIPFloatingLayoutDelegate delegate;
    public boolean floatingMode;
    public boolean isAppearing;
    public int lastH;
    public WindowInsets lastInsets;
    public int lastW;
    public float leftPadding;
    public boolean measuredAsFloatingMode;
    public boolean moving;
    public ValueAnimator mutedAnimator;
    public final Drawable mutedDrawable;
    public final Paint mutedPaint;
    public float mutedProgress;
    public final PhotoViewer$73$$ExternalSyntheticLambda0 mutedUpdateListener;
    public float overrideCornerRadius;
    public final Path path;
    public final ChatActivity.AnonymousClass133 progressUpdateListener;
    public final RectF rectF;
    public float relativePositionToSetX;
    public float relativePositionToSetY;
    public float rightPadding;
    public float savedRelativePositionX;
    public float savedRelativePositionY;
    public boolean setedFloatingMode;
    public float starX;
    public float starY;
    public float startMovingFromX;
    public float startMovingFromY;
    public long startTime;
    public ValueAnimator switchToFloatingModeAnimator;
    public boolean switchingToFloatingMode;
    public boolean switchingToPip;
    public View.OnClickListener tapListener;
    public float toFloatingModeProgress;
    public float topPadding;
    public final float touchSlop;
    public boolean uiVisible;
    public float updatePositionFromX;
    public float updatePositionFromY;

    public final class AnonymousClass4 implements ViewTreeObserver.OnPreDrawListener {
        public final float val$fromX;
        public final float val$fromY;

        public AnonymousClass4(float f, float f2) {
            this.val$fromX = f;
            this.val$fromY = f2;
        }

        @Override
        public final boolean onPreDraw() {
            VoIPFloatingLayout voIPFloatingLayout = VoIPFloatingLayout.this;
            if (voIPFloatingLayout.measuredAsFloatingMode) {
                voIPFloatingLayout.floatingMode = false;
                voIPFloatingLayout.requestLayout();
                return false;
            }
            ValueAnimator valueAnimator = voIPFloatingLayout.switchToFloatingModeAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(voIPFloatingLayout.toFloatingModeProgress, 0.0f);
            voIPFloatingLayout.switchToFloatingModeAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(voIPFloatingLayout.progressUpdateListener);
            voIPFloatingLayout.switchToFloatingModeAnimator.setDuration(300L);
            voIPFloatingLayout.switchToFloatingModeAnimator.start();
            float measuredWidth = this.val$fromX - ((voIPFloatingLayout.getMeasuredWidth() - (voIPFloatingLayout.getMeasuredWidth() * 0.23f)) / 2.0f);
            float measuredHeight = this.val$fromY - ((voIPFloatingLayout.getMeasuredHeight() - (voIPFloatingLayout.getMeasuredHeight() * 0.23f)) / 2.0f);
            voIPFloatingLayout.getViewTreeObserver().removeOnPreDrawListener(this);
            voIPFloatingLayout.setTranslationX(measuredWidth);
            voIPFloatingLayout.setTranslationY(measuredHeight);
            voIPFloatingLayout.setScaleX(0.23f);
            voIPFloatingLayout.setScaleY(0.23f);
            voIPFloatingLayout.animate().setListener(null).cancel();
            voIPFloatingLayout.animate().setListener(new Tooltip.AnonymousClass1(this, 28)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            return false;
        }
    }

    public interface VoIPFloatingLayoutDelegate {
    }

    public VoIPFloatingLayout(Activity activity) {
        super(activity);
        this.path = new Path();
        this.rectF = new RectF();
        new Paint(1);
        Paint paint = new Paint(1);
        this.mutedPaint = paint;
        this.relativePositionToSetX = -1.0f;
        this.relativePositionToSetY = -1.0f;
        this.toFloatingModeProgress = 0.0f;
        this.mutedProgress = 0.0f;
        this.overrideCornerRadius = -1.0f;
        this.active = true;
        this.progressUpdateListener = new ChatActivity.AnonymousClass133(this, 11);
        this.mutedUpdateListener = new PhotoViewer$73$$ExternalSyntheticLambda0(this, 8);
        this.touchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        setOutlineProvider(new PremiumPreviewFragment.AnonymousClass3(this, 6));
        setClipToOutline(true);
        paint.setColor(ColorUtils.setAlphaComponent(-16777216, 102));
        this.mutedDrawable = activity.getDrawable(R.drawable.calls_mute_mini);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        VoIPFloatingLayout voIPFloatingLayout;
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
        if (this.relativePositionToSetX < 0.0f || !this.floatingMode || getMeasuredWidth() <= 0) {
            voIPFloatingLayout = this;
        } else {
            voIPFloatingLayout = this;
            voIPFloatingLayout.setRelativePositionInternal(this.relativePositionToSetX, this.relativePositionToSetY, getMeasuredWidth(), getMeasuredHeight(), false);
            voIPFloatingLayout.relativePositionToSetX = -1.0f;
            voIPFloatingLayout.relativePositionToSetY = -1.0f;
        }
        super.dispatchDraw(canvas);
        if (!voIPFloatingLayout.switchingToFloatingMode) {
            boolean z = voIPFloatingLayout.floatingMode;
            boolean z2 = voIPFloatingLayout.setedFloatingMode;
            if (z != z2) {
                setFloatingMode(z2, true);
            }
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - ((int) ((AndroidUtilities.dp(18.0f) * 1.0f) / getScaleY()));
        canvas.save();
        float f = measuredWidth;
        float f2 = measuredHeight;
        canvas.scale((1.0f / getScaleX()) * voIPFloatingLayout.toFloatingModeProgress * voIPFloatingLayout.mutedProgress, (1.0f / getScaleY()) * voIPFloatingLayout.toFloatingModeProgress * voIPFloatingLayout.mutedProgress, f, f2);
        canvas.drawCircle(f, f2, AndroidUtilities.dp(14.0f), voIPFloatingLayout.mutedPaint);
        Drawable drawable = voIPFloatingLayout.mutedDrawable;
        drawable.setBounds(zzle.m(measuredWidth, drawable), measuredHeight - (drawable.getIntrinsicHeight() / 2), (drawable.getIntrinsicWidth() / 2) + measuredWidth, (drawable.getIntrinsicHeight() / 2) + measuredHeight);
        drawable.draw(canvas);
        canvas.restore();
        if (voIPFloatingLayout.switchingToFloatingMode) {
            invalidate();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onMeasure(int i, int i2) {
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
            ((VoIPFragment$$ExternalSyntheticLambda12) voIPFloatingLayoutDelegate).f$0.currentUserTextureView.setScreenshareMiniProgress(this.toFloatingModeProgress, this.measuredAsFloatingMode);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        if (getMeasuredHeight() != this.lastH && getMeasuredWidth() != this.lastW) {
            Path path = this.path;
            path.reset();
            RectF rectF = this.rectF;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Path.Direction.CW);
            path.toggleInverseFillType();
        }
        this.lastH = getMeasuredHeight();
        this.lastW = getMeasuredWidth();
        updatePadding();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.VoIPFloatingLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void saveRelativePosition() {
        if (getMeasuredWidth() <= 0 || this.relativePositionToSetX >= 0.0f) {
            this.savedRelativePositionX = -1.0f;
            this.savedRelativePositionY = -1.0f;
            return;
        }
        Object parent = getParent();
        if (parent == null) {
            return;
        }
        WindowInsets windowInsets = this.lastInsets;
        float systemWindowInsetTop = windowInsets == null ? 0.0f : windowInsets.getSystemWindowInsetTop() + this.topPadding;
        WindowInsets windowInsets2 = this.lastInsets;
        float systemWindowInsetBottom = windowInsets2 == null ? 0.0f : windowInsets2.getSystemWindowInsetBottom() + this.bottomPadding;
        View view = (View) parent;
        this.savedRelativePositionX = (getTranslationX() - this.leftPadding) / (((view.getMeasuredWidth() - this.leftPadding) - this.rightPadding) - getMeasuredWidth());
        this.savedRelativePositionY = (getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - getMeasuredHeight());
        this.savedRelativePositionX = Math.max(0.0f, Math.min(1.0f, this.savedRelativePositionX));
        this.savedRelativePositionY = Math.max(0.0f, Math.min(1.0f, this.savedRelativePositionY));
    }

    public void setCornerRadius(float f) {
        this.overrideCornerRadius = f;
        invalidateOutline();
    }

    public void setDelegate(VoIPFloatingLayoutDelegate voIPFloatingLayoutDelegate) {
        this.delegate = voIPFloatingLayoutDelegate;
    }

    public final void setFloatingMode(boolean z, boolean z2) {
        VoIPFloatingLayout voIPFloatingLayout;
        if (getMeasuredWidth() <= 0 || getVisibility() != 0) {
            z2 = false;
        }
        if (!z2) {
            if (this.floatingMode != z) {
                this.floatingMode = z;
                this.setedFloatingMode = z;
                this.toFloatingModeProgress = z ? 1.0f : 0.0f;
                requestLayout();
                invalidateOutline();
                return;
            }
            return;
        }
        if (this.switchingToFloatingMode) {
            this.setedFloatingMode = z;
            return;
        }
        if (!z || this.floatingMode) {
            if (z || !this.floatingMode) {
                this.toFloatingModeProgress = this.floatingMode ? 1.0f : 0.0f;
                this.floatingMode = z;
                this.setedFloatingMode = z;
                requestLayout();
                return;
            }
            this.setedFloatingMode = z;
            float translationX = getTranslationX();
            float translationY = getTranslationY();
            updatePadding();
            this.floatingMode = false;
            this.switchingToFloatingMode = true;
            requestLayout();
            animate().setListener(null).cancel();
            getViewTreeObserver().addOnPreDrawListener(new AnonymousClass4(translationX, translationY));
            return;
        }
        this.floatingMode = true;
        this.setedFloatingMode = z;
        updatePadding();
        float f = this.relativePositionToSetX;
        if (f >= 0.0f) {
            voIPFloatingLayout = this;
            voIPFloatingLayout.setRelativePositionInternal(f, this.relativePositionToSetY, (int) (getMeasuredWidth() * 0.23f), (int) (getMeasuredHeight() * 0.23f), false);
        } else {
            voIPFloatingLayout = this;
        }
        voIPFloatingLayout.floatingMode = false;
        voIPFloatingLayout.switchingToFloatingMode = true;
        float translationX2 = getTranslationX();
        float translationY2 = getTranslationY();
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        invalidate();
        ValueAnimator valueAnimator = voIPFloatingLayout.switchToFloatingModeAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(voIPFloatingLayout.toFloatingModeProgress, 1.0f);
        voIPFloatingLayout.switchToFloatingModeAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(voIPFloatingLayout.progressUpdateListener);
        voIPFloatingLayout.switchToFloatingModeAnimator.setDuration(300L);
        voIPFloatingLayout.switchToFloatingModeAnimator.start();
        animate().setListener(null).cancel();
        ViewPropertyAnimator duration = animate().scaleX(0.23f).scaleY(0.23f).translationX(translationX2 - ((getMeasuredWidth() - (getMeasuredWidth() * 0.23f)) / 2.0f)).translationY(translationY2 - ((getMeasuredHeight() - (getMeasuredHeight() * 0.23f)) / 2.0f)).alpha(1.0f).setStartDelay(0L).setDuration(300L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        duration.setInterpolator(cubicBezierInterpolator).setListener(new FactorAnimator.AnonymousClass1(this, translationX2, translationY2, 1)).setInterpolator(cubicBezierInterpolator).start();
    }

    public void setInsets(WindowInsets windowInsets) {
        this.lastInsets = windowInsets;
    }

    public void setIsActive(boolean z) {
        this.active = z;
    }

    public void setOnTapListener(View.OnClickListener onClickListener) {
        this.tapListener = onClickListener;
    }

    public final void setRelativePosition(float f, float f2) {
        Object parent = getParent();
        if (this.floatingMode && parent != null && ((View) parent).getMeasuredWidth() <= 0 && getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
            setRelativePositionInternal(f, f2, getMeasuredWidth(), getMeasuredHeight(), true);
        } else {
            this.relativePositionToSetX = f;
            this.relativePositionToSetY = f2;
        }
    }

    public final void setRelativePositionInternal(float f, float f2, int i, int i2, boolean z) {
        Object parent = getParent();
        if (parent == null || !this.floatingMode || this.switchingToFloatingMode || !this.active) {
            return;
        }
        WindowInsets windowInsets = this.lastInsets;
        float systemWindowInsetTop = windowInsets == null ? 0.0f : windowInsets.getSystemWindowInsetTop() + this.topPadding;
        WindowInsets windowInsets2 = this.lastInsets;
        float systemWindowInsetBottom = windowInsets2 != null ? windowInsets2.getSystemWindowInsetBottom() + this.bottomPadding : 0.0f;
        View view = (View) parent;
        float fM = DiffUtil.m((view.getMeasuredWidth() - this.leftPadding) - this.rightPadding, i, f, this.leftPadding);
        float fM2 = DiffUtil.m((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop, i2, f2, systemWindowInsetTop);
        if (z) {
            animate().setListener(null).cancel();
            animate().scaleX(1.0f).scaleY(1.0f).translationX(fM).translationY(fM2).alpha(1.0f).setStartDelay(this.uiVisible ? 0L : 150L).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            return;
        }
        if (!this.alwaysFloating) {
            animate().setListener(null).cancel();
            setScaleX(1.0f);
            setScaleY(1.0f);
            animate().alpha(1.0f).setDuration(150L).start();
        }
        setTranslationX(fM);
        setTranslationY(fM2);
    }

    public void setUiVisible(boolean z) {
        if (getParent() == null) {
            this.uiVisible = z;
        } else {
            this.uiVisible = z;
        }
    }

    public final void updatePadding() {
        this.leftPadding = AndroidUtilities.dp(16.0f);
        this.rightPadding = AndroidUtilities.dp(16.0f);
        this.topPadding = this.uiVisible ? AndroidUtilities.dp(60.0f) : AndroidUtilities.dp(16.0f);
        this.bottomPadding = AndroidUtilities.dp(this.uiVisible ? 100.0f : 16.0f) + this.bottomOffset;
    }

    public void setRelativePosition(VoIPFloatingLayout voIPFloatingLayout) {
        Object parent = getParent();
        if (parent == null) {
            return;
        }
        WindowInsets windowInsets = this.lastInsets;
        float systemWindowInsetTop = windowInsets == null ? 0.0f : windowInsets.getSystemWindowInsetTop() + this.topPadding;
        WindowInsets windowInsets2 = this.lastInsets;
        View view = (View) parent;
        setRelativePosition(Math.min(1.0f, Math.max(0.0f, (voIPFloatingLayout.getTranslationX() - this.leftPadding) / (((view.getMeasuredWidth() - this.leftPadding) - this.rightPadding) - voIPFloatingLayout.getMeasuredWidth()))), Math.min(1.0f, Math.max(0.0f, (voIPFloatingLayout.getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - (windowInsets2 == null ? 0.0f : windowInsets2.getSystemWindowInsetBottom() + this.bottomPadding)) - systemWindowInsetTop) - voIPFloatingLayout.getMeasuredHeight()))));
    }
}
