package org.telegram.ui;

import android.view.View;
public final class fb0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f37551a;

    public fb0(LaunchActivity launchActivity) {
        this.f37551a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f37551a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f33822d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f37551a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f33822d1);
    }
}
