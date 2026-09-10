package org.telegram.ui;

import android.view.View;
public final class hb0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f33339a;

    public hb0(LaunchActivity launchActivity) {
        this.f33339a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f33339a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f29934d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f33339a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f29934d1);
    }
}
