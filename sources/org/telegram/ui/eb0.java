package org.telegram.ui;

import android.view.View;
public final class eb0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f37260a;

    public eb0(LaunchActivity launchActivity) {
        this.f37260a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f37260a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f33812d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f37260a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f33812d1);
    }
}
