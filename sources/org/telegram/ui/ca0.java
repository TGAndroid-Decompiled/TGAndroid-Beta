package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
public final class ca0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f32298a;
    public final Object f32299b;

    public ca0(Object obj, int i10) {
        this.f32298a = i10;
        this.f32299b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f32298a;
        Object obj = this.f32299b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                org.telegram.messenger.z0.n(AndroidUtilities.displaySize.y, hg.c.l(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.z0.n(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                od1 od1Var = (od1) obj;
                od1Var.P = SystemClock.elapsedRealtime() + 1500;
                od1Var.f35813k0.invalidate();
                return;
        }
    }
}
