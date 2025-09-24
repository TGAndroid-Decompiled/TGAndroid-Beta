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
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(68.0f), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(makeMeasureSpec, makeMeasureSpec2);
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
                GroupCallActivityButtonsLayout.this.invalidate();
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

    private void doLayout(boolean z, boolean z2) {
        int min;
        int i;
        int measuredWidth;
        int i2;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        boolean z3 = measuredWidth2 <= measuredHeight;
        if (measuredWidth2 <= 0 || measuredHeight <= 0) {
            return;
        }
        Iterator it = this.holders.values().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (((ButtonHolder) it.next()).isVisible) {
                i3++;
            }
        }
        if (i3 == 0) {
            i3 = 1;
        }
        if (!z3) {
            int min2 = Math.min(AndroidUtilities.dp(50.0f) + Math.max((int) ((measuredWidth2 - (AndroidUtilities.dp(50.0f) * i3)) / (i3 + 0.333f)), 0), measuredWidth2 / i3);
            min = AndroidUtilities.dp(76.0f);
            i = (measuredWidth2 - (i3 * min2)) / 2;
            measuredWidth2 = min2;
        } else {
            min = Math.min(AndroidUtilities.dp(50.0f) + Math.max((int) ((measuredHeight - (AndroidUtilities.dp(50.0f) * i3)) / (i3 + 0.333f)), 0), measuredHeight / i3);
            i = (measuredHeight - (i3 * min)) / 2;
        }
        Iterator it2 = this.holders.entrySet().iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            ButtonHolder buttonHolder = (ButtonHolder) ((Map.Entry) it2.next()).getValue();
            if (buttonHolder.isVisible) {
                if (!z3) {
                    measuredWidth = (measuredWidth2 * i4) + i + ((measuredWidth2 - AndroidUtilities.dp(68.0f)) / 2);
                    i2 = getMeasuredHeight() - AndroidUtilities.dp(76.0f);
                } else {
                    measuredWidth = (getMeasuredWidth() - measuredWidth2) + ((measuredWidth2 - AndroidUtilities.dp(68.0f)) / 2);
                    i2 = (min * i4) + i;
                }
                if (!z2 && ((z || buttonHolder.xAnimator.isAnimating()) && buttonHolder.visibility.getValue())) {
                    buttonHolder.xAnimator.animateTo(measuredWidth);
                } else {
                    buttonHolder.xAnimator.forceFactor(measuredWidth);
                }
                if (!z2 && ((z || buttonHolder.yAnimator.isAnimating()) && buttonHolder.visibility.getValue())) {
                    buttonHolder.yAnimator.animateTo(i2);
                } else {
                    buttonHolder.yAnimator.forceFactor(i2);
                }
                i4++;
            }
            buttonHolder.visibility.setValue(buttonHolder.isVisible, !z2 && (z || buttonHolder.visibility.isAnimating()));
        }
        invalidate();
    }

    public static class ButtonHolder implements FactorAnimator.Target {
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
                this.view.setAlpha(f);
                this.view.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f));
                this.view.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f));
                this.view.setVisibility(f > 0.0f ? 0 : 8);
            }
            Runnable runnable = this.invalidateRunnable;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
