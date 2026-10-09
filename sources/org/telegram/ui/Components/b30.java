package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class b30 {
    public static final int f24864w = ViewConfiguration.getTapTimeout();
    public final int f24865a;
    public final int f24866b;
    public final int f24867c;
    public final int d;
    public final c30 f24869f;
    public final c30 f24870g;
    public boolean h;
    public boolean f24871i;
    public boolean f24872j;
    public boolean f24873k;
    public boolean f24874l;
    public MotionEvent f24875m;
    public MotionEvent f24876n;
    public boolean f24877o;
    public float f24878p;
    public float f24879q;
    public float f24880r;
    public float f24881s;
    public boolean f24882t;
    public VelocityTracker v;
    public long f24883u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c f24868e = new androidx.mediarouter.app.c(this, 8);

    public b30(Context context, c30 c30Var) {
        this.f24869f = c30Var;
        this.f24870g = c30Var;
        if (context != null) {
            this.f24882t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f24867c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f24865a = scaledTouchSlop * scaledTouchSlop;
            this.f24866b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
