package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class d10 {
    public static final int f33789x;
    public static final int f33790y;
    public final int f33791a;
    public final int f33792b;
    public final int f33793c;
    public final int d;
    public final int f33794e;
    public final android.support.v4.media.session.q f33795f;
    public final c10 f33796g;
    public b10 h;
    public boolean f33797i;
    public boolean f33798j;
    public boolean f33799k;
    public boolean f33800l;
    public boolean f33801m;
    public MotionEvent f33802n;
    public MotionEvent f33803o;
    public MotionEvent f33804p;
    public boolean f33805q;
    public float f33806r;
    public float f33807s;
    public float f33808t;
    public float f33809u;
    public boolean v;
    public VelocityTracker f33810w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f33789x = ViewConfiguration.getTapTimeout();
        f33790y = ViewConfiguration.getDoubleTapTimeout();
    }

    public d10(Context context, PhotoViewer photoViewer) {
        this(context, (c10) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d10.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public d10(Context context, c10 c10Var) {
        int scaledTouchSlop;
        int i7;
        int i10;
        this.f33795f = new android.support.v4.media.session.q(this, 5);
        this.f33796g = c10Var;
        if (c10Var instanceof b10) {
            this.h = (b10) c10Var;
        }
        this.v = true;
        if (context == null) {
            i7 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f33794e = ViewConfiguration.getMaximumFlingVelocity();
            i10 = 100;
            scaledTouchSlop = i7;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f33794e = viewConfiguration.getScaledMaximumFlingVelocity();
            i7 = scaledTouchSlop2;
            i10 = scaledDoubleTapSlop;
        }
        this.f33791a = i7 * i7;
        this.f33792b = scaledTouchSlop * scaledTouchSlop;
        this.f33793c = i10 * i10;
    }
}
