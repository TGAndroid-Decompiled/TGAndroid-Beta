package org.telegram.ui;

import android.view.View;
public final class eb0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f33208a;

    public eb0(LaunchActivity launchActivity) {
        this.f33208a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f33208a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f31109d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f33208a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f31109d1);
    }
}
