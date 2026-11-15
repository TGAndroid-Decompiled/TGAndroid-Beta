package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class e10 {
    public static final int f34139w = ViewConfiguration.getTapTimeout();
    public final int f34140a;
    public final int f34141b;
    public final int f34142c;
    public final int d;
    public final f10 f34144f;
    public final f10 f34145g;
    public boolean h;
    public boolean f34146i;
    public boolean f34147j;
    public boolean f34148k;
    public boolean f34149l;
    public MotionEvent f34150m;
    public MotionEvent f34151n;
    public boolean f34152o;
    public float f34153p;
    public float f34154q;
    public float f34155r;
    public float f34156s;
    public boolean f34157t;
    public VelocityTracker v;
    public long f34158u = ViewConfiguration.getLongPressTimeout();
    public final android.support.v4.media.session.q f34143e = new android.support.v4.media.session.q(this, 6);

    public e10(Context context, f10 f10Var) {
        this.f34144f = f10Var;
        this.f34145g = f10Var;
        if (context != null) {
            this.f34157t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f34142c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f34140a = scaledTouchSlop * scaledTouchSlop;
            this.f34141b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
