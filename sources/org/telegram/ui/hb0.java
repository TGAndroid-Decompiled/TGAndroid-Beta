package org.telegram.ui;

import android.view.View;
public final class hb0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f36945a;

    public hb0(LaunchActivity launchActivity) {
        this.f36945a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f36945a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f33430d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f36945a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f33430d1);
    }
}
