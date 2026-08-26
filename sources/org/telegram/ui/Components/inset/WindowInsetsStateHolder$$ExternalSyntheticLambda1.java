package org.telegram.ui.Components.inset;

import android.graphics.RectF;
import android.view.View;
import androidx.core.view.ViewCompat;

public final class WindowInsetsStateHolder$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final WindowInsetsStateHolder f$0;

    public WindowInsetsStateHolder$$ExternalSyntheticLambda1(WindowInsetsStateHolder windowInsetsStateHolder, int i) {
        this.$r8$classId = i;
        this.f$0 = windowInsetsStateHolder;
    }

    @Override
    public final void run() {
        WindowInsetsStateHolder windowInsetsStateHolder = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                if (windowInsetsStateHolder.inAppKeyboardHeight != 0) {
                    windowInsetsStateHolder.resetInAppKeyboardHeight(false);
                }
                break;
            default:
                int i = windowInsetsStateHolder.activeAnimations - 1;
                windowInsetsStateHolder.activeAnimations = i;
                if (i == 0) {
                    View view = windowInsetsStateHolder.animatedInsetsProviderTarget;
                    RectF rectF = WindowAnimatedInsetsProvider.tmpRectF;
                    windowInsetsStateHolder.setInsets(WindowAnimatedInsetsProvider.calculateWindowInsets(ViewCompat.getRootWindowInsets(view), view, view.getRootView()), false);
                }
                break;
        }
    }
}
