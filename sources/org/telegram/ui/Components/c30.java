package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class c30 {
    public static final int f25082w = ViewConfiguration.getTapTimeout();
    public final int f25083a;
    public final int f25084b;
    public final int f25085c;
    public final int d;
    public final d30 f25087f;
    public final d30 f25088g;
    public boolean h;
    public boolean f25089i;
    public boolean f25090j;
    public boolean f25091k;
    public boolean f25092l;
    public MotionEvent f25093m;
    public MotionEvent f25094n;
    public boolean f25095o;
    public float f25096p;
    public float f25097q;
    public float f25098r;
    public float f25099s;
    public boolean f25100t;
    public VelocityTracker v;
    public long f25101u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c f25086e = new androidx.mediarouter.app.c(this, 8);

    public c30(Context context, d30 d30Var) {
        this.f25087f = d30Var;
        this.f25088g = d30Var;
        if (context != null) {
            this.f25100t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f25085c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f25083a = scaledTouchSlop * scaledTouchSlop;
            this.f25084b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
