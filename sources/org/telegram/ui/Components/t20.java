package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class t20 {
    public static final int f30401w = ViewConfiguration.getTapTimeout();
    public final int f30402a;
    public final int f30403b;
    public final int f30404c;
    public final int d;
    public final u20 f30405f;
    public final u20 f30406g;
    public boolean h;
    public boolean f30407i;
    public boolean f30408j;
    public boolean f30409k;
    public boolean f30410l;
    public MotionEvent f30411m;
    public MotionEvent f30412n;
    public boolean f30413o;
    public float f30414p;
    public float f30415q;
    public float f30416r;
    public float f30417s;
    public boolean f30418t;
    public VelocityTracker v;
    public long f30419u = ViewConfiguration.getLongPressTimeout();
    public final ab.o0 e = new ab.o0(this, 9);

    public t20(Context context, u20 u20Var) {
        this.f30405f = u20Var;
        this.f30406g = u20Var;
        if (context != null) {
            this.f30418t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f30404c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f30402a = scaledTouchSlop * scaledTouchSlop;
            this.f30403b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
