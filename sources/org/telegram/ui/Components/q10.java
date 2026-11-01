package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class q10 {
    public static final int f29588w = ViewConfiguration.getTapTimeout();
    public final int f29589a;
    public final int f29590b;
    public final int f29591c;
    public final int d;
    public final r10 f29592f;
    public final r10 f29593g;
    public boolean h;
    public boolean f29594i;
    public boolean f29595j;
    public boolean f29596k;
    public boolean f29597l;
    public MotionEvent f29598m;
    public MotionEvent f29599n;
    public boolean f29600o;
    public float f29601p;
    public float f29602q;
    public float f29603r;
    public float f29604s;
    public boolean f29605t;
    public VelocityTracker v;
    public long f29606u = ViewConfiguration.getLongPressTimeout();
    public final android.support.v4.media.session.q e = new android.support.v4.media.session.q(this, 11);

    public q10(Context context, r10 r10Var) {
        this.f29592f = r10Var;
        this.f29593g = r10Var;
        if (context != null) {
            this.f29605t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f29591c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f29589a = scaledTouchSlop * scaledTouchSlop;
            this.f29590b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
