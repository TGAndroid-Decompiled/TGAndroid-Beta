package org.telegram.ui;

import android.view.View;
public final class jb0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f34912a;

    public jb0(LaunchActivity launchActivity) {
        this.f34912a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f34912a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f31126d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f34912a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f31126d1);
    }
}
