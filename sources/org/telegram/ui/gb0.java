package org.telegram.ui;

import android.view.View;
public final class gb0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f37995a;

    public gb0(LaunchActivity launchActivity) {
        this.f37995a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f37995a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f33621d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f37995a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f33621d1);
    }
}
