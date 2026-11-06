package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class a10 {
    public static final int f31629w = ViewConfiguration.getTapTimeout();
    public final int f31630a;
    public final int f31631b;
    public final int f31632c;
    public final int d;
    public final b10 f31634f;
    public final b10 f31635g;
    public boolean h;
    public boolean f31636i;
    public boolean f31637j;
    public boolean f31638k;
    public boolean f31639l;
    public MotionEvent f31640m;
    public MotionEvent f31641n;
    public boolean f31642o;
    public float f31643p;
    public float f31644q;
    public float f31645r;
    public float f31646s;
    public boolean f31647t;
    public VelocityTracker v;
    public long f31648u = ViewConfiguration.getLongPressTimeout();
    public final android.support.v4.media.session.q f31633e = new android.support.v4.media.session.q(this, 6);

    public a10(Context context, b10 b10Var) {
        this.f31634f = b10Var;
        this.f31635g = b10Var;
        if (context != null) {
            this.f31647t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f31632c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f31630a = scaledTouchSlop * scaledTouchSlop;
            this.f31631b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
