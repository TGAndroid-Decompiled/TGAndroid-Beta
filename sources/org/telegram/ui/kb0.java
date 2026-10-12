package org.telegram.ui;

import android.view.View;
public final class kb0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f37616a;

    public kb0(LaunchActivity launchActivity) {
        this.f37616a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f37616a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f32110d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f37616a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f32110d1);
    }
}
