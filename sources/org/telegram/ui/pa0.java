package org.telegram.ui;

import android.view.View;
public final class pa0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f41345a;

    public pa0(LaunchActivity launchActivity) {
        this.f41345a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f41345a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.Z0);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f41345a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.Z0);
    }
}
