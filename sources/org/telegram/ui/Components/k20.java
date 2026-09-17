package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class k20 {
    public static final int f25531w = ViewConfiguration.getTapTimeout();
    public final int f25532a;
    public final int f25533b;
    public final int f25534c;
    public final int d;
    public final l20 f25535f;
    public final l20 f25536g;
    public boolean h;
    public boolean f25537i;
    public boolean f25538j;
    public boolean f25539k;
    public boolean f25540l;
    public MotionEvent f25541m;
    public MotionEvent f25542n;
    public boolean f25543o;
    public float f25544p;
    public float f25545q;
    public float f25546r;
    public float f25547s;
    public boolean f25548t;
    public VelocityTracker v;
    public long f25549u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 8);

    public k20(Context context, l20 l20Var) {
        this.f25535f = l20Var;
        this.f25536g = l20Var;
        if (context != null) {
            this.f25548t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f25534c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f25532a = scaledTouchSlop * scaledTouchSlop;
            this.f25533b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
