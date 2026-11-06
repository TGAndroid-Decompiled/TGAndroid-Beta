package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class a10 {
    public static final int f31636w = ViewConfiguration.getTapTimeout();
    public final int f31637a;
    public final int f31638b;
    public final int f31639c;
    public final int d;
    public final b10 f31641f;
    public final b10 f31642g;
    public boolean h;
    public boolean f31643i;
    public boolean f31644j;
    public boolean f31645k;
    public boolean f31646l;
    public MotionEvent f31647m;
    public MotionEvent f31648n;
    public boolean f31649o;
    public float f31650p;
    public float f31651q;
    public float f31652r;
    public float f31653s;
    public boolean f31654t;
    public VelocityTracker v;
    public long f31655u = ViewConfiguration.getLongPressTimeout();
    public final android.support.v4.media.session.q f31640e = new android.support.v4.media.session.q(this, 6);

    public a10(Context context, b10 b10Var) {
        this.f31641f = b10Var;
        this.f31642g = b10Var;
        if (context != null) {
            this.f31654t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f31639c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f31637a = scaledTouchSlop * scaledTouchSlop;
            this.f31638b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
