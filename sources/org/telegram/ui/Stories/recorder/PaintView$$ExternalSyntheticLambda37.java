package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.CubicBezierInterpolator;

public final class PaintView$$ExternalSyntheticLambda37 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final View f$0;
    public final Object f$1;
    public final Object f$2;

    public PaintView$$ExternalSyntheticLambda37(int i, View view, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = view;
        this.f$1 = obj;
        this.f$2 = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.$r8$classId) {
            case 0:
                PaintView paintView = (PaintView) this.f$0;
                paintView.getClass();
                paintView.tabsSelectionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paintView.tabsLayout.invalidate();
                paintView.bottomLayout.invalidate();
                paintView.overlayLayout.invalidate();
                int i = 0;
                while (i < paintView.tabsLayout.getChildCount()) {
                    paintView.tabsLayout.getChildAt(i).setAlpha(((i == paintView.tabsNewSelectedIndex ? paintView.tabsSelectionProgress : i == paintView.tabsSelectedIndex ? 1.0f - paintView.tabsSelectionProgress : 0.0f) * 0.4f) + 0.6f);
                    i++;
                }
                float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(paintView.tabsSelectionProgress);
                ViewGroup viewGroup2 = (ViewGroup) this.f$1;
                if (viewGroup2 != null && (viewGroup = (ViewGroup) this.f$2) != null) {
                    float f = 1.0f - interpolation;
                    float f2 = (f * 0.4f) + 0.6f;
                    viewGroup2.setScaleX(f2);
                    viewGroup2.setScaleY(f2);
                    viewGroup2.setTranslationY((Math.min(interpolation, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    viewGroup2.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
                    float f3 = (interpolation * 0.4f) + 0.6f;
                    viewGroup.setScaleX(f3);
                    viewGroup.setScaleY(f3);
                    viewGroup.setTranslationY((Math.min(f, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
                    viewGroup.setAlpha(1.0f - (Math.min(f, 0.25f) / 0.25f));
                    break;
                }
                break;
            default:
                ToggleButton2 toggleButton2 = (ToggleButton2) this.f$0;
                toggleButton2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(fFloatValue - 0.5f);
                if (fFloatValue >= 0.5f) {
                    AtomicBoolean atomicBoolean = (AtomicBoolean) this.f$1;
                    if (!atomicBoolean.get()) {
                        atomicBoolean.set(true);
                        toggleButton2.setDrawable((CollageLayoutButton.CollageLayoutDrawable) this.f$2);
                    }
                }
                break;
        }
    }
}
