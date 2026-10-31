package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class p10 {
    public static final int f29242x;
    public static final int f29243y;
    public final int f29244a;
    public final int f29245b;
    public final int f29246c;
    public final int d;
    public final int e;
    public final android.support.v4.media.session.q f29247f;
    public final o10 f29248g;
    public n10 h;
    public boolean f29249i;
    public boolean f29250j;
    public boolean f29251k;
    public boolean f29252l;
    public boolean f29253m;
    public MotionEvent f29254n;
    public MotionEvent f29255o;
    public MotionEvent f29256p;
    public boolean f29257q;
    public float f29258r;
    public float f29259s;
    public float f29260t;
    public float f29261u;
    public boolean v;
    public VelocityTracker f29262w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f29242x = ViewConfiguration.getTapTimeout();
        f29243y = ViewConfiguration.getDoubleTapTimeout();
    }

    public p10(Context context, PhotoViewer photoViewer) {
        this(context, (o10) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p10.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public p10(Context context, o10 o10Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f29247f = new android.support.v4.media.session.q(this, 10);
        this.f29248g = o10Var;
        if (o10Var instanceof n10) {
            this.h = (n10) o10Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.f29244a = i10 * i10;
        this.f29245b = scaledTouchSlop * scaledTouchSlop;
        this.f29246c = i11 * i11;
    }
}
