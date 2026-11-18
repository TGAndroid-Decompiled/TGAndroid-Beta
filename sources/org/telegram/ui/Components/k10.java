package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class k10 {
    public static final int f36614x;
    public static final int f36615y;
    public final int f36616a;
    public final int f36617b;
    public final int f36618c;
    public final int d;
    public final int f36619e;
    public final android.support.v4.media.session.q f36620f;
    public final j10 f36621g;
    public i10 h;
    public boolean f36622i;
    public boolean f36623j;
    public boolean f36624k;
    public boolean f36625l;
    public boolean f36626m;
    public MotionEvent f36627n;
    public MotionEvent f36628o;
    public MotionEvent f36629p;
    public boolean f36630q;
    public float f36631r;
    public float f36632s;
    public float f36633t;
    public float f36634u;
    public boolean v;
    public VelocityTracker f36635w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f36614x = ViewConfiguration.getTapTimeout();
        f36615y = ViewConfiguration.getDoubleTapTimeout();
    }

    public k10(Context context, PhotoViewer photoViewer) {
        this(context, (j10) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k10.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public k10(Context context, j10 j10Var) {
        int scaledTouchSlop;
        int i7;
        int i10;
        this.f36620f = new android.support.v4.media.session.q(this, 5);
        this.f36621g = j10Var;
        if (j10Var instanceof i10) {
            this.h = (i10) j10Var;
        }
        this.v = true;
        if (context == null) {
            i7 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f36619e = ViewConfiguration.getMaximumFlingVelocity();
            i10 = 100;
            scaledTouchSlop = i7;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f36619e = viewConfiguration.getScaledMaximumFlingVelocity();
            i7 = scaledTouchSlop2;
            i10 = scaledDoubleTapSlop;
        }
        this.f36616a = i7 * i7;
        this.f36617b = scaledTouchSlop * scaledTouchSlop;
        this.f36618c = i10 * i10;
    }
}
