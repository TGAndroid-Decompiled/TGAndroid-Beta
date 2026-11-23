package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class o10 {
    public static final int f38036w = ViewConfiguration.getTapTimeout();
    public final int f38037a;
    public final int f38038b;
    public final int f38039c;
    public final int d;
    public final p10 f38041f;
    public final p10 f38042g;
    public boolean h;
    public boolean f38043i;
    public boolean f38044j;
    public boolean f38045k;
    public boolean f38046l;
    public MotionEvent f38047m;
    public MotionEvent f38048n;
    public boolean f38049o;
    public float f38050p;
    public float f38051q;
    public float f38052r;
    public float f38053s;
    public boolean f38054t;
    public VelocityTracker v;
    public long f38055u = ViewConfiguration.getLongPressTimeout();
    public final android.support.v4.media.session.q f38040e = new android.support.v4.media.session.q(this, 6);

    public o10(Context context, p10 p10Var) {
        this.f38041f = p10Var;
        this.f38042g = p10Var;
        if (context != null) {
            this.f38054t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f38039c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f38037a = scaledTouchSlop * scaledTouchSlop;
            this.f38038b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
