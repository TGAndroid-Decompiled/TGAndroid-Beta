package org.telegram.ui;

import android.view.View;
public final class cb0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f32302a;

    public cb0(LaunchActivity launchActivity) {
        this.f32302a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f32302a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f30792d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f32302a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f30792d1);
    }
}
