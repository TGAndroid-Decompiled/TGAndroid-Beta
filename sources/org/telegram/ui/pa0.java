package org.telegram.ui;

import android.view.View;
public final class pa0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f42412a;

    public pa0(LaunchActivity launchActivity) {
        this.f42412a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f42412a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f35529e1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f42412a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f35529e1);
    }
}
