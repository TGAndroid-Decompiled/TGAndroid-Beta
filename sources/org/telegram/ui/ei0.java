package org.telegram.ui;

import android.os.Build;
import java.util.ArrayList;
public final class ei0 {
    public final LaunchActivity f46795a;
    public final ArrayList f46796b = new ArrayList();
    public int f46797c = Integer.MIN_VALUE;

    public ei0(LaunchActivity launchActivity) {
        this.f46795a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.f46796b.isEmpty();
        LaunchActivity launchActivity = this.f46795a;
        try {
            if (!isEmpty && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (Build.VERSION.SDK_INT < 24 || !launchActivity.isInMultiWindowMode())) {
                if (this.f46797c == Integer.MIN_VALUE) {
                    this.f46797c = launchActivity.getRequestedOrientation();
                }
                if (launchActivity.getRequestedOrientation() != 1) {
                    launchActivity.setRequestedOrientation(1);
                    return;
                }
                return;
            }
            int i7 = this.f46797c;
            if (i7 != Integer.MIN_VALUE) {
                launchActivity.setRequestedOrientation(i7);
                this.f46797c = Integer.MIN_VALUE;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
