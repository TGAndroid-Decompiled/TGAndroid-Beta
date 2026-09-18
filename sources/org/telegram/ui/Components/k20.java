package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class k20 {
    public static final int f25542w = ViewConfiguration.getTapTimeout();
    public final int f25543a;
    public final int f25544b;
    public final int f25545c;
    public final int d;
    public final l20 f25546f;
    public final l20 f25547g;
    public boolean h;
    public boolean f25548i;
    public boolean f25549j;
    public boolean f25550k;
    public boolean f25551l;
    public MotionEvent f25552m;
    public MotionEvent f25553n;
    public boolean f25554o;
    public float f25555p;
    public float f25556q;
    public float f25557r;
    public float f25558s;
    public boolean f25559t;
    public VelocityTracker v;
    public long f25560u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 8);

    public k20(Context context, l20 l20Var) {
        this.f25546f = l20Var;
        this.f25547g = l20Var;
        if (context != null) {
            this.f25559t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f25545c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f25543a = scaledTouchSlop * scaledTouchSlop;
            this.f25544b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
