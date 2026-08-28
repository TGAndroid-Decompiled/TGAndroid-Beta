package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
public final class l90 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f40085a;
    public final Object f40086b;

    public l90(Object obj, int i9) {
        this.f40085a = i9;
        this.f40086b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i9 = this.f40085a;
        Object obj = this.f40086b;
        switch (i9) {
            case 0:
                Pattern pattern = LaunchActivity.f35493x1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                org.telegram.messenger.l0.n(AndroidUtilities.displaySize.y, j3.r0.p(measuredHeight, "height = ", " displayHeight = "));
                int i10 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i10 > AndroidUtilities.dp(100.0f) && i10 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i10;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i10;
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.l0.n(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                oc1 oc1Var = (oc1) obj;
                oc1Var.L = SystemClock.elapsedRealtime() + 1500;
                oc1Var.f41078g0.invalidate();
                return;
        }
    }
}
