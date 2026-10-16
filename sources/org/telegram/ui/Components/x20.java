package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class x20 {
    public static final int f30821w = ViewConfiguration.getTapTimeout();
    public final int f30822a;
    public final int f30823b;
    public final int f30824c;
    public final int d;
    public final y20 f30825f;
    public final y20 f30826g;
    public boolean h;
    public boolean f30827i;
    public boolean f30828j;
    public boolean f30829k;
    public boolean f30830l;
    public MotionEvent f30831m;
    public MotionEvent f30832n;
    public boolean f30833o;
    public float f30834p;
    public float f30835q;
    public float f30836r;
    public float f30837s;
    public boolean f30838t;
    public VelocityTracker v;
    public long f30839u = ViewConfiguration.getLongPressTimeout();
    public final ab.o0 e = new ab.o0(this, 9);

    public x20(Context context, y20 y20Var) {
        this.f30825f = y20Var;
        this.f30826g = y20Var;
        if (context != null) {
            this.f30838t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f30824c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f30822a = scaledTouchSlop * scaledTouchSlop;
            this.f30823b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
