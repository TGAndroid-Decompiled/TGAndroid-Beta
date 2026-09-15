package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class k20 {
    public static final int f25512w = ViewConfiguration.getTapTimeout();
    public final int f25513a;
    public final int f25514b;
    public final int f25515c;
    public final int d;
    public final l20 f25516f;
    public final l20 f25517g;
    public boolean h;
    public boolean f25518i;
    public boolean f25519j;
    public boolean f25520k;
    public boolean f25521l;
    public MotionEvent f25522m;
    public MotionEvent f25523n;
    public boolean f25524o;
    public float f25525p;
    public float f25526q;
    public float f25527r;
    public float f25528s;
    public boolean f25529t;
    public VelocityTracker v;
    public long f25530u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 8);

    public k20(Context context, l20 l20Var) {
        this.f25516f = l20Var;
        this.f25517g = l20Var;
        if (context != null) {
            this.f25529t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f25515c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f25513a = scaledTouchSlop * scaledTouchSlop;
            this.f25514b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
