package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class s20 {
    public static final int f30155x;
    public static final int f30156y;
    public final int f30157a;
    public final int f30158b;
    public final int f30159c;
    public final int d;
    public final int e;
    public final ab.o0 f30160f;
    public final r20 f30161g;
    public q20 h;
    public boolean f30162i;
    public boolean f30163j;
    public boolean f30164k;
    public boolean f30165l;
    public boolean f30166m;
    public MotionEvent f30167n;
    public MotionEvent f30168o;
    public MotionEvent f30169p;
    public boolean f30170q;
    public float f30171r;
    public float f30172s;
    public float f30173t;
    public float f30174u;
    public boolean v;
    public VelocityTracker f30175w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f30155x = ViewConfiguration.getTapTimeout();
        f30156y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f30160f = new ab.o0(this, 8);
        this.f30161g = r20Var;
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
        this.f30157a = i10 * i10;
        this.f30158b = scaledTouchSlop * scaledTouchSlop;
        this.f30159c = i11 * i11;
    }
}
