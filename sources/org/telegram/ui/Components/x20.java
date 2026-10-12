package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class x20 {
    public static final int f31123w = ViewConfiguration.getTapTimeout();
    public final int f31124a;
    public final int f31125b;
    public final int f31126c;
    public final int d;
    public final y20 f31127f;
    public final y20 f31128g;
    public boolean h;
    public boolean f31129i;
    public boolean f31130j;
    public boolean f31131k;
    public boolean f31132l;
    public MotionEvent f31133m;
    public MotionEvent f31134n;
    public boolean f31135o;
    public float f31136p;
    public float f31137q;
    public float f31138r;
    public float f31139s;
    public boolean f31140t;
    public VelocityTracker v;
    public long f31141u = ViewConfiguration.getLongPressTimeout();
    public final ab.o0 e = new ab.o0(this, 9);

    public x20(Context context, y20 y20Var) {
        this.f31127f = y20Var;
        this.f31128g = y20Var;
        if (context != null) {
            this.f31140t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f31126c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f31124a = scaledTouchSlop * scaledTouchSlop;
            this.f31125b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
