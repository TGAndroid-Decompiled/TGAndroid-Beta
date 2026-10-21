package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class t20 {
    public static final int f30402w = ViewConfiguration.getTapTimeout();
    public final int f30403a;
    public final int f30404b;
    public final int f30405c;
    public final int d;
    public final u20 f30406f;
    public final u20 f30407g;
    public boolean h;
    public boolean f30408i;
    public boolean f30409j;
    public boolean f30410k;
    public boolean f30411l;
    public MotionEvent f30412m;
    public MotionEvent f30413n;
    public boolean f30414o;
    public float f30415p;
    public float f30416q;
    public float f30417r;
    public float f30418s;
    public boolean f30419t;
    public VelocityTracker v;
    public long f30420u = ViewConfiguration.getLongPressTimeout();
    public final ab.o0 e = new ab.o0(this, 9);

    public t20(Context context, u20 u20Var) {
        this.f30406f = u20Var;
        this.f30407g = u20Var;
        if (context != null) {
            this.f30419t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f30405c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f30403a = scaledTouchSlop * scaledTouchSlop;
            this.f30404b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
