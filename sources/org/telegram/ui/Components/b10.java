package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class b10 {
    public static final int f32043w = ViewConfiguration.getTapTimeout();
    public final int f32044a;
    public final int f32045b;
    public final int f32046c;
    public final int d;
    public final c10 f32048f;
    public final c10 f32049g;
    public boolean h;
    public boolean f32050i;
    public boolean f32051j;
    public boolean f32052k;
    public boolean f32053l;
    public MotionEvent f32054m;
    public MotionEvent f32055n;
    public boolean f32056o;
    public float f32057p;
    public float f32058q;
    public float f32059r;
    public float f32060s;
    public boolean f32061t;
    public VelocityTracker v;
    public long f32062u = ViewConfiguration.getLongPressTimeout();
    public final android.support.v4.media.session.q f32047e = new android.support.v4.media.session.q(this, 6);

    public b10(Context context, c10 c10Var) {
        this.f32048f = c10Var;
        this.f32049g = c10Var;
        if (context != null) {
            this.f32061t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f32046c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f32044a = scaledTouchSlop * scaledTouchSlop;
            this.f32045b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
