package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class s20 {
    public static final int f30130x;
    public static final int f30131y;
    public final int f30132a;
    public final int f30133b;
    public final int f30134c;
    public final int d;
    public final int e;
    public final ab.o0 f30135f;
    public final r20 f30136g;
    public q20 h;
    public boolean f30137i;
    public boolean f30138j;
    public boolean f30139k;
    public boolean f30140l;
    public boolean f30141m;
    public MotionEvent f30142n;
    public MotionEvent f30143o;
    public MotionEvent f30144p;
    public boolean f30145q;
    public float f30146r;
    public float f30147s;
    public float f30148t;
    public float f30149u;
    public boolean v;
    public VelocityTracker f30150w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f30130x = ViewConfiguration.getTapTimeout();
        f30131y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f30135f = new ab.o0(this, 8);
        this.f30136g = r20Var;
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
        this.f30132a = i10 * i10;
        this.f30133b = scaledTouchSlop * scaledTouchSlop;
        this.f30134c = i11 * i11;
    }
}
