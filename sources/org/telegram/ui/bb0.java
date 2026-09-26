package org.telegram.ui;

import android.view.View;
public final class bb0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f32368a;

    public bb0(LaunchActivity launchActivity) {
        this.f32368a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f32368a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f31106d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f32368a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f31106d1);
    }
}
