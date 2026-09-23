package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class l20 {
    public static final int f25780w = ViewConfiguration.getTapTimeout();
    public final int f25781a;
    public final int f25782b;
    public final int f25783c;
    public final int d;
    public final m20 f25784f;
    public final m20 f25785g;
    public boolean h;
    public boolean f25786i;
    public boolean f25787j;
    public boolean f25788k;
    public boolean f25789l;
    public MotionEvent f25790m;
    public MotionEvent f25791n;
    public boolean f25792o;
    public float f25793p;
    public float f25794q;
    public float f25795r;
    public float f25796s;
    public boolean f25797t;
    public VelocityTracker v;
    public long f25798u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 8);

    public l20(Context context, m20 m20Var) {
        this.f25784f = m20Var;
        this.f25785g = m20Var;
        if (context != null) {
            this.f25797t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f25783c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f25781a = scaledTouchSlop * scaledTouchSlop;
            this.f25782b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
