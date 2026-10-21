package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class s20 {
    public static final int f30139x;
    public static final int f30140y;
    public final int f30141a;
    public final int f30142b;
    public final int f30143c;
    public final int d;
    public final int e;
    public final ab.o0 f30144f;
    public final r20 f30145g;
    public q20 h;
    public boolean f30146i;
    public boolean f30147j;
    public boolean f30148k;
    public boolean f30149l;
    public boolean f30150m;
    public MotionEvent f30151n;
    public MotionEvent f30152o;
    public MotionEvent f30153p;
    public boolean f30154q;
    public float f30155r;
    public float f30156s;
    public float f30157t;
    public float f30158u;
    public boolean v;
    public VelocityTracker f30159w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f30139x = ViewConfiguration.getTapTimeout();
        f30140y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f30144f = new ab.o0(this, 8);
        this.f30145g = r20Var;
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
        this.f30141a = i10 * i10;
        this.f30142b = scaledTouchSlop * scaledTouchSlop;
        this.f30143c = i11 * i11;
    }
}
