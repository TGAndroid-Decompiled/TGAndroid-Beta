package org.telegram.ui;

import android.view.View;
public final class hb0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f34213a;

    public hb0(LaunchActivity launchActivity) {
        this.f34213a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f34213a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f30818d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f34213a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f30818d1);
    }
}
