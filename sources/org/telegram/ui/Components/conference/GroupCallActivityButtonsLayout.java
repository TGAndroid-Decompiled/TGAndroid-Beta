package org.telegram.ui.Components.conference;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.voip.VoIPToggleButton;

public abstract class GroupCallActivityButtonsLayout extends ViewGroup {
    private final LinkedHashMap holders;
    private int lastHeight;
    private int lastWidth;

    public GroupCallActivityButtonsLayout(Context context) {
        super(context);
        this.holders = new LinkedHashMap(16);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        if (this.lastWidth != size || this.lastHeight != size2) {
            doLayout(false, true);
            this.lastWidth = size;
            this.lastHeight = size2;
            return;
        }
        doLayout(true, false);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    public void addButton(VoIPToggleButton voIPToggleButton) {
        addView(voIPToggleButton);
        this.holders.put(voIPToggleButton, new ButtonHolder(voIPToggleButton, new Runnable() {
            @Override
            public final void run() {
                this.f$0.invalidate();
            }
        }));
    }

    public void setButtonVisibility(VoIPToggleButton voIPToggleButton, boolean z, boolean z2) {
        ButtonHolder buttonHolder = (ButtonHolder) this.holders.get(voIPToggleButton);
        if (buttonHolder == null || buttonHolder.isVisible == z) {
            return;
        }
        buttonHolder.isVisible = z;
        doLayout(z2, false);
    }

    public void setButtonEnabled(VoIPToggleButton voIPToggleButton, boolean z, boolean z2) {
        ButtonHolder buttonHolder = (ButtonHolder) this.holders.get(voIPToggleButton);
        if (buttonHolder != null) {
            buttonHolder.enabled.setValue(z, z2);
            voIPToggleButton.setEnabled(z);
        }
    }

    private void doLayout(boolean z, boolean z2) {
        int iMin;
        int i;
        int measuredWidth;
        int measuredHeight;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        boolean z3 = measuredWidth2 <= measuredHeight2;
        if (measuredWidth2 <= 0 || measuredHeight2 <= 0) {
            return;
        }
        Iterator it = this.holders.values().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((ButtonHolder) it.next()).isVisible) {
                i2++;
            }
        }
        if (i2 == 0) {
            i2 = 1;
        }
        if (!z3) {
            int iMin2 = Math.min(AndroidUtilities.dp(50.0f) + Math.max((int) ((measuredWidth2 - (AndroidUtilities.dp(50.0f) * i2)) / (i2 + 0.333f)), 0), measuredWidth2 / i2);
            iMin = AndroidUtilities.dp(76.0f);
            i = (measuredWidth2 - (i2 * iMin2)) / 2;
            measuredWidth2 = iMin2;
        } else {
            iMin = Math.min(AndroidUtilities.dp(50.0f) + Math.max((int) ((measuredHeight2 - (AndroidUtilities.dp(50.0f) * i2)) / (i2 + 0.333f)), 0), measuredHeight2 / i2);
            i = (measuredHeight2 - (i2 * iMin)) / 2;
        }
        Iterator it2 = this.holders.entrySet().iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            ButtonHolder buttonHolder = (ButtonHolder) ((Map.Entry) it2.next()).getValue();
            if (buttonHolder.isVisible) {
                if (!z3) {
                    measuredWidth = (measuredWidth2 * i3) + i + ((measuredWidth2 - buttonHolder.view.getMeasuredWidth()) / 2);
                    measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(76.0f);
                } else {
                    measuredWidth = (getMeasuredWidth() - measuredWidth2) + ((measuredWidth2 - buttonHolder.view.getMeasuredWidth()) / 2);
                    measuredHeight = (iMin * i3) + i;
                }
                if (!z2 && ((z || buttonHolder.xAnimator.isAnimating()) && buttonHolder.visibility.getValue())) {
                    buttonHolder.xAnimator.animateTo(measuredWidth);
                } else {
                    buttonHolder.xAnimator.forceFactor(measuredWidth);
                }
                if (!z2 && ((z || buttonHolder.yAnimator.isAnimating()) && buttonHolder.visibility.getValue())) {
                    buttonHolder.yAnimator.animateTo(measuredHeight);
                } else {
                    buttonHolder.yAnimator.forceFactor(measuredHeight);
                }
                i3++;
            }
            buttonHolder.visibility.setValue(buttonHolder.isVisible, !z2 && (z || buttonHolder.visibility.isAnimating()));
        }
        invalidate();
    }

    private static class ButtonHolder implements FactorAnimator.Target {
        public final BoolAnimator enabled;
        private final Runnable invalidateRunnable;
        private boolean isVisible;
        public final VoIPToggleButton view;
        public final BoolAnimator visibility;
        public final FactorAnimator xAnimator;
        public final FactorAnimator yAnimator;

        @Override
        public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
            FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
        }

        private ButtonHolder(VoIPToggleButton voIPToggleButton, Runnable runnable) {
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.xAnimator = new FactorAnimator(1, this, cubicBezierInterpolator, 350L);
            this.yAnimator = new FactorAnimator(2, this, cubicBezierInterpolator, 350L);
            this.visibility = new BoolAnimator(0, this, cubicBezierInterpolator, 350L, true);
            this.enabled = new BoolAnimator(3, this, cubicBezierInterpolator, 350L, true);
            this.isVisible = true;
            this.view = voIPToggleButton;
            this.invalidateRunnable = runnable;
        }

        @Override
        public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
            if (i == 1) {
                this.view.setTranslationX(this.xAnimator.getFactor());
            }
            if (i == 2) {
                this.view.setTranslationY(this.yAnimator.getFactor());
            }
            if (i == 0) {
                this.view.setAlpha(this.visibility.getFloatValue() * AndroidUtilities.lerp(0.5f, 1.0f, this.enabled.getFloatValue()));
                this.view.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f));
                this.view.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f));
                this.view.setVisibility(f > 0.0f ? 0 : 8);
            }
            if (i == 3) {
                this.view.setAlpha(this.visibility.getFloatValue() * AndroidUtilities.lerp(0.5f, 1.0f, this.enabled.getFloatValue()));
            }
            Runnable runnable = this.invalidateRunnable;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
