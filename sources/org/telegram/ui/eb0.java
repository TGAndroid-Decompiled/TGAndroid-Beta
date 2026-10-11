package org.telegram.ui;

import android.view.View;
public final class eb0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f37294a;

    public eb0(LaunchActivity launchActivity) {
        this.f37294a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f37294a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f33846d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f37294a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f33846d1);
    }
}
