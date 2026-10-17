package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class s20 {
    public static final int f30148x;
    public static final int f30149y;
    public final int f30150a;
    public final int f30151b;
    public final int f30152c;
    public final int d;
    public final int e;
    public final ab.o0 f30153f;
    public final r20 f30154g;
    public q20 h;
    public boolean f30155i;
    public boolean f30156j;
    public boolean f30157k;
    public boolean f30158l;
    public boolean f30159m;
    public MotionEvent f30160n;
    public MotionEvent f30161o;
    public MotionEvent f30162p;
    public boolean f30163q;
    public float f30164r;
    public float f30165s;
    public float f30166t;
    public float f30167u;
    public boolean v;
    public VelocityTracker f30168w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f30148x = ViewConfiguration.getTapTimeout();
        f30149y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f30153f = new ab.o0(this, 8);
        this.f30154g = r20Var;
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
        this.f30150a = i10 * i10;
        this.f30151b = scaledTouchSlop * scaledTouchSlop;
        this.f30152c = i11 * i11;
    }
}
