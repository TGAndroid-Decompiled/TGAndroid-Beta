package org.telegram.ui;

import android.view.View;
public final class q80 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f48814a;

    public q80(LaunchActivity launchActivity) {
        this.f48814a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f48814a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f41294f1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f48814a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f41294f1);
    }
}
