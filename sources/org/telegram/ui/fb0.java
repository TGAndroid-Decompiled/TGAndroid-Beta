package org.telegram.ui;

import android.view.View;
public final class fb0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f36239a;

    public fb0(LaunchActivity launchActivity) {
        this.f36239a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f36239a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f33775d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f36239a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f33775d1);
    }
}
