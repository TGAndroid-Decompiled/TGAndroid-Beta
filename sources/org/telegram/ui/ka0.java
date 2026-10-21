package org.telegram.ui;

import android.view.View;
public final class ka0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f38500a;

    public ka0(LaunchActivity launchActivity) {
        this.f38500a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f38500a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f33163d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f38500a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f33163d1);
    }
}
