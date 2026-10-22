package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class s20 {
    public static final int f30142x;
    public static final int f30143y;
    public final int f30144a;
    public final int f30145b;
    public final int f30146c;
    public final int d;
    public final int e;
    public final ab.o0 f30147f;
    public final r20 f30148g;
    public q20 h;
    public boolean f30149i;
    public boolean f30150j;
    public boolean f30151k;
    public boolean f30152l;
    public boolean f30153m;
    public MotionEvent f30154n;
    public MotionEvent f30155o;
    public MotionEvent f30156p;
    public boolean f30157q;
    public float f30158r;
    public float f30159s;
    public float f30160t;
    public float f30161u;
    public boolean v;
    public VelocityTracker f30162w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f30142x = ViewConfiguration.getTapTimeout();
        f30143y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f30147f = new ab.o0(this, 8);
        this.f30148g = r20Var;
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
        this.f30144a = i10 * i10;
        this.f30145b = scaledTouchSlop * scaledTouchSlop;
        this.f30146c = i11 * i11;
    }
}
