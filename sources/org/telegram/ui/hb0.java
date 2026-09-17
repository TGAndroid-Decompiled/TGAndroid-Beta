package org.telegram.ui;

import android.view.View;
public final class hb0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f36973a;

    public hb0(LaunchActivity launchActivity) {
        this.f36973a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f36973a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f33458d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f36973a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f33458d1);
    }
}
