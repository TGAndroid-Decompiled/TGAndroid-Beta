package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class o20 {
    public static final int f29195w = ViewConfiguration.getTapTimeout();
    public final int f29196a;
    public final int f29197b;
    public final int f29198c;
    public final int d;
    public final p20 f29200f;
    public final p20 f29201g;
    public boolean h;
    public boolean f29202i;
    public boolean f29203j;
    public boolean f29204k;
    public boolean f29205l;
    public MotionEvent f29206m;
    public MotionEvent f29207n;
    public boolean f29208o;
    public float f29209p;
    public float f29210q;
    public float f29211r;
    public float f29212s;
    public boolean f29213t;
    public VelocityTracker v;
    public long f29214u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c f29199e = new androidx.mediarouter.app.c(this, 8);

    public o20(Context context, p20 p20Var) {
        this.f29200f = p20Var;
        this.f29201g = p20Var;
        if (context != null) {
            this.f29213t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f29198c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f29196a = scaledTouchSlop * scaledTouchSlop;
            this.f29197b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
