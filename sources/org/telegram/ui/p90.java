package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
public final class p90 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f41327a;
    public final Object f41328b;

    public p90(Object obj, int i10) {
        this.f41327a = i10;
        this.f41328b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f41327a;
        Object obj = this.f41328b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f35560x1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                j7.l1.t(AndroidUtilities.displaySize.y, j7.l1.o(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            j7.l1.t(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                qc1 qc1Var = (qc1) obj;
                qc1Var.L = SystemClock.elapsedRealtime() + 1500;
                qc1Var.f41645g0.invalidate();
                return;
        }
    }
}
