package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class t20 {
    public static final int f30600w = ViewConfiguration.getTapTimeout();
    public final int f30601a;
    public final int f30602b;
    public final int f30603c;
    public final int d;
    public final u20 f30604f;
    public final u20 f30605g;
    public boolean h;
    public boolean f30606i;
    public boolean f30607j;
    public boolean f30608k;
    public boolean f30609l;
    public MotionEvent f30610m;
    public MotionEvent f30611n;
    public boolean f30612o;
    public float f30613p;
    public float f30614q;
    public float f30615r;
    public float f30616s;
    public boolean f30617t;
    public VelocityTracker v;
    public long f30618u = ViewConfiguration.getLongPressTimeout();
    public final ab.o0 e = new ab.o0(this, 9);

    public t20(Context context, u20 u20Var) {
        this.f30604f = u20Var;
        this.f30605g = u20Var;
        if (context != null) {
            this.f30617t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f30603c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f30601a = scaledTouchSlop * scaledTouchSlop;
            this.f30602b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
