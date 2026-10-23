package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class s20 {
    public static final int f30143x;
    public static final int f30144y;
    public final int f30145a;
    public final int f30146b;
    public final int f30147c;
    public final int d;
    public final int e;
    public final ab.o0 f30148f;
    public final r20 f30149g;
    public q20 h;
    public boolean f30150i;
    public boolean f30151j;
    public boolean f30152k;
    public boolean f30153l;
    public boolean f30154m;
    public MotionEvent f30155n;
    public MotionEvent f30156o;
    public MotionEvent f30157p;
    public boolean f30158q;
    public float f30159r;
    public float f30160s;
    public float f30161t;
    public float f30162u;
    public boolean v;
    public VelocityTracker f30163w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f30143x = ViewConfiguration.getTapTimeout();
        f30144y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f30148f = new ab.o0(this, 8);
        this.f30149g = r20Var;
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
        this.f30145a = i10 * i10;
        this.f30146b = scaledTouchSlop * scaledTouchSlop;
        this.f30147c = i11 * i11;
    }
}
