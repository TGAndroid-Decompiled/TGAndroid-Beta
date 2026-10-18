package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class s20 {
    public static final int f30149x;
    public static final int f30150y;
    public final int f30151a;
    public final int f30152b;
    public final int f30153c;
    public final int d;
    public final int e;
    public final ab.o0 f30154f;
    public final r20 f30155g;
    public q20 h;
    public boolean f30156i;
    public boolean f30157j;
    public boolean f30158k;
    public boolean f30159l;
    public boolean f30160m;
    public MotionEvent f30161n;
    public MotionEvent f30162o;
    public MotionEvent f30163p;
    public boolean f30164q;
    public float f30165r;
    public float f30166s;
    public float f30167t;
    public float f30168u;
    public boolean v;
    public VelocityTracker f30169w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f30149x = ViewConfiguration.getTapTimeout();
        f30150y = ViewConfiguration.getDoubleTapTimeout();
    }

    public s20(Context context, PhotoViewer photoViewer) {
        this(context, (r20) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s20.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public s20(Context context, r20 r20Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f30154f = new ab.o0(this, 8);
        this.f30155g = r20Var;
        if (r20Var instanceof q20) {
            this.h = (q20) r20Var;
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
        this.f30151a = i10 * i10;
        this.f30152b = scaledTouchSlop * scaledTouchSlop;
        this.f30153c = i11 * i11;
    }
}
