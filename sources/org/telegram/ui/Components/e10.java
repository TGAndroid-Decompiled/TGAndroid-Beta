package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class e10 {
    public static final int f34126w = ViewConfiguration.getTapTimeout();
    public final int f34127a;
    public final int f34128b;
    public final int f34129c;
    public final int d;
    public final f10 f34131f;
    public final f10 f34132g;
    public boolean h;
    public boolean f34133i;
    public boolean f34134j;
    public boolean f34135k;
    public boolean f34136l;
    public MotionEvent f34137m;
    public MotionEvent f34138n;
    public boolean f34139o;
    public float f34140p;
    public float f34141q;
    public float f34142r;
    public float f34143s;
    public boolean f34144t;
    public VelocityTracker v;
    public long f34145u = ViewConfiguration.getLongPressTimeout();
    public final android.support.v4.media.session.q f34130e = new android.support.v4.media.session.q(this, 6);

    public e10(Context context, f10 f10Var) {
        this.f34131f = f10Var;
        this.f34132g = f10Var;
        if (context != null) {
            this.f34144t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f34129c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f34127a = scaledTouchSlop * scaledTouchSlop;
            this.f34128b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
