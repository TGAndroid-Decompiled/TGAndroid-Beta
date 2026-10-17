package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
public final class p90 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f40021a;
    public final Object f40022b;

    public p90(Object obj, int i10) {
        this.f40021a = i10;
        this.f40022b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f40021a;
        Object obj = this.f40022b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.C1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                org.telegram.messenger.q.o(AndroidUtilities.displaySize.y, i0.a.l(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.q.o(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                mc1 mc1Var = (mc1) obj;
                mc1Var.P = SystemClock.elapsedRealtime() + 1500;
                mc1Var.f39130k0.invalidate();
                return;
        }
    }
}
