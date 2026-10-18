package org.telegram.ui;

import android.view.View;
public final class ma0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f39061a;

    public ma0(LaunchActivity launchActivity) {
        this.f39061a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f39061a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f33150d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f39061a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f33150d1);
    }
}
