package org.telegram.ui;

import android.view.View;
public final class qa0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f40755a;

    public qa0(LaunchActivity launchActivity) {
        this.f40755a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f40755a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f33468e1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f40755a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f33468e1);
    }
}
