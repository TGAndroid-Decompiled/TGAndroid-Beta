package org.telegram.ui;

import android.view.View;
public final class fb0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f36244a;

    public fb0(LaunchActivity launchActivity) {
        this.f36244a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f36244a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f33781d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f36244a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f33781d1);
    }
}
