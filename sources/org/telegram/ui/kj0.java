package org.telegram.ui;

import android.os.Build;
import java.util.ArrayList;
public final class kj0 {
    public final LaunchActivity f38878a;
    public final ArrayList f38879b = new ArrayList();
    public int f38880c = Integer.MIN_VALUE;

    public kj0(LaunchActivity launchActivity) {
        this.f38878a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.f38879b.isEmpty();
        LaunchActivity launchActivity = this.f38878a;
        try {
            if (!isEmpty && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (Build.VERSION.SDK_INT < 24 || !launchActivity.isInMultiWindowMode())) {
                if (this.f38880c == Integer.MIN_VALUE) {
                    this.f38880c = launchActivity.getRequestedOrientation();
                }
                if (launchActivity.getRequestedOrientation() != 1) {
                    launchActivity.setRequestedOrientation(1);
                    return;
                }
                return;
            }
            int i10 = this.f38880c;
            if (i10 != Integer.MIN_VALUE) {
                launchActivity.setRequestedOrientation(i10);
                this.f38880c = Integer.MIN_VALUE;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
