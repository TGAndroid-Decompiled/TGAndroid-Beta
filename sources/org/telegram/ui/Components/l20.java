package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class l20 {
    public static final int f25993w = ViewConfiguration.getTapTimeout();
    public final int f25994a;
    public final int f25995b;
    public final int f25996c;
    public final int d;
    public final m20 f25997f;
    public final m20 f25998g;
    public boolean h;
    public boolean f25999i;
    public boolean f26000j;
    public boolean f26001k;
    public boolean f26002l;
    public MotionEvent f26003m;
    public MotionEvent f26004n;
    public boolean f26005o;
    public float f26006p;
    public float f26007q;
    public float f26008r;
    public float f26009s;
    public boolean f26010t;
    public VelocityTracker v;
    public long f26011u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 8);

    public l20(Context context, m20 m20Var) {
        this.f25997f = m20Var;
        this.f25998g = m20Var;
        if (context != null) {
            this.f26010t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f25996c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f25994a = scaledTouchSlop * scaledTouchSlop;
            this.f25995b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
