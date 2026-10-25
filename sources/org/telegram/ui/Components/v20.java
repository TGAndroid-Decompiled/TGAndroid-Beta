package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class v20 {
    public static final int f33536w = ViewConfiguration.getTapTimeout();
    public final int f33537a;
    public final int f33538b;
    public final int f33539c;
    public final int d;
    public final w20 f33540f;
    public final w20 f33541g;
    public boolean h;
    public boolean f33542i;
    public boolean f33543j;
    public boolean f33544k;
    public boolean f33545l;
    public MotionEvent f33546m;
    public MotionEvent f33547n;
    public boolean f33548o;
    public float f33549p;
    public float f33550q;
    public float f33551r;
    public float f33552s;
    public boolean f33553t;
    public VelocityTracker v;
    public long f33554u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 9);

    public v20(Context context, w20 w20Var) {
        this.f33540f = w20Var;
        this.f33541g = w20Var;
        if (context != null) {
            this.f33553t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f33539c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f33537a = scaledTouchSlop * scaledTouchSlop;
            this.f33538b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
