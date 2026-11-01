package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class p10 {
    public static final int f29291x;
    public static final int f29292y;
    public final int f29293a;
    public final int f29294b;
    public final int f29295c;
    public final int d;
    public final int e;
    public final android.support.v4.media.session.q f29296f;
    public final o10 f29297g;
    public n10 h;
    public boolean f29298i;
    public boolean f29299j;
    public boolean f29300k;
    public boolean f29301l;
    public boolean f29302m;
    public MotionEvent f29303n;
    public MotionEvent f29304o;
    public MotionEvent f29305p;
    public boolean f29306q;
    public float f29307r;
    public float f29308s;
    public float f29309t;
    public float f29310u;
    public boolean v;
    public VelocityTracker f29311w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f29291x = ViewConfiguration.getTapTimeout();
        f29292y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f29296f = new android.support.v4.media.session.q(this, 10);
        this.f29297g = o10Var;
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
        this.f29293a = i10 * i10;
        this.f29294b = scaledTouchSlop * scaledTouchSlop;
        this.f29295c = i11 * i11;
    }
}
