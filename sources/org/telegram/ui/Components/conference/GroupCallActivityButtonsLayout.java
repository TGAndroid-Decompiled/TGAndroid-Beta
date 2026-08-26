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
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.voip.VoIPToggleButton;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda9;

public abstract class GroupCallActivityButtonsLayout extends ViewGroup {
    private static final int BUTTON_HEIGHT = 76;
    private static final int BUTTON_WIDTH = 50;
    private final LinkedHashMap<View, ButtonHolder> holders;
    private int lastHeight;
    private int lastWidth;

    public final class ButtonHolder implements FactorAnimator.Target {
        public final BoolAnimator enabled;
        public final GiftSheet$$ExternalSyntheticLambda9 invalidateRunnable;
        public boolean isVisible;
        public final VoIPToggleButton view;
        public final BoolAnimator visibility;
        public final FactorAnimator xAnimator;
        public final FactorAnimator yAnimator;

        public ButtonHolder(VoIPToggleButton voIPToggleButton, GiftSheet$$ExternalSyntheticLambda9 giftSheet$$ExternalSyntheticLambda9) {
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.xAnimator = new FactorAnimator(1, this, cubicBezierInterpolator, 350L);
            this.yAnimator = new FactorAnimator(2, this, cubicBezierInterpolator, 350L);
            this.visibility = new BoolAnimator(0, this, cubicBezierInterpolator, 350L, true);
            this.enabled = new BoolAnimator(3, this, cubicBezierInterpolator, 350L, true);
            this.isVisible = true;
            this.view = voIPToggleButton;
            this.invalidateRunnable = giftSheet$$ExternalSyntheticLambda9;
        }

        @Override
        public final void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        }

        @Override
        public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
            VoIPToggleButton voIPToggleButton = this.view;
            if (i == 1) {
                voIPToggleButton.setTranslationX(this.xAnimator.factor);
            }
            if (i == 2) {
                voIPToggleButton.setTranslationY(this.yAnimator.factor);
            }
            BoolAnimator boolAnimator = this.enabled;
            BoolAnimator boolAnimator2 = this.visibility;
            if (i == 0) {
                voIPToggleButton.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, boolAnimator.floatValue) * boolAnimator2.floatValue);
                voIPToggleButton.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f));
                voIPToggleButton.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f));
                voIPToggleButton.setVisibility(f > 0.0f ? 0 : 8);
            }
            if (i == 3) {
                voIPToggleButton.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, boolAnimator.floatValue) * boolAnimator2.floatValue);
            }
            GiftSheet$$ExternalSyntheticLambda9 giftSheet$$ExternalSyntheticLambda9 = this.invalidateRunnable;
            if (giftSheet$$ExternalSyntheticLambda9 != null) {
                giftSheet$$ExternalSyntheticLambda9.run();
            }
        }
    }

    public GroupCallActivityButtonsLayout(Context context) {
        super(context);
        this.holders = new LinkedHashMap<>(16);
    }

    public void addButton(VoIPToggleButton voIPToggleButton) {
        addView(voIPToggleButton);
        this.holders.put(voIPToggleButton, new ButtonHolder(voIPToggleButton, new GiftSheet$$ExternalSyntheticLambda9(this, 8)));
    }

    public final void doLayout(boolean z, boolean z2) {
        int iMin;
        int i;
        FactorAnimator factorAnimator;
        int measuredWidth;
        int measuredHeight;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        boolean z3 = measuredWidth2 <= measuredHeight2;
        if (measuredWidth2 <= 0 || measuredHeight2 <= 0) {
            return;
        }
        Iterator<ButtonHolder> it = this.holders.values().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().isVisible) {
                i2++;
            }
        }
        if (i2 == 0) {
            i2 = 1;
        }
        if (z3) {
            iMin = Math.min(AndroidUtilities.dp(50.0f) + Math.max((int) (OKLCH.m$3(50.0f, i2, measuredHeight2) / (i2 + 0.333f)), 0), measuredHeight2 / i2);
            i = (measuredHeight2 - (i2 * iMin)) / 2;
        } else {
            int iMin2 = Math.min(AndroidUtilities.dp(50.0f) + Math.max((int) (OKLCH.m$3(50.0f, i2, measuredWidth2) / (i2 + 0.333f)), 0), measuredWidth2 / i2);
            iMin = AndroidUtilities.dp(76.0f);
            i = (measuredWidth2 - (i2 * iMin2)) / 2;
            measuredWidth2 = iMin2;
        }
        Iterator<Map.Entry<View, ButtonHolder>> it2 = this.holders.entrySet().iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            ButtonHolder value = it2.next().getValue();
            boolean z4 = value.isVisible;
            BoolAnimator boolAnimator = value.visibility;
            if (z4) {
                VoIPToggleButton voIPToggleButton = value.view;
                if (z3) {
                    measuredWidth = ((measuredWidth2 - voIPToggleButton.getMeasuredWidth()) / 2) + (getMeasuredWidth() - measuredWidth2);
                    measuredHeight = (iMin * i3) + i;
                } else {
                    measuredWidth = ((measuredWidth2 - voIPToggleButton.getMeasuredWidth()) / 2) + (measuredWidth2 * i3) + i;
                    measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(76.0f);
                }
                FactorAnimator factorAnimator2 = value.xAnimator;
                if (z2 || !((z || factorAnimator2.isAnimating) && boolAnimator.value)) {
                    factorAnimator2.forceFactor(measuredWidth);
                } else {
                    factorAnimator2.animateTo(measuredWidth);
                }
                FactorAnimator factorAnimator3 = value.yAnimator;
                if (z2 || !((z || factorAnimator3.isAnimating) && boolAnimator.value)) {
                    factorAnimator3.forceFactor(measuredHeight);
                } else {
                    factorAnimator3.animateTo(measuredHeight);
                }
                i3++;
            }
            boolAnimator.setValue(value.isVisible, !z2 && (z || ((factorAnimator = boolAnimator.animator) != null && factorAnimator.isAnimating)));
        }
        invalidate();
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        if (this.lastWidth == size && this.lastHeight == size2) {
            doLayout(true, false);
            return;
        }
        doLayout(false, true);
        this.lastWidth = size;
        this.lastHeight = size2;
    }

    public void removeButton(VoIPToggleButton voIPToggleButton) {
        removeView(voIPToggleButton);
        this.holders.remove(voIPToggleButton);
    }

    public void setButtonEnabled(VoIPToggleButton voIPToggleButton, boolean z, boolean z2) {
        ButtonHolder buttonHolder = this.holders.get(voIPToggleButton);
        if (buttonHolder != null) {
            buttonHolder.enabled.setValue(z, z2);
            voIPToggleButton.setEnabled(z);
        }
    }

    public void setButtonVisibility(VoIPToggleButton voIPToggleButton, boolean z, boolean z2) {
        ButtonHolder buttonHolder = this.holders.get(voIPToggleButton);
        if (buttonHolder == null || buttonHolder.isVisible == z) {
            return;
        }
        buttonHolder.isVisible = z;
        doLayout(z2, false);
    }
}
