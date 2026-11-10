package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class z00 {
    public static final int f40789x;
    public static final int f40790y;
    public final int f40791a;
    public final int f40792b;
    public final int f40793c;
    public final int d;
    public final int f40794e;
    public final android.support.v4.media.session.q f40795f;
    public final y00 f40796g;
    public x00 h;
    public boolean f40797i;
    public boolean f40798j;
    public boolean f40799k;
    public boolean f40800l;
    public boolean f40801m;
    public MotionEvent f40802n;
    public MotionEvent f40803o;
    public MotionEvent f40804p;
    public boolean f40805q;
    public float f40806r;
    public float f40807s;
    public float f40808t;
    public float f40809u;
    public boolean v;
    public VelocityTracker f40810w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f40789x = ViewConfiguration.getTapTimeout();
        f40790y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f40795f = new android.support.v4.media.session.q(this, 5);
        this.f40796g = y00Var;
        if (y00Var instanceof x00) {
            this.h = (x00) y00Var;
        }
        this.v = true;
        if (context == null) {
            i7 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f40794e = ViewConfiguration.getMaximumFlingVelocity();
            i10 = 100;
            scaledTouchSlop = i7;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f40794e = viewConfiguration.getScaledMaximumFlingVelocity();
            i7 = scaledTouchSlop2;
            i10 = scaledDoubleTapSlop;
        }
        this.f40791a = i7 * i7;
        this.f40792b = scaledTouchSlop * scaledTouchSlop;
        this.f40793c = i10 * i10;
    }
}
