package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
public final class n90 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f39476a;
    public final Object f39477b;

    public n90(Object obj, int i10) {
        this.f39476a = i10;
        this.f39477b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f39476a;
        Object obj = this.f39477b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.C1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                org.telegram.messenger.g0.o(AndroidUtilities.displaySize.y, i2.e.l(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.g0.o(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                kc1 kc1Var = (kc1) obj;
                kc1Var.P = SystemClock.elapsedRealtime() + 1500;
                kc1Var.f38543k0.invalidate();
                return;
        }
    }
}
