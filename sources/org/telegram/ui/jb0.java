package org.telegram.ui;

import android.view.View;
public final class jb0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f37008a;

    public jb0(LaunchActivity launchActivity) {
        this.f37008a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f37008a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f31812d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f37008a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f31812d1);
    }
}
