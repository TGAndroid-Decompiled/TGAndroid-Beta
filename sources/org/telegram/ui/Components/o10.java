package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class o10 {
    public static final int f38035w = ViewConfiguration.getTapTimeout();
    public final int f38036a;
    public final int f38037b;
    public final int f38038c;
    public final int d;
    public final p10 f38040f;
    public final p10 f38041g;
    public boolean h;
    public boolean f38042i;
    public boolean f38043j;
    public boolean f38044k;
    public boolean f38045l;
    public MotionEvent f38046m;
    public MotionEvent f38047n;
    public boolean f38048o;
    public float f38049p;
    public float f38050q;
    public float f38051r;
    public float f38052s;
    public boolean f38053t;
    public VelocityTracker v;
    public long f38054u = ViewConfiguration.getLongPressTimeout();
    public final android.support.v4.media.session.q f38039e = new android.support.v4.media.session.q(this, 6);

    public o10(Context context, p10 p10Var) {
        this.f38040f = p10Var;
        this.f38041g = p10Var;
        if (context != null) {
            this.f38053t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f38038c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f38036a = scaledTouchSlop * scaledTouchSlop;
            this.f38037b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
