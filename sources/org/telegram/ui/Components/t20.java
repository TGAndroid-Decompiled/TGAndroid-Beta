package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class t20 {
    public static final int f30390w = ViewConfiguration.getTapTimeout();
    public final int f30391a;
    public final int f30392b;
    public final int f30393c;
    public final int d;
    public final u20 f30394f;
    public final u20 f30395g;
    public boolean h;
    public boolean f30396i;
    public boolean f30397j;
    public boolean f30398k;
    public boolean f30399l;
    public MotionEvent f30400m;
    public MotionEvent f30401n;
    public boolean f30402o;
    public float f30403p;
    public float f30404q;
    public float f30405r;
    public float f30406s;
    public boolean f30407t;
    public VelocityTracker v;
    public long f30408u = ViewConfiguration.getLongPressTimeout();
    public final ab.o0 e = new ab.o0(this, 9);

    public t20(Context context, u20 u20Var) {
        this.f30394f = u20Var;
        this.f30395g = u20Var;
        if (context != null) {
            this.f30407t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f30393c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f30391a = scaledTouchSlop * scaledTouchSlop;
            this.f30392b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
