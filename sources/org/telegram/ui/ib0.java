package org.telegram.ui;

import android.view.View;
public final class ib0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f34484a;

    public ib0(LaunchActivity launchActivity) {
        this.f34484a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f34484a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f31065d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f34484a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f31065d1);
    }
}
