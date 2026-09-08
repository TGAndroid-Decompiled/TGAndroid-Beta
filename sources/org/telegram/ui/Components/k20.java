package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class k20 {
    public static final int f27678w = ViewConfiguration.getTapTimeout();
    public final int f27679a;
    public final int f27680b;
    public final int f27681c;
    public final int d;
    public final l20 f27683f;
    public final l20 f27684g;
    public boolean h;
    public boolean f27685i;
    public boolean f27686j;
    public boolean f27687k;
    public boolean f27688l;
    public MotionEvent f27689m;
    public MotionEvent f27690n;
    public boolean f27691o;
    public float f27692p;
    public float f27693q;
    public float f27694r;
    public float f27695s;
    public boolean f27696t;
    public VelocityTracker v;
    public long f27697u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c f27682e = new androidx.mediarouter.app.c(this, 8);

    public k20(Context context, l20 l20Var) {
        this.f27683f = l20Var;
        this.f27684g = l20Var;
        if (context != null) {
            this.f27696t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f27681c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f27679a = scaledTouchSlop * scaledTouchSlop;
            this.f27680b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
