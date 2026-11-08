package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class b10 {
    public static final int f31987w = ViewConfiguration.getTapTimeout();
    public final int f31988a;
    public final int f31989b;
    public final int f31990c;
    public final int d;
    public final c10 f31992f;
    public final c10 f31993g;
    public boolean h;
    public boolean f31994i;
    public boolean f31995j;
    public boolean f31996k;
    public boolean f31997l;
    public MotionEvent f31998m;
    public MotionEvent f31999n;
    public boolean f32000o;
    public float f32001p;
    public float f32002q;
    public float f32003r;
    public float f32004s;
    public boolean f32005t;
    public VelocityTracker v;
    public long f32006u = ViewConfiguration.getLongPressTimeout();
    public final android.support.v4.media.session.q f31991e = new android.support.v4.media.session.q(this, 6);

    public b10(Context context, c10 c10Var) {
        this.f31992f = c10Var;
        this.f31993g = c10Var;
        if (context != null) {
            this.f32005t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f31990c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f31988a = scaledTouchSlop * scaledTouchSlop;
            this.f31989b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
