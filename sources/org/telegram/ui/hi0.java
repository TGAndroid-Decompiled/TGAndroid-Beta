package org.telegram.ui;

import android.os.Build;
import java.util.ArrayList;
public final class hi0 {
    public final LaunchActivity f48361a;
    public final ArrayList f48362b = new ArrayList();
    public int f48363c = Integer.MIN_VALUE;

    public hi0(LaunchActivity launchActivity) {
        this.f48361a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.f48362b.isEmpty();
        LaunchActivity launchActivity = this.f48361a;
        try {
            if (!isEmpty && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (Build.VERSION.SDK_INT < 24 || !launchActivity.isInMultiWindowMode())) {
                if (this.f48363c == Integer.MIN_VALUE) {
                    this.f48363c = launchActivity.getRequestedOrientation();
                }
                if (launchActivity.getRequestedOrientation() != 1) {
                    launchActivity.setRequestedOrientation(1);
                    return;
                }
                return;
            }
            int i7 = this.f48363c;
            if (i7 != Integer.MIN_VALUE) {
                launchActivity.setRequestedOrientation(i7);
                this.f48363c = Integer.MIN_VALUE;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
