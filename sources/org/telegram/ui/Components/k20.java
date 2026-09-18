package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class k20 {
    public static final int f25534w = ViewConfiguration.getTapTimeout();
    public final int f25535a;
    public final int f25536b;
    public final int f25537c;
    public final int d;
    public final l20 f25538f;
    public final l20 f25539g;
    public boolean h;
    public boolean f25540i;
    public boolean f25541j;
    public boolean f25542k;
    public boolean f25543l;
    public MotionEvent f25544m;
    public MotionEvent f25545n;
    public boolean f25546o;
    public float f25547p;
    public float f25548q;
    public float f25549r;
    public float f25550s;
    public boolean f25551t;
    public VelocityTracker v;
    public long f25552u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 8);

    public k20(Context context, l20 l20Var) {
        this.f25538f = l20Var;
        this.f25539g = l20Var;
        if (context != null) {
            this.f25551t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f25537c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f25535a = scaledTouchSlop * scaledTouchSlop;
            this.f25536b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
