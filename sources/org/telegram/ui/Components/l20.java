package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class l20 {
    public static final int f25985w = ViewConfiguration.getTapTimeout();
    public final int f25986a;
    public final int f25987b;
    public final int f25988c;
    public final int d;
    public final m20 f25989f;
    public final m20 f25990g;
    public boolean h;
    public boolean f25991i;
    public boolean f25992j;
    public boolean f25993k;
    public boolean f25994l;
    public MotionEvent f25995m;
    public MotionEvent f25996n;
    public boolean f25997o;
    public float f25998p;
    public float f25999q;
    public float f26000r;
    public float f26001s;
    public boolean f26002t;
    public VelocityTracker v;
    public long f26003u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 8);

    public l20(Context context, m20 m20Var) {
        this.f25989f = m20Var;
        this.f25990g = m20Var;
        if (context != null) {
            this.f26002t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f25988c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f25986a = scaledTouchSlop * scaledTouchSlop;
            this.f25987b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
