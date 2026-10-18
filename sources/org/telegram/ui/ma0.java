package org.telegram.ui;

import android.view.View;
public final class ma0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f39105a;

    public ma0(LaunchActivity launchActivity) {
        this.f39105a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f39105a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f33157d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f39105a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f33157d1);
    }
}
