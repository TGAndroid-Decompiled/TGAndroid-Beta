package org.telegram.ui;

import android.os.Build;
import java.util.ArrayList;
public final class hi0 {
    public final LaunchActivity f48404a;
    public final ArrayList f48405b = new ArrayList();
    public int f48406c = Integer.MIN_VALUE;

    public hi0(LaunchActivity launchActivity) {
        this.f48404a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.f48405b.isEmpty();
        LaunchActivity launchActivity = this.f48404a;
        try {
            if (!isEmpty && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (Build.VERSION.SDK_INT < 24 || !launchActivity.isInMultiWindowMode())) {
                if (this.f48406c == Integer.MIN_VALUE) {
                    this.f48406c = launchActivity.getRequestedOrientation();
                }
                if (launchActivity.getRequestedOrientation() != 1) {
                    launchActivity.setRequestedOrientation(1);
                    return;
                }
                return;
            }
            int i7 = this.f48406c;
            if (i7 != Integer.MIN_VALUE) {
                launchActivity.setRequestedOrientation(i7);
                this.f48406c = Integer.MIN_VALUE;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
