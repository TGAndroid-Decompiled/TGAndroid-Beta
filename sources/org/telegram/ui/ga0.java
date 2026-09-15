package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
public final class ga0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f33853a;
    public final Object f33854b;

    public ga0(Object obj, int i10) {
        this.f33853a = i10;
        this.f33854b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f33853a;
        Object obj = this.f33854b;
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
                vd1 vd1Var = (vd1) obj;
                vd1Var.P = SystemClock.elapsedRealtime() + 1500;
                vd1Var.f38546k0.invalidate();
                return;
        }
    }
}
