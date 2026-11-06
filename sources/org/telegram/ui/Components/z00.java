package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class z00 {
    public static final int f40776x;
    public static final int f40777y;
    public final int f40778a;
    public final int f40779b;
    public final int f40780c;
    public final int d;
    public final int f40781e;
    public final android.support.v4.media.session.q f40782f;
    public final y00 f40783g;
    public x00 h;
    public boolean f40784i;
    public boolean f40785j;
    public boolean f40786k;
    public boolean f40787l;
    public boolean f40788m;
    public MotionEvent f40789n;
    public MotionEvent f40790o;
    public MotionEvent f40791p;
    public boolean f40792q;
    public float f40793r;
    public float f40794s;
    public float f40795t;
    public float f40796u;
    public boolean v;
    public VelocityTracker f40797w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f40776x = ViewConfiguration.getTapTimeout();
        f40777y = ViewConfiguration.getDoubleTapTimeout();
    }

    public z00(Context context, PhotoViewer photoViewer) {
        this(context, (y00) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z00.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public z00(Context context, y00 y00Var) {
        int scaledTouchSlop;
        int i7;
        int i10;
        this.f40782f = new android.support.v4.media.session.q(this, 5);
        this.f40783g = y00Var;
        if (y00Var instanceof x00) {
            this.h = (x00) y00Var;
        }
        this.v = true;
        if (context == null) {
            i7 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f40781e = ViewConfiguration.getMaximumFlingVelocity();
            i10 = 100;
            scaledTouchSlop = i7;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f40781e = viewConfiguration.getScaledMaximumFlingVelocity();
            i7 = scaledTouchSlop2;
            i10 = scaledDoubleTapSlop;
        }
        this.f40778a = i7 * i7;
        this.f40779b = scaledTouchSlop * scaledTouchSlop;
        this.f40780c = i10 * i10;
    }
}
