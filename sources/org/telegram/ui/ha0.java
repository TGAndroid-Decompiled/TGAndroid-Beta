package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
public final class ha0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f36941a;
    public final Object f36942b;

    public ha0(Object obj, int i10) {
        this.f36941a = i10;
        this.f36942b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f36941a;
        Object obj = this.f36942b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                i2.g.o(AndroidUtilities.displaySize.y, i2.g.l(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            i2.g.o(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                wd1 wd1Var = (wd1) obj;
                wd1Var.P = SystemClock.elapsedRealtime() + 1500;
                wd1Var.f41949k0.invalidate();
                return;
        }
    }
}
