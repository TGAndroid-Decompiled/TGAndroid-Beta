package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class m20 {
    public static final int f26926w = ViewConfiguration.getTapTimeout();
    public final int f26927a;
    public final int f26928b;
    public final int f26929c;
    public final int d;
    public final n20 f26930f;
    public final n20 f26931g;
    public boolean h;
    public boolean f26932i;
    public boolean f26933j;
    public boolean f26934k;
    public boolean f26935l;
    public MotionEvent f26936m;
    public MotionEvent f26937n;
    public boolean f26938o;
    public float f26939p;
    public float f26940q;
    public float f26941r;
    public float f26942s;
    public boolean f26943t;
    public VelocityTracker v;
    public long f26944u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.d e = new androidx.mediarouter.app.d(this, 10);

    public m20(Context context, n20 n20Var) {
        this.f26930f = n20Var;
        this.f26931g = n20Var;
        if (context != null) {
            this.f26943t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f26929c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f26927a = scaledTouchSlop * scaledTouchSlop;
            this.f26928b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
