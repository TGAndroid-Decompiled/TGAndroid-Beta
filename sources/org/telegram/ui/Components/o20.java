package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class o20 {
    public static final int f29189w = ViewConfiguration.getTapTimeout();
    public final int f29190a;
    public final int f29191b;
    public final int f29192c;
    public final int d;
    public final p20 f29194f;
    public final p20 f29195g;
    public boolean h;
    public boolean f29196i;
    public boolean f29197j;
    public boolean f29198k;
    public boolean f29199l;
    public MotionEvent f29200m;
    public MotionEvent f29201n;
    public boolean f29202o;
    public float f29203p;
    public float f29204q;
    public float f29205r;
    public float f29206s;
    public boolean f29207t;
    public VelocityTracker v;
    public long f29208u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c f29193e = new androidx.mediarouter.app.c(this, 8);

    public o20(Context context, p20 p20Var) {
        this.f29194f = p20Var;
        this.f29195g = p20Var;
        if (context != null) {
            this.f29207t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f29192c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f29190a = scaledTouchSlop * scaledTouchSlop;
            this.f29191b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
