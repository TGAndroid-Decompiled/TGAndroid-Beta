package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
public final class ga0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f33050a;
    public final Object f33051b;

    public ga0(Object obj, int i10) {
        this.f33050a = i10;
        this.f33051b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f33050a;
        Object obj = this.f33051b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                hc.b.q(AndroidUtilities.displaySize.y, hc.b.m(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            hc.b.q(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ae1 ae1Var = (ae1) obj;
                ae1Var.P = SystemClock.elapsedRealtime() + 1500;
                ae1Var.f30947k0.invalidate();
                return;
        }
    }
}
