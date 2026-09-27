package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class n20 {
    public static final int f26702w = ViewConfiguration.getTapTimeout();
    public final int f26703a;
    public final int f26704b;
    public final int f26705c;
    public final int d;
    public final o20 f26706f;
    public final o20 f26707g;
    public boolean h;
    public boolean f26708i;
    public boolean f26709j;
    public boolean f26710k;
    public boolean f26711l;
    public MotionEvent f26712m;
    public MotionEvent f26713n;
    public boolean f26714o;
    public float f26715p;
    public float f26716q;
    public float f26717r;
    public float f26718s;
    public boolean f26719t;
    public VelocityTracker v;
    public long f26720u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 8);

    public n20(Context context, o20 o20Var) {
        this.f26706f = o20Var;
        this.f26707g = o20Var;
        if (context != null) {
            this.f26719t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f26705c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f26703a = scaledTouchSlop * scaledTouchSlop;
            this.f26704b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
