package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class a10 {
    public static final int f31648w = ViewConfiguration.getTapTimeout();
    public final int f31649a;
    public final int f31650b;
    public final int f31651c;
    public final int d;
    public final b10 f31653f;
    public final b10 f31654g;
    public boolean h;
    public boolean f31655i;
    public boolean f31656j;
    public boolean f31657k;
    public boolean f31658l;
    public MotionEvent f31659m;
    public MotionEvent f31660n;
    public boolean f31661o;
    public float f31662p;
    public float f31663q;
    public float f31664r;
    public float f31665s;
    public boolean f31666t;
    public VelocityTracker v;
    public long f31667u = ViewConfiguration.getLongPressTimeout();
    public final android.support.v4.media.session.q f31652e = new android.support.v4.media.session.q(this, 6);

    public a10(Context context, b10 b10Var) {
        this.f31653f = b10Var;
        this.f31654g = b10Var;
        if (context != null) {
            this.f31666t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f31651c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f31649a = scaledTouchSlop * scaledTouchSlop;
            this.f31650b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
