package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class k20 {
    public static final int f27651w = ViewConfiguration.getTapTimeout();
    public final int f27652a;
    public final int f27653b;
    public final int f27654c;
    public final int d;
    public final l20 f27656f;
    public final l20 f27657g;
    public boolean h;
    public boolean f27658i;
    public boolean f27659j;
    public boolean f27660k;
    public boolean f27661l;
    public MotionEvent f27662m;
    public MotionEvent f27663n;
    public boolean f27664o;
    public float f27665p;
    public float f27666q;
    public float f27667r;
    public float f27668s;
    public boolean f27669t;
    public VelocityTracker v;
    public long f27670u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c f27655e = new androidx.mediarouter.app.c(this, 8);

    public k20(Context context, l20 l20Var) {
        this.f27656f = l20Var;
        this.f27657g = l20Var;
        if (context != null) {
            this.f27669t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f27654c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f27652a = scaledTouchSlop * scaledTouchSlop;
            this.f27653b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
