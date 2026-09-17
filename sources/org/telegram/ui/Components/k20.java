package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class k20 {
    public static final int f27652w = ViewConfiguration.getTapTimeout();
    public final int f27653a;
    public final int f27654b;
    public final int f27655c;
    public final int d;
    public final l20 f27657f;
    public final l20 f27658g;
    public boolean h;
    public boolean f27659i;
    public boolean f27660j;
    public boolean f27661k;
    public boolean f27662l;
    public MotionEvent f27663m;
    public MotionEvent f27664n;
    public boolean f27665o;
    public float f27666p;
    public float f27667q;
    public float f27668r;
    public float f27669s;
    public boolean f27670t;
    public VelocityTracker v;
    public long f27671u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c f27656e = new androidx.mediarouter.app.c(this, 8);

    public k20(Context context, l20 l20Var) {
        this.f27657f = l20Var;
        this.f27658g = l20Var;
        if (context != null) {
            this.f27670t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f27655c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f27653a = scaledTouchSlop * scaledTouchSlop;
            this.f27654b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
