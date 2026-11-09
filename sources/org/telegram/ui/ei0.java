package org.telegram.ui;

import android.os.Build;
import java.util.ArrayList;
public final class ei0 {
    public final LaunchActivity f45454a;
    public final ArrayList f45455b = new ArrayList();
    public int f45456c = Integer.MIN_VALUE;

    public ei0(LaunchActivity launchActivity) {
        this.f45454a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.f45455b.isEmpty();
        LaunchActivity launchActivity = this.f45454a;
        try {
            if (!isEmpty && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (Build.VERSION.SDK_INT < 24 || !launchActivity.isInMultiWindowMode())) {
                if (this.f45456c == Integer.MIN_VALUE) {
                    this.f45456c = launchActivity.getRequestedOrientation();
                }
                if (launchActivity.getRequestedOrientation() != 1) {
                    launchActivity.setRequestedOrientation(1);
                    return;
                }
                return;
            }
            int i7 = this.f45456c;
            if (i7 != Integer.MIN_VALUE) {
                launchActivity.setRequestedOrientation(i7);
                this.f45456c = Integer.MIN_VALUE;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
