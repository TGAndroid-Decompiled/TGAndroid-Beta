package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class t20 {
    public static final int f30388w = ViewConfiguration.getTapTimeout();
    public final int f30389a;
    public final int f30390b;
    public final int f30391c;
    public final int d;
    public final u20 f30392f;
    public final u20 f30393g;
    public boolean h;
    public boolean f30394i;
    public boolean f30395j;
    public boolean f30396k;
    public boolean f30397l;
    public MotionEvent f30398m;
    public MotionEvent f30399n;
    public boolean f30400o;
    public float f30401p;
    public float f30402q;
    public float f30403r;
    public float f30404s;
    public boolean f30405t;
    public VelocityTracker v;
    public long f30406u = ViewConfiguration.getLongPressTimeout();
    public final ab.o0 e = new ab.o0(this, 9);

    public t20(Context context, u20 u20Var) {
        this.f30392f = u20Var;
        this.f30393g = u20Var;
        if (context != null) {
            this.f30405t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f30391c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f30389a = scaledTouchSlop * scaledTouchSlop;
            this.f30390b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
