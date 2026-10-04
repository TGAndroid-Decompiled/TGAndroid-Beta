package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class o20 {
    public static final int f29190w = ViewConfiguration.getTapTimeout();
    public final int f29191a;
    public final int f29192b;
    public final int f29193c;
    public final int d;
    public final p20 f29195f;
    public final p20 f29196g;
    public boolean h;
    public boolean f29197i;
    public boolean f29198j;
    public boolean f29199k;
    public boolean f29200l;
    public MotionEvent f29201m;
    public MotionEvent f29202n;
    public boolean f29203o;
    public float f29204p;
    public float f29205q;
    public float f29206r;
    public float f29207s;
    public boolean f29208t;
    public VelocityTracker v;
    public long f29209u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c f29194e = new androidx.mediarouter.app.c(this, 8);

    public o20(Context context, p20 p20Var) {
        this.f29195f = p20Var;
        this.f29196g = p20Var;
        if (context != null) {
            this.f29208t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f29193c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f29191a = scaledTouchSlop * scaledTouchSlop;
            this.f29192b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
