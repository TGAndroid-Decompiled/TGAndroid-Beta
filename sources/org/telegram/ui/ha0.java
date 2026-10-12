package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
public final class ha0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f38313a;
    public final Object f38314b;

    public ha0(Object obj, int i10) {
        this.f38313a = i10;
        this.f38314b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f38313a;
        Object obj = this.f38314b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                org.telegram.messenger.v0.o(AndroidUtilities.displaySize.y, hg.c.l(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.v0.o(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                zd1 zd1Var = (zd1) obj;
                zd1Var.P = SystemClock.elapsedRealtime() + 1500;
                zd1Var.f44768k0.invalidate();
                return;
        }
    }
}
