package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;

public final class p90 implements ViewTreeObserver.OnGlobalLayoutListener {

    public final int f41302a;

    public final Object f41303b;

    public p90(Object obj, int i10) {
        this.f41302a = i10;
        this.f41303b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f41302a;
        Object obj = this.f41303b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f35496x1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                i0.a.v(AndroidUtilities.displaySize.y, i0.a.o(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int iDp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (iDp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            i0.a.v(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                        }
                    }
                    break;
                }
                break;
            default:
                nc1 nc1Var = (nc1) obj;
                nc1Var.L = SystemClock.elapsedRealtime() + 1500;
                nc1Var.f40757g0.invalidate();
                break;
        }
    }
}
