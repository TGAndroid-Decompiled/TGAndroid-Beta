package org.telegram.ui;

import android.view.View;
public final class fb0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f36258a;

    public fb0(LaunchActivity launchActivity) {
        this.f36258a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f36258a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f33794d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f36258a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f33794d1);
    }
}
