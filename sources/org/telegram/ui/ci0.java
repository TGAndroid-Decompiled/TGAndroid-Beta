package org.telegram.ui;

import android.os.Build;
import java.util.ArrayList;
public final class ci0 {
    public final LaunchActivity f44840a;
    public final ArrayList f44841b = new ArrayList();
    public int f44842c = Integer.MIN_VALUE;

    public ci0(LaunchActivity launchActivity) {
        this.f44840a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.f44841b.isEmpty();
        LaunchActivity launchActivity = this.f44840a;
        try {
            if (!isEmpty && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (Build.VERSION.SDK_INT < 24 || !launchActivity.isInMultiWindowMode())) {
                if (this.f44842c == Integer.MIN_VALUE) {
                    this.f44842c = launchActivity.getRequestedOrientation();
                }
                if (launchActivity.getRequestedOrientation() != 1) {
                    launchActivity.setRequestedOrientation(1);
                    return;
                }
                return;
            }
            int i7 = this.f44842c;
            if (i7 != Integer.MIN_VALUE) {
                launchActivity.setRequestedOrientation(i7);
                this.f44842c = Integer.MIN_VALUE;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
