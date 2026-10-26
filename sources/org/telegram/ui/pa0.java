package org.telegram.ui;

import android.view.View;
public final class pa0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f42415a;

    public pa0(LaunchActivity launchActivity) {
        this.f42415a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f42415a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f35532e1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f42415a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f35532e1);
    }
}
