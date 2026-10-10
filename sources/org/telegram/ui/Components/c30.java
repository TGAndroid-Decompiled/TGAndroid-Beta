package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class c30 {
    public static final int f25147w = ViewConfiguration.getTapTimeout();
    public final int f25148a;
    public final int f25149b;
    public final int f25150c;
    public final int d;
    public final d30 f25152f;
    public final d30 f25153g;
    public boolean h;
    public boolean f25154i;
    public boolean f25155j;
    public boolean f25156k;
    public boolean f25157l;
    public MotionEvent f25158m;
    public MotionEvent f25159n;
    public boolean f25160o;
    public float f25161p;
    public float f25162q;
    public float f25163r;
    public float f25164s;
    public boolean f25165t;
    public VelocityTracker v;
    public long f25166u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c f25151e = new androidx.mediarouter.app.c(this, 8);

    public c30(Context context, d30 d30Var) {
        this.f25152f = d30Var;
        this.f25153g = d30Var;
        if (context != null) {
            this.f25165t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f25150c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f25148a = scaledTouchSlop * scaledTouchSlop;
            this.f25149b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
