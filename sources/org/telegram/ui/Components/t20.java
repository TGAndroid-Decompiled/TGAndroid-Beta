package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class t20 {
    public static final int f30434w = ViewConfiguration.getTapTimeout();
    public final int f30435a;
    public final int f30436b;
    public final int f30437c;
    public final int d;
    public final u20 f30438f;
    public final u20 f30439g;
    public boolean h;
    public boolean f30440i;
    public boolean f30441j;
    public boolean f30442k;
    public boolean f30443l;
    public MotionEvent f30444m;
    public MotionEvent f30445n;
    public boolean f30446o;
    public float f30447p;
    public float f30448q;
    public float f30449r;
    public float f30450s;
    public boolean f30451t;
    public VelocityTracker v;
    public long f30452u = ViewConfiguration.getLongPressTimeout();
    public final ab.o0 e = new ab.o0(this, 9);

    public t20(Context context, u20 u20Var) {
        this.f30438f = u20Var;
        this.f30439g = u20Var;
        if (context != null) {
            this.f30451t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f30437c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f30435a = scaledTouchSlop * scaledTouchSlop;
            this.f30436b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
