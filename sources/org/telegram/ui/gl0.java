package org.telegram.ui;

import android.os.Build;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class gl0 {
    public final LaunchActivity f39643a;
    public final ArrayList f39644b = new ArrayList();
    public int f39645c = Integer.MIN_VALUE;

    public gl0(LaunchActivity launchActivity) {
        this.f39643a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.f39644b.isEmpty();
        LaunchActivity launchActivity = this.f39643a;
        try {
            if (!isEmpty && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (Build.VERSION.SDK_INT < 24 || !launchActivity.isInMultiWindowMode())) {
                if (this.f39645c == Integer.MIN_VALUE) {
                    this.f39645c = launchActivity.getRequestedOrientation();
                }
                if (launchActivity.getRequestedOrientation() != 1) {
                    launchActivity.setRequestedOrientation(1);
                    return;
                }
                return;
            }
            int i10 = this.f39645c;
            if (i10 != Integer.MIN_VALUE) {
                launchActivity.setRequestedOrientation(i10);
                this.f39645c = Integer.MIN_VALUE;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
