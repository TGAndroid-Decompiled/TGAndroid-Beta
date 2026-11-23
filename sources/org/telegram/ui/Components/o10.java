package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class o10 {
    public static final int f38037w = ViewConfiguration.getTapTimeout();
    public final int f38038a;
    public final int f38039b;
    public final int f38040c;
    public final int d;
    public final p10 f38042f;
    public final p10 f38043g;
    public boolean h;
    public boolean f38044i;
    public boolean f38045j;
    public boolean f38046k;
    public boolean f38047l;
    public MotionEvent f38048m;
    public MotionEvent f38049n;
    public boolean f38050o;
    public float f38051p;
    public float f38052q;
    public float f38053r;
    public float f38054s;
    public boolean f38055t;
    public VelocityTracker v;
    public long f38056u = ViewConfiguration.getLongPressTimeout();
    public final android.support.v4.media.session.q f38041e = new android.support.v4.media.session.q(this, 6);

    public o10(Context context, p10 p10Var) {
        this.f38042f = p10Var;
        this.f38043g = p10Var;
        if (context != null) {
            this.f38055t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f38040c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f38038a = scaledTouchSlop * scaledTouchSlop;
            this.f38039b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
