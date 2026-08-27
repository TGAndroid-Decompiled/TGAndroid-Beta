package org.telegram.ui;

import android.view.View;

public final class qa0 implements View.OnAttachStateChangeListener {

    public final LaunchActivity f41588a;

    public qa0(LaunchActivity launchActivity) {
        this.f41588a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f41588a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.Z0);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f41588a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.Z0);
    }
}
