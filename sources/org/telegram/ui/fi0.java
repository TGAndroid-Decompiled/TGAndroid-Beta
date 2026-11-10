package org.telegram.ui;

import android.os.Build;
import java.util.ArrayList;
public final class fi0 {
    public final LaunchActivity f45783a;
    public final ArrayList f45784b = new ArrayList();
    public int f45785c = Integer.MIN_VALUE;

    public fi0(LaunchActivity launchActivity) {
        this.f45783a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.f45784b.isEmpty();
        LaunchActivity launchActivity = this.f45783a;
        try {
            if (!isEmpty && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (Build.VERSION.SDK_INT < 24 || !launchActivity.isInMultiWindowMode())) {
                if (this.f45785c == Integer.MIN_VALUE) {
                    this.f45785c = launchActivity.getRequestedOrientation();
                }
                if (launchActivity.getRequestedOrientation() != 1) {
                    launchActivity.setRequestedOrientation(1);
                    return;
                }
                return;
            }
            int i7 = this.f45785c;
            if (i7 != Integer.MIN_VALUE) {
                launchActivity.setRequestedOrientation(i7);
                this.f45785c = Integer.MIN_VALUE;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
