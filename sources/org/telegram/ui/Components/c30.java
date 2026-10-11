package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class c30 {
    public static final int f25185w = ViewConfiguration.getTapTimeout();
    public final int f25186a;
    public final int f25187b;
    public final int f25188c;
    public final int d;
    public final d30 f25190f;
    public final d30 f25191g;
    public boolean h;
    public boolean f25192i;
    public boolean f25193j;
    public boolean f25194k;
    public boolean f25195l;
    public MotionEvent f25196m;
    public MotionEvent f25197n;
    public boolean f25198o;
    public float f25199p;
    public float f25200q;
    public float f25201r;
    public float f25202s;
    public boolean f25203t;
    public VelocityTracker v;
    public long f25204u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c f25189e = new androidx.mediarouter.app.c(this, 8);

    public c30(Context context, d30 d30Var) {
        this.f25190f = d30Var;
        this.f25191g = d30Var;
        if (context != null) {
            this.f25203t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f25188c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f25186a = scaledTouchSlop * scaledTouchSlop;
            this.f25187b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
