package org.telegram.ui;

import android.os.Build;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class el0 {
    public final LaunchActivity f39133a;
    public final ArrayList f39134b = new ArrayList();
    public int f39135c = Integer.MIN_VALUE;

    public el0(LaunchActivity launchActivity) {
        this.f39133a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.f39134b.isEmpty();
        LaunchActivity launchActivity = this.f39133a;
        try {
            if (!isEmpty && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (Build.VERSION.SDK_INT < 24 || !launchActivity.isInMultiWindowMode())) {
                if (this.f39135c == Integer.MIN_VALUE) {
                    this.f39135c = launchActivity.getRequestedOrientation();
                }
                if (launchActivity.getRequestedOrientation() != 1) {
                    launchActivity.setRequestedOrientation(1);
                    return;
                }
                return;
            }
            int i10 = this.f39135c;
            if (i10 != Integer.MIN_VALUE) {
                launchActivity.setRequestedOrientation(i10);
                this.f39135c = Integer.MIN_VALUE;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
