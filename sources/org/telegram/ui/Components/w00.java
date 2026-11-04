package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class w00 {
    public static final int f39832w = ViewConfiguration.getTapTimeout();
    public final int f39833a;
    public final int f39834b;
    public final int f39835c;
    public final int d;
    public final x00 f39837f;
    public final x00 f39838g;
    public boolean h;
    public boolean f39839i;
    public boolean f39840j;
    public boolean f39841k;
    public boolean f39842l;
    public MotionEvent f39843m;
    public MotionEvent f39844n;
    public boolean f39845o;
    public float f39846p;
    public float f39847q;
    public float f39848r;
    public float f39849s;
    public boolean f39850t;
    public VelocityTracker v;
    public long f39851u = ViewConfiguration.getLongPressTimeout();
    public final android.support.v4.media.session.q f39836e = new android.support.v4.media.session.q(this, 7);

    public w00(Context context, x00 x00Var) {
        this.f39837f = x00Var;
        this.f39838g = x00Var;
        if (context != null) {
            this.f39850t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f39835c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f39833a = scaledTouchSlop * scaledTouchSlop;
            this.f39834b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
