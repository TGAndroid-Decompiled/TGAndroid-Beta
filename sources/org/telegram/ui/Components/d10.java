package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class d10 {
    public static final int f33791x;
    public static final int f33792y;
    public final int f33793a;
    public final int f33794b;
    public final int f33795c;
    public final int d;
    public final int f33796e;
    public final android.support.v4.media.session.q f33797f;
    public final c10 f33798g;
    public b10 h;
    public boolean f33799i;
    public boolean f33800j;
    public boolean f33801k;
    public boolean f33802l;
    public boolean f33803m;
    public MotionEvent f33804n;
    public MotionEvent f33805o;
    public MotionEvent f33806p;
    public boolean f33807q;
    public float f33808r;
    public float f33809s;
    public float f33810t;
    public float f33811u;
    public boolean v;
    public VelocityTracker f33812w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f33791x = ViewConfiguration.getTapTimeout();
        f33792y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f33797f = new android.support.v4.media.session.q(this, 5);
        this.f33798g = c10Var;
        if (c10Var instanceof b10) {
            this.h = (b10) c10Var;
        }
        this.v = true;
        if (context == null) {
            i7 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f33796e = ViewConfiguration.getMaximumFlingVelocity();
            i10 = 100;
            scaledTouchSlop = i7;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f33796e = viewConfiguration.getScaledMaximumFlingVelocity();
            i7 = scaledTouchSlop2;
            i10 = scaledDoubleTapSlop;
        }
        this.f33793a = i7 * i7;
        this.f33794b = scaledTouchSlop * scaledTouchSlop;
        this.f33795c = i10 * i10;
    }
}
