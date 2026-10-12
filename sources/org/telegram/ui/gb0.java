package org.telegram.ui;

import android.view.View;
public final class gb0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f37993a;

    public gb0(LaunchActivity launchActivity) {
        this.f37993a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f37993a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f33623d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f37993a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f33623d1);
    }
}
