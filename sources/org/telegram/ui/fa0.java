package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
public final class fa0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f36242a;
    public final Object f36243b;

    public fa0(Object obj, int i10) {
        this.f36242a = i10;
        this.f36243b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f36242a;
        Object obj = this.f36243b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                org.telegram.messenger.q.n(AndroidUtilities.displaySize.y, hg.c.j(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.q.n(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                pd1 pd1Var = (pd1) obj;
                pd1Var.P = SystemClock.elapsedRealtime() + 1500;
                pd1Var.f39521k0.invalidate();
                return;
        }
    }
}
