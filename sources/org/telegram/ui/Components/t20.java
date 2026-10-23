package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class t20 {
    public static final int f30406w = ViewConfiguration.getTapTimeout();
    public final int f30407a;
    public final int f30408b;
    public final int f30409c;
    public final int d;
    public final u20 f30410f;
    public final u20 f30411g;
    public boolean h;
    public boolean f30412i;
    public boolean f30413j;
    public boolean f30414k;
    public boolean f30415l;
    public MotionEvent f30416m;
    public MotionEvent f30417n;
    public boolean f30418o;
    public float f30419p;
    public float f30420q;
    public float f30421r;
    public float f30422s;
    public boolean f30423t;
    public VelocityTracker v;
    public long f30424u = ViewConfiguration.getLongPressTimeout();
    public final ab.o0 e = new ab.o0(this, 9);

    public t20(Context context, u20 u20Var) {
        this.f30410f = u20Var;
        this.f30411g = u20Var;
        if (context != null) {
            this.f30423t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f30409c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f30407a = scaledTouchSlop * scaledTouchSlop;
            this.f30408b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
