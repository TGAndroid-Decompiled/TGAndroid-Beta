package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
public final class da0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f32904a;
    public final Object f32905b;

    public da0(Object obj, int i10) {
        this.f32904a = i10;
        this.f32905b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f32904a;
        Object obj = this.f32905b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                org.telegram.messenger.l0.m(AndroidUtilities.displaySize.y, hg.k0.k(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.l0.m(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
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
                pd1Var.f36423k0.invalidate();
                return;
        }
    }
}
