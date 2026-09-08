package org.telegram.ui;

import android.view.View;
public final class hb0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f36972a;

    public hb0(LaunchActivity launchActivity) {
        this.f36972a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f36972a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f33457d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f36972a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f33457d1);
    }
}
