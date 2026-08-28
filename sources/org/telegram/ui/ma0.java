package org.telegram.ui;

import android.view.View;
public final class ma0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f40372a;

    public ma0(LaunchActivity launchActivity) {
        this.f40372a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f40372a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.Z0);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f40372a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.Z0);
    }
}
