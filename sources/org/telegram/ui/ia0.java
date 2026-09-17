package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
public final class ia0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f34518a;
    public final Object f34519b;

    public ia0(Object obj, int i10) {
        this.f34518a = i10;
        this.f34519b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f34518a;
        Object obj = this.f34519b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                hg.k0.p(AndroidUtilities.displaySize.y, hg.k0.l(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            hg.k0.p(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                xd1 xd1Var = (xd1) obj;
                xd1Var.P = SystemClock.elapsedRealtime() + 1500;
                xd1Var.f39564k0.invalidate();
                return;
        }
    }
}
