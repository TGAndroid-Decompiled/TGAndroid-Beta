package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class t20 {
    public static final int f30405w = ViewConfiguration.getTapTimeout();
    public final int f30406a;
    public final int f30407b;
    public final int f30408c;
    public final int d;
    public final u20 f30409f;
    public final u20 f30410g;
    public boolean h;
    public boolean f30411i;
    public boolean f30412j;
    public boolean f30413k;
    public boolean f30414l;
    public MotionEvent f30415m;
    public MotionEvent f30416n;
    public boolean f30417o;
    public float f30418p;
    public float f30419q;
    public float f30420r;
    public float f30421s;
    public boolean f30422t;
    public VelocityTracker v;
    public long f30423u = ViewConfiguration.getLongPressTimeout();
    public final ab.o0 e = new ab.o0(this, 9);

    public t20(Context context, u20 u20Var) {
        this.f30409f = u20Var;
        this.f30410g = u20Var;
        if (context != null) {
            this.f30422t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f30408c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f30406a = scaledTouchSlop * scaledTouchSlop;
            this.f30407b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
