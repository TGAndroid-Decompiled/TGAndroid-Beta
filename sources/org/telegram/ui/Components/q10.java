package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class q10 {
    public static final int f29489w = ViewConfiguration.getTapTimeout();
    public final int f29490a;
    public final int f29491b;
    public final int f29492c;
    public final int d;
    public final r10 f29493f;
    public final r10 f29494g;
    public boolean h;
    public boolean f29495i;
    public boolean f29496j;
    public boolean f29497k;
    public boolean f29498l;
    public MotionEvent f29499m;
    public MotionEvent f29500n;
    public boolean f29501o;
    public float f29502p;
    public float f29503q;
    public float f29504r;
    public float f29505s;
    public boolean f29506t;
    public VelocityTracker v;
    public long f29507u = ViewConfiguration.getLongPressTimeout();
    public final android.support.v4.media.session.q e = new android.support.v4.media.session.q(this, 11);

    public q10(Context context, r10 r10Var) {
        this.f29493f = r10Var;
        this.f29494g = r10Var;
        if (context != null) {
            this.f29506t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f29492c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f29490a = scaledTouchSlop * scaledTouchSlop;
            this.f29491b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
