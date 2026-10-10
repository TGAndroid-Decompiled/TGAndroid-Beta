package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
public final class fa0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f37548a;
    public final Object f37549b;

    public fa0(Object obj, int i10) {
        this.f37548a = i10;
        this.f37549b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f37548a;
        Object obj = this.f37549b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                org.telegram.messenger.q.o(AndroidUtilities.displaySize.y, hg.c.j(measuredHeight, "height = ", " displayHeight = "));
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
                xd1 xd1Var = (xd1) obj;
                xd1Var.P = SystemClock.elapsedRealtime() + 1500;
                xd1Var.f44015k0.invalidate();
                return;
        }
    }
}
