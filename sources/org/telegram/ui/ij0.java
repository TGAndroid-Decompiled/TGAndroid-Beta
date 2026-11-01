package org.telegram.ui;

import android.os.Build;
import java.util.ArrayList;
public final class ij0 {
    public final LaunchActivity f38096a;
    public final ArrayList f38097b = new ArrayList();
    public int f38098c = Integer.MIN_VALUE;

    public ij0(LaunchActivity launchActivity) {
        this.f38096a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.f38097b.isEmpty();
        LaunchActivity launchActivity = this.f38096a;
        try {
            if (!isEmpty && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (Build.VERSION.SDK_INT < 24 || !launchActivity.isInMultiWindowMode())) {
                if (this.f38098c == Integer.MIN_VALUE) {
                    this.f38098c = launchActivity.getRequestedOrientation();
                }
                if (launchActivity.getRequestedOrientation() != 1) {
                    launchActivity.setRequestedOrientation(1);
                    return;
                }
                return;
            }
            int i10 = this.f38098c;
            if (i10 != Integer.MIN_VALUE) {
                launchActivity.setRequestedOrientation(i10);
                this.f38098c = Integer.MIN_VALUE;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
