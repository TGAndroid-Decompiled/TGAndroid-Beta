package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class t20 {
    public static final int f30441w = ViewConfiguration.getTapTimeout();
    public final int f30442a;
    public final int f30443b;
    public final int f30444c;
    public final int d;
    public final u20 f30445f;
    public final u20 f30446g;
    public boolean h;
    public boolean f30447i;
    public boolean f30448j;
    public boolean f30449k;
    public boolean f30450l;
    public MotionEvent f30451m;
    public MotionEvent f30452n;
    public boolean f30453o;
    public float f30454p;
    public float f30455q;
    public float f30456r;
    public float f30457s;
    public boolean f30458t;
    public VelocityTracker v;
    public long f30459u = ViewConfiguration.getLongPressTimeout();
    public final ab.o0 e = new ab.o0(this, 9);

    public t20(Context context, u20 u20Var) {
        this.f30445f = u20Var;
        this.f30446g = u20Var;
        if (context != null) {
            this.f30458t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f30444c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f30442a = scaledTouchSlop * scaledTouchSlop;
            this.f30443b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
