package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class k20 {
    public static final int f25587w = ViewConfiguration.getTapTimeout();
    public final int f25588a;
    public final int f25589b;
    public final int f25590c;
    public final int d;
    public final l20 f25591f;
    public final l20 f25592g;
    public boolean h;
    public boolean f25593i;
    public boolean f25594j;
    public boolean f25595k;
    public boolean f25596l;
    public MotionEvent f25597m;
    public MotionEvent f25598n;
    public boolean f25599o;
    public float f25600p;
    public float f25601q;
    public float f25602r;
    public float f25603s;
    public boolean f25604t;
    public VelocityTracker v;
    public long f25605u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 8);

    public k20(Context context, l20 l20Var) {
        this.f25591f = l20Var;
        this.f25592g = l20Var;
        if (context != null) {
            this.f25604t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f25590c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f25588a = scaledTouchSlop * scaledTouchSlop;
            this.f25589b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
