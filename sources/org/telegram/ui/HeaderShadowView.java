package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.Components.CubicBezierInterpolator;

public class HeaderShadowView extends View implements FactorAnimator.Target {
    private final INavigationLayout iNavigationLayout;
    private final BoolAnimator shadowVisible;

    public HeaderShadowView(Context context, INavigationLayout iNavigationLayout) {
        super(context);
        this.shadowVisible = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L, true);
        this.iNavigationLayout = iNavigationLayout;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        INavigationLayout iNavigationLayout = this.iNavigationLayout;
        iNavigationLayout.getClass();
        ((ActionBarLayout) iNavigationLayout).drawHeaderShadow(canvas, 255, 0);
    }

    public boolean isShadowVisible() {
        return this.shadowVisible.value;
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        setVisibility(f > 0.0f ? 0 : 8);
        setAlpha(f);
    }

    public void setShadowVisible(boolean z, boolean z2) {
        this.shadowVisible.setValue(z, z2);
    }
}
