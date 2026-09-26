package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
public final class ba0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f32361a;
    public final Object f32362b;

    public ba0(Object obj, int i10) {
        this.f32361a = i10;
        this.f32362b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f32361a;
        Object obj = this.f32362b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                org.telegram.messenger.f0.n(AndroidUtilities.displaySize.y, hg.c.j(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.f0.n(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
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
                od1Var.f36184k0.invalidate();
                return;
        }
    }
}
