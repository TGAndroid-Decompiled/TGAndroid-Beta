package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class s20 {
    public static final int f30133x;
    public static final int f30134y;
    public final int f30135a;
    public final int f30136b;
    public final int f30137c;
    public final int d;
    public final int e;
    public final ab.o0 f30138f;
    public final r20 f30139g;
    public q20 h;
    public boolean f30140i;
    public boolean f30141j;
    public boolean f30142k;
    public boolean f30143l;
    public boolean f30144m;
    public MotionEvent f30145n;
    public MotionEvent f30146o;
    public MotionEvent f30147p;
    public boolean f30148q;
    public float f30149r;
    public float f30150s;
    public float f30151t;
    public float f30152u;
    public boolean v;
    public VelocityTracker f30153w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f30133x = ViewConfiguration.getTapTimeout();
        f30134y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f30138f = new ab.o0(this, 8);
        this.f30139g = r20Var;
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
        this.f30135a = i10 * i10;
        this.f30136b = scaledTouchSlop * scaledTouchSlop;
        this.f30137c = i11 * i11;
    }
}
