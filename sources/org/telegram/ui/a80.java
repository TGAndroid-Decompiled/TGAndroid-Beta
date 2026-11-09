package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
public final class a80 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f43639a;
    public final Object f43640b;

    public a80(Object obj, int i7) {
        this.f43639a = i7;
        this.f43640b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i7 = this.f43639a;
        Object obj = this.f43640b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                StringBuilder n10 = jg.g.n(measuredHeight, "height = ", " displayHeight = ");
                Point point = org.telegram.messenger.g0.f22563q;
                jg.g.s(point.y, n10);
                int i10 = (measuredHeight - org.telegram.messenger.g0.f22558n) - org.telegram.messenger.g0.f22557m;
                if (i10 > org.telegram.messenger.g0.L(100.0f) && i10 < point.y && org.telegram.messenger.g0.L(100.0f) + i10 > point.y) {
                    point.y = i10;
                    if (org.telegram.messenger.r2.f25212a) {
                        jg.g.s(point.y, new StringBuilder("fix display size y to "));
                        return;
                    }
                    return;
                }
                return;
            default:
                w71 w71Var = (w71) obj;
                w71Var.Q = SystemClock.elapsedRealtime() + 1500;
                w71Var.f50939l0.invalidate();
                return;
        }
    }
}
