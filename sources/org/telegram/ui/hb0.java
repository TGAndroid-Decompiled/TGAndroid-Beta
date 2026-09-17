package org.telegram.ui;

import android.view.View;
public final class hb0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f36946a;

    public hb0(LaunchActivity launchActivity) {
        this.f36946a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f36946a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f33431d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f36946a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f33431d1);
    }
}
