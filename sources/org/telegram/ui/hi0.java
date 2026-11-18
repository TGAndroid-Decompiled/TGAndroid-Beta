package org.telegram.ui;

import android.os.Build;
import java.util.ArrayList;
public final class hi0 {
    public final LaunchActivity f48405a;
    public final ArrayList f48406b = new ArrayList();
    public int f48407c = Integer.MIN_VALUE;

    public hi0(LaunchActivity launchActivity) {
        this.f48405a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.f48406b.isEmpty();
        LaunchActivity launchActivity = this.f48405a;
        try {
            if (!isEmpty && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (Build.VERSION.SDK_INT < 24 || !launchActivity.isInMultiWindowMode())) {
                if (this.f48407c == Integer.MIN_VALUE) {
                    this.f48407c = launchActivity.getRequestedOrientation();
                }
                if (launchActivity.getRequestedOrientation() != 1) {
                    launchActivity.setRequestedOrientation(1);
                    return;
                }
                return;
            }
            int i7 = this.f48407c;
            if (i7 != Integer.MIN_VALUE) {
                launchActivity.setRequestedOrientation(i7);
                this.f48407c = Integer.MIN_VALUE;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
