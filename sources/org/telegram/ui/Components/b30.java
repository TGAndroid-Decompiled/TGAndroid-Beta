package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class b30 {
    public static final int f24829x;
    public static final int f24830y;
    public final int f24831a;
    public final int f24832b;
    public final int f24833c;
    public final int d;
    public final int f24834e;
    public final androidx.mediarouter.app.c f24835f;
    public final a30 f24836g;
    public z20 h;
    public boolean f24837i;
    public boolean f24838j;
    public boolean f24839k;
    public boolean f24840l;
    public boolean f24841m;
    public MotionEvent f24842n;
    public MotionEvent f24843o;
    public MotionEvent f24844p;
    public boolean f24845q;
    public float f24846r;
    public float f24847s;
    public float f24848t;
    public float f24849u;
    public boolean v;
    public VelocityTracker f24850w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f24829x = ViewConfiguration.getTapTimeout();
        f24830y = ViewConfiguration.getDoubleTapTimeout();
    }

    public b30(Context context, PhotoViewer photoViewer) {
        this(context, (a30) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b30.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public b30(Context context, a30 a30Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f24835f = new androidx.mediarouter.app.c(this, 7);
        this.f24836g = a30Var;
        if (a30Var instanceof z20) {
            this.h = (z20) a30Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f24834e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f24834e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.f24831a = i10 * i10;
        this.f24832b = scaledTouchSlop * scaledTouchSlop;
        this.f24833c = i11 * i11;
    }
}
